package dev.mishkun.disample.feature

import android.os.Parcelable
import dev.mishkun.disample.utils.Analyst
import dev.mishkun.disample.utils.DepRef
import kotlinx.android.parcel.Parcelize

interface FeatureComponent {
    val feature: Feature

    @Parcelize
    data class Args(val filterId: String): Parcelable

    companion object {
        lateinit var componentRef: DepRef<Args, FeatureComponent>
    }

}

