package com.aabhasjindal.arch.androidkotlinboilerplate.data.repositories

import com.aabhasjindal.arch.androidkotlinboilerplate.MyApplication
import com.aabhasjindal.arch.androidkotlinboilerplate.common.network.ApiProvider
import com.aabhasjindal.arch.androidkotlinboilerplate.common.network.ApiService
import com.aabhasjindal.arch.androidkotlinboilerplate.common.network.BaseApiObserver
import com.aabhasjindal.arch.androidkotlinboilerplate.data.models.BaseApiResponse
import com.aabhasjindal.arch.androidkotlinboilerplate.data.models.GitReposResponse
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by aabhasjindal on 18/06/18.
 */
class ToastyTestRepository @Inject constructor(application: MyApplication) {
    fun getGitRepos(): Single<GitReposResponse> {
        return ApiProvider
                .getApiProvider()
                .provideApiService()
                .create(ApiService::class.java)
                .repos()
    }


    fun getDefaultTestData(): MutableList<String> {
        val mList = ArrayList<String>()
        mList.add("error message")
        mList.add("info message")
        mList.add("success message")
        mList.add("warning message")
        return mList.toMutableList()
    }
}
