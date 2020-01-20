package com.appin.kotlinexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_toast.*
class ToastEx : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        button.setOnClickListener() {
            Toast.makeText(applicationContext, "this is toast message", Toast.LENGTH_SHORT).show()

            val toast = Toast.makeText(applicationContext, "Hello Javatpoint", Toast.LENGTH_SHORT)
            toast.show()

            val myToast =
                Toast.makeText(applicationContext, "toast message with gravity", Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.LEFT, 200, 200)
            myToast.show()
        }
    }
}
