package com.aabhasjindal.arch.androidkotlinboilerplate.common

import android.arch.lifecycle.ViewModel
import com.aabhasjindal.arch.androidkotlinboilerplate.common.rx2.CompositeDisposableProvider

/**
 * Created by aabhasjindal on 17/06/18.
 */
open class BaseViewModel constructor(private val compositeDisposableProvider: CompositeDisposableProvider): ViewModel()