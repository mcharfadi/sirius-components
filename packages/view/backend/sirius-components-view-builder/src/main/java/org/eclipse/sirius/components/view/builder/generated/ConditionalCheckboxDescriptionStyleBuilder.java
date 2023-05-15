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
 * Builder for ConditionalCheckboxDescriptionStyleBuilder.
 * @generated
 */
@SuppressWarnings("checkstyle:JavadocType")
public class ConditionalCheckboxDescriptionStyleBuilder {

    /**
     * Create instance org.eclipse.sirius.components.view.ConditionalCheckboxDescriptionStyle.
     * @generated
     */
    private org.eclipse.sirius.components.view.ConditionalCheckboxDescriptionStyle conditionalCheckboxDescriptionStyle = org.eclipse.sirius.components.view.ViewFactory.eINSTANCE.createConditionalCheckboxDescriptionStyle();

    /**
     * Return instance org.eclipse.sirius.components.view.ConditionalCheckboxDescriptionStyle.
     * @generated
     */
    protected org.eclipse.sirius.components.view.ConditionalCheckboxDescriptionStyle getConditionalCheckboxDescriptionStyle() {
        return this.conditionalCheckboxDescriptionStyle;
    }

    /**
     * Return instance org.eclipse.sirius.components.view.ConditionalCheckboxDescriptionStyle.
     * @generated
     */
    public org.eclipse.sirius.components.view.ConditionalCheckboxDescriptionStyle build() {
        return this.getConditionalCheckboxDescriptionStyle();
    }

    /**
     * Setter for Condition.
     *
     * @generated
     */
    public ConditionalCheckboxDescriptionStyleBuilder condition(java.lang.String value) {
        this.getConditionalCheckboxDescriptionStyle().setCondition(value);
        return this;
    }
    /**
     * Setter for Color.
     *
     * @generated
     */
    public ConditionalCheckboxDescriptionStyleBuilder color(org.eclipse.sirius.components.view.UserColor value) {
        this.getConditionalCheckboxDescriptionStyle().setColor(value);
        return this;
    }

}

