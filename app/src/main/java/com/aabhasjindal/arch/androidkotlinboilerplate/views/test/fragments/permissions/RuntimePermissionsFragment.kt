package com.aabhasjindal.arch.androidkotlinboilerplate.views.test.fragments.permissions


import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aabhasjindal.arch.androidkotlinboilerplate.R
import com.aabhasjindal.arch.androidkotlinboilerplate.common.BaseFragment
import com.aabhasjindal.arch.androidkotlinboilerplate.common.ViewModelFactory
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject


/**
 * A simple [Fragment] subclass.
 */
class RuntimePermissionsFragment : BaseFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var runtimePermissionsViewModel: RuntimePermissionsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        runtimePermissionsViewModel = ViewModelProviders.of(this,viewModelFactory).
                get(RuntimePermissionsViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_runtime_permission, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onActivityCreated(savedInstanceState)
    }
}// Required empty public constructor
