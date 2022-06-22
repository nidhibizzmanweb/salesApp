package com.example.mysalestrackapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mysalestrackapp.R
import kotlinx.android.synthetic.main.activity_my_plan_two.*

class MyPlanTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_plan_two)

        setClick()
    }

    private fun setClick() {
        backArrow.setOnClickListener {
            onBackPressed()
        }
    }
}