package com.neppplus.pizzaorderapp_20210825.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.pizzaorderapp_20210825.fragments.MyProfileFragment
import com.neppplus.pizzaorderapp_20210825.fragments.PizzaStoreListFragment

class MainViewPagerAdapter( fm : FragmentManager )  : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when( position ) {
            0 -> PizzaStoreListFragment()
            else -> MyProfileFragment()
        }
    }

}