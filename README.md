# QuickFlickr
A proof-of-concept app that loads images from the public Flickr feed and shows some metadata on clicked images. 

Written 50/50 in **Kotlin** and **Java**, **MVP design pattern**, **local Unit tests**, **Mockito** for unit test isolation and Instrumented tests using **Espresso**


- The app is organized *Feature-per-Package* 
- There are two added *flavor dimensions* mock and prod that were introduced to isolate testing from the network
- There the base endpoint URL for the live API is loaded from a config file
- The basic metadata strings are available in English (the *default* language) and Portuguese (loaded through *resource qualifiers*)
- Retrofit was used to design a simple restful API client (in the *prod* flavor)
- Picasso was used for simple asynchronous loading and caching of the image urls
- There is a set of local Unit tests written with **JUnit**
- Mockito was used to generate mocks and better isolate these unit tests
- There is a separate set of Instrumented tests performed using **Espresso**





Video Demos:

Prod flavor

[![YouTube demo](https://img.youtube.com/vi/tTMgWdVFrEg/hqdefault.jpg)](https://youtu.be/tTMgWdVFrEg)


Mocked Api / Fake Implementation for test isolation (using Product Flavor dimensions)

[![YouTube demo](https://img.youtube.com/vi/FuXi13p0go8/hqdefault.jpg)](https://youtu.be/FuXi13p0go8)

