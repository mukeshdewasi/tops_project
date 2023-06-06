package com.example.module_4.Question11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import com.example.module_4.databinding.ActivityFontDisplayBinding
import com.example.module_4.databinding.ActivityPdfOpenBinding

class FontDisplayActivity : AppCompatActivity() {

    lateinit var binding: ActivityFontDisplayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFontDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlus.setOnClickListener {
            inceaseFontSize()
        }
        binding.btnMinus.setOnClickListener {
            decreaseFontSize()
        }

    }

    private fun decreaseFontSize() {
        val size=binding.fontSize.textSize / resources.displayMetrics.scaledDensity
        binding.fontSize.setTextSize(TypedValue.COMPLEX_UNIT_SP,size+1)
    }

    private fun inceaseFontSize() {
        val size=binding.fontSize.textSize / resources.displayMetrics.scaledDensity
        binding.fontSize.setTextSize(TypedValue.COMPLEX_UNIT_SP,size+1)
    }

    }



