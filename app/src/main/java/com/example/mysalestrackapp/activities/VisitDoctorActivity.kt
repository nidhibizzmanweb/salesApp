package com.example.mysalestrackapp.activities


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mysalestrackapp.R
import com.example.mysalestrackapp.adapters.PlanAdapter
import kotlinx.android.synthetic.main.activity_visit_doctor.*


class VisitDoctorActivity : AppCompatActivity() {

    private var adapter : PlanAdapter?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visit_doctor)

        setClicks()
        setAdapter()
    }

    private fun setAdapter() {
        adapter = PlanAdapter(this)
        recyclePlan.adapter = adapter
    }

    private fun setClicks() {
        backArrow.setOnClickListener {
            onBackPressed()
        }
        home_icon.setOnClickListener {
            onBackPressed()
        }
        bottomSec.setOnClickListener {
           startActivity(Intent(this,MyPlanTwoActivity::class.java))
        }
    }
}