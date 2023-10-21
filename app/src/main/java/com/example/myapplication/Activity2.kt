package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val button=findViewById<Button>(R.id.button)
        val textview4 = findViewById<TextView>(R.id.textView4)
        textview4.text=intent.getStringExtra("animal")
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}