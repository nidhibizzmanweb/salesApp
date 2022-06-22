package com.example.mysalestrackapp.activities

import android.content.Intent
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.core.content.ContextCompat
import com.example.mysalestrackapp.R
import kotlinx.android.synthetic.main.activity_my_plan.*

class MyPlanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_plan)

        setClicks()
        setRoleAdapter()
        setStrokeColorToBlue()

    }

    private fun setStrokeColorToBlue() {
        val drawable = blueStrokeSec.background as GradientDrawable
        drawable.setStroke(1,ContextCompat.getColor(this,R.color.purple_500))
    }

    private fun setRoleAdapter() {
       val arrayAdapter = ArrayAdapter.createFromResource(
            this,
            R.array.roleArray,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
//           adapter.setDropDownViewResource(R.layout.items_spinner_layout)

           adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
           spinRole.adapter = adapter
        }
    }


    private fun setClicks() {
        backArrow.setOnClickListener {
            onBackPressed()
        }
        home_icon.setOnClickListener {
            onBackPressed()
        }
        locImage.setOnClickListener {
            startActivity(Intent(this,MyPlanTwoActivity::class.java))
        }
    }
}