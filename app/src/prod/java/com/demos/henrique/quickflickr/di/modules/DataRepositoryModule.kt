package com.demos.henrique.quickflickr.di.modules

import com.demos.henrique.quickflickr.utils.DataContract
import com.demos.henrique.quickflickr.utils.Networking.FlickrApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataRepositoryModule(val baseEndpointUrl: String)
{
    @Provides
    fun provideDataRepo(): DataContract = FlickrApi(baseEndpointUrl)
}