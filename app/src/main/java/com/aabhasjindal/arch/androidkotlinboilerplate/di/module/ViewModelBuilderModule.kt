package com.aabhasjindal.arch.androidkotlinboilerplate.di.module

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.aabhasjindal.arch.androidkotlinboilerplate.common.ViewModelFactory
import com.aabhasjindal.arch.androidkotlinboilerplate.di.annotations.ViewModelKey
import com.aabhasjindal.arch.androidkotlinboilerplate.views.main.MainViewModel
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
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}