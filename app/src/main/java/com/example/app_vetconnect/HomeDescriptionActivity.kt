package com.example.app_vetconnect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeDescriptionActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_description)

        val btAdd = findViewById<Button>(R.id.btAdd)
        btAdd.setOnClickListener {
            val intent = Intent(this, HomeInfoActivity::class.java)
            startActivity(intent)
        }
    }
}
