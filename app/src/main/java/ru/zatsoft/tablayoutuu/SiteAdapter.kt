package ru.zatsoft.tablayoutuu

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class SiteAdapter(fragment: FragmentActivity, private val siteList: MutableList<Site>):
FragmentStateAdapter(fragment){
    override fun getItemCount(): Int {
       return siteList.size
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = ViewPagerFragment()
        fragment.arguments = bundleOf("site" to siteList[position])
        return fragment
    }

}
