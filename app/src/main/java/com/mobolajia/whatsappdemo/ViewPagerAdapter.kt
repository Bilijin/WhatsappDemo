package com.mobolajia.whatsappdemo

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragment : Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment = when (position) {
        0 -> CameraFragment()
        1 -> ChatFragment()
        2 -> StatusFragment()
        3 -> CallFragment()

        else -> ChatFragment()
    }
}