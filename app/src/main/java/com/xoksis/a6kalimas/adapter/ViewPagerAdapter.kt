package com.xoksis.a6kalimas.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.xoksis.a6kalimas.fragment.KalimaFragment
import com.xoksis.a6kalimas.fragment.TranslationFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle, val kalima: String) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {

        return if (position == 0) {
            KalimaFragment(kalima)
        } else {
            TranslationFragment(kalima)
        }
        
    }
}