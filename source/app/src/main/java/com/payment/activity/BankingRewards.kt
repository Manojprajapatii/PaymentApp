package com.payment.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.payment.R

class BankingRewards : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banking_rewards)



        val sendOtp = findViewById<Button>(R.id.btn)
        sendOtp.setOnClickListener {
            val intent = Intent(this, MoneyTransaction::class.java)
            startActivity(intent)
        }

    }

}