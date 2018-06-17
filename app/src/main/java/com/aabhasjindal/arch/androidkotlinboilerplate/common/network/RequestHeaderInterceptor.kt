package com.aabhasjindal.arch.androidkotlinboilerplate.common.network

import android.content.Context
import okhttp3.Interceptor
import okhttp3.Response

/**
 * Created by aabhasjindal on 19/06/18.
 */
class RequestHeaderInterceptor(var context: Context) : Interceptor {

    override fun intercept(chain: Interceptor.Chain?): Response {
        val original = chain!!.request()

        val request = original.newBuilder()
                .header("Accept", "application/json")
                .build()

        return chain.proceed(request)
    }
}