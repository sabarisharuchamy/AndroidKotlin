package com.appin.kotlinexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import org.xml.sax.SAXException
import org.xml.sax.helpers.DefaultHandler
import java.io.IOException
import javax.xml.parsers.ParserConfigurationException
import javax.xml.parsers.SAXParser
import javax.xml.parsers.SAXParserFactory

class XMLParsingUsingSAXParser : AppCompatActivity() {
    internal var empList = ArrayList<HashMap<String, String>>()
    internal var empData = HashMap<String, String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xmlparsing_using_domparser)
        val lv:ListView = findViewById(R.id.listView)
        try {
            //instancing the SAXParserFactory class
            val parserFactory:SAXParserFactory = SAXParserFactory.newInstance()
            //instancing the SAXParser class
            val saxParser:SAXParser = parserFactory.newSAXParser()
            val defaultHandler= object : DefaultHandler() {
                var currentValue = ""
                var currentElement = false
                //overriding the startElement() method of DefaultHandler
                override fun startElement(uri: String, localName: String, qName: String, attributes: org.xml.sax.Attributes) {
                    currentElement = true
                    currentValue = ""
                    if (localName == "employee") {
                        empData = HashMap()
                    }
                }
                //overriding the endElement() method of DefaultHandler
                override fun endElement(uri: String, localName: String, qName: String) {
                    currentElement = false
                    if (localName.equals("name", ignoreCase = true))
                        empData["name"] = currentValue
                    else if (localName.equals("salary", ignoreCase = true))
                        empData["salary"] = currentValue
                    else if (localName.equals("designation", ignoreCase = true))
                        empData["designation"] = currentValue
                    else if (localName.equals("employee", ignoreCase = true))
                        empList.add(empData)
                }
                //overriding the characters() method of DefaultHandler
                override fun characters(ch: CharArray, start: Int, length: Int) {
                    if (currentElement) {
                        currentValue = currentValue + String(ch, start, length)
                    }
                }
            }
            val istream = assets.open("empdetail.xml")
            saxParser.parse(istream, defaultHandler)
            //creating Adapter class to access the custom list
            val adapter = SimpleAdapter(this@XMLParsingUsingSAXParser, empList, R.layout.custom_list, arrayOf("name", "salary", "designation"), intArrayOf(R.id.name, R.id.salary, R.id.designation))
            lv.adapter = adapter
        } catch (e: IOException) {
            e.printStackTrace()
        } catch (e: ParserConfigurationException) {
            e.printStackTrace()
        } catch (e: SAXException) {
            e.printStackTrace()
        }

    }
}
