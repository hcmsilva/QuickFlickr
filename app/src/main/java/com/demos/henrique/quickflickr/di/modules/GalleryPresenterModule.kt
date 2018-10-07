package com.demos.henrique.quickflickr.di.modules

import com.demos.henrique.quickflickr.ui.gallery.GalleryContract
import com.demos.henrique.quickflickr.ui.gallery.GalleryPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class GalleryPresenterModule(val view: GalleryContract.GalleryView)
{
    @Singleton
    @Provides
    fun provideGalleryPresenter(): GalleryContract.GalleryPresenter
    {
        return GalleryPresenter(view)
    }
}