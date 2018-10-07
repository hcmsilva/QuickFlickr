package com.demos.henrique.quickflickr.ui.gallery

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import com.demos.henrique.quickflickr.R
import com.demos.henrique.quickflickr.di.components.DaggerDataRepositoryComponent
import com.demos.henrique.quickflickr.di.components.DaggerGalleryActivityComponent
import com.demos.henrique.quickflickr.di.components.DataRepositoryComponent
import com.demos.henrique.quickflickr.di.components.GalleryActivityComponent
import com.demos.henrique.quickflickr.di.modules.DataRepositoryModule
import com.demos.henrique.quickflickr.di.modules.GalleryPresenterModule
import com.demos.henrique.quickflickr.di.modules.GalleryViewModule
import com.demos.henrique.quickflickr.model.FlickrFeed
import com.demos.henrique.quickflickr.ui.custom.holders.MyBasicViewHolder
import com.demos.henrique.quickflickr.utils.DataContract
import javax.inject.Inject

class GalleryActivity : AppCompatActivity(), GalleryContract.GalleryView
{
    //val mPresenter: GalleryPresenter = GalleryPresenter(this);
    @Inject
    lateinit var mPresenter: GalleryContract.GalleryPresenter
    @Inject
    lateinit var mLayoutManager: RecyclerView.LayoutManager
    @Inject
    lateinit var mAdapter: RecyclerView.Adapter<MyBasicViewHolder>
    @Inject
    lateinit var dataRepo: DataContract

    lateinit var mRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)
        setupDagger()
        setupViews()
        //mPresenter.getPhotosFromApi(FlickrApi(getString(R.string.flickr_base_url)))
        //mPresenter.getPhotosFromApi(DataRepository.getDataRepository(getString(R.string.flickr_base_url)))
        mPresenter.getPhotosFromApi(dataRepo)
    }

    private fun setupViews() {

        mRecyclerView = findViewById<RecyclerView>(R.id.main_list)
        mRecyclerView.layoutManager = mLayoutManager
        mRecyclerView.adapter = mAdapter
    }

    private fun setupDagger()
    {

        val dataRepoComponent: DataRepositoryComponent =
                DaggerDataRepositoryComponent.builder()
                        .dataRepositoryModule(DataRepositoryModule(getString(R.string.flickr_base_url)))
                        .build()


        val galleryComponent: GalleryActivityComponent

        galleryComponent = DaggerGalleryActivityComponent.builder()
                .dataRepositoryComponent(dataRepoComponent)
                .galleryPresenterModule(GalleryPresenterModule(this))
                .galleryViewModule(GalleryViewModule(this, 3))
                .build()

        galleryComponent.inject(this)
    }


    override fun showPhotoList(feed: FlickrFeed) {
        //val photoList = mPresenter.getPhotosFromApi()

        (mRecyclerView.adapter as MainListAdapter).dataList.clear()

        for(photo in feed.flickrPhotos)
        {
            (mRecyclerView.adapter as MainListAdapter).dataList.add(photo)
        }

        (mRecyclerView.adapter)?.notifyDataSetChanged()
    }
}
