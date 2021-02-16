package com.mobolajia.whatsappdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StatusAdapter(private val statuses : ArrayList<Status>) : RecyclerView.Adapter<StatusAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.status, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val status = statuses[position]

        holder.dp.setImageResource(status.img)
        holder.user.text = status.name
        holder.time.text = status.time
    }

    override fun getItemCount(): Int {
        return statuses.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        init {
            itemView.setOnClickListener(this)
        }
        val dp : ImageView = itemView.findViewById(R.id.status_img)
        val user : TextView = itemView.findViewById(R.id.name)
        val time : TextView = itemView.findViewById(R.id.time)

        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }

    }
}