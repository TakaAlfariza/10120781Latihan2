package com.example.a10120781latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class VerifyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        var buttonsend = findViewById<Button>(R.id.button7)
        buttonsend.setOnClickListener {
            val intent4 = Intent (this, ProfilActivity::class.java)
            startActivity(intent4)
        }
    }
}