package com.plugin;

/**
 * Alibaba.com Inc.
 * Copyright (c) 1999-2019 All Rights Reserved.
 *
 * @author panes
 * @contact pt135794@alibaba-inc.com
 */
public class DAConfig {
    private static DAConfig sInstance = new DAConfig();

    public DAPluginExtension extension;

    public static DAConfig getInstance() {
        return sInstance;
    }
}
