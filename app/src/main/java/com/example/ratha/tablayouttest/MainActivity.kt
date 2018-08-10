package com.example.ratha.tablayouttest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.support.v7.widget.Toolbar
import com.example.ratha.tablayouttest.adapter.SimpleFragmentPagerAdapter
import com.example.ratha.tablayouttest.fragment.HomeFragment
import com.example.ratha.tablayouttest.fragment.PopularFragment
import com.example.ratha.tablayouttest.fragment.SettingFragment

class MainActivity : AppCompatActivity() {

    lateinit var toolBar : Toolbar
    var fragments = mutableListOf<Fragment>(HomeFragment(),PopularFragment(),SettingFragment())
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_hide_toolbar_tabbar)

        toolBar=findViewById(R.id.toolBar);
        tabLayout=findViewById(R.id.tabLayout)
        viewPager=findViewById(R.id.viewPager)

        setSupportActionBar(toolBar)
        toolBar.apply {
            this.title="Home"
        }

        val viewPagerAdapter=SimpleFragmentPagerAdapter(supportFragmentManager,fragments)
        viewPager.adapter=viewPagerAdapter
        tabLayout.setupWithViewPager(viewPager)

    }
}
