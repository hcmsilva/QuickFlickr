package com.demos.henrique.quickflickr.utils.Networking;

import com.demos.henrique.quickflickr.model.FlickrFeed;
import com.demos.henrique.quickflickr.ui.gallery.GalleryContract;
import com.demos.henrique.quickflickr.utils.DataContract;
import com.demos.henrique.quickflickr.utils.EspressoTestingIdlingResource;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FlickrApi implements DataContract
{
    private static String API_BASE_URL;
    private Retrofit retrofit;

    public FlickrApi(String endPointBaseUrl)
    {
        API_BASE_URL = endPointBaseUrl;
        retrofit = getRetrofitInstance();
    }



    private Retrofit getRetrofitInstance()
    {
        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

    @Override
    public void getFlickrFeed(final GalleryContract.GalleryPresenter dataReceiver)
    {


        FlickrClientService apiService = getRetrofitInstance().create(FlickrClientService.class);


        Call<FlickrFeed> mCall = apiService.getFeed(1, "json");


        EspressoTestingIdlingResource.increment();
        mCall.enqueue(new Callback<FlickrFeed>() {
            @Override
            public void onResponse(Call<FlickrFeed> call, Response<FlickrFeed> response)
            {
                dataReceiver.updatePhotosList(response.body());
                EspressoTestingIdlingResource.decrement();
            }

            @Override
            public void onFailure(Call<FlickrFeed> call, Throwable t)
            {
                t.printStackTrace();
                EspressoTestingIdlingResource.decrement();
            }
        });



    }
}
