package com.example.mysalestrackapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mysalestrackapp.activities.DashboardActivity
import com.example.mysalestrackapp.activities.ExpenseActivity
import com.example.mysalestrackapp.activities.MyPlanActivity
import com.example.mysalestrackapp.activities.TargetAchievementActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clicks()

    }

    private fun clicks() {

        dashboardSec.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
        myPlanSec.setOnClickListener {
            startActivity(Intent(this, MyPlanActivity::class.java))
        }
        expenseSec.setOnClickListener {
            startActivity(Intent(this, ExpenseActivity::class.java))
        }
        targetAchievmnetSec.setOnClickListener {
            startActivity(Intent(this, TargetAchievementActivity::class.java))
        }

    }
}