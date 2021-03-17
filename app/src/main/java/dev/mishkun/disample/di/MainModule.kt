package dev.mishkun.disample.di

import dev.mishkun.disample.feature.FeatureApi
import dev.mishkun.disample.feature.FeatureComponent
import dev.mishkun.disample.lib.DialogApi
import dev.mishkun.disample.utils.Analyst
import dev.mishkun.disample.utils.DepRef


class MainModule : FeatureModule.Dependencies {

    override val featureApi: FeatureApi by lazy { TODO() }
    override val dialogApi: DialogApi by lazy { TODO() }

    override val analyst: Analyst = TODO()

    init {
        FeatureComponent.componentRef = DepRef { args ->
            FeatureModule(args, this)
        }
    }
}
