package com.mobolajia.whatsappdemo.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.mobolajia.whatsappdemo.R
import com.mobolajia.whatsappdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tab : TabLayout
    private lateinit var pager: ViewPager2

    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        supportActionBar?.elevation = 0F
        title = "WhatsApp"

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_bar_menu_chats, menu)
        return true
    }
}