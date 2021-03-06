/*******************************************************************************
 * Copyright (c) 2013, 2014 Ericsson
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License 2.0 which
 * accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Marc-Andre Laperle - Initial API and implementation
 *******************************************************************************/

package org.eclipse.tracecompass.internal.tmf.ui.project.wizards.tracepkg;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/**
 * A label provider for the export trace tree.
 *
 * @author Marc-Andre Laperle
 */
public class TracePackageLabelProvider extends ColumnLabelProvider {

    @Override
    public void addListener(ILabelProviderListener listener) {
        // Do nothing
    }

    @Override
    public void dispose() {
        // Do nothing
    }

    @Override
    public boolean isLabelProperty(Object element, String property) {
        return false;
    }

    @Override
    public void removeListener(ILabelProviderListener listener) {
        // Do nothing
    }

    @Override
    public Image getImage(Object element) {
        return ((TracePackageElement) element).getImage();
    }

    @Override
    public String getText(Object element) {
        return ((TracePackageElement) element).getText();
    }

    @Override
    public Color getForeground(Object element) {
        if (!((TracePackageElement) element).isEnabled()) {
            return Display.getDefault().getSystemColor(SWT.COLOR_GRAY);
        }
        return null;
    }

    @Override
    public Color getBackground(Object element) {
        return null;
    }

}