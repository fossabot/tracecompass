/*******************************************************************************
 * Copyright (c) 2015 Ericsson
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License 2.0 which
 * accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Bernd Hufmann - Initial API and implementation
 *******************************************************************************/

package org.eclipse.tracecompass.tmf.remote.core.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.tracecompass.internal.tmf.remote.core.Activator;
import org.junit.Test;

/**
 * Test the TMF remote core plug-in activator
 */
public class TmfRemoteCorePluginTest {

    // ------------------------------------------------------------------------
    // Attributes
    // ------------------------------------------------------------------------

    // Plug-in instantiation
    static final Activator fPlugin = new Activator();

    // ------------------------------------------------------------------------
    // Test cases
    // ------------------------------------------------------------------------

    /**
     * Test the plugin ID.
     */
    @Test
    public void testTmfCorePluginId() {
        assertEquals("Plugin ID", "org.eclipse.tracecompass.tmf.remote.core", Activator.PLUGIN_ID);
    }

    /**
     * Test the getDefault() static method.
     */
    @Test
    public void testGetDefault() {
        Activator plugin = Activator.getDefault();
        assertEquals("getDefault()", plugin, fPlugin);
    }
}
