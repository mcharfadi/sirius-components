/**
 * Copyright (c) 2021, 2023 Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *      Obeo - initial API and implementation
 */
package org.eclipse.sirius.components.view.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.sirius.components.view.LabelStyle;
import org.eclipse.sirius.components.view.MultiSelectDescriptionStyle;
import org.eclipse.sirius.components.view.UserColor;
import org.eclipse.sirius.components.view.ViewPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Multi Select Description Style</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.sirius.components.view.impl.MultiSelectDescriptionStyleImpl#getFontSize <em>Font
 * Size</em>}</li>
 * <li>{@link org.eclipse.sirius.components.view.impl.MultiSelectDescriptionStyleImpl#isItalic <em>Italic</em>}</li>
 * <li>{@link org.eclipse.sirius.components.view.impl.MultiSelectDescriptionStyleImpl#isBold <em>Bold</em>}</li>
 * <li>{@link org.eclipse.sirius.components.view.impl.MultiSelectDescriptionStyleImpl#isUnderline
 * <em>Underline</em>}</li>
 * <li>{@link org.eclipse.sirius.components.view.impl.MultiSelectDescriptionStyleImpl#isStrikeThrough <em>Strike
 * Through</em>}</li>
 * <li>{@link org.eclipse.sirius.components.view.impl.MultiSelectDescriptionStyleImpl#getBackgroundColor <em>Background
 * Color</em>}</li>
 * <li>{@link org.eclipse.sirius.components.view.impl.MultiSelectDescriptionStyleImpl#getForegroundColor <em>Foreground
 * Color</em>}</li>
 * <li>{@link org.eclipse.sirius.components.view.impl.MultiSelectDescriptionStyleImpl#isShowIcon <em>Show
 * Icon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiSelectDescriptionStyleImpl extends WidgetDescriptionStyleImpl implements MultiSelectDescriptionStyle {
    /**
     * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getFontSize()
     * @generated
     * @ordered
     */
    protected static final int FONT_SIZE_EDEFAULT = 14;

    /**
     * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #getFontSize()
     * @generated
     * @ordered
     */
    protected int fontSize = FONT_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #isItalic() <em>Italic</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #isItalic()
     * @generated
     * @ordered
     */
    protected static final boolean ITALIC_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isItalic() <em>Italic</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #isItalic()
     * @generated
     * @ordered
     */
    protected boolean italic = ITALIC_EDEFAULT;

    /**
     * The default value of the '{@link #isBold() <em>Bold</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #isBold()
     * @generated
     * @ordered
     */
    protected static final boolean BOLD_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isBold() <em>Bold</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #isBold()
     * @generated
     * @ordered
     */
    protected boolean bold = BOLD_EDEFAULT;

    /**
     * The default value of the '{@link #isUnderline() <em>Underline</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #isUnderline()
     * @generated
     * @ordered
     */
    protected static final boolean UNDERLINE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isUnderline() <em>Underline</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #isUnderline()
     * @generated
     * @ordered
     */
    protected boolean underline = UNDERLINE_EDEFAULT;

    /**
     * The default value of the '{@link #isStrikeThrough() <em>Strike Through</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #isStrikeThrough()
     * @generated
     * @ordered
     */
    protected static final boolean STRIKE_THROUGH_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isStrikeThrough() <em>Strike Through</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #isStrikeThrough()
     * @generated
     * @ordered
     */
    protected boolean strikeThrough = STRIKE_THROUGH_EDEFAULT;

    /**
     * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getBackgroundColor()
     * @generated
     * @ordered
     */
    protected UserColor backgroundColor;

    /**
     * The cached value of the '{@link #getForegroundColor() <em>Foreground Color</em>}' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getForegroundColor()
     * @generated
     * @ordered
     */
    protected UserColor foregroundColor;

    /**
     * The default value of the '{@link #isShowIcon() <em>Show Icon</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #isShowIcon()
     * @generated
     * @ordered
     */
    protected static final boolean SHOW_ICON_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isShowIcon() <em>Show Icon</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #isShowIcon()
     * @generated
     * @ordered
     */
    protected boolean showIcon = SHOW_ICON_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MultiSelectDescriptionStyleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ViewPackage.Literals.MULTI_SELECT_DESCRIPTION_STYLE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getFontSize() {
        return this.fontSize;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFontSize(int newFontSize) {
        int oldFontSize = this.fontSize;
        this.fontSize = newFontSize;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__FONT_SIZE, oldFontSize, this.fontSize));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isItalic() {
        return this.italic;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setItalic(boolean newItalic) {
        boolean oldItalic = this.italic;
        this.italic = newItalic;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__ITALIC, oldItalic, this.italic));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isBold() {
        return this.bold;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setBold(boolean newBold) {
        boolean oldBold = this.bold;
        this.bold = newBold;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__BOLD, oldBold, this.bold));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isUnderline() {
        return this.underline;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUnderline(boolean newUnderline) {
        boolean oldUnderline = this.underline;
        this.underline = newUnderline;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__UNDERLINE, oldUnderline, this.underline));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isStrikeThrough() {
        return this.strikeThrough;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStrikeThrough(boolean newStrikeThrough) {
        boolean oldStrikeThrough = this.strikeThrough;
        this.strikeThrough = newStrikeThrough;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__STRIKE_THROUGH, oldStrikeThrough, this.strikeThrough));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public UserColor getBackgroundColor() {
        if (this.backgroundColor != null && this.backgroundColor.eIsProxy()) {
            InternalEObject oldBackgroundColor = (InternalEObject) this.backgroundColor;
            this.backgroundColor = (UserColor) this.eResolveProxy(oldBackgroundColor);
            if (this.backgroundColor != oldBackgroundColor) {
                if (this.eNotificationRequired())
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__BACKGROUND_COLOR, oldBackgroundColor, this.backgroundColor));
            }
        }
        return this.backgroundColor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public UserColor basicGetBackgroundColor() {
        return this.backgroundColor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setBackgroundColor(UserColor newBackgroundColor) {
        UserColor oldBackgroundColor = this.backgroundColor;
        this.backgroundColor = newBackgroundColor;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__BACKGROUND_COLOR, oldBackgroundColor, this.backgroundColor));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public UserColor getForegroundColor() {
        if (this.foregroundColor != null && this.foregroundColor.eIsProxy()) {
            InternalEObject oldForegroundColor = (InternalEObject) this.foregroundColor;
            this.foregroundColor = (UserColor) this.eResolveProxy(oldForegroundColor);
            if (this.foregroundColor != oldForegroundColor) {
                if (this.eNotificationRequired())
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__FOREGROUND_COLOR, oldForegroundColor, this.foregroundColor));
            }
        }
        return this.foregroundColor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public UserColor basicGetForegroundColor() {
        return this.foregroundColor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setForegroundColor(UserColor newForegroundColor) {
        UserColor oldForegroundColor = this.foregroundColor;
        this.foregroundColor = newForegroundColor;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__FOREGROUND_COLOR, oldForegroundColor, this.foregroundColor));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isShowIcon() {
        return this.showIcon;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setShowIcon(boolean newShowIcon) {
        boolean oldShowIcon = this.showIcon;
        this.showIcon = newShowIcon;
        if (this.eNotificationRequired())
            this.eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__SHOW_ICON, oldShowIcon, this.showIcon));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__FONT_SIZE:
                return this.getFontSize();
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__ITALIC:
                return this.isItalic();
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__BOLD:
                return this.isBold();
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__UNDERLINE:
                return this.isUnderline();
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__STRIKE_THROUGH:
                return this.isStrikeThrough();
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__BACKGROUND_COLOR:
                if (resolve)
                    return this.getBackgroundColor();
                return this.basicGetBackgroundColor();
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__FOREGROUND_COLOR:
                if (resolve)
                    return this.getForegroundColor();
                return this.basicGetForegroundColor();
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__SHOW_ICON:
                return this.isShowIcon();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__FONT_SIZE:
                this.setFontSize((Integer) newValue);
                return;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__ITALIC:
                this.setItalic((Boolean) newValue);
                return;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__BOLD:
                this.setBold((Boolean) newValue);
                return;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__UNDERLINE:
                this.setUnderline((Boolean) newValue);
                return;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__STRIKE_THROUGH:
                this.setStrikeThrough((Boolean) newValue);
                return;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__BACKGROUND_COLOR:
                this.setBackgroundColor((UserColor) newValue);
                return;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__FOREGROUND_COLOR:
                this.setForegroundColor((UserColor) newValue);
                return;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__SHOW_ICON:
                this.setShowIcon((Boolean) newValue);
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
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__FONT_SIZE:
                this.setFontSize(FONT_SIZE_EDEFAULT);
                return;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__ITALIC:
                this.setItalic(ITALIC_EDEFAULT);
                return;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__BOLD:
                this.setBold(BOLD_EDEFAULT);
                return;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__UNDERLINE:
                this.setUnderline(UNDERLINE_EDEFAULT);
                return;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__STRIKE_THROUGH:
                this.setStrikeThrough(STRIKE_THROUGH_EDEFAULT);
                return;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__BACKGROUND_COLOR:
                this.setBackgroundColor((UserColor) null);
                return;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__FOREGROUND_COLOR:
                this.setForegroundColor((UserColor) null);
                return;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__SHOW_ICON:
                this.setShowIcon(SHOW_ICON_EDEFAULT);
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
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__FONT_SIZE:
                return this.fontSize != FONT_SIZE_EDEFAULT;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__ITALIC:
                return this.italic != ITALIC_EDEFAULT;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__BOLD:
                return this.bold != BOLD_EDEFAULT;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__UNDERLINE:
                return this.underline != UNDERLINE_EDEFAULT;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__STRIKE_THROUGH:
                return this.strikeThrough != STRIKE_THROUGH_EDEFAULT;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__BACKGROUND_COLOR:
                return this.backgroundColor != null;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__FOREGROUND_COLOR:
                return this.foregroundColor != null;
            case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__SHOW_ICON:
                return this.showIcon != SHOW_ICON_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == LabelStyle.class) {
            switch (derivedFeatureID) {
                case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__FONT_SIZE:
                    return ViewPackage.LABEL_STYLE__FONT_SIZE;
                case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__ITALIC:
                    return ViewPackage.LABEL_STYLE__ITALIC;
                case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__BOLD:
                    return ViewPackage.LABEL_STYLE__BOLD;
                case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__UNDERLINE:
                    return ViewPackage.LABEL_STYLE__UNDERLINE;
                case ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__STRIKE_THROUGH:
                    return ViewPackage.LABEL_STYLE__STRIKE_THROUGH;
                default:
                    return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == LabelStyle.class) {
            switch (baseFeatureID) {
                case ViewPackage.LABEL_STYLE__FONT_SIZE:
                    return ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__FONT_SIZE;
                case ViewPackage.LABEL_STYLE__ITALIC:
                    return ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__ITALIC;
                case ViewPackage.LABEL_STYLE__BOLD:
                    return ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__BOLD;
                case ViewPackage.LABEL_STYLE__UNDERLINE:
                    return ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__UNDERLINE;
                case ViewPackage.LABEL_STYLE__STRIKE_THROUGH:
                    return ViewPackage.MULTI_SELECT_DESCRIPTION_STYLE__STRIKE_THROUGH;
                default:
                    return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (fontSize: ");
        result.append(this.fontSize);
        result.append(", italic: ");
        result.append(this.italic);
        result.append(", bold: ");
        result.append(this.bold);
        result.append(", underline: ");
        result.append(this.underline);
        result.append(", strikeThrough: ");
        result.append(this.strikeThrough);
        result.append(", showIcon: ");
        result.append(this.showIcon);
        result.append(')');
        return result.toString();
    }

} // MultiSelectDescriptionStyleImpl
