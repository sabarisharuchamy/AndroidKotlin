package com.appin.kotlinexamples

import android.Manifest
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat


class AndroidVideoViewEx : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_video_view_ex)

        // Check whether this app has write external storage permission or not.
        // Check whether this app has write external storage permission or not.
        val writeExternalStoragePermission = ContextCompat.checkSelfPermission(
            this@AndroidVideoViewEx,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
        )
// If do not grant write external storage permission.
        // If do not grant write external storage permission.
        if (writeExternalStoragePermission != PackageManager.PERMISSION_GRANTED) { // Request user to grant write external storage permission.
            ActivityCompat.requestPermissions(
                this@AndroidVideoViewEx,
                arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                2
            )
        }

        val videoView = findViewById<VideoView>(R.id.videoView)
        //Creating MediaController
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        //specify the location of media file
        val uri:Uri = Uri.parse("/mnt/m_external_sd/Downloads/BigBuckBunny.mp4")
         //Setting MediaController and URI, then starting the videoView
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode === 2) {
            val grantResultsLength: Int = grantResults.size
            if (grantResultsLength > 0 && grantResults[0] === PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(
                    applicationContext,
                    "You grant write external storage permission. Please click original button again to continue.",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                Toast.makeText(
                    applicationContext,
                    "You denied write external storage permission.",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }

    }

