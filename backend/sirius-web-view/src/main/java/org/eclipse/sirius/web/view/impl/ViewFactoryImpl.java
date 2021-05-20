/*******************************************************************************
 * Copyright (c) 2021 Obeo.
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
package org.eclipse.sirius.web.view.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.sirius.web.view.ArrowStyle;
import org.eclipse.sirius.web.view.ChangeContext;
import org.eclipse.sirius.web.view.CreateInstance;
import org.eclipse.sirius.web.view.DeleteElement;
import org.eclipse.sirius.web.view.DeleteTool;
import org.eclipse.sirius.web.view.DiagramDescription;
import org.eclipse.sirius.web.view.EdgeDescription;
import org.eclipse.sirius.web.view.EdgeStyle;
import org.eclipse.sirius.web.view.EdgeTool;
import org.eclipse.sirius.web.view.LabelEditTool;
import org.eclipse.sirius.web.view.LineStyle;
import org.eclipse.sirius.web.view.NodeDescription;
import org.eclipse.sirius.web.view.NodeStyle;
import org.eclipse.sirius.web.view.NodeTool;
import org.eclipse.sirius.web.view.SetValue;
import org.eclipse.sirius.web.view.UnsetValue;
import org.eclipse.sirius.web.view.View;
import org.eclipse.sirius.web.view.ViewFactory;
import org.eclipse.sirius.web.view.ViewPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class ViewFactoryImpl extends EFactoryImpl implements ViewFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static ViewFactory init() {
        try {
            ViewFactory theViewFactory = (ViewFactory) EPackage.Registry.INSTANCE.getEFactory(ViewPackage.eNS_URI);
            if (theViewFactory != null) {
                return theViewFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ViewFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ViewFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case ViewPackage.VIEW:
            return this.createView();
        case ViewPackage.DIAGRAM_DESCRIPTION:
            return this.createDiagramDescription();
        case ViewPackage.NODE_DESCRIPTION:
            return this.createNodeDescription();
        case ViewPackage.EDGE_DESCRIPTION:
            return this.createEdgeDescription();
        case ViewPackage.NODE_STYLE:
            return this.createNodeStyle();
        case ViewPackage.EDGE_STYLE:
            return this.createEdgeStyle();
        case ViewPackage.LABEL_EDIT_TOOL:
            return this.createLabelEditTool();
        case ViewPackage.DELETE_TOOL:
            return this.createDeleteTool();
        case ViewPackage.NODE_TOOL:
            return this.createNodeTool();
        case ViewPackage.EDGE_TOOL:
            return this.createEdgeTool();
        case ViewPackage.CHANGE_CONTEXT:
            return this.createChangeContext();
        case ViewPackage.CREATE_INSTANCE:
            return this.createCreateInstance();
        case ViewPackage.SET_VALUE:
            return this.createSetValue();
        case ViewPackage.UNSET_VALUE:
            return this.createUnsetValue();
        case ViewPackage.DELETE_ELEMENT:
            return this.createDeleteElement();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case ViewPackage.ARROW_STYLE:
            return this.createArrowStyleFromString(eDataType, initialValue);
        case ViewPackage.LINE_STYLE:
            return this.createLineStyleFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case ViewPackage.ARROW_STYLE:
            return this.convertArrowStyleToString(eDataType, instanceValue);
        case ViewPackage.LINE_STYLE:
            return this.convertLineStyleToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public View createView() {
        ViewImpl view = new ViewImpl();
        return view;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DiagramDescription createDiagramDescription() {
        DiagramDescriptionImpl diagramDescription = new DiagramDescriptionImpl();
        return diagramDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NodeDescription createNodeDescription() {
        NodeDescriptionImpl nodeDescription = new NodeDescriptionImpl();
        return nodeDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EdgeDescription createEdgeDescription() {
        EdgeDescriptionImpl edgeDescription = new EdgeDescriptionImpl();
        return edgeDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NodeStyle createNodeStyle() {
        NodeStyleImpl nodeStyle = new NodeStyleImpl();
        return nodeStyle;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EdgeStyle createEdgeStyle() {
        EdgeStyleImpl edgeStyle = new EdgeStyleImpl();
        return edgeStyle;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public LabelEditTool createLabelEditTool() {
        LabelEditToolImpl labelEditTool = new LabelEditToolImpl();
        return labelEditTool;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DeleteTool createDeleteTool() {
        DeleteToolImpl deleteTool = new DeleteToolImpl();
        return deleteTool;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NodeTool createNodeTool() {
        NodeToolImpl nodeTool = new NodeToolImpl();
        return nodeTool;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EdgeTool createEdgeTool() {
        EdgeToolImpl edgeTool = new EdgeToolImpl();
        return edgeTool;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ChangeContext createChangeContext() {
        ChangeContextImpl changeContext = new ChangeContextImpl();
        return changeContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public CreateInstance createCreateInstance() {
        CreateInstanceImpl createInstance = new CreateInstanceImpl();
        return createInstance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SetValue createSetValue() {
        SetValueImpl setValue = new SetValueImpl();
        return setValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public UnsetValue createUnsetValue() {
        UnsetValueImpl unsetValue = new UnsetValueImpl();
        return unsetValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DeleteElement createDeleteElement() {
        DeleteElementImpl deleteElement = new DeleteElementImpl();
        return deleteElement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ArrowStyle createArrowStyleFromString(EDataType eDataType, String initialValue) {
        ArrowStyle result = ArrowStyle.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertArrowStyleToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public LineStyle createLineStyleFromString(EDataType eDataType, String initialValue) {
        LineStyle result = LineStyle.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertLineStyleToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ViewPackage getViewPackage() {
        return (ViewPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ViewPackage getPackage() {
        return ViewPackage.eINSTANCE;
    }

} // ViewFactoryImpl
