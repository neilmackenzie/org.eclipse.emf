/**
 * <copyright>
 *
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: JETException.java,v 1.2 2004/05/16 17:33:10 emerks Exp $
 */
package org.eclipse.emf.codegen.jet;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import org.eclipse.emf.codegen.CodeGenPlugin;



/**
 * Base class for all exceptions generated by the JET engine. 
 * Makes it convienient to catch just this at the top-level.
 */
public class JETException extends CoreException 
{
  public JETException(String reason) 
  {
    super(new Status(IStatus.ERROR, CodeGenPlugin.INSTANCE.getSymbolicName(), 0, reason, null));
  }

  /**
   * Creates a JETException with the embedded exception and the reason for throwing a JETException.
   */
  public JETException (String reason, Throwable exception) 
  {
    super(new Status(IStatus.ERROR, CodeGenPlugin.INSTANCE.getSymbolicName(), 0, reason, exception));
  }

  /**
   * Creates a JETException with the embedded exception.
   */
  public JETException (Throwable exception) 
  {
    super
      (new Status
        (IStatus.ERROR, CodeGenPlugin.INSTANCE.getSymbolicName(), 0, getMessage(exception), exception));
  }

  protected static String getMessage(Throwable exception)
  {
    String result = exception.getLocalizedMessage();
    if (result == null)
    {
      result = "";
    }

    return result;
  }
}
