package com.bird_brown.myomikujiapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
//import android.R
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setContentView(R.layout.content_layout_id)

        getOmikujiButton.setOnClickListener {
            // Code here executes on main thread after user presses button
//            Log.v("MainActivity", "Button Clicked")
            val results = arrayOf("大吉","吉","中吉","小吉","凶")

//            val n = Random().nextInt(3)
            val n = Random().nextInt(results.count())


//            resultTextView.text = n.toString()
            resultTextView.text = results.get(n)

            if (n == 0) {
//                resultTextView.setTextColor(Color.RED)
//                resultTextView.setTextColor(Color.parseColor("#ff0000"))
                resultTextView.setTextColor(Color.argb(255, 255, 0, 0))
            } else {
                resultTextView.setTextColor(Color.parseColor("#808080"))
            }

        }
    }
}
