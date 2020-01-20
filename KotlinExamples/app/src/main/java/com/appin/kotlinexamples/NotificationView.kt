package com.appin.kotlinexamples


import android.os.Bundle
import kotlinx.android.synthetic.main.activity_notification_view.*
import androidx.appcompat.app.AppCompatActivity


class NotificationView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_view)
        //getting the notification message
        val message = intent.getStringExtra("message")
textView.text=message
    }
}