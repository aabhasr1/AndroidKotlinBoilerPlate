package com.aabhasjindal.arch.androidkotlinboilerplate.views.test

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.aabhasjindal.arch.androidkotlinboilerplate.R
import com.aabhasjindal.arch.androidkotlinboilerplate.common.BaseActivity
import com.aabhasjindal.arch.androidkotlinboilerplate.views.test.fragments.permissions.RuntimePermissionsFragment
import com.aabhasjindal.arch.androidkotlinboilerplate.views.test.fragments.toasty.ToastyFragment
import javax.inject.Inject

class TestActivity : BaseActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var testViewModel: TestViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        title="Test Activity"

        testViewModel = ViewModelProviders.of(this,viewModelFactory).get(TestViewModel::class.java)

        supportFragmentManager
                .beginTransaction()
                .add(R.id.container, ToastyFragment())
                .commitAllowingStateLoss()
    }
}
