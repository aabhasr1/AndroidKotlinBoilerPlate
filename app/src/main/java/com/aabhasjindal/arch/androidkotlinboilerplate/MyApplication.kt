package com.aabhasjindal.arch.androidkotlinboilerplate

import com.aabhasjindal.arch.androidkotlinboilerplate.di.DaggerAppComponent
import com.crashlytics.android.Crashlytics
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import io.fabric.sdk.android.Fabric
import timber.log.Timber


/**
 * Created by aabhasjindal on 17/06/18.
 */
class MyApplication : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())

        Fabric.with(this, Crashlytics())
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }
}