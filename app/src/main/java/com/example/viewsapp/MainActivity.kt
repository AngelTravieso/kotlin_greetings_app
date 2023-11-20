package com.example.viewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et: EditText = findViewById(R.id.editText1)
        // val ett = findViewById<EditText>(R.id.editText1)

        // Getting the input from EditText
        val editTextInput: String = et.text.toString()

        println(editTextInput)

    }
}