package com.example.dailyplanner

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThridScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thrid_screen)

        val tvNext3 = findViewById<Button>(R.id.tvNext3)
        tvNext3.setOnClickListener {
            val intent = Intent(this, GetStart::class.java)
            startActivity(intent)
        }

        val btn_prev_02 = findViewById<Button>(R.id.btn_prev_02)
        btn_prev_02.setOnClickListener {
            val intent = Intent(this, SecoundScreen::class.java)
            startActivity(intent)
        }
    }
}