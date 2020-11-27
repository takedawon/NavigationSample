package com.lanic.navigationsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lanic.navigationsample.base.BaseFragment
import com.lanic.navigationsample.databinding.FragmentOneOneBinding
import com.lanic.navigationsample.databinding.FragmentTwoOneBinding

class TwoOneFragment : BaseFragment<FragmentTwoOneBinding>(R.layout.fragment_two_one) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}