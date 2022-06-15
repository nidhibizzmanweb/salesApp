package com.example.mysalestrackapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mysalestrackapp.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        clicks()

    }

    private fun clicks() {
        tvSignUp.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))

        }
        tvLogin.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}