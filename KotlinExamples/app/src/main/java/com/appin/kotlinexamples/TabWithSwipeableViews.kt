package com.appin.kotlinexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout

class TabWithSwipeableViews : AppCompatActivity() {
    var tabLayout: TabLayout? = null
    var viewPager: ViewPager2? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_with_swipeable_views)

        tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        viewPager = findViewById<ViewPager2>(R.id.viewPager2)

        tabLayout!!.addTab(tabLayout!!.newTab().setText("Bus"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Bike"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Car"))
        tabLayout!!.tabGravity = TabLayout.GRAVITY_FILL


    }
}
