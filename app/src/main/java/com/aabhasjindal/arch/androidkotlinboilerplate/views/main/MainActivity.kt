package com.aabhasjindal.arch.androidkotlinboilerplate.views.main

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.aabhasjindal.arch.androidkotlinboilerplate.R
import com.aabhasjindal.arch.androidkotlinboilerplate.common.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProviders.of(this,viewModelFactory).get(MainViewModel::class.java)

        loadData()


//        throw Exception("this is second demo crash")
    }

    private fun loadData() {
        mainViewModel.getTestData()
        updateview(mainViewModel.testDataList)
    }

    private fun updateview(mList : List<String>) {
        tv1.text = mList[0]
        tv2.text = mList[1]
        tv3.text = mList[2]
        tv4.text = mList[3]
    }
}
