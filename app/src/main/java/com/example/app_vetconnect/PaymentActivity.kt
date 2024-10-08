package com.example.app_vetconnect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val btPay = findViewById<Button>(R.id.btPay)
        btPay.setOnClickListener {
            val intent = Intent(this, PaymentCompleteActivity::class.java)
            startActivity(intent)
        }
    }
}