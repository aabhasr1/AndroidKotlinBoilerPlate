package com.aabhasjindal.arch.androidkotlinboilerplate.views.test.fragments.permissions

import dagger.Module
import dagger.Provides

/**
 * Created by aabhasjindal on 19/06/18.
 */
@Module
class RuntimePermissionsFragmentModule {

    @Provides
    fun provideTestData(): List<String> = ArrayList()

}