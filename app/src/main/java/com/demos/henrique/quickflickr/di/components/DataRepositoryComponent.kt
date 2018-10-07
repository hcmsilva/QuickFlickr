package com.demos.henrique.quickflickr.di.components

import com.demos.henrique.quickflickr.di.modules.DataRepositoryModule
import com.demos.henrique.quickflickr.utils.DataContract
import dagger.Component
import javax.inject.Singleton


@Component(modules = arrayOf(DataRepositoryModule::class))
interface DataRepositoryComponent
{
    fun getRepository():DataContract
}