package com.example.dailyplanner

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecoundScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secound_screen)

        val tvNext2 = findViewById<Button>(R.id.tvNext2)
        tvNext2.setOnClickListener {
            val intent = Intent(this, ThridScreen::class.java)
            startActivity(intent)
        }

        val btn_prev = findViewById<Button>(R.id.btn_prev)
        btn_prev.setOnClickListener {
            val intent = Intent(this, FristScreen::class.java)
            startActivity(intent)
        }
    }
}