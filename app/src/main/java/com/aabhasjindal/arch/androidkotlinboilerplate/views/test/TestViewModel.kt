package com.aabhasjindal.arch.androidkotlinboilerplate.views.test

import com.aabhasjindal.arch.androidkotlinboilerplate.common.BaseViewModel
import com.aabhasjindal.arch.androidkotlinboilerplate.common.rx2.CompositeDisposableProvider
import com.aabhasjindal.arch.androidkotlinboilerplate.data.repositories.TestRepository
import javax.inject.Inject

/**
 * Created by aabhasjindal on 18/06/18.
 */
class TestViewModel @Inject constructor(compositeDisposableProvider: CompositeDisposableProvider, private val testRepository: TestRepository) : BaseViewModel(compositeDisposableProvider) {
    lateinit var testDataList: List<String>

    fun getTestData() {
        testDataList = testRepository.getDefaultTestData()
    }
}