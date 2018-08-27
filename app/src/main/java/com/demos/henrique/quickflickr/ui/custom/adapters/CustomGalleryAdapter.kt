package com.demos.henrique.quickflickr.ui.custom.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.demos.henrique.quickflickr.ui.custom.Listable
import com.demos.henrique.quickflickr.ui.custom.holders.MyBasicViewHolder

abstract class CustomGalleryAdapter(val dataList: MutableList<Listable>) : RecyclerView.Adapter<MyBasicViewHolder>()
{
    abstract override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyBasicViewHolder

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(viewHolder: MyBasicViewHolder, p1: Int)
            = viewHolder.setupHolder(dataList[p1].url,dataList[p1].metaAuthor, dataList[p1].metaTitle, dataList[p1].metaPublished)
}