package com.aabhasjindal.arch.androidkotlinboilerplate.common.network

import com.aabhasjindal.arch.androidkotlinboilerplate.data.models.BaseApiResponse
import com.aabhasjindal.arch.androidkotlinboilerplate.data.models.GitReposResponse
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {
    @GET("/users/aabhasr1")
    fun repos() : Single<GitReposResponse>
}