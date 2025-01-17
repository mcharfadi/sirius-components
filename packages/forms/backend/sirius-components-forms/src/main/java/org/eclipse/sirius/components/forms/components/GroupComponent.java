/*******************************************************************************
 * Copyright (c) 2019, 2023 Obeo.
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
package org.eclipse.sirius.components.forms.components;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.eclipse.sirius.components.forms.GroupDisplayMode;
import org.eclipse.sirius.components.forms.description.AbstractControlDescription;
import org.eclipse.sirius.components.forms.description.AbstractWidgetDescription;
import org.eclipse.sirius.components.forms.description.ButtonDescription;
import org.eclipse.sirius.components.forms.description.ForDescription;
import org.eclipse.sirius.components.forms.description.GroupDescription;
import org.eclipse.sirius.components.forms.elements.GroupElementProps;
import org.eclipse.sirius.components.representations.Element;
import org.eclipse.sirius.components.representations.Fragment;
import org.eclipse.sirius.components.representations.FragmentProps;
import org.eclipse.sirius.components.representations.IComponent;
import org.eclipse.sirius.components.representations.VariableManager;

/**
 * The component used to render the groups.
 *
 * @author sbegaudeau
 */
public class GroupComponent implements IComponent {

    private final GroupComponentProps props;

    public GroupComponent(GroupComponentProps props) {
        this.props = Objects.requireNonNull(props);
    }

    @Override
    public Element render() {
        VariableManager variableManager = this.props.getVariableManager();
        GroupDescription groupDescription = this.props.getGroupDescription();
        var borderStyle = groupDescription.getBorderStyleProvider().apply(variableManager);

        List<?> semanticElements = groupDescription.getSemanticElementsProvider().apply(variableManager);

        List<Element> children = new ArrayList<>(semanticElements.size());

        for (Object semanticElement : semanticElements) {
            VariableManager groupVariableManager = variableManager.createChild();
            groupVariableManager.put(VariableManager.SELF, semanticElement);

            String id = groupDescription.getIdProvider().apply(groupVariableManager);
            String label = groupDescription.getLabelProvider().apply(groupVariableManager);
            GroupDisplayMode displayMode = groupDescription.getDisplayModeProvider().apply(groupVariableManager);

            List<Element> groupChildren = new ArrayList<>();
            for (ButtonDescription toolbarActionDescription : groupDescription.getToolbarActionDescriptions()) {
                groupChildren.add(new Element(ToolbarActionComponent.class, new ToolbarActionComponentProps(groupVariableManager, toolbarActionDescription)));
            }

            List<AbstractControlDescription> controlDescriptions = groupDescription.getControlDescriptions();
            for (AbstractControlDescription controlDescription : controlDescriptions) {
                if (controlDescription instanceof AbstractWidgetDescription widgetDescription) {
                    WidgetComponentProps widgetComponentProps = new WidgetComponentProps(groupVariableManager, widgetDescription, this.props.getWidgetDescriptors());
                    groupChildren.add(new Element(WidgetComponent.class, widgetComponentProps));
                } else if (controlDescription instanceof ForDescription forDescription) {
                    ForComponentProps forComponentProps = new ForComponentProps(groupVariableManager, forDescription, this.props.getWidgetDescriptors());
                    groupChildren.add(new Element(ForComponent.class, forComponentProps));
                }
            }

            GroupElementProps.Builder groupElementPropsBuilder = GroupElementProps.newGroupElementProps(id)
                    .label(label)
                    .displayMode(displayMode)
                    .children(groupChildren);

            if (borderStyle != null) {
                groupElementPropsBuilder.borderStyle(borderStyle);
            }

            GroupElementProps groupElementProps = groupElementPropsBuilder.build();
            Element groupElement = new Element(GroupElementProps.TYPE, groupElementProps);

            children.add(groupElement);
        }

        FragmentProps fragmentProps = new FragmentProps(children);
        return new Fragment(fragmentProps);
    }
}
