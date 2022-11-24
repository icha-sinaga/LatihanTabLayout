package com.example.latihantablayout

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity){

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {ExploreFragment()}
            1 -> {FlightFragment()}
            2 -> {TripFragment()}
            else -> { throw Resources.NotFoundException("The Menu Not Found")}
        }
    }

}