package dev.mishkun.disample.di

import dev.mishkun.disample.lib.DialogApi
import dev.mishkun.disample.lib.DialogComponent
import dev.mishkun.disample.lib.DialogFeature
import dev.mishkun.disample.lib.DialogRepo
import dev.mishkun.disample.utils.Analyst

class DialogModule(val args: DialogComponent.Args, val dependencies: Dependencies): DialogComponent {
    override val feature: DialogFeature
        get() = TODO()

    interface Dependencies {
        val api: DialogApi
        val analyst: Analyst
        val repo: DialogRepo
    }
}
