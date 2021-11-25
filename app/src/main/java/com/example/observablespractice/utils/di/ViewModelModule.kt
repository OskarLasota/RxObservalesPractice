package com.example.observablespractice.utils.di

import androidx.lifecycle.ViewModel
import com.example.observablespractice.features.ExampleViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class ViewModelModule {

    @Binds
    abstract fun bindMainViewModel(viewModel: ExampleViewModel): ViewModel

}