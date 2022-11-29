package com.abrahamgudratli.recordkeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abrahamgudratli.recordkeeper.databinding.ActivityEditRunningRecordBinding

class EditRunningRecordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditRunningRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditRunningRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val titleDistance = intent.getStringExtra("Distance")
        title = titleDistance


    }
}