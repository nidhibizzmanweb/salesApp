package com.example.mysalestrackapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mysalestrackapp.MainActivity
import com.example.mysalestrackapp.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setClicks()

    }

    private fun setClicks() {
        tvForgetPass.setOnClickListener {
            startActivity(Intent(this,ForgetPasswordActivity::class.java))
        }
        tvLogin.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}