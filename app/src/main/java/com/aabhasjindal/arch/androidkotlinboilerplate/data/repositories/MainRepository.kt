package com.aabhasjindal.arch.androidkotlinboilerplate.data.repositories

import com.aabhasjindal.arch.androidkotlinboilerplate.di.annotations.ApplicationScope
import javax.inject.Inject

/**
 * Created by aabhasjindal on 17/06/18.
 */

class MainRepository @Inject constructor(){
    fun getDefaultTestData() :  List<String> {
        val mList = ArrayList<String>()
        mList.add("data 1")
        mList.add("data 2")
        mList.add("data 3")
        mList.add("data 4")
        return mList
    }
}