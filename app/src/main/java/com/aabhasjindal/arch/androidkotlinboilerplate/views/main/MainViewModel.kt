package com.aabhasjindal.arch.androidkotlinboilerplate.views.main

import com.aabhasjindal.arch.androidkotlinboilerplate.common.BaseViewModel
import com.aabhasjindal.arch.androidkotlinboilerplate.common.rx2.CompositeDisposableProvider
import com.aabhasjindal.arch.androidkotlinboilerplate.data.repositories.MainRepository
import javax.inject.Inject

/**
 * Created by aabhasjindal on 17/06/18.
 */
class MainViewModel @Inject constructor(compositeDisposableProvider: CompositeDisposableProvider, private val mainRepository: MainRepository) : BaseViewModel(compositeDisposableProvider) {

    lateinit var testDataList: List<String>

    fun getTestData() {
        testDataList = mainRepository.getDefaultTestData()
    }
}