package com.mobolajia.whatsappdemo

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.mobolajia.whatsappdemo.databinding.FragmentStatusBinding

class StatusFragment : Fragment() {

    private val binding : FragmentStatusBinding by lazy {
        FragmentStatusBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val recycler = binding.recycler
        recycler.adapter = StatusAdapter(loadStatus())
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu.clear()
        activity?.menuInflater?.inflate(R.menu.action_bar_menu_status, menu)
        super.onCreateOptionsMenu(menu, inflater)

    }

    private fun loadStatus() : ArrayList<Status> {
        val statuses = ArrayList<Status>()
        statuses.add(Status(R.drawable.book, "Bisola", "9:20pm"))
        statuses.add(Status(R.drawable.fem, "Cynthia", "9:20pm"))
        statuses.add(Status(R.drawable.yellow, "Big Head", "9:20pm"))
        statuses.add(Status(R.drawable.wiki, "Hussein", "9:20pm"))
        statuses.add(Status(R.drawable.avatar, "Kelechi", "9:20pm"))
        statuses.add(Status(R.drawable.brooch, "A", "9:20pm"))
        statuses.add(Status(R.drawable.cookie, "Chuks", "9:20pm"))

        return statuses
    }
}