package com.abrahamgudratli.recordkeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abrahamgudratli.recordkeeper.databinding.ActivityEditCyclingRecordBinding
import com.abrahamgudratli.recordkeeper.databinding.FragmentCyclingBinding

class EditCyclingRecordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditCyclingRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditCyclingRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val titleDistance = intent.getStringExtra("Distance")
        title = titleDistance
    }
}