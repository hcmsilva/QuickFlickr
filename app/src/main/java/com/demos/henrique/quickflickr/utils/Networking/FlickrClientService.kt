package com.demos.henrique.quickflickr.utils.Networking

import com.demos.henrique.quickflickr.model.FlickrFeed

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface FlickrClientService {

    @GET("photos_public.gne")
    fun getFeed(@Query("nojsoncallback") value: Int, @Query("format") format: String): Call<FlickrFeed>
}