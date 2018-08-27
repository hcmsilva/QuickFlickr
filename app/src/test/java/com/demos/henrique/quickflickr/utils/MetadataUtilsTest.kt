package com.demos.henrique.quickflickr.utils


import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MetadataUtilsTest {

    lateinit var utils: MetadataUtils

    @Before
    fun setUp() {
        utils = MetadataUtils()
    }

    @Test
    fun extractAuthor() {
        val author = "nobody@flickr.com (\"Henrique\")"

        val result = utils.extractAuthor(author)

        Assert.assertEquals("Henrique", result)
    }

    @Test
    fun extractTime() {

        val date = "2018-08-26T18:39:47Z"

        val result = utils.extractTime(date)

        Assert.assertEquals("2018-08-26, 18:39", result)
    }
}