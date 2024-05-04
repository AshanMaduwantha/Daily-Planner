package com.example.dailyplanner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FristScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frist_screen)

        val tvNext1 = findViewById<Button>(R.id.tvNext1)
        tvNext1.setOnClickListener {
            val intent = Intent(this, SecoundScreen::class.java)
            startActivity(intent)
        }
    }
}