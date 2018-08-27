package com.demos.henrique.quickflickr.ui.gallery

import com.demos.henrique.quickflickr.model.FlickrFeed
import com.demos.henrique.quickflickr.utils.Networking.FlickrApi
import org.junit.Test

import org.junit.Before
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.Mockito.*


class GalleryPresenterTest {

    @Mock
    private lateinit var mViewMock: GalleryContract.GalleryView
    @Mock
    private lateinit var feedMock: FlickrFeed
    @Mock
    private lateinit var photosApiMock: FlickrApi

    private lateinit var mPresenter: GalleryPresenter

    @Before
    fun setupPresenter()
    {
        MockitoAnnotations.initMocks(this)
        mPresenter = GalleryPresenter(mViewMock)
    }

    @Test
    fun updatePhotosList() {
        mPresenter.updatePhotosList(feedMock)


        verify(mViewMock).showPhotoList(feedMock)
    }

    @Test
    fun getPhotosFromApi()
    {
        mPresenter.getPhotosFromApi(photosApiMock);

        verify(photosApiMock).getFlickrFeed(mPresenter)
    }
}