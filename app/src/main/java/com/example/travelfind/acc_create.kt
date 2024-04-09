package com.example.travelfind

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class acc_create : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acc_create)

        val backArr: ImageButton = findViewById(R.id.backArrow)
        backArr.setOnClickListener{
            val intent = Intent(this,Welcome::class.java)
            startActivity(intent)
        }

        val nxtBtn: ImageButton = findViewById(R.id.nextBtn)
        nxtBtn.setOnClickListener{
            val intent = Intent(this,create_pswd::class.java)
            startActivity(intent)
        }

    }
}