package com.aabhasjindal.arch.androidkotlinboilerplate.views.test

import com.aabhasjindal.arch.androidkotlinboilerplate.views.test.fragments.permissions.RuntimePermissionsFragment
import com.aabhasjindal.arch.androidkotlinboilerplate.views.test.fragments.permissions.RuntimePermissionsFragmentModule
import com.aabhasjindal.arch.androidkotlinboilerplate.views.test.fragments.toasty.ToastyFragment
import com.aabhasjindal.arch.androidkotlinboilerplate.views.test.fragments.toasty.ToastyFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by aabhasjindal on 18/06/18.
 */
@Module
abstract class TestFragmentBuilderModule {

    @ContributesAndroidInjector(modules = [ToastyFragmentModule::class])
    abstract fun bindToastyTestFragment(): ToastyFragment

    @ContributesAndroidInjector(modules = [RuntimePermissionsFragmentModule::class])
    abstract fun bindRuntimePermissionFragment(): RuntimePermissionsFragment
}