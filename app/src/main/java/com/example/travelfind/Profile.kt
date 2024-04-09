package com.example.travelfind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlin.collections.Map

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val backArr: ImageButton = findViewById(R.id.backArrow)
        backArr.setOnClickListener{
            val intent = Intent(this,HomePage::class.java)
            startActivity(intent)
        }


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        // Highlight the "Map" button
        bottomNavigationView.menu.findItem(R.id.profile).isChecked = true

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