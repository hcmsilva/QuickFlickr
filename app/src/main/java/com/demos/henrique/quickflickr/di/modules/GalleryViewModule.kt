package com.demos.henrique.quickflickr.di.modules

import android.content.Context
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.demos.henrique.quickflickr.ui.custom.Listable
import com.demos.henrique.quickflickr.ui.custom.holders.MyBasicViewHolder
import com.demos.henrique.quickflickr.ui.gallery.MainListAdapter
import dagger.Module
import dagger.Provides

@Module
class GalleryViewModule
{
    val ctx: Context
    val span: Int

    public constructor(ctx: Context, span: Int)
    {
        this.ctx = ctx
        this.span = span
    }

    @Provides
    fun provideAdapter(): RecyclerView.Adapter<MyBasicViewHolder>
    {
        return MainListAdapter(arrayListOf<Listable>())
    }

    @Provides
    fun provideLayoutManager(): RecyclerView.LayoutManager
    {
        return GridLayoutManager(ctx, span)
    }
}