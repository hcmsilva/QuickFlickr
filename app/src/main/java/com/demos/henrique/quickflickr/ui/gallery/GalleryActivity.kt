package com.demos.henrique.quickflickr.ui.gallery

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.demos.henrique.quickflickr.R
import com.demos.henrique.quickflickr.model.FlickrFeed
import kotlinx.android.synthetic.main.activity_gallery.*

class GalleryActivity : AppCompatActivity(), GalleryContract.GalleryView
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

    }


    override fun showPhotoList(feed: FlickrFeed)
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
