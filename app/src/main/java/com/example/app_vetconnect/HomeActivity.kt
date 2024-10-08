package com.example.app_vetconnect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btShow = findViewById<Button>(R.id.btShow)
        btShow.setOnClickListener {
            val intent = Intent(this, HomeDescriptionActivity::class.java)
            startActivity(intent)
        }
    }
}