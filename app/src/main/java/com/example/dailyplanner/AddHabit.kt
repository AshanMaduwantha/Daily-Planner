package com.example.dailyplanner

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AddHabit : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_habit)

        val btn_continue1 = findViewById<Button>(R.id.btn_continue1)
        btn_continue1.setOnClickListener {
            val intent = Intent(this, Home_02::class.java)
            startActivity(intent)
        }
    }
}