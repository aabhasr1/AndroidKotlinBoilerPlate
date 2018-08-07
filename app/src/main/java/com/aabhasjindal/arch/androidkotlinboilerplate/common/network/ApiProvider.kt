package com.aabhasjindal.arch.androidkotlinboilerplate.common.network

import com.aabhasjindal.arch.androidkotlinboilerplate.BuildConfig
import com.aabhasjindal.arch.androidkotlinboilerplate.di.annotations.ApplicationScope
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import io.reactivex.schedulers.Schedulers
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@ApplicationScope
class ApiProvider private constructor() {
    companion object {
        private var provider: ApiProvider? = null;

        fun getApiProvider(): ApiProvider {
            if (provider == null) {
                provider = ApiProvider()
            }
            return provider!!
        }
    }

    fun provideApiService(): Retrofit {
        val builder = OkHttpClient.Builder()

        builder.connectTimeout(30, TimeUnit.SECONDS)
        builder.readTimeout(30, TimeUnit.SECONDS)
        builder.writeTimeout(30, TimeUnit.SECONDS)

        // Add headers
        builder.interceptors().add(Interceptor { chain ->
            var request = chain.request()

            request = request.newBuilder()
                    .addHeader("Content-Type", "application/json")
                    .build()
            chain.proceed(request)
        })

        // Logging
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        builder.interceptors().add(interceptor)

        val gson = GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                .setDateFormat("yyyy-MM-dd")
                .create()

        val rxAdapter = RxJava2CallAdapterFactory
                .createWithScheduler(Schedulers.io())

        return Retrofit.Builder()
                .baseUrl(BuildConfig.API_URL)
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(rxAdapter)
                .build()
    }
}