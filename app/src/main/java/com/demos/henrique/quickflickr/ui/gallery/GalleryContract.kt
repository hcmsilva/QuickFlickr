package com.demos.henrique.quickflickr.ui.gallery

import com.demos.henrique.quickflickr.model.FlickrFeed
import com.demos.henrique.quickflickr.utils.DataContract
import com.demos.henrique.quickflickr.utils.Networking.FlickrApi

interface GalleryContract {

    interface GalleryPresenter {
        fun getPhotosFromApi(flickrApi: DataContract)
        fun updatePhotosList(feed: FlickrFeed)
    }


    interface GalleryView {
        fun showPhotoList(feed: FlickrFeed)
    }
}