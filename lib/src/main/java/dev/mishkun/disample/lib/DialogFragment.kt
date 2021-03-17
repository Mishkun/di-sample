package dev.mishkun.disample.lib

import androidx.fragment.app.Fragment

class DialogFragment : Fragment() {
    private val component = DialogComponent.componentRef.get(requireArguments().getParcelable("args")!!)
    private val feature = component.feature
}
