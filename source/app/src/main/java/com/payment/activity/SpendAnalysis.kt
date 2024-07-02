package com.payment.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.payment.R

class SpendAnalysis : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.payment.R.layout.activity_spend_analysis)


        val imgView = findViewById<ImageView>(R.id.back_arrow)
        imgView.setOnClickListener {
            val intent = Intent(this, MoneyTransaction::class.java)
            startActivity(intent)
        }

    }

}