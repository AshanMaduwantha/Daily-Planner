package com.example.dailyplanner

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GetStart : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_start)

        val start = findViewById<Button>(R.id.start)
        start.setOnClickListener {
            val intent = Intent(this, Home_01::class.java)
            startActivity(intent)
        }
    }
}