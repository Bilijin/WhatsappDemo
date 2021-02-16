package com.mobolajia.whatsappdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatAdapter(private val chats : ArrayList<Chat>) : RecyclerView.Adapter<ChatAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.chat_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val chat = chats[position]

        holder.dp.setImageResource(chat.img)
        holder.message.text = chat.message
        holder.user.text = chat.user
        holder.time.text = chat.time

        when(chat.value) {
            1 -> holder.message.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_sent_24, 0, 0, 0)
            2 -> holder.message.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_delivered_24, 0, 0, 0)
            3 -> holder.message.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_read_24, 0, 0, 0)
            else -> holder.message.compoundDrawablePadding = 0
        }
    }

    override fun getItemCount(): Int {
        return chats.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        init {
            itemView.setOnClickListener(this)
        }
        val dp : ImageView = itemView.findViewById(R.id.dp)
        val user : TextView = itemView.findViewById(R.id.user)
        val message : TextView = itemView.findViewById(R.id.message)
        val time : TextView = itemView.findViewById(R.id.time)

        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }

    }
}