package com.example.app_vetconnect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PaymentCompleteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paymentcomplete)

        val btReturn = findViewById<Button>(R.id.btReturn)
        btReturn.setOnClickListener {
            val intent = Intent(this, HomeDescriptionActivity::class.java)
            startActivity(intent)
        }
    }
}