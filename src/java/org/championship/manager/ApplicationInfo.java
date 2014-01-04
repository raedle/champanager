/*
 * Copyright 2005-2006 Championship Manager development team.
 *
 * This file is part of Championship Manager.
 *
 * Championship Manager is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * Please see COPYING for the complete licence.
 */
package org.championship.manager;

/**
 * This <code>ApplicationInfo</code> provides version and compile time strings.
 * It is generated at build time.
 * <p/>
 * User: raedler
 * Date: 05.10.2006
 * Time: 17:26:58
 *
 * @author Roman R&auml;dle
 * @version $Id$
 * @since Championship Manager 0.1
 */
public class ApplicationInfo {

    public static String getApplicationName() {
        return "Championship Manager";
    }

    public static String getVersion() {
        return "1.0.0";
    }
    
    public static String getBuildtime() {
        return "2014-01-04 18:15";
    }

    public static String[] getAuthors() {
        return "Roman R�dle".split(",");
    }
}