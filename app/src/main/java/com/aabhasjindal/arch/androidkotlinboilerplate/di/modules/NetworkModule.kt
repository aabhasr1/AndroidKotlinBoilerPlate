package com.aabhasjindal.arch.androidkotlinboilerplate.di.modules

import com.aabhasjindal.arch.androidkotlinboilerplate.MyApplication
import com.aabhasjindal.arch.androidkotlinboilerplate.common.network.ApiProvider
import com.aabhasjindal.arch.androidkotlinboilerplate.common.network.RequestHeaderInterceptor
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Created by aabhasjindal on 19/06/18.
 */
@Module
class NetworkModule {

    @Provides
    fun provideRequestHeaderInterceptor(application: MyApplication): RequestHeaderInterceptor {
        return RequestHeaderInterceptor(application.applicationContext)
    }

    @Provides
    fun provideNetworkService(application: MyApplication) : Retrofit {
        return ApiProvider.getApiProvider().provideApiService()
    }
}