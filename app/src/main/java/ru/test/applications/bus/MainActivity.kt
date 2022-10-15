package ru.test.applications.bus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import ru.test.applications.bus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.destination.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

            override fun onTabSelected(tab: TabLayout.Tab?) {
                var fragment: Fragment = RaichikhinskBureya.newInstance()
                if (tab != null) {
                    when (tab.position) {
                        1 -> fragment = BureyaRaichikhinsk.newInstance()
                    }
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.timetable, fragment).commit()
                }
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                // Handle tab reselect
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // Handle tab unselect
            }
        })

        supportFragmentManager
            .beginTransaction().replace(R.id.timetable, RaichikhinskBureya.newInstance()).commit()
    }
}