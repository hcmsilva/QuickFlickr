package com.demos.henrique.quickflickr.ui.gallery

import android.support.test.espresso.Espresso
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.contrib.RecyclerViewActions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.demos.henrique.quickflickr.R
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers
import org.hamcrest.TypeSafeMatcher
import org.junit.Test

import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class GalleryActivityTest {

    @Rule
    @JvmField
    var galleryTestRule = ActivityTestRule<GalleryActivity>(GalleryActivity::class.java)

    @Test
    fun showPhotoListAndScroll()
    {
        val mInteraction = Espresso.onView(ViewMatchers.withId(R.id.main_list))

        mInteraction.perform(ViewActions.swipeUp()).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun showPhotoListScrollAndClickLastPhoto()
    {
        Espresso.onView(ViewMatchers.withId(R.id.main_list))
                .perform(
                        RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(19))
                .perform(ViewActions.click())
    }


}