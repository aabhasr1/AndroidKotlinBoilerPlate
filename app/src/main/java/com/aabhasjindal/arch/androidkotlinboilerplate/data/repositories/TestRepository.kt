package com.aabhasjindal.arch.androidkotlinboilerplate.data.repositories

import javax.inject.Inject

/**
 * Created by aabhasjindal on 18/06/18.
 */
class TestRepository @Inject constructor() {
    fun getDefaultTestData() :  List<String> {
        val mList = ArrayList<String>()
        mList.add("data 1")
        mList.add("data 2")
        mList.add("data 3")
        mList.add("data 4")
        return mList
    }
}