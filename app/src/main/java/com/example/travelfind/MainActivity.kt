package com.example.travelfind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextLable = findViewById<TextView>(R.id.getstart_btn)
        nextLable.setOnClickListener {
            val intent = Intent(this, second_onboard::class.java)
            startActivity(intent)
        }

        val skipLable = findViewById<TextView>(R.id.skip)
        skipLable.setOnClickListener {
            val intent = Intent(this,Welcome::class.java)
            startActivity(intent)
        }
    }


}