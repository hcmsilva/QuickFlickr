package com.demos.henrique.quickflickr.ui.gallery

import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.demos.henrique.quickflickr.R
import com.demos.henrique.quickflickr.ui.custom.holders.MyBasicViewHolder
import com.demos.henrique.quickflickr.utils.MetadataUtils
import com.squareup.picasso.Picasso

class PhotoHolder(itemView: View) : MyBasicViewHolder(itemView)
{
    companion object {
        @JvmStatic
        private val metadataUtils = MetadataUtils()
    }

    val thumb: ImageView = itemView.findViewById<ImageView>(R.id.thumbnail)

    lateinit var photoUrl : String
    lateinit var author : String
    lateinit var title : String
    lateinit var published : String

    override fun setupHolder(url: String, author: String, title: String, published: String) {
        this.author = metadataUtils.extractAuthor(author)
        photoUrl = url
        this.title = title
        this.published = metadataUtils.extractTime(published)

        thumb.setOnClickListener { view ->
            Toast.makeText(view.context,
                    view.context.getString(R.string.photo_metadata, title, this.author, this.published),
                    Toast.LENGTH_LONG).show() }

        //possible improvement configurable
        if(photoUrl.isNotBlank())
            Picasso.get().load(photoUrl).resize(350,350).centerCrop().placeholder(R.mipmap.ic_launcher).into(thumb)
        else
            Picasso.get().load(R.mipmap.ic_launcher).resize(350,350).centerCrop().placeholder(R.mipmap.ic_launcher).into(thumb)
    }
}
