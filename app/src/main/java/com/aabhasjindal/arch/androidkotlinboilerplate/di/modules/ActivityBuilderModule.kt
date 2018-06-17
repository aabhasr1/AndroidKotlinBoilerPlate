package com.aabhasjindal.arch.androidkotlinboilerplate.di.modules

import com.aabhasjindal.arch.androidkotlinboilerplate.views.main.MainActivity
import com.aabhasjindal.arch.androidkotlinboilerplate.views.main.MainActivityModule
import com.aabhasjindal.arch.androidkotlinboilerplate.views.test.TestActivity
import com.aabhasjindal.arch.androidkotlinboilerplate.views.test.TestActivityModule
import com.aabhasjindal.arch.androidkotlinboilerplate.views.test.TestFragmentBuilderModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by aabhasjindal on 17/06/18.
 */
@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [TestActivityModule::class , TestFragmentBuilderModule::class])
    abstract fun bindTestActivity(): TestActivity
}