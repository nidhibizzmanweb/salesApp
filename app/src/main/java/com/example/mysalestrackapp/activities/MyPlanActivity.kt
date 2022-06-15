package com.example.mysalestrackapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mysalestrackapp.R
import com.example.mysalestrackapp.adapters.PlanAdapter
import kotlinx.android.synthetic.main.activity_my_plan.*

class MyPlanActivity : AppCompatActivity() {
    private var adapter : PlanAdapter ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_plan)

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
    }
}