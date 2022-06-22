package com.example.mysalestrackapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mysalestrackapp.R
import com.example.mysalestrackapp.adapters.ExpenseAdapter
import kotlinx.android.synthetic.main.activity_expense.*

class ExpenseActivity : AppCompatActivity() {
    private var adapter : ExpenseAdapter ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expense)

        setClick()
        setAdapter()
    }

    private fun setAdapter() {
        adapter = ExpenseAdapter(this)
        recycleExpense.adapter = adapter
    }

    private fun setClick() {
        backArrow.setOnClickListener {
            onBackPressed()
        }
    }
}