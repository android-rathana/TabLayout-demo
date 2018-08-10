package com.example.ratha.tablayouttest.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class SimpleFragmentPagerAdapter(var fm : FragmentManager,var fragments: MutableList<Fragment>) : FragmentPagerAdapter(fm) {

    val tabTitles= arrayOf("HOME","POPULAR","SETTING")
    override fun getItem(position: Int): Fragment =fragments[position]
    override fun getCount(): Int =fragments.size
    override fun getPageTitle(position: Int): CharSequence? =tabTitles[position]
}