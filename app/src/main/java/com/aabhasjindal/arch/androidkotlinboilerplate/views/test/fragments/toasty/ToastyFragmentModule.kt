package com.aabhasjindal.arch.androidkotlinboilerplate.views.test.fragments.toasty

import dagger.Module
import dagger.Provides

/**
 * Created by aabhasjindal on 18/06/18.
 */
@Module
class ToastyFragmentModule {

    @Provides
    fun provideTestData(): List<String> = ArrayList()

}