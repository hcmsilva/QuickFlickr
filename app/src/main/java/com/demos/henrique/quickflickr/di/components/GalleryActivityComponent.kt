package com.demos.henrique.quickflickr.di.components

import com.demos.henrique.quickflickr.di.modules.GalleryPresenterModule
import com.demos.henrique.quickflickr.di.modules.GalleryViewModule
import com.demos.henrique.quickflickr.ui.gallery.GalleryActivity
import com.demos.henrique.quickflickr.ui.gallery.GalleryPresenter
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(dependencies = arrayOf(DataRepositoryComponent::class), modules = arrayOf(GalleryPresenterModule::class, GalleryViewModule::class))
interface GalleryActivityComponent
{
    fun inject(galleryActivity: GalleryActivity)
}