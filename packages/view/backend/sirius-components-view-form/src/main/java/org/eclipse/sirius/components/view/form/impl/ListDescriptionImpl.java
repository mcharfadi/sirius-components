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
package org.eclipse.sirius.components.view.form.impl;

import java.util.Collection;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.sirius.components.view.Operation;
import org.eclipse.sirius.components.view.form.ConditionalListDescriptionStyle;
import org.eclipse.sirius.components.view.form.FormPackage;
import org.eclipse.sirius.components.view.form.ListDescription;
import org.eclipse.sirius.components.view.form.ListDescriptionStyle;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>List Description</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.sirius.components.view.form.impl.ListDescriptionImpl#getValueExpression <em>Value
 * Expression</em>}</li>
 * <li>{@link org.eclipse.sirius.components.view.form.impl.ListDescriptionImpl#getDisplayExpression <em>Display
 * Expression</em>}</li>
 * <li>{@link org.eclipse.sirius.components.view.form.impl.ListDescriptionImpl#getIsDeletableExpression <em>Is Deletable
 * Expression</em>}</li>
 * <li>{@link org.eclipse.sirius.components.view.form.impl.ListDescriptionImpl#getBody <em>Body</em>}</li>
 * <li>{@link org.eclipse.sirius.components.view.form.impl.ListDescriptionImpl#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.sirius.components.view.form.impl.ListDescriptionImpl#getConditionalStyles <em>Conditional
 * Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListDescriptionImpl extends WidgetDescriptionImpl implements ListDescription {
    /**
     * The default value of the '{@link #getValueExpression() <em>Value Expression</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getValueExpression()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EXPRESSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValueExpression() <em>Value Expression</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getValueExpression()
     * @generated
     * @ordered
     */
    protected String valueExpression = VALUE_EXPRESSION_EDEFAULT;

    /**
     * The default value of the '{@link #getDisplayExpression() <em>Display Expression</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDisplayExpression()
     * @generated
     * @ordered
     */
    protected static final String DISPLAY_EXPRESSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDisplayExpression() <em>Display Expression</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDisplayExpression()
     * @generated
     * @ordered
     */
    protected String displayExpression = DISPLAY_EXPRESSION_EDEFAULT;

    /**
     * The default value of the '{@link #getIsDeletableExpression() <em>Is Deletable Expression</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getIsDeletableExpression()
     * @generated
     * @ordered
     */
    protected static final String IS_DELETABLE_EXPRESSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsDeletableExpression() <em>Is Deletable Expression</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getIsDeletableExpression()
     * @generated
     * @ordered
     */
    protected String isDeletableExpression = IS_DELETABLE_EXPRESSION_EDEFAULT;

    /**
     * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getBody()
     * @generated
     * @ordered
     */
    protected EList<Operation> body;

    /**
     * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getStyle()
     * @generated
     * @ordered
     */
    protected ListDescriptionStyle style;

    /**
     * The default value of the '{@link #getIsEnabledExpression() <em>Is Enabled Expression</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getIsEnabledExpression()
     */
    protected static final String IS_ENABLED_EXPRESSION_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getConditionalStyles() <em>Conditional Styles</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getConditionalStyles()
     */
    protected EList<ConditionalListDescriptionStyle> conditionalStyles;
    /**
     * The cached value of the '{@link #getIsEnabledExpression() <em>Is Enabled Expression</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getIsEnabledExpression()
     */
    protected String isEnabledExpression = IS_ENABLED_EXPRESSION_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ListDescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FormPackage.Literals.LIST_DESCRIPTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getValueExpression() {
        return this.valueExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setValueExpression(String newValueExpression) {
        String oldValueExpression = this.valueExpression;
        this.valueExpression = newValueExpression;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.LIST_DESCRIPTION__VALUE_EXPRESSION, oldValueExpression, this.valueExpression));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getDisplayExpression() {
        return this.displayExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDisplayExpression(String newDisplayExpression) {
        String oldDisplayExpression = this.displayExpression;
        this.displayExpression = newDisplayExpression;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.LIST_DESCRIPTION__DISPLAY_EXPRESSION, oldDisplayExpression, this.displayExpression));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getIsDeletableExpression() {
        return this.isDeletableExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setIsDeletableExpression(String newIsDeletableExpression) {
        String oldIsDeletableExpression = this.isDeletableExpression;
        this.isDeletableExpression = newIsDeletableExpression;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.LIST_DESCRIPTION__IS_DELETABLE_EXPRESSION, oldIsDeletableExpression, this.isDeletableExpression));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Operation> getBody() {
        if (this.body == null) {
            this.body = new EObjectContainmentEList<>(Operation.class, this, FormPackage.LIST_DESCRIPTION__BODY);
        }
        return this.body;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ListDescriptionStyle getStyle() {
        return this.style;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetStyle(ListDescriptionStyle newStyle, NotificationChain msgs) {
        ListDescriptionStyle oldStyle = this.style;
        this.style = newStyle;
        if (this.eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.LIST_DESCRIPTION__STYLE, oldStyle, newStyle);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStyle(ListDescriptionStyle newStyle) {
        if (newStyle != this.style) {
            NotificationChain msgs = null;
            if (this.style != null)
                msgs = ((InternalEObject) this.style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.LIST_DESCRIPTION__STYLE, null, msgs);
            if (newStyle != null)
                msgs = ((InternalEObject) newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.LIST_DESCRIPTION__STYLE, null, msgs);
            msgs = this.basicSetStyle(newStyle, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.LIST_DESCRIPTION__STYLE, newStyle, newStyle));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ConditionalListDescriptionStyle> getConditionalStyles() {
        if (this.conditionalStyles == null) {
            this.conditionalStyles = new EObjectContainmentEList<>(ConditionalListDescriptionStyle.class, this, FormPackage.LIST_DESCRIPTION__CONDITIONAL_STYLES);
        }
        return this.conditionalStyles;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getIsEnabledExpression() {
        return this.isEnabledExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setIsEnabledExpression(String newIsEnabledExpression) {
        String oldIsEnabledExpression = this.isEnabledExpression;
        this.isEnabledExpression = newIsEnabledExpression;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.LIST_DESCRIPTION__IS_ENABLED_EXPRESSION, oldIsEnabledExpression, this.isEnabledExpression));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FormPackage.LIST_DESCRIPTION__BODY:
                return ((InternalEList<?>) this.getBody()).basicRemove(otherEnd, msgs);
            case FormPackage.LIST_DESCRIPTION__STYLE:
                return this.basicSetStyle(null, msgs);
            case FormPackage.LIST_DESCRIPTION__CONDITIONAL_STYLES:
                return ((InternalEList<?>) this.getConditionalStyles()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FormPackage.LIST_DESCRIPTION__VALUE_EXPRESSION:
                return this.getValueExpression();
            case FormPackage.LIST_DESCRIPTION__DISPLAY_EXPRESSION:
                return this.getDisplayExpression();
            case FormPackage.LIST_DESCRIPTION__IS_DELETABLE_EXPRESSION:
                return this.getIsDeletableExpression();
            case FormPackage.LIST_DESCRIPTION__BODY:
                return this.getBody();
            case FormPackage.LIST_DESCRIPTION__STYLE:
                return this.getStyle();
            case FormPackage.LIST_DESCRIPTION__CONDITIONAL_STYLES:
                return this.getConditionalStyles();
            case FormPackage.LIST_DESCRIPTION__IS_ENABLED_EXPRESSION:
                return this.getIsEnabledExpression();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case FormPackage.LIST_DESCRIPTION__VALUE_EXPRESSION:
                this.setValueExpression((String) newValue);
                return;
            case FormPackage.LIST_DESCRIPTION__DISPLAY_EXPRESSION:
                this.setDisplayExpression((String) newValue);
                return;
            case FormPackage.LIST_DESCRIPTION__IS_DELETABLE_EXPRESSION:
                this.setIsDeletableExpression((String) newValue);
                return;
            case FormPackage.LIST_DESCRIPTION__BODY:
                this.getBody().clear();
                this.getBody().addAll((Collection<? extends Operation>) newValue);
                return;
            case FormPackage.LIST_DESCRIPTION__STYLE:
                this.setStyle((ListDescriptionStyle) newValue);
                return;
            case FormPackage.LIST_DESCRIPTION__CONDITIONAL_STYLES:
                this.getConditionalStyles().clear();
                this.getConditionalStyles().addAll((Collection<? extends ConditionalListDescriptionStyle>) newValue);
                return;
            case FormPackage.LIST_DESCRIPTION__IS_ENABLED_EXPRESSION:
                this.setIsEnabledExpression((String) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case FormPackage.LIST_DESCRIPTION__VALUE_EXPRESSION:
                this.setValueExpression(VALUE_EXPRESSION_EDEFAULT);
                return;
            case FormPackage.LIST_DESCRIPTION__DISPLAY_EXPRESSION:
                this.setDisplayExpression(DISPLAY_EXPRESSION_EDEFAULT);
                return;
            case FormPackage.LIST_DESCRIPTION__IS_DELETABLE_EXPRESSION:
                this.setIsDeletableExpression(IS_DELETABLE_EXPRESSION_EDEFAULT);
                return;
            case FormPackage.LIST_DESCRIPTION__BODY:
                this.getBody().clear();
                return;
            case FormPackage.LIST_DESCRIPTION__STYLE:
                this.setStyle((ListDescriptionStyle) null);
                return;
            case FormPackage.LIST_DESCRIPTION__CONDITIONAL_STYLES:
                this.getConditionalStyles().clear();
                return;
            case FormPackage.LIST_DESCRIPTION__IS_ENABLED_EXPRESSION:
                this.setIsEnabledExpression(IS_ENABLED_EXPRESSION_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case FormPackage.LIST_DESCRIPTION__VALUE_EXPRESSION:
                return VALUE_EXPRESSION_EDEFAULT == null ? this.valueExpression != null : !VALUE_EXPRESSION_EDEFAULT.equals(this.valueExpression);
            case FormPackage.LIST_DESCRIPTION__DISPLAY_EXPRESSION:
                return DISPLAY_EXPRESSION_EDEFAULT == null ? this.displayExpression != null : !DISPLAY_EXPRESSION_EDEFAULT.equals(this.displayExpression);
            case FormPackage.LIST_DESCRIPTION__IS_DELETABLE_EXPRESSION:
                return IS_DELETABLE_EXPRESSION_EDEFAULT == null ? this.isDeletableExpression != null : !IS_DELETABLE_EXPRESSION_EDEFAULT.equals(this.isDeletableExpression);
            case FormPackage.LIST_DESCRIPTION__BODY:
                return this.body != null && !this.body.isEmpty();
            case FormPackage.LIST_DESCRIPTION__STYLE:
                return this.style != null;
            case FormPackage.LIST_DESCRIPTION__CONDITIONAL_STYLES:
                return this.conditionalStyles != null && !this.conditionalStyles.isEmpty();
            case FormPackage.LIST_DESCRIPTION__IS_ENABLED_EXPRESSION:
                return !Objects.equals(IS_ENABLED_EXPRESSION_EDEFAULT, this.isEnabledExpression);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (valueExpression: ");
        result.append(this.valueExpression);
        result.append(", displayExpression: ");
        result.append(this.displayExpression);
        result.append(", isDeletableExpression: ");
        result.append(this.isDeletableExpression);
        result.append(", IsEnabledExpression: ");
        result.append(this.isEnabledExpression);
        result.append(')');
        return result.toString();
    }

} // ListDescriptionImpl
