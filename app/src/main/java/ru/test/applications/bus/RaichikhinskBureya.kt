package ru.test.applications.bus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.test.applications.bus.databinding.FragmentRaichikhinskBureyaBinding

class RaichikhinskBureya: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentRaichikhinskBureyaBinding.inflate(inflater)

        val raichikhinsk = "\nРайчихинск\n\n5-35\n\n7-00\n\n9-45\n\n11-15\n\n12-15\n\n15-05\n\n16-35\n\n18-30"
        val progress = "\nПрогресс\n\n6-30\n\n8-00\n\n10-40\n\n12-10\n\n13-10\n\n16-00\n\n17-30\n\n19-25"
        val bureya = "\nБурея\n\n7-10 (6-50)\n\n8-50 (8-30)\n\n11-20 (11-00)\n\n12-50 (12-30)\n\n13-50 (13-30)\n\n16-40 (16-20)\n\n18-10 (17-50)\n\n20-00 (19-40)"

        with(binding) {
            timing1.text = raichikhinsk
            timing2.text = progress
            timing3.text = bureya
        }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = RaichikhinskBureya()
    }
}