package com.example.latihantablayout

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2
    /*private lateinit var toolbar: Toolbar*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)
        /*toolbar = findViewById(R.id.toolbar)*/
        /*setSupportActionBar(toolbar);*/

        viewPager.adapter = PagerAdapter(this)
        TabLayoutMediator(tabLayout, viewPager) { tab, index ->
            tab.text = when (index) {
                0 -> {
                    "Explore"
                }
                1 -> {
                    "Flight"
                }
                2 -> {
                    "Trip"
                }
                else -> {
                    throw Resources.NotFoundException("The Menu Not Found") }
                }



            }.attach()
        }
    }
