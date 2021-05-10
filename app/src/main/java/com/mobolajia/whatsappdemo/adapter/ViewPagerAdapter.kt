package com.mobolajia.whatsappdemo.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mobolajia.whatsappdemo.view.fragment.CallFragment
import com.mobolajia.whatsappdemo.view.fragment.CameraFragment
import com.mobolajia.whatsappdemo.view.fragment.ChatFragment
import com.mobolajia.whatsappdemo.view.fragment.StatusFragment

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