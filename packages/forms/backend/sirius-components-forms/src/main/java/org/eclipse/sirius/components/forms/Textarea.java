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
package org.eclipse.sirius.components.forms;

import java.text.MessageFormat;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

import org.eclipse.sirius.components.annotations.Immutable;
import org.eclipse.sirius.components.forms.validation.Diagnostic;
import org.eclipse.sirius.components.representations.IStatus;

/**
 * The text area widget.
 *
 * @author lfasani
 */
@Immutable
public final class Textarea extends AbstractWidget {

    private String value;

    private Function<String, IStatus> newValueHandler;

    private TextareaStyle style;

    private Function<CompletionRequest, List<CompletionProposal>> completionProposalsProvider;

    private Textarea() {
        // Prevent instantiation
    }

    public String getValue() {
        return this.value;
    }

    public Function<String, IStatus> getNewValueHandler() {
        return this.newValueHandler;
    }

    public TextareaStyle getStyle() {
        return this.style;
    }

    public boolean isSupportsCompletion() {
        return this.completionProposalsProvider != null;
    }

    public Function<CompletionRequest, List<CompletionProposal>> getCompletionProposalsProvider() {
        return this.completionProposalsProvider;
    }

    public static Builder newTextarea(String id) {
        return new Builder(id);
    }

    @Override
    public String toString() {
        String pattern = "{0} '{'id: {1}, label: {2}, value: {3}, supportsCompletion: {4}'}'";
        return MessageFormat.format(pattern, this.getClass().getSimpleName(), this.getId(), this.label, this.value, this.completionProposalsProvider != null);
    }

    /**
     * The builder used to create the textarea.
     *
     * @author lfasani
     */
    @SuppressWarnings("checkstyle:HiddenField")
    public static final class Builder {
        private String id;

        private String label;

        private String iconURL;

        private String value;

        private Function<String, IStatus> newValueHandler;

        private TextareaStyle style;

        private Function<CompletionRequest, List<CompletionProposal>> completionProposalsProvider;

        private List<Diagnostic> diagnostics;

        private Supplier<String> helpTextProvider;

        private boolean readOnly;

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

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder newValueHandler(Function<String, IStatus> newValueHandler) {
            this.newValueHandler = Objects.requireNonNull(newValueHandler);
            return this;
        }

        public Builder style(TextareaStyle style) {
            this.style = Objects.requireNonNull(style);
            return this;
        }

        public Builder completionProposalsProvider(Function<CompletionRequest, List<CompletionProposal>> completionProposalsProvider) {
            this.completionProposalsProvider = Objects.requireNonNull(completionProposalsProvider);
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

        public Builder readOnly(boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Textarea build() {
            Textarea textarea = new Textarea();
            textarea.id = Objects.requireNonNull(this.id);
            textarea.label = Objects.requireNonNull(this.label);
            textarea.iconURL = this.iconURL; // Optional on purpose
            textarea.value = Objects.requireNonNull(this.value);
            textarea.newValueHandler = Objects.requireNonNull(this.newValueHandler);
            textarea.style = this.style; // Optional on purpose
            textarea.completionProposalsProvider = this.completionProposalsProvider; // Optional on purpose
            textarea.diagnostics = Objects.requireNonNull(this.diagnostics);
            textarea.helpTextProvider = this.helpTextProvider; // Optional on purpose
            textarea.readOnly = this.readOnly;
            return textarea;
        }
    }
}
