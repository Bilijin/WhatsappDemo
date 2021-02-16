package com.mobolajia.whatsappdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CallAdapter(private val calls : ArrayList<Call>) : RecyclerView.Adapter<CallAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.call, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val call = calls[position]

        holder.dp.setImageResource(call.img)
        holder.user.text = call.name
        holder.time.text = call.time
        holder.inOut.setImageResource(call.inOut)
        holder.audioVideo.setImageResource(call.videoAudio)
    }

    override fun getItemCount(): Int {
        return calls.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        init {
            itemView.setOnClickListener(this)
        }
        val dp : ImageView = itemView.findViewById(R.id.img)
        val user : TextView = itemView.findViewById(R.id.name)
        val time : TextView = itemView.findViewById(R.id.time)
        val inOut : ImageView = itemView.findViewById(R.id.in_or_out)
        val audioVideo : ImageView = itemView.findViewById(R.id.audio_video)

        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }

    }
}