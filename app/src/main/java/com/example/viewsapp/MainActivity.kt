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

       // Declaring Views
        val editText: EditText = findViewById(R.id.editText1)
        val btn = findViewById<Button>(R.id.button)

        // Adding functionalities
        btn.setOnClickListener() {
            val enteredText = editText.text

            Toast.makeText(this@MainActivity,
                "Hello $enteredText",
                Toast.LENGTH_LONG
            ).show()
        }

    }
}