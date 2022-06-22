package com.example.mysalestrackapp.activities

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import com.example.mysalestrackapp.R
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        setClick()
    }

    private fun setClick() {
        signUpBut.setOnClickListener {
            startActivity(Intent(this,VerificationActivity::class.java))
        }
    }

//    private fun showVerifyPopUp() {
//        var dialog = Dialog(this)
//        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
//        dialog.setCancelable(true)
//        dialog.setContentView(R.layout.verification_code_layout)
//        dialog.show()
//        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT));
//    }

}