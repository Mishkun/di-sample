package dev.mishkun.disample.feature

import androidx.fragment.app.Fragment

class FeatureFragment : Fragment() {
    private val component = FeatureComponent.componentRef.get(requireArguments().getParcelable("args")!!)
    private val feature = component.feature
}
