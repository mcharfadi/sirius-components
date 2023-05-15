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
package org.eclipse.sirius.components.view.builder.generated;

/**
 * Builder for CheckboxDescriptionStyleBuilder.
 * @generated
 */
@SuppressWarnings("checkstyle:JavadocType")
public class CheckboxDescriptionStyleBuilder {

    /**
     * Create instance org.eclipse.sirius.components.view.CheckboxDescriptionStyle.
     * @generated
     */
    private org.eclipse.sirius.components.view.CheckboxDescriptionStyle checkboxDescriptionStyle = org.eclipse.sirius.components.view.ViewFactory.eINSTANCE.createCheckboxDescriptionStyle();

    /**
     * Return instance org.eclipse.sirius.components.view.CheckboxDescriptionStyle.
     * @generated
     */
    protected org.eclipse.sirius.components.view.CheckboxDescriptionStyle getCheckboxDescriptionStyle() {
        return this.checkboxDescriptionStyle;
    }

    /**
     * Return instance org.eclipse.sirius.components.view.CheckboxDescriptionStyle.
     * @generated
     */
    public org.eclipse.sirius.components.view.CheckboxDescriptionStyle build() {
        return this.getCheckboxDescriptionStyle();
    }

    /**
     * Setter for Color.
     *
     * @generated
     */
    public CheckboxDescriptionStyleBuilder color(org.eclipse.sirius.components.view.UserColor value) {
        this.getCheckboxDescriptionStyle().setColor(value);
        return this;
    }

}

