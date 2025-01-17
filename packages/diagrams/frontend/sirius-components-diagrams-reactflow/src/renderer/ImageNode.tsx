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

import { ServerContext, ServerContextValue } from '@eclipse-sirius/sirius-components-core';
import { Theme, useTheme } from '@material-ui/core/styles';
import { memo, useContext } from 'react';
import { Handle, NodeProps, NodeResizer, Position } from 'reactflow';
import { ImageNodeData } from './ImageNode.types';
import { NodePalette } from './palette/NodePalette';

const imageNodeStyle = (
  style: React.CSSProperties,
  theme: Theme,
  selected: boolean,
  faded: boolean
): React.CSSProperties => {
  const imageNodeStyle: React.CSSProperties = { width: '100%', height: '100%', opacity: faded ? '0.4' : '', ...style };

  if (selected) {
    imageNodeStyle.outline = `${theme.palette.primary.main} solid 1px`;
  }

  return imageNodeStyle;
};

export const ImageNode = memo(({ data, isConnectable, id, selected }: NodeProps<ImageNodeData>) => {
  const { httpOrigin } = useContext<ServerContextValue>(ServerContext);
  const theme = useTheme();

  return (
    <>
      <NodeResizer color={theme.palette.primary.main} isVisible={selected} />
      <img src={httpOrigin + data.imageURL} style={imageNodeStyle(data.style, theme, selected, data.faded)} />
      {selected ? <NodePalette diagramElementId={id} labelId={data.label?.id ?? null} /> : null}
      <Handle type="source" position={Position.Left} isConnectable={isConnectable} />
      <Handle type="target" position={Position.Right} isConnectable={isConnectable} />
    </>
  );
});
