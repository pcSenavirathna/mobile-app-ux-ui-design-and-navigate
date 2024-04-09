package com.example.travelfind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class create_pswd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_pswd)

        val backArr: ImageButton = findViewById(R.id.backArrow)
        backArr.setOnClickListener{
            val intent = Intent(this,acc_create::class.java)
            startActivity(intent)
        }

        val nxtBtn: ImageButton = findViewById(R.id.nextBtn)
        nxtBtn.setOnClickListener{
            val intent = Intent(this,terms::class.java)
            startActivity(intent)
        }
    }
}