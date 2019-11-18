package com.jiadibo.moviecatalogue.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.jiadibo.moviecatalogue.MovieFragment
import com.jiadibo.moviecatalogue.R
import com.jiadibo.moviecatalogue.TvshowFragment

private val TAB_TITLES = arrayOf(
    R.string.judul_film,
    R.string.judul_tv
)

class ViewPagerAdapter(private val context : Context,fm: FragmentManager): FragmentPagerAdapter(fm){


    private val pages = listOf(
        MovieFragment(),
        TvshowFragment()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }


    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> context.resources.getString(TAB_TITLES[position])
            else -> context.resources.getString(TAB_TITLES[position])
        }
    }


}