package com.example.module_4.Question2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.module_4.R
import com.example.module_4.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {

    lateinit var binding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSend.setOnClickListener {

            var firstnumber=binding.firstNumber.text.toString().toInt()
            var secondnumber=binding.etSecondNumber.text.toString().toInt()

            var intent=Intent(this,SecondActivity::class.java)
            intent.putExtra("FIRSTNUMBER",firstnumber)
            intent.putExtra("SECONDNUMBER",secondnumber)
            startActivity(intent)

        }



    }
}