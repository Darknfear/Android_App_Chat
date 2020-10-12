package com.example.appchat.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.appchat.R
import com.example.appchat.adapter.ViewPagerAdapter
import com.example.appchat.fragment.FragmentChat
import com.example.appchat.fragment.FragmentNotifications
import com.example.appchat.fragment.FragmentUser
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(FragmentChat(), "Chat")
        adapter.addFragment(FragmentNotifications(), "Notifications")
        adapter.addFragment(FragmentUser(), "User")

        view_Pager.adapter = adapter
        tab_layout.setupWithViewPager(view_Pager)

        tab_layout.getTabAt(0)?.setIcon(R.drawable.chat_24)
        tab_layout.getTabAt(1)?.setIcon(R.drawable.notification)
        tab_layout.getTabAt(2)?.setIcon(R.drawable.user_24)

    }
}