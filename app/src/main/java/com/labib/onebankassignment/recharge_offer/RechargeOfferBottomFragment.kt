package com.OBL.OKwallet.recharge_offer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager

import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.tabs.TabLayout
import com.labib.onebankassignment.R

/*
val bottomSheetFragment = BottomSheetFragment()

    slideLayout.setOnClickListener() {

        bottomSheetFragment.show(supportFragmentManager, "BottomSheetDialog")

    }
*/

class RechargeOfferBottomFragment : BottomSheetDialogFragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)


        var view = inflater.inflate(R.layout.recharge_offer_parent_layout, container, false);
        val viewPager: ViewPager = view.findViewById(R.id.viewPagerRechargeOffer)
        val tabLayout: TabLayout = view.findViewById(R.id.tabLayoutRechargeOffer)

        val adapter = ViewPageAdapter(childFragmentManager)
        adapter.addFragment(BasicRechargeOfferFragment(), "Job Info")
        adapter.addFragment(BasicRechargeOfferFragment(), "Client Info")
        adapter.addFragment(BasicRechargeOfferFragment(), "Guarantor Info")
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
        return view
    }


    override fun onDetach() {
        super.onDetach()
    }
}

class ViewPageAdapter(supportFragmentManager: FragmentManager) : FragmentPagerAdapter(supportFragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val mFragmentList = ArrayList<Fragment>()
    private val mFragmentListTitle = ArrayList<String>()

    override fun getCount(): Int {
        return mFragmentList.size

    }

    override fun getItem(position: Int): Fragment {

        return mFragmentList[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {

        return mFragmentListTitle[position]
    }

    fun addFragment(fragment: Fragment, title: String){

        mFragmentList.add(fragment)
        mFragmentListTitle.add(title)
    }
}