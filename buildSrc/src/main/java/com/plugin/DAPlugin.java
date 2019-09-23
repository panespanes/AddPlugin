package com.plugin;
import com.android.build.api.dsl.extension.AppExtension;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

import java.util.Collections;


/**
 * Alibaba.com Inc.
 * Copyright (c) 1999-2019 All Rights Reserved.
 *
 * @author panes
 * @contact pt135794@alibaba-inc.com
 */
public class DAPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        DAPluginExtension daPlugin = project.getExtensions().create("daPlugin", DAPluginExtension.class);
        DAConfig.getInstance().extension = daPlugin;

        AppExtension appExtension = (AppExtension) project.getProperties().get("android");
//        appExtension.registerTransform(new AddTryCatchTransform(project), Collections.EMPTY_LIST);

    }
}
