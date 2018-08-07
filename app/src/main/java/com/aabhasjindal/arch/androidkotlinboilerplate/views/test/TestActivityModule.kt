package com.aabhasjindal.arch.androidkotlinboilerplate.views.test

import dagger.Module
import dagger.Provides

/**
 * Created by aabhasjindal on 18/06/18.
 */
@Module
class TestActivityModule {

    @Provides
    fun providesTestActivity() : TestActivity = TestActivity()
}