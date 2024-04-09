package com.example.travelfind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        var signinbtn = findViewById<TextView>(R.id.signinBtn)
        signinbtn.setOnClickListener {
            val intent = Intent(this,HomePage::class.java)
            startActivity(intent)
        }

        var signup_btn = findViewById<TextView>(R.id.acc_btn)
        signup_btn.setOnClickListener {
            val intent = Intent(this,acc_create::class.java)
            startActivity(intent)
        }
    }
}