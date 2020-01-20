package com.appin.kotlinexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import kotlinx.android.synthetic.main.activity_pop_up_menu_ex.*

class PopUpMenuEx : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pop_up_menu_ex)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button)
            popupMenu.menuInflater.inflate(R.menu.menu_main3,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_crick ->
                        Toast.makeText(this@PopUpMenuEx, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
                    R.id.action_ftbal ->
                        Toast.makeText(this@PopUpMenuEx, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
                    R.id.action_hockey ->
                        Toast.makeText(this@PopUpMenuEx, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
                }
                true
            })
            popupMenu.show()
        }
    }
}
