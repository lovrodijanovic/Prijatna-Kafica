package com.example.prijatnakafica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val fragments: ArrayList<Fragment> = arrayListOf(
            AboutFragment(),
            MoccaFragment(),
            V60Fragment(),
            EspressoFragment(),
            FrenchPressFragment(),
            AeroPressFragment(),
            ChemexFragment()
        )

        val adapter = ViewPagerAdapter(fragments,this)
        viewPager.adapter = adapter
    }
}