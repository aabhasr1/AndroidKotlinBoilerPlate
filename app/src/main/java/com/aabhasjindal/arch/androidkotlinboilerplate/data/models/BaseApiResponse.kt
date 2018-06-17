package com.aabhasjindal.arch.androidkotlinboilerplate.data.models

open class BaseApiResponse<T> {
    var data: T? = null
    var isSuccess: Boolean? = null
    var title: String? = null
    var message: String? = null
    var errorCode: String? = null

    open fun isSuccess() : Boolean{
        if (isSuccess!=null) return isSuccess!!
        return when (data != null) {
            true -> true
            false -> false
        }
    }
}