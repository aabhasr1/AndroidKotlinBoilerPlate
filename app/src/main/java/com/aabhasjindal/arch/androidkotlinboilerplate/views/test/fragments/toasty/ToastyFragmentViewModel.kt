package com.aabhasjindal.arch.androidkotlinboilerplate.views.test.fragments.toasty

import com.aabhasjindal.arch.androidkotlinboilerplate.common.BaseViewModel
import com.aabhasjindal.arch.androidkotlinboilerplate.common.rx2.CompositeDisposableProvider
import com.aabhasjindal.arch.androidkotlinboilerplate.data.models.BaseApiResponse
import com.aabhasjindal.arch.androidkotlinboilerplate.data.models.GitReposResponse
import com.aabhasjindal.arch.androidkotlinboilerplate.data.repositories.ToastyTestRepository
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by aabhasjindal on 18/06/18.
 */
class ToastyFragmentViewModel @Inject constructor(compositeDisposableProvider: CompositeDisposableProvider
                                                  , private val toastyTestRepository: ToastyTestRepository) : BaseViewModel(compositeDisposableProvider) {
    lateinit var testDataList: MutableList<String>
    var testDataList2: MutableList<GitReposResponse>? = null


    fun getTestData(): Single<GitReposResponse>? {
        testDataList = toastyTestRepository.getDefaultTestData()
        return toastyTestRepository
                .getGitRepos()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }
}