package com.aabhasjindal.arch.androidkotlinboilerplate.utils

import android.app.Activity
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.Toast
import com.aabhasjindal.arch.androidkotlinboilerplate.BuildConfig
import timber.log.Timber

fun Any?.toast(activity: Activity) {
    Toast.makeText(activity, this.toString(), Toast.LENGTH_LONG).show()
}

fun Any?.snackBar(view: View) {
    Snackbar.make(view, this.toString(), Snackbar.LENGTH_LONG).show()
}

fun Any?.snackBar(activity: Activity) {
    Snackbar.make(activity.findViewById(android.R.id.content), this.toString(), Snackbar.LENGTH_LONG).show()
}

fun String?.getInitials(): String {
    return if (this?.isNotNullOrBlank() == true) {
        val trimmedArray = trim().split(" ")

        trimmedArray.first().toCharArray().first().toString() +
                trimmedArray.last().toCharArray().first().toString()
    } else {
        "-"
    }
}

fun String?.getColorCodeForText(): String {
    return if (this.isNullOrBlank()) {
        "#3F51B5"
    } else {
        String.format("#FF%06X", 0xFFFFFF and this!!.hashCode())
    }
}

fun String?.isNotNullOrBlank(): Boolean = this != null && this.isNotBlank()

fun String.logD() = Timber.d(this)
fun Throwable.logD() = Timber.d(this)

fun String.logE() = Timber.e(this)
fun Throwable.logE() = Timber.e(this)

fun String.logI() = Timber.i(this)
fun Throwable.logI() = Timber.i(this)

fun String.logV() = Timber.v(this)
fun Throwable.logV() = Timber.v(this)
