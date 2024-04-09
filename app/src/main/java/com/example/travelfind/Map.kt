package com.example.travelfind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlin.collections.Map

class Map : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        // Highlight the "Map" button
        bottomNavigationView.menu.findItem(R.id.map).isChecked = true

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    startActivity(Intent(this, HomePage::class.java))
                    true
                }
                R.id.map -> {
                    startActivity(Intent(this, Map::class.java))
                    true
                }
                R.id.profile -> {
                    startActivity(Intent(this, Profile::class.java))
                    true
                }
                R.id.setting -> {
                    startActivity(Intent(this, setting::class.java))
                    true
                }
                else -> false
            }
        }
    }
}