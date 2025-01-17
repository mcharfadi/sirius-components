/*******************************************************************************
 * Copyright (c) 2023 Obeo and others.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/

import { Selection, SelectionEntry } from '@eclipse-sirius/sirius-components-core';
import { useEffect, useRef, useState } from 'react';
import {
  Background,
  BackgroundVariant,
  EdgeChange,
  EdgeTypes,
  NodeChange,
  NodeSelectionChange,
  NodeTypes,
  OnEdgesChange,
  OnNodesChange,
  ReactFlow,
  useEdgesState,
  useNodesState,
  useStoreApi,
} from 'reactflow';
import { DiagramPanel } from './DiagramPanel';
import { DiagramRendererProps, DiagramRendererState, NodeData } from './DiagramRenderer.types';
import { ImageNode } from './ImageNode';
import { ListNode } from './ListNode';
import { RectangularNode } from './RectangularNode';
import { ConnectorContextualMenu } from './connector/ConnectorContextualMenu';
import { useConnector } from './connector/useConnector';
import { useDiagramDirectEdit } from './direct-edit/useDiagramDirectEdit';
import { CustomEdge } from './edge/CustomEdge';
import { CustomEdgeData } from './edge/CustomEdge.types';
import { useLayout } from './layout/useLayout';
import { DiagramPalette } from './palette/DiagramPalette';
import { useDiagramPalette } from './palette/useDiagramPalette';
import { useReconnectEdge } from './reconnect-edge/useReconnectEdge';

import 'reactflow/dist/style.css';

const nodeTypes: NodeTypes = {
  rectangularNode: RectangularNode,
  imageNode: ImageNode,
  listNode: ListNode,
};

const edgeTypes: EdgeTypes = {
  customEdge: CustomEdge,
};

const isSelectChange = (change: NodeChange): change is NodeSelectionChange => change.type === 'select';

export const DiagramRenderer = ({ diagram, selection, setSelection }: DiagramRendererProps) => {
  const store = useStoreApi();
  const { onKeyDown } = useDiagramDirectEdit();
  const ref = useRef<HTMLDivElement | null>(null);
  const [state, setState] = useState<DiagramRendererState>({
    fullscreen: false,
    snapToGrid: false,
  });
  const { onDiagramBackgroundClick, hideDiagramPalette } = useDiagramPalette();
  const { onConnect } = useConnector();
  const { reconnectEdge } = useReconnectEdge();
  const { autoLayout } = useLayout();

  const [nodes, setNodes, onNodesChange] = useNodesState<NodeData>(diagram.nodes);
  const [edges, setEdges, onEdgesChange] = useEdgesState<CustomEdgeData>(diagram.edges);

  useEffect(() => {
    setNodes(diagram.nodes);
    setEdges(diagram.edges);
    hideDiagramPalette();
  }, [diagram]);

  useEffect(() => {
    const selectionEntryIds = selection.entries.map((entry) => entry.id);
    const firstSelectedNodeId = diagram.nodes
      .filter((node) => selectionEntryIds.includes(node.data.targetObjectId))
      .map((node) => node.id);
    const reactFlowState = store.getState();
    reactFlowState.unselectNodesAndEdges();
    if (firstSelectedNodeId.length > 0) {
      // Support single graphical selection to display the palette on node containing compartment based on the same targetObjectId.
      reactFlowState.addSelectedNodes([firstSelectedNodeId[0]]);
    }
  }, [selection, diagram]);

  const handleNodesChange: OnNodesChange = (changes: NodeChange[]) => {
    onNodesChange(changes);

    const selectionEntries: SelectionEntry[] = changes
      .filter(isSelectChange)
      .filter((change) => change.selected)
      .flatMap((change) => diagram.nodes.filter((node) => node.id === change.id))
      .map((node) => {
        const { targetObjectId, targetObjectKind, targetObjectLabel } = node.data;
        return {
          id: targetObjectId,
          kind: targetObjectKind,
          label: targetObjectLabel,
        };
      });

    const currentSelectionEntryIds = selection.entries.map((selectionEntry) => selectionEntry.id);
    const shouldUpdateSelection =
      selectionEntries.map((entry) => entry.id).filter((entryId) => currentSelectionEntryIds.includes(entryId))
        .length !== selectionEntries.length;

    if (selectionEntries.length > 0 && shouldUpdateSelection) {
      setSelection({ entries: selectionEntries });
    }

    if (selectionEntries.length > 0) {
      hideDiagramPalette();
    }
  };

  const handleEdgesChange: OnEdgesChange = (changes: EdgeChange[]) => {
    onEdgesChange(changes);
  };

  const handlePaneClick = (event: React.MouseEvent<Element, MouseEvent>) => {
    const selection: Selection = {
      entries: [
        {
          id: diagram.metadata.id,
          kind: diagram.metadata.kind,
          label: diagram.metadata.label,
        },
      ],
    };

    setSelection(selection);
    onDiagramBackgroundClick(event);
  };

  useEffect(() => {
    const onFullscreenChange = () =>
      setState((prevState) => ({ ...prevState, fullscreen: Boolean(document.fullscreenElement) }));

    document.addEventListener('fullscreenchange', onFullscreenChange);

    return () => document.removeEventListener('fullscreenchange', onFullscreenChange);
  }, []);

  const handleFullscreen = (fullscreen: boolean) => {
    if (ref.current) {
      if (fullscreen) {
        ref.current.requestFullscreen();
      } else {
        document.exitFullscreen();
      }
    }
  };

  const handleSnapToGrid = (snapToGrid: boolean) => setState((prevState) => ({ ...prevState, snapToGrid }));
  const handleArrangeAll = () => {
    autoLayout(nodes, edges).then(({ nodes }) => {
      setNodes(nodes);
    });
  };

  return (
    <ReactFlow
      nodes={nodes}
      nodeTypes={nodeTypes}
      onNodesChange={handleNodesChange}
      edges={edges}
      edgeTypes={edgeTypes}
      onKeyDown={onKeyDown}
      onConnect={onConnect}
      onEdgesChange={handleEdgesChange}
      onEdgeUpdate={reconnectEdge}
      onPaneClick={handlePaneClick}
      onMove={() => hideDiagramPalette()}
      maxZoom={40}
      minZoom={0.1}
      snapToGrid={state.snapToGrid}
      snapGrid={[10, 10]}
      ref={ref}>
      {state.snapToGrid ? (
        <>
          <Background
            id="small-grid"
            style={{ backgroundColor: '#ffffff' }}
            variant={BackgroundVariant.Lines}
            gap={10}
            color="#f1f1f1"
          />
          <Background id="large-grid" variant={BackgroundVariant.Lines} gap={100} offset={1} color="#cccccc" />
        </>
      ) : (
        <Background style={{ backgroundColor: '#ffffff' }} variant={BackgroundVariant.Lines} color="#ffffff" />
      )}
      <DiagramPanel
        fullscreen={state.fullscreen}
        onFullscreen={handleFullscreen}
        snapToGrid={state.snapToGrid}
        onSnapToGrid={handleSnapToGrid}
        onArrangeAll={handleArrangeAll}
      />
      <DiagramPalette targetObjectId={diagram.metadata.id} />
      <ConnectorContextualMenu />
    </ReactFlow>
  );
};
