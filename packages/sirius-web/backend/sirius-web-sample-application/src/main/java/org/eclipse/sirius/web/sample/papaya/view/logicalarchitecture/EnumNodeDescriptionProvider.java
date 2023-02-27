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
package org.eclipse.sirius.web.sample.papaya.view.logicalarchitecture;

import org.eclipse.sirius.components.view.NodeDescription;
import org.eclipse.sirius.components.view.ViewFactory;
import org.eclipse.sirius.web.sample.papaya.view.INodeDescriptionProvider;
import org.eclipse.sirius.web.sample.papaya.view.PapayaToolsFactory;
import org.eclipse.sirius.web.sample.papaya.view.PapayaViewBuilder;

/**
 * Description of the enum.
 *
 * @author sbegaudeau
 */
public class EnumNodeDescriptionProvider implements INodeDescriptionProvider {

    @Override
    public NodeDescription create() {
        var nodeStyle = ViewFactory.eINSTANCE.createRectangularNodeStyleDescription();
        nodeStyle.setColor("#26a69a");
        nodeStyle.setBorderColor("#00695c");
        nodeStyle.setLabelColor("white");
        nodeStyle.setWithHeader(true);

        var nodeDescription = new PapayaViewBuilder().createNodeDescription("Enum");
        nodeDescription.setChildrenLayoutStrategy(ViewFactory.eINSTANCE.createListLayoutStrategyDescription());
        nodeDescription.setSemanticCandidatesExpression("aql:self.types");
        nodeDescription.setLabelExpression("aql:self.name");
        nodeDescription.setStyle(nodeStyle);
        nodeDescription.getChildrenDescriptions().add(this.enumLiteralNodeDescription());

        var newEnumNodeTool = new PapayaToolsFactory().createNamedElement("papaya_logical_architecture::Enum", "types", "Enum");
        newEnumNodeTool.setName("New Enum");
        nodeDescription.getNodeTools().add(newEnumNodeTool);
        nodeDescription.setLabelEditTool(new PapayaToolsFactory().editName());
        nodeDescription.setDeleteTool(new PapayaToolsFactory().deleteTool());

        return nodeDescription;
    }

    private NodeDescription enumLiteralNodeDescription() {
        var nodeStyle = ViewFactory.eINSTANCE.createIconLabelNodeStyleDescription();
        nodeStyle.setColor("#26a69a");
        nodeStyle.setBorderColor("#00695c");
        nodeStyle.setLabelColor("white");

        var nodeDescription = new PapayaViewBuilder().createNodeDescription("EnumLiteral");
        nodeDescription.setSemanticCandidatesExpression("aql:self.enumLiterals");
        nodeDescription.setLabelExpression("aql:self.name");
        nodeDescription.setStyle(nodeStyle);

        var newEnumLiteralNodeTool = new PapayaToolsFactory().createNamedElement("papaya_logical_architecture::EnumLiteral", "enumLiterals", "EnumLiteral");
        newEnumLiteralNodeTool.setName("New Enum Literal");
        nodeDescription.getNodeTools().add(newEnumLiteralNodeTool);
        nodeDescription.setLabelEditTool(new PapayaToolsFactory().editName());
        nodeDescription.setDeleteTool(new PapayaToolsFactory().deleteTool());

        return nodeDescription;
    }

}
