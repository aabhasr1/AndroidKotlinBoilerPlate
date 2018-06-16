package com.aabhasjindal.arch.androidkotlinboilerplate

import android.app.Activity
import android.app.Application
import android.os.Bundle
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import io.sentry.Sentry
import io.sentry.android.AndroidSentryClientFactory
import timber.log.Timber

/**
 * Created by aabhasjindal on 17/06/18.
 */
class MyApplication : DaggerApplication(), Application.ActivityLifecycleCallbacks {
    private var mCurrentActivity: Activity? = null
    private var instance: MyApplication? = null

    override fun onCreate() {
        super.onCreate()
        instance = this

        Timber.plant(Timber.DebugTree())
        val ctx = this.applicationContext
        val sentryDsn = keys.
        Sentry.init(sentryDsn, AndroidSentryClientFactory(ctx))
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onActivityPaused(activity: Activity?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onActivityResumed(activity: Activity?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onActivityStarted(activity: Activity?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onActivityDestroyed(activity: Activity?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onActivityStopped(activity: Activity?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}