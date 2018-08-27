package com.demos.henrique.quickflickr.ui.gallery

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.demos.henrique.quickflickr.R
import com.demos.henrique.quickflickr.model.FlickrFeed
import com.demos.henrique.quickflickr.ui.custom.Listable
import com.demos.henrique.quickflickr.utils.Networking.FlickrApi

class GalleryActivity : AppCompatActivity(), GalleryContract.GalleryView
{
    val mPresenter: GalleryPresenter = GalleryPresenter(this);
    lateinit var mRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)
        setupViews()
        mPresenter.getPhotosFromApi(FlickrApi(getString(R.string.flickr_base_url)))
    }

    private fun setupViews() {

        mRecyclerView = findViewById<RecyclerView>(R.id.main_list)
        mRecyclerView.layoutManager = GridLayoutManager(this, 3)
        mRecyclerView.adapter = MainListAdapter(arrayListOf<Listable>())
    }


    override fun showPhotoList(feed: FlickrFeed) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        //val photoList = mPresenter.getPhotosFromApi()

        (mRecyclerView.adapter as MainListAdapter).dataList.clear()

        for(photo in feed.flickrPhotos)
        {
            (mRecyclerView.adapter as MainListAdapter).dataList.add(photo)
        }

        (mRecyclerView.adapter)?.notifyDataSetChanged()
    }
}
