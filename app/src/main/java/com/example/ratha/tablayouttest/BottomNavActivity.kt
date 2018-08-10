package com.example.ratha.tablayouttest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.MenuItem
import com.example.ratha.tablayouttest.adapter.SimpleFragmentPagerAdapter
import com.example.ratha.tablayouttest.fragment.HomeFragment
import com.example.ratha.tablayouttest.fragment.PopularFragment
import com.example.ratha.tablayouttest.fragment.SettingFragment

class BottomNavActivity : AppCompatActivity() {
    var prevMenuItem:MenuItem? = null
    lateinit var viewPager: ViewPager
    lateinit var bottomNavigationView: BottomNavigationView
    var fragments = mutableListOf<Fragment>(HomeFragment(), PopularFragment(), SettingFragment())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nav)
        viewPager=findViewById(R.id.viewPager)
        bottomNavigationView=findViewById(R.id.bottomNav)

        val adapter= SimpleFragmentPagerAdapter(supportFragmentManager,fragments)
        viewPager.adapter=adapter
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {}
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}
            override fun onPageSelected(position: Int) {

                prevMenuItem?.setChecked(false)
                bottomNavigationView?.getMenu().getItem(0).setChecked(false)
                bottomNavigationView.getMenu().getItem(position).setChecked(true)
                prevMenuItem = bottomNavigationView.getMenu().getItem(position)
            }
        })
    }
}
