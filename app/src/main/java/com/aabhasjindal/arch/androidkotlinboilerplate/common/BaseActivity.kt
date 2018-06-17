package com.aabhasjindal.arch.androidkotlinboilerplate.common

import dagger.android.support.DaggerAppCompatActivity

/**
 * Created by aabhasjindal on 17/06/18.
 */
open class BaseActivity : DaggerAppCompatActivity() {
    override fun setContentView(layoutResID: Int) {
        super.setContentView(layoutResID)
        title = "Test App"
    }
}