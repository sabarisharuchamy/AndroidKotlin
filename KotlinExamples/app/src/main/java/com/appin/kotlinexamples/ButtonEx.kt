package com.appin.kotlinexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_button_ex.*

class ButtonEx : AppCompatActivity(),View.OnClickListener {
    val button4_Id: Int = 1111
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_ex)
        button1.setOnClickListener(){
            Toast.makeText(this,"button 1 clicked", Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener(this)
        // add button dynamically
        val button4 = Button(this)
        button4.setText("Button 4 added dynamically")
        button4.setLayoutParams(ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT))
        button4.setId(button4_Id)
        button4.x = 250f
        button4.y = 500f
        button4.setOnClickListener(this)
        constraintLayout.addView(button4)
    }
    override fun onClick(view: View) {
        //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        when (view.id) {
            R.id.button2 ->
                Toast.makeText(this,"button 2 clicked", Toast.LENGTH_SHORT).show()//single line code
            button4_Id->{//multiline code
                val myToast = Toast.makeText(this,"button 4 clicked", Toast.LENGTH_SHORT)
                myToast.show()
            }
        }
    }
    fun clickButton(v: View){
        val mToast = Toast.makeText(applicationContext,"button 3 clicked", Toast.LENGTH_SHORT)
        mToast.show()
    }

}

