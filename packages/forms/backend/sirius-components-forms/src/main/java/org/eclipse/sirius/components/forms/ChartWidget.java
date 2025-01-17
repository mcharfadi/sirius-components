/*******************************************************************************
 * Copyright (c) 2022, 2023 Obeo.
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
package org.eclipse.sirius.components.forms;

import java.text.MessageFormat;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

import org.eclipse.sirius.components.annotations.Immutable;
import org.eclipse.sirius.components.charts.IChart;
import org.eclipse.sirius.components.forms.validation.Diagnostic;

/**
 * The Chart widget.
 *
 * @author fbarbin
 */
@Immutable
public final class ChartWidget extends AbstractWidget {
    private IChart chart;

    private ChartWidget() {
        // Prevent instantiation
    }

    public IChart getChart() {
        return this.chart;
    }

    public static Builder newChartWidget(String id) {
        return new Builder(id);
    }

    @Override
    public String toString() {
        String pattern = "{0} '{'id: {1}, label: {2}'}'";
        return MessageFormat.format(pattern, this.getClass().getSimpleName(), this.getId(), this.label);
    }

    /**
     * The builder used to create the Chart Widget.
     *
     * @author ldelaigue
     */
    @SuppressWarnings("checkstyle:HiddenField")
    public static final class Builder {

        private final String id;

        private String label;

        private String iconURL;

        private IChart chart;

        private List<Diagnostic> diagnostics;

        private Supplier<String> helpTextProvider;

        private final boolean readOnly = true; // Read-only by nature;

        private Builder(String id) {
            this.id = Objects.requireNonNull(id);
        }

        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder iconURL(String iconURL) {
            this.iconURL = Objects.requireNonNull(iconURL);
            return this;
        }

        public Builder chart(IChart chart) {
            this.chart = Objects.requireNonNull(chart);
            return this;
        }

        public Builder diagnostics(List<Diagnostic> diagnostics) {
            this.diagnostics = Objects.requireNonNull(diagnostics);
            return this;
        }

        public Builder helpTextProvider(Supplier<String> helpTextProvider) {
            this.helpTextProvider = Objects.requireNonNull(helpTextProvider);
            return this;
        }

        public ChartWidget build() {
            ChartWidget chartWidget = new ChartWidget();
            chartWidget.id = Objects.requireNonNull(this.id);
            chartWidget.label = Objects.requireNonNull(this.label);
            chartWidget.iconURL = this.iconURL; // Optional on purpose
            chartWidget.chart = Objects.requireNonNull(this.chart);
            chartWidget.diagnostics = Objects.requireNonNull(this.diagnostics);
            chartWidget.helpTextProvider = this.helpTextProvider; // Optional on purpose
            chartWidget.readOnly = this.readOnly;
            return chartWidget;
        }
    }
}
