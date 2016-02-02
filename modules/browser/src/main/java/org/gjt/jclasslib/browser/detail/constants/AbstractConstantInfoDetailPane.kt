/*
    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU General Public
    License as published by the Free Software Foundation; either
    version 2 of the license, or (at your option) any later version.
*/

package org.gjt.jclasslib.browser.detail.constants;

import org.gjt.jclasslib.browser.BrowserServices;
import org.gjt.jclasslib.browser.detail.FixedListDetailPane;
import org.gjt.jclasslib.structures.Constant;

import javax.swing.tree.TreePath;

/**
    Base class for all constant pool entry detail panes.
 
    @author <a href="mailto:jclasslib@ej-technologies.com">Ingo Kegel</a>
*/
public abstract class AbstractConstantInfoDetailPane extends FixedListDetailPane {

    /** Message which is displayed if the constant pool entry is invalid. */
    protected static final String MESSAGE_INVALID_CONSTANT_POOL_ENTRY = "invalid constant pool entry";

    /**
        Constructor.
        @param services the associated browser services.
     */
    protected AbstractConstantInfoDetailPane(BrowserServices services) {
        super(services);
    }
    
    protected <T extends Constant> T getConstant(TreePath treePath, Class<T> constantClass) {
        return constantClass.cast(getElement(treePath));
    }
    
}

