package com.demos.henrique.quickflickr.utils.Networking;

import com.demos.henrique.quickflickr.model.FlickrFeed;
import com.demos.henrique.quickflickr.model.FlickrPhoto;
import com.demos.henrique.quickflickr.ui.gallery.GalleryContract;
import com.demos.henrique.quickflickr.utils.DataContract;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ApiFakeImpl implements DataContract {
    @Override
    public void getFlickrFeed(@NotNull GalleryContract.GalleryPresenter dataReceiver) {

        FlickrFeed feed = new FlickrFeed();
        feed.setFlickrPhotos(generateDummyPhotoList());

        dataReceiver.updatePhotosList(feed);
    }

    private List<FlickrPhoto> generateDummyPhotoList() {

        List<FlickrPhoto> dummyList = new ArrayList<>(20);
        for(int i = 0; i < 20; i++)
        {
            FlickrPhoto photo = new FlickrPhoto();
            photo.setAuthor("Henrique");
            photo.setTitle("Dummy-"+i);
            photo.setDateTaken("00-00-00");
            photo.setPublished("00-00-00");
            FlickrPhoto.Media mockM = new FlickrPhoto.Media("");
            photo.setMedia(mockM);
            photo.setLink("");
            photo.setDateTaken("");
            photo.setDescription("");
            dummyList.add(photo);
        }

        return dummyList;
    }
}
