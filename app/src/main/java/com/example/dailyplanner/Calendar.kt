package com.example.dailyplanner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class Calendar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {

                R.id.Home -> {
                    val homeIntent = Intent(this, Home_02::class.java)
                    startActivity(homeIntent)
                    true
                }
                R.id.Static -> {
                    val homeIntent = Intent(this, Calendar::class.java)
                    startActivity(homeIntent)
                    true
                }
                R.id.Setting -> {
                    val browseIntent = Intent(this, Settings::class.java)
                    startActivity(browseIntent)
                    true
                }
                else -> false
            }
        }
    }
}