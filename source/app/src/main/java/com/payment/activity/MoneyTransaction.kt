package com.payment.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.payment.R


class MoneyTransaction : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_money_transaction)

        val textOpen = findViewById<TextView>(R.id.spend_analysis)
        textOpen.setOnClickListener {
            val intent = Intent(this, SpendAnalysis::class.java)
            startActivity(intent)
        }

        val imgView = findViewById<ImageView>(R.id.group)
        imgView.setOnClickListener {
            val intent = Intent(this, SpendAnalysis::class.java)
            startActivity(intent)
        }
    }
}