package me.leon.asm

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

public class LeonPlugin implements Plugin<Project> {
    void apply(Project project) {
        System.out.println("==LeonPlugin gradle plugin==")
        def android = project.extensions.getByType(AppExtension)
        println '----------- registering AutoTrackTransform  -----------'
        LeonTransform transform = new LeonTransform()
        android.registerTransform(transform)
    }
}