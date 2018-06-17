package com.aabhasjindal.arch.androidkotlinboilerplate.views.main

import dagger.Module
import dagger.Provides

/**
 * Created by aabhasjindal on 17/06/18.
 */
@Module
class MainActivityModule {
    @Provides
    fun provideTestData(): List<String> = ArrayList()
}