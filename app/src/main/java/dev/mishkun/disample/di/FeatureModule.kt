package dev.mishkun.disample.di

import dev.mishkun.disample.feature.Feature
import dev.mishkun.disample.feature.FeatureApi
import dev.mishkun.disample.feature.FeatureComponent
import dev.mishkun.disample.lib.DialogApi
import dev.mishkun.disample.lib.DialogComponent
import dev.mishkun.disample.lib.DialogRepo
import dev.mishkun.disample.utils.Analyst
import dev.mishkun.disample.utils.DepRef

class FeatureModule(args: FeatureComponent.Args, deps: Dependencies) : FeatureComponent, DialogModule.Dependencies {
    override val analyst: Analyst = deps.analyst
    override val api: DialogApi = deps.dialogApi
    override val repo: DialogRepo = TODO()

    init {
        DialogComponent.componentRef = DepRef { args: DialogComponent.Args ->
            DialogModule(args, this)
        }
    }

    override val feature: Feature
        get() = TODO()

    interface Dependencies {
        val dialogApi: DialogApi
        val featureApi: FeatureApi
        val analyst: Analyst
    }
}
