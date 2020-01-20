package com.appin.kotlinexamples

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import kotlinx.android.synthetic.main.fragment_java.view.*

class JavaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_java, container, false)

        view.androidButton!!.setOnClickListener(View.OnClickListener {
            Toast.makeText(context,"java fragment", Toast.LENGTH_SHORT).show()
        })
        return view
    }
} //Required empty public constructor