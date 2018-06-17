package com.aabhasjindal.arch.androidkotlinboilerplate.di.module

import com.aabhasjindal.arch.androidkotlinboilerplate.di.annotations.ActivityScope
import com.aabhasjindal.arch.androidkotlinboilerplate.views.main.MainActivity
import com.aabhasjindal.arch.androidkotlinboilerplate.views.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by aabhasjindal on 17/06/18.
 */
@Module
abstract class ActivityBuilderModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity(): MainActivity
}