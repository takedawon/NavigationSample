package com.lanic.navigationsample

import android.os.Bundle
import android.view.View
import com.lanic.navigationsample.base.BaseFragment
import com.lanic.navigationsample.databinding.FragmentOneBinding

class OneFragment : BaseFragment<FragmentOneBinding>(R.layout.fragment_one) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}