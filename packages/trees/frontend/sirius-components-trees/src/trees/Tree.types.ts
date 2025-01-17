/*******************************************************************************
 * Copyright (c) 2021, 2023 Obeo.
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
import { Selection } from '@eclipse-sirius/sirius-components-core';
import { GQLTree, GQLTreeItem } from '../views/TreeView.types';
import { FilterBarOptions } from './FilterBar.types';

export interface TreeProps {
  editingContextId: string;
  tree: GQLTree;
  onExpand: (id: string, depth: number) => void;
  onExpandAll: (treeItem: GQLTreeItem) => void;
  selection: Selection;
  setSelection: (selection: Selection) => void;
  readOnly: boolean;
  enableMultiSelection: boolean;
  options: TreeOptions | undefined;
}

export interface TreeState {
  filterBar: boolean;
  filterBarText: string | null;
  filterBarTreeFiltering: boolean;
}

export interface TreeOptions {
  filterBarOptions: FilterBarOptions | undefined;
  treeBorderStyle: boolean | undefined;
  treeTitle: string | undefined;
}
