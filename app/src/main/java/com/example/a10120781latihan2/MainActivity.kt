package com.example.a10120781latihan2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button5 = findViewById<TextView>(R.id.tblregister)
        button5.setOnClickListener {
            val intent1 = Intent (this, RegisterActivity::class.java)
            startActivity(intent1)
        }
    }
}