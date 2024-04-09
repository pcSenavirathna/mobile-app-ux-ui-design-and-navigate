package com.example.travelfind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class terms : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms)

        val backArr: ImageButton = findViewById(R.id.backArrow)
        backArr.setOnClickListener{
            val intent = Intent(this,create_pswd::class.java)
            startActivity(intent)
        }

        val accept = findViewById<TextView>(R.id.acceptBtn)
        accept.setOnClickListener {
            val intent = Intent(this,HomePage::class.java)
            startActivity(intent)
        }
    }
}