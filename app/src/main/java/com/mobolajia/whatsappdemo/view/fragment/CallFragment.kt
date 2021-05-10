package com.mobolajia.whatsappdemo.view.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.mobolajia.whatsappdemo.model.Call
import com.mobolajia.whatsappdemo.adapter.CallAdapter
import com.mobolajia.whatsappdemo.R
import com.mobolajia.whatsappdemo.databinding.FragmentCallBinding

class CallFragment : Fragment() {

    private val binding : FragmentCallBinding by lazy {
        FragmentCallBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val recyclerView = binding.recycler
        recyclerView.adapter =
            CallAdapter(loadCalls())
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu.clear()
        activity?.menuInflater?.inflate(R.menu.action_bar_menu_calls, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    private fun loadCalls() : ArrayList<Call> {
        val calls = ArrayList<Call>()
        calls.add(
            Call(
                R.drawable.fox_s,
                "Ryder",
                "10 minutes ago, 9:20pm",
                R.drawable.ic_baseline_call_made_24,
                R.drawable.ic_baseline_videocam_24
            )
        )
        calls.add(
            Call(
                R.drawable.lib_ref,
                "Babes",
                "Today, 8:40pm",
                R.drawable.ic_baseline_call_received_green_24,
                R.drawable.ic_baseline_call_24
            )
        )
        calls.add(
            Call(
                R.drawable.bg_music,
                "Mr. David",
                "Today, 8:11pm",
                R.drawable.ic_baseline_call_received_green_24,
                R.drawable.ic_baseline_call_24
            )
        )
        calls.add(
            Call(
                R.drawable.lib_ref,
                "Babes",
                "Today, 8:03pm",
                R.drawable.ic_baseline_call_received_red_24,
                R.drawable.ic_baseline_call_24
            )
        )
        calls.add(
            Call(
                R.drawable.book,
                "Annabelle",
                "Today, 7:56pm",
                R.drawable.ic_baseline_call_made_24,
                R.drawable.ic_baseline_call_24
            )
        )
        calls.add(
            Call(
                R.drawable.harley_quin,
                "Psycho",
                "Today, 7:05pm",
                R.drawable.ic_baseline_call_made_24,
                R.drawable.ic_baseline_videocam_24
            )
        )


        calls.add(
            Call(
                R.drawable.cookies,
                "Bolu",
                "Today, 1:24pm",
                R.drawable.ic_baseline_call_received_red_24,
                R.drawable.ic_baseline_call_24
            )
        )
        calls.add(
            Call(
                R.drawable.shoes,
                "Fav Cousin",
                "Yesterday, 11:05pm",
                R.drawable.ic_baseline_call_received_green_24,
                R.drawable.ic_baseline_call_24
            )
        )
        return calls
    }
}