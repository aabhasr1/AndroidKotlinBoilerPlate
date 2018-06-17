package com.aabhasjindal.arch.androidkotlinboilerplate.di

import com.aabhasjindal.arch.androidkotlinboilerplate.MyApplication
import com.aabhasjindal.arch.androidkotlinboilerplate.di.annotations.ApplicationScope
import com.aabhasjindal.arch.androidkotlinboilerplate.di.module.ActivityBuilderModule
import com.aabhasjindal.arch.androidkotlinboilerplate.di.module.AppModule
import com.aabhasjindal.arch.androidkotlinboilerplate.di.module.ViewModelBuilderModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by aabhasjindal on 17/06/18.
 */
@ApplicationScope
@Component(modules = arrayOf(AndroidSupportInjectionModule::class,
        AppModule::class,
        ViewModelBuilderModule::class,
        ActivityBuilderModule::class))
interface AppComponent : AndroidInjector<MyApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MyApplication>()
}