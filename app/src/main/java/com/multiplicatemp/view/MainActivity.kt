package com.multiplicatemp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.multiplicatemp.databinding.ActivityMainBinding
import com.multiplicatemp.model.modelView


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private val modelView: modelView by viewModels()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initObservers()


        binding.btnStart.setOnClickListener { modelView.doCount(
            1 ,10) }

    }
    private fun initObservers() {
        modelView.count.observe(this) {

            binding.tvTimer.text = it
        }
    }



}

