package com.github.chenhongshan.plugintemplate.services

import com.intellij.openapi.project.Project
import com.github.chenhongshan.plugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
