package com.example.a10120781latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var buttonregis = findViewById<Button>(R.id.button3)
        buttonregis.setOnClickListener {
            val intent2 = Intent (this, AlmostActivity::class.java)
            startActivity(intent2)
        }
    }
}