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
package org.eclipse.sirius.components.view.form;

import org.eclipse.emf.common.util.EList;
import org.eclipse.sirius.components.view.Operation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>List Description</b></em>'. <!-- end-user-doc
 * -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.sirius.components.view.form.ListDescription#getValueExpression <em>Value Expression</em>}</li>
 * <li>{@link org.eclipse.sirius.components.view.form.ListDescription#getDisplayExpression <em>Display
 * Expression</em>}</li>
 * <li>{@link org.eclipse.sirius.components.view.form.ListDescription#getIsDeletableExpression <em>Is Deletable
 * Expression</em>}</li>
 * <li>{@link org.eclipse.sirius.components.view.form.ListDescription#getBody <em>Body</em>}</li>
 * <li>{@link org.eclipse.sirius.components.view.form.ListDescription#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.sirius.components.view.form.ListDescription#getConditionalStyles <em>Conditional
 * Styles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.components.view.form.FormPackage#getListDescription()
 * @model
 * @generated
 */
public interface ListDescription extends WidgetDescription {

    /**
     * Returns the value of the '<em><b>Value Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return the value of the '<em>Value Expression</em>' attribute.
     * @see #setValueExpression(String)
     * @see org.eclipse.sirius.components.view.form.FormPackage#getListDescription_ValueExpression()
     * @model dataType="org.eclipse.sirius.components.view.InterpretedExpression"
     * @generated
     */
    String getValueExpression();

    /**
     * Sets the value of the '{@link org.eclipse.sirius.components.view.form.ListDescription#getValueExpression
     * <em>Value Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Value Expression</em>' attribute.
     * @see #getValueExpression()
     * @generated
     */
    void setValueExpression(String value);

    /**
     * Returns the value of the '<em><b>Display Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the value of the '<em>Display Expression</em>' attribute.
     * @see #setDisplayExpression(String)
     * @see org.eclipse.sirius.components.view.form.FormPackage#getListDescription_DisplayExpression()
     * @model dataType="org.eclipse.sirius.components.view.InterpretedExpression"
     * @generated
     */
    String getDisplayExpression();

    /**
     * Sets the value of the '{@link org.eclipse.sirius.components.view.form.ListDescription#getDisplayExpression
     * <em>Display Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Display Expression</em>' attribute.
     * @see #getDisplayExpression()
     * @generated
     */
    void setDisplayExpression(String value);

    /**
     * Returns the value of the '<em><b>Is Deletable Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the value of the '<em>Is Deletable Expression</em>' attribute.
     * @see #setIsDeletableExpression(String)
     * @see org.eclipse.sirius.components.view.form.FormPackage#getListDescription_IsDeletableExpression()
     * @model dataType="org.eclipse.sirius.components.view.InterpretedExpression"
     * @generated
     */
    String getIsDeletableExpression();

    /**
     * Sets the value of the '{@link org.eclipse.sirius.components.view.form.ListDescription#getIsDeletableExpression
     * <em>Is Deletable Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Is Deletable Expression</em>' attribute.
     * @see #getIsDeletableExpression()
     * @generated
     */
    void setIsDeletableExpression(String value);

    /**
     * Returns the value of the '<em><b>Body</b></em>' containment reference list. The list contents are of type
     * {@link org.eclipse.sirius.components.view.Operation}. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Body</em>' containment reference list.
     * @see org.eclipse.sirius.components.view.form.FormPackage#getListDescription_Body()
     * @model containment="true"
     * @generated
     */
    EList<Operation> getBody();

    /**
     * Returns the value of the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return the value of the '<em>Style</em>' containment reference.
     * @see #setStyle(ListDescriptionStyle)
     * @see org.eclipse.sirius.components.view.form.FormPackage#getListDescription_Style()
     * @model containment="true"
     * @generated
     */
    ListDescriptionStyle getStyle();

    /**
     * Sets the value of the '{@link org.eclipse.sirius.components.view.form.ListDescription#getStyle <em>Style</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Style</em>' containment reference.
     * @see #getStyle()
     * @generated
     */
    void setStyle(ListDescriptionStyle value);

    /**
     * Returns the value of the '<em><b>Conditional Styles</b></em>' containment reference list. The list contents are
     * of type {@link org.eclipse.sirius.components.view.form.ConditionalListDescriptionStyle}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Conditional Styles</em>' containment reference list.
     * @see org.eclipse.sirius.components.view.form.FormPackage#getListDescription_ConditionalStyles()
     * @model containment="true"
     * @generated
     */
    EList<ConditionalListDescriptionStyle> getConditionalStyles();

    /**
     * Returns the value of the '<em><b>Is Enabled Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the value of the '<em>Is Enabled Expression</em>' attribute.
     * @model dataType="org.eclipse.sirius.components.view.InterpretedExpression"
     * @generated
     * @see #setIsEnabledExpression(String)
     * @see org.eclipse.sirius.components.view.form.FormPackage#getListDescription_IsEnabledExpression()
     */
    String getIsEnabledExpression();

    /**
     * Sets the value of the '{@link org.eclipse.sirius.components.view.form.ListDescription#getIsEnabledExpression
     * <em>Is Enabled Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Is Enabled Expression</em>' attribute.
     * @generated
     * @see #getIsEnabledExpression()
     */
    void setIsEnabledExpression(String value);

} // ListDescription
