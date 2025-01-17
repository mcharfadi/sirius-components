/*******************************************************************************
 * Copyright (c) 2023 Obeo.
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

import { memo } from 'react';
import { LabelProps } from './Label.types';
import { DiagramDirectEditInput } from './direct-edit/DiagramDirectEditInput';
import { useDiagramDirectEdit } from './direct-edit/useDiagramDirectEdit';

const labelStyle = (style: React.CSSProperties, faded: Boolean): React.CSSProperties => {
  return {
    opacity: faded ? '0.4' : '',
    ...style,
  };
};

export const Label = memo(({ label, faded }: LabelProps) => {
  const { currentlyEditedLabelId, editingKey, setCurrentlyEditedLabelId, resetDirectEdit } = useDiagramDirectEdit();

  const handleClose = () => resetDirectEdit();

  const handleDoubleClick = () => {
    setCurrentlyEditedLabelId('doubleClick', label.id, null);
  };

  if (label.id === currentlyEditedLabelId) {
    return <DiagramDirectEditInput editingKey={editingKey} onClose={handleClose} labelId={label.id} />;
  }
  return (
    <div data-id={label.id} onDoubleClick={handleDoubleClick} style={labelStyle(label.style, faded)}>
      {label.text}
    </div>
  );
});
