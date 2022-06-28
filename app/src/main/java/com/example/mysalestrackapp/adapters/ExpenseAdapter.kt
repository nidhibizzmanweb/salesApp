package com.example.mysalestrackapp.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mysalestrackapp.R
import com.example.mysalestrackapp.activities.MyPlanTwoActivity
import kotlinx.android.synthetic.main.items_expense.view.*

class ExpenseAdapter(var context : Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items_expense,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.tvOpen.setOnClickListener {
            context.startActivity(Intent(context,MyPlanTwoActivity::class.java))
        }

    }

    override fun getItemCount() = 6
}