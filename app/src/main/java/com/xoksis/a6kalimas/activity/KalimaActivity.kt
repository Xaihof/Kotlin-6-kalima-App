package com.xoksis.a6kalimas.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.xoksis.a6kalimas.R
import com.xoksis.a6kalimas.adapter.ViewPagerAdapter
import com.xoksis.a6kalimas.databinding.ActivityKalimaBinding

class KalimaActivity : AppCompatActivity() {

    private val binding: ActivityKalimaBinding by lazy {
        ActivityKalimaBinding.inflate(layoutInflater)
    }

    private lateinit var adapter: FragmentStateAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val kalima = intent.getStringExtra("kalima")

        adapter = ViewPagerAdapter(supportFragmentManager, lifecycle, kalima.toString())

        binding.apply {

            tabLayout.addTab(tabLayout.newTab().setText("Kalima"))
            tabLayout.addTab(tabLayout.newTab().setText("Translation"))

            viewPager2.adapter = adapter

            tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    viewPager2.currentItem = tab!!.position
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                }

                override fun onTabReselected(tab: TabLayout.Tab?) {
                }
            })

            viewPager2.registerOnPageChangeCallback(object :ViewPager2.OnPageChangeCallback(){
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    tabLayout.selectTab(tabLayout.getTabAt(position))
                }
            })

        }
    }
}