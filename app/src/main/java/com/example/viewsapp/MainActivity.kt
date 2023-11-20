package com.example.viewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // EditText
        val et: EditText = findViewById(R.id.editText1)
        // val ett = findViewById<EditText>(R.id.editText1)

        // Button
        val btn: Button = findViewById(R.id.button)

        // Image
        val img: ImageView = findViewById(R.id.img)

        img.setImageResource(R.drawable.ring)

        // Handle the click event on the button
        btn.setOnClickListener() {
            // Execute this code when the button is clicked

            // Getting the input from EditText
            val editTextInput: String = et.text.toString()

            Toast.makeText(
                this@MainActivity,
                "$editTextInput",
                Toast.LENGTH_LONG)
                .show()
        }

    }
}