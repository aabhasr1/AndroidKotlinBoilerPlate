package com.aabhasjindal.arch.androidkotlinboilerplate.di.modules

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.aabhasjindal.arch.androidkotlinboilerplate.common.ViewModelFactory
import com.aabhasjindal.arch.androidkotlinboilerplate.di.annotations.ViewModelKey
import com.aabhasjindal.arch.androidkotlinboilerplate.views.main.MainViewModel
import com.aabhasjindal.arch.androidkotlinboilerplate.views.test.TestViewModel
import com.aabhasjindal.arch.androidkotlinboilerplate.views.test.fragments.permissions.RuntimePermissionsViewModel
import com.aabhasjindal.arch.androidkotlinboilerplate.views.test.fragments.toasty.ToastyFragmentViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by aabhasjindal on 17/06/18.
 */
@Module
abstract class ViewModelBuilderModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TestViewModel::class)
    abstract fun bindTestViewModel(testViewModel: TestViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ToastyFragmentViewModel::class)
    abstract fun bindToastyFragmentViewModel(toastyFragmentViewModel: ToastyFragmentViewModel) : ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(RuntimePermissionsViewModel::class)
    abstract fun bindRuntimePermissionsViewModel(runtimePermissionsViewModel: RuntimePermissionsViewModel) : ViewModel

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}