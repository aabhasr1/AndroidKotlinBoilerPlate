package com.aabhasjindal.arch.androidkotlinboilerplate.common.rx2

import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * Created by aabhasjindal on 17/06/18.
 */
class CompositeDisposableProvider @Inject constructor() {

    private var compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun get(): CompositeDisposable {
        if(compositeDisposable.isDisposed) compositeDisposable = CompositeDisposable()
        return compositeDisposable
    }

    fun dispose() {
        if(!compositeDisposable.isDisposed) compositeDisposable.dispose()
    }
}