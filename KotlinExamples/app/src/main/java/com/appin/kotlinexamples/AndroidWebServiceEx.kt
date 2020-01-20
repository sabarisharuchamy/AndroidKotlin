package com.appin.kotlinexamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class AndroidWebServiceEx : AppCompatActivity() {
    internal lateinit var id: TextView
    internal lateinit var userName: TextView
    internal lateinit var userEmail: TextView
    internal lateinit var gender: TextView
    internal lateinit var btnLogout: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_web_service_ex)
        if (SharedPrefManager.getInstance(this).isLoggedIn) {
            id = findViewById(R.id.textViewId)
            userName = findViewById(R.id.textViewUsername)
            userEmail = findViewById(R.id.textViewEmail)
            gender = findViewById(R.id.textViewGender)
            btnLogout = findViewById(R.id.buttonLogout)

            val user = SharedPrefManager.getInstance(this).user

            id.text = user.id.toString()
            userEmail.text = user.email
            gender.text = user.gender
            userName.text = user.name




        } else {
            val intent = Intent(this@AndroidWebServiceEx, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
    fun onClick(view: View) {
        if (view == btnLogout) {
            SharedPrefManager.getInstance(applicationContext).logout()
        }
    }



}
