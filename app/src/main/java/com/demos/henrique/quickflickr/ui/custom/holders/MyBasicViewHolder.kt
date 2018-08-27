package com.demos.henrique.quickflickr.ui.custom.holders

import android.support.v7.widget.RecyclerView
import android.view.View

abstract class MyBasicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
{
    abstract fun setupHolder(url: String, author: String, title: String, published: String)
}
