package com.appin.kotlinexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import java.io.IOException

class XMLParsingUsingXMLPullParser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
setContentView(R.layout.activity_xmlparsing_using_domparser)
        val listView = findViewById<ListView>(R.id.listView)
        var employees: List<Employee>? = null
        try {
            val parser = XmlPullParserHandler()
            val istream = assets.open("employees.xml")
            employees = parser.parse(istream)

            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, employees)
            listView.adapter = adapter

        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}
