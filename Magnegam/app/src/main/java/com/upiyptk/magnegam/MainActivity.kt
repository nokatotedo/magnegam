package com.upiyptk.magnegam

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private lateinit var tvBab1: TextView
    private lateinit var tvBab2: TextView
    private lateinit var vpPembelajaran: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vpPembelajaran = findViewById(R.id.vp_pembelajaran)
        vpPembelajaran.adapter = AdapterViewPager(supportFragmentManager, lifecycle)

        tvBab1 = findViewById(R.id.tv_bab1)
        tvBab2 = findViewById(R.id.tv_bab2)
        val colorMati = Color.parseColor("#040E14")
        val colorHidup = Color.parseColor("#EFEBDF")
        vpPembelajaran.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                when(position) {
                    0 -> {
                        tvBab1.setTextColor(colorHidup)
                        tvBab2.setTextColor(colorMati)
                    }
                    1 -> {
                        tvBab1.setTextColor(colorMati)
                        tvBab2.setTextColor(colorHidup)
                    }
                }
            }
        })
    }
}