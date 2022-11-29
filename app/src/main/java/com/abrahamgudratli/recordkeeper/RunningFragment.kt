package com.abrahamgudratli.recordkeeper

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.abrahamgudratli.recordkeeper.databinding.FragmentRunningBinding

class RunningFragment : Fragment() {

    private lateinit var binding: FragmentRunningBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRunningBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.container5kmRunning.setOnClickListener { launchEditRunningScreen("5 Km Distance") }
        binding.container10kmRunning.setOnClickListener { launchEditRunningScreen("10 Km Distance") }
        binding.container20kmRunning.setOnClickListener { launchEditRunningScreen("20 Km Distance") }
        binding.containerHalfMarathonRunning.setOnClickListener { launchEditRunningScreen("Half Marathon Running") }
        binding.containerFullMarathonRunning.setOnClickListener { launchEditRunningScreen("Full Marathon Running") }
    }

    private fun launchEditRunningScreen(distance: String) {
        var intent = Intent(context, EditRunningRecordActivity::class.java)
        intent.putExtra("Distance", distance)
        startActivity(intent)
    }

}