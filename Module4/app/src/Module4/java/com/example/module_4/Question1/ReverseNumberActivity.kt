package com.example.module_4.Question1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.module_4.R
import com.example.module_4.databinding.ActivityReverseNumberBinding

class ReverseNumberActivity : AppCompatActivity() {

    lateinit var binding: ActivityReverseNumberBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityReverseNumberBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.evInputNumber.addTextChangedListener(object : TextWatcher {

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                val inputString= p0.toString()

                if (!inputString.isEmpty()){
                    //Reverse the number
                    val reverseString=inputString.reversed()
                    binding.reverseNumber.text=reverseString
                }else{
                    binding.reverseNumber.text=""
                }
            }

        })

    }
}