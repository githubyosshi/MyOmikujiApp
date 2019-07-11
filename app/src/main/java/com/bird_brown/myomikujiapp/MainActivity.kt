package com.bird_brown.myomikujiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
//import android.R
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setContentView(R.layout.content_layout_id)

        getOmikujiButton.setOnClickListener {
            // Code here executes on main thread after user presses button
            Log.v("MainActivity", "Button Clicked")
        }
    }
}
