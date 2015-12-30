package com.muzzyhorse.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by Administrator on 15-12-30.
 */
class Liannu implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println 'hello plugin'
    }
}
