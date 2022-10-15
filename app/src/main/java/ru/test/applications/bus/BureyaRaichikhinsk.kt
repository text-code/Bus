package ru.test.applications.bus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.test.applications.bus.databinding.FragmentRaichikhinskBureyaBinding

class BureyaRaichikhinsk:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentRaichikhinskBureyaBinding.inflate(inflater)

        val bureya = "\nБурея\n\n7-35 (7-45)\n\n9-05 (9-15)\n\n11-35 (11-45)\n\n13-15 (13-25)\n\n14-05 (14-15)\n\n17-20 (17-30)\n\n18-25 (18-35)\n\n21-15 (21-25)"
        val progress = "\nПрогресс\n\n8-10\n\n9-40\n\n12-10\n\n13-50\n\n14-40\n\n17-40\n\n19-00\n\n21-55"
        val raichikhinsk = "\nРайчихинск\n\n9-10\n\n10-40\n\n13-10\n\n14-50\n\n15-40\n\n18-20\n\n19-45\n\n22-35"

        with(binding) {
            timing1.text = bureya
            timing2.text = progress
            timing3.text = raichikhinsk
        }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BureyaRaichikhinsk()
    }
}