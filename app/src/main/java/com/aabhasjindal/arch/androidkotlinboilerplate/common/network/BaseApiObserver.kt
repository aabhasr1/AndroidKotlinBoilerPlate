package com.aabhasjindal.arch.androidkotlinboilerplate.common.network

import com.aabhasjindal.arch.androidkotlinboilerplate.data.models.BaseApiResponse
import io.reactivex.Single
import io.reactivex.SingleSource

abstract class BaseApiObserver<T>(source: SingleSource<T>) : Single<BaseApiResponse<T>>() {
}