package com.mobolajia.whatsappdemo.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentContainer
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.mobolajia.whatsappdemo.R
import com.mobolajia.whatsappdemo.adapter.ViewPagerAdapter
import com.mobolajia.whatsappdemo.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private val binding : FragmentMainBinding by lazy {
        FragmentMainBinding.inflate(layoutInflater)
    }

    private lateinit var tab : TabLayout
    private lateinit var pager: ViewPager2

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tab = binding.tabLayout
        pager = binding.viewPager
//        pager.offscreenPageLimit = 4

        val adapter = ViewPagerAdapter(this)
        pager.adapter = adapter


        TabLayoutMediator(tab, pager) { tab, position ->
            tab.text = when (position){
                0 -> null
                1 -> "CHATS"
                2 -> "STATUS"
                3 -> "CALLS"
                else -> "BLANK"
            }
        }.attach()

        pager.currentItem = 1
//        tab.getTabAt(0)!!.icon = context?.let { ContextCompat.getDrawable(it, R.drawable.ic_baseline_camera_alt_24) }

//        val tabs : LinearLayout = tab.getChildAt(0) as LinearLayout
//        val layoutParams : ViewGroup.LayoutParams = tab.layoutParams as ViewGroup.LayoutParams
////        layoutParams.weight = 0f
//        layoutParams.width = ViewGroup.LayoutParams.WRAP_CONTENT
//        tabs.layoutParams = layoutParams
//        tab.requestLayout()

        tab.getTabAt(0)?.customView = layoutInflater.inflate(R.layout.cam_tab, container, false)
        return binding.root
    }
}