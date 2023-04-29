package com.example.a10120781latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AlmostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost)

        var buttonvery = findViewById<Button>(R.id.button7)
        buttonvery.setOnClickListener {
            val intent3 = Intent (this, VerifyActivity::class.java)
            startActivity(intent3)
        }
    }
}