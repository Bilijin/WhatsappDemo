package com.mobolajia.whatsappdemo.view.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.mobolajia.whatsappdemo.R
import com.mobolajia.whatsappdemo.model.Status
import com.mobolajia.whatsappdemo.adapter.StatusAdapter
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
        recycler.adapter =
            StatusAdapter(loadStatus())
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
        statuses.add(
            Status(
                R.drawable.book,
                "Bisola",
                "Just now"
            )
        )
        statuses.add(
            Status(
                R.drawable.fem,
                "Cynthia",
                "3 minutes ago"
            )
        )
        statuses.add(
            Status(
                R.drawable.yellow,
                "Big Head",
                "10 minutes ago"
            )
        )
        statuses.add(
            Status(
                R.drawable.wiki,
                "Hussein",
                "36 minutes ago"
            )
        )
        statuses.add(
            Status(
                R.drawable.avatar,
                "Kelechi",
                "Today, 7:21pm"
            )
        )
        statuses.add(
            Status(
                R.drawable.brooch,
                "A",
                "Today, 7:00pm"
            )
        )
        statuses.add(
            Status(
                R.drawable.cookie,
                "Chuks",
                "Today, 6:56pm"
            )
        )

        return statuses
    }
}