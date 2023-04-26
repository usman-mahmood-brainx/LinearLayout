package com.example.linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the parent LinearLayout from your XML layout
        val parentLayout = findViewById<LinearLayout>(R.id.containerLayout)

        for (i in 0..3) {

            // Create a new LinearLayout
            val linearLayout = LinearLayout(this)
            linearLayout.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                0,
                1f
            )
            linearLayout.orientation = LinearLayout.HORIZONTAL
            linearLayout.weightSum = 3f

            // Set the background color based on the row number
            if (i % 2 == 0) {
                linearLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.gray))
            } else {
                linearLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            }

            // Create the TextView and add it to the LinearLayout
            val textView = TextView(this)
            textView.layoutParams = LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                1f
            )
            textView.gravity = Gravity.CENTER
            textView.text = "TextView"
            textView.setTextColor(ContextCompat.getColor(this, R.color.black))
            linearLayout.addView(textView)

            // Create the EditText and add it to the LinearLayout
            val editText = EditText(this)
            editText.layoutParams = LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                1f,
            )
            editText.gravity = Gravity.CENTER
            editText.setText("EditText")
            editText.setTextColor(ContextCompat.getColor(this, R.color.black))
            linearLayout.addView(editText)

            // Create the Button and add it to the LinearLayout
            val button = Button(this)
            button.layoutParams = LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                1f
            )
            button.gravity = Gravity.CENTER
            button.text = "Button"
            button.setTextColor(ContextCompat.getColor(this, R.color.black))
            linearLayout.addView(button)

            // Add the LinearLayout to the parent LinearLayout
            parentLayout.addView(linearLayout)
        }

    }
}