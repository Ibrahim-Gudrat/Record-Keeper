package com.abrahamgudratli.recordkeeper

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.abrahamgudratli.recordkeeper.databinding.FragmentCyclingBinding

class CyclingFragment : Fragment() {

    private lateinit var binding: FragmentCyclingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCyclingBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.container5kmCycling.setOnClickListener { launchEditCyclingScreen("5 Km Distance") }
        binding.container10kmCycling.setOnClickListener { launchEditCyclingScreen("10 Km Distance") }
        binding.container20kmCycling.setOnClickListener { launchEditCyclingScreen("Longest Ride") }
        binding.containerHalfMarathonCycling.setOnClickListener { launchEditCyclingScreen("Biggest Climb") }
        binding.containerFullMarathonCycling.setOnClickListener { launchEditCyclingScreen("Best Average Speed") }
    }

    private fun launchEditCyclingScreen(distance: String) {
        val intent = Intent(context, EditCyclingRecordActivity::class.java)
        intent.putExtra("Distance", distance)
        startActivity(intent)
    }

}