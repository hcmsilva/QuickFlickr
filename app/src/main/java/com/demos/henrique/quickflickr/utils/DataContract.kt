package com.demos.henrique.quickflickr.utils

import com.demos.henrique.quickflickr.ui.gallery.GalleryContract

interface DataContract {
    fun getFlickrFeed(dataReceiver : GalleryContract.GalleryPresenter)
}