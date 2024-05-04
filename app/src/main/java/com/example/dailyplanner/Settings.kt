package com.example.dailyplanner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

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
        val imageView = findViewById<ImageView>(R.id.pro_set)
        imageView.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}