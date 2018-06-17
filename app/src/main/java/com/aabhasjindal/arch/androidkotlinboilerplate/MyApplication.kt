package com.aabhasjindal.arch.androidkotlinboilerplate

import android.app.Activity
import android.app.Application
import android.os.Bundle
import com.aabhasjindal.arch.androidkotlinboilerplate.di.DaggerAppComponent
import com.aabhasjindal.arch.androidkotlinboilerplate.di.annotations.ApplicationScope
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import timber.log.Timber
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric



/**
 * Created by aabhasjindal on 17/06/18.
 */
@ApplicationScope
class MyApplication : DaggerApplication(), Application.ActivityLifecycleCallbacks {
    private var mCurrentActivity: Activity? = null

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
        val ctx = this.applicationContext

        Fabric.with(this, Crashlytics())
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }

    override fun onActivityPaused(activity: Activity?) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onActivityResumed(activity: Activity?) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onActivityStarted(activity: Activity?) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onActivityDestroyed(activity: Activity?) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onActivityStopped(activity: Activity?) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}