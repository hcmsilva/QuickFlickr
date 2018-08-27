package com.demos.henrique.quickflickr.ui.gallery

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.demos.henrique.quickflickr.R
import com.demos.henrique.quickflickr.ui.custom.Listable
import com.demos.henrique.quickflickr.ui.custom.adapters.CustomGalleryAdapter
import com.demos.henrique.quickflickr.ui.custom.holders.MyBasicViewHolder

class MainListAdapter(val mDataList: MutableList<Listable>) : CustomGalleryAdapter(mDataList)
{
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyBasicViewHolder =
            PhotoHolder(LayoutInflater.from(parent.context)
                    .inflate(R.layout.list_unit_layout, parent,  false))

}
