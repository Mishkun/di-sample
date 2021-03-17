package dev.mishkun.disample.lib

import android.os.Parcelable
import dev.mishkun.disample.utils.Analyst
import dev.mishkun.disample.utils.DepRef
import dev.mishkun.disample.utils.Listener
import kotlinx.android.parcel.Parcelize

interface DialogComponent {
    val feature: DialogFeature

    @Parcelize
    data class Args(val filterId: String, val listener: Listener): Parcelable

    companion object {
        lateinit var componentRef: DepRef<Args, DialogComponent>
    }
}


