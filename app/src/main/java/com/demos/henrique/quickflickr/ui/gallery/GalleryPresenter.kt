package com.demos.henrique.quickflickr.ui.gallery

import com.demos.henrique.quickflickr.model.FlickrFeed
import com.demos.henrique.quickflickr.utils.Networking.FlickrApi

class GalleryPresenter(mView: GalleryContract.GalleryView) : GalleryContract.GalleryPresenter
{
    val mView = mView

    override fun updatePhotosList(feed: FlickrFeed) = mView.showPhotoList(feed)

    override fun getPhotosFromApi(api: FlickrApi) = api.getFlickrFeed(this)

}