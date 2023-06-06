package com.example.module_4.Question8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.module_4.databinding.ActivityCalculateBinding
import com.example.module_4.databinding.ActivityTextViewHideAndDisplayBinding

class TextViewHideAndDisplay : AppCompatActivity() {

    lateinit var binding: ActivityTextViewHideAndDisplayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTextViewHideAndDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShow.setOnClickListener {
            binding.textView.visibility=View.VISIBLE

        }

        binding.btnHide.setOnClickListener {
            binding.textView.visibility=View.GONE
        }

    }
}