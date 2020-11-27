package com.lanic.navigationsample.base

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<T : ViewDataBinding>(@LayoutRes val layoutId: Int) : Fragment() {

    lateinit var binding: T

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e(this.javaClass.simpleName, "onAttach 실행")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(this.javaClass.simpleName, "onCreate 실행")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        binding.lifecycleOwner = this
        Log.e(this.javaClass.simpleName, "onCreateView 실행")

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e(this.javaClass.simpleName, "onViewCreated 실행")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e(this.javaClass.simpleName, "onActivityCreated 실행")
    }

    override fun onStart() {
        super.onStart()
        Log.e(this.javaClass.simpleName, "onStart 실행")
    }

    override fun onResume() {
        super.onResume()
        Log.e(this.javaClass.simpleName, "onResume 실행")
    }

    override fun onPause() {
        super.onPause()
        Log.e(this.javaClass.simpleName, "onPause 실행")
    }

    override fun onStop() {
        Log.e(this.javaClass.simpleName, "onStop 실행")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.e(this.javaClass.simpleName, "onDestroyView 실행")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.e(this.javaClass.simpleName, "onDestroy 실행")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.e(this.javaClass.simpleName, "onDetach 실행")
        super.onDetach()
    }
}