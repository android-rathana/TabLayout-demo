package com.example.ratha.tablayouttest.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.ratha.tablayouttest.fragment.HomeFragment
import com.example.ratha.tablayouttest.fragment.PopularFragment
import com.example.ratha.tablayouttest.fragment.SettingFragment

class SimpleFragmentPagerAdapter(var fm : FragmentManager,var fragments: MutableList<Fragment>) : FragmentPagerAdapter(fm) {

    val tabTitles= arrayOf("HOME","POPULAR","SETTING")
    override fun getItem(position: Int): Fragment {
        /*if(position==0)
            return HomeFragment()
        else if(position==1)
            return PopularFragment()
        else (position==3)
            return SettingFragment()*/
        for(fragment in fragments)
            return fragment

        return HomeFragment()

    }

    override fun getCount(): Int =fragments.size
    override fun getPageTitle(position: Int): CharSequence? {
        /*if(position==0)
            return tabTitles[0]
        else if(position==1)
            return tabTitles[1]
        else return tabTitles[2]*/
        for(title in tabTitles)
            return title
        return "HOME"
    }
}