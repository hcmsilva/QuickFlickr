package com.demos.henrique.quickflickr.di.modules

import com.demos.henrique.quickflickr.utils.DataContract
import com.demos.henrique.quickflickr.utils.Networking.ApiFakeImpl
import dagger.Module
import dagger.Provides

@Module
class DataRepositoryModule(val dummy: String)
{
    @Provides
    fun provideFakeDataRepo(): DataContract = ApiFakeImpl()
}