package com.mobolajia.whatsappdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mobolajia.whatsappdemo.databinding.FragmentChatBinding
import kotlin.collections.ArrayList

class ChatFragment : Fragment() {

    private val binding : FragmentChatBinding by lazy {
        FragmentChatBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val recyclerView = binding.recycler
        recyclerView.adapter = ChatAdapter(loadChats())
        return binding.root
    }

    private fun loadChats() : ArrayList<Chat> {
        val chats = ArrayList<Chat>()
        chats.add(Chat(R.drawable.lib_ref, "Babes", "Love you!!", "9:30pm"))
        chats.add(Chat(R.drawable.robot, "Chuks", getString(R.string.msg4), "9:28pm", 1))
        chats.add(Chat(R.drawable.laptop, "mr maybe", getString(R.string.msg2), "9:28pm"))
        chats.add(Chat(R.drawable.brooch, "Lola", getString(R.string.msg6), "9:24pm", 3))
        chats.add(Chat(R.drawable.book, "Big Head", getString(R.string.msg12), "9:23pm"))
        chats.add(Chat(R.drawable.harley_quin, "Psycho", getString(R.string.msg9), "9:22pm"))
        chats.add(Chat(R.drawable.cookie, "Deborah", getString(R.string.msg1), "9:15pm", 3))
        chats.add(Chat(R.drawable.wiki, "Dad", getString(R.string.msg13), "9:10pm", 2))

        chats.add(Chat(R.drawable.fox_s, "Ryder", getString(R.string.msg3), "9:09pm"))
        chats.add(Chat(R.drawable.yellow, "Tom", getString(R.string.msg5), "9:00pm", 2))
        chats.add(Chat(R.drawable.meme_dark, "Rasheedat", getString(R.string.msg7), "8:59pm"))
        chats.add(Chat(R.drawable.cookies, "Bolu", getString(R.string.msg8), "8:33pm"))

        return chats
    }
}