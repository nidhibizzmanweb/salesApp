package com.example.mysalestrackapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mysalestrackapp.R
import kotlinx.android.synthetic.main.activity_target_achievement_actviity.*


class TargetAchievementActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target_achievement_actviity)

        setClick()

    }

    private fun setClick() {

        home_icon.setOnClickListener {
            onBackPressed()
        }

    }

}