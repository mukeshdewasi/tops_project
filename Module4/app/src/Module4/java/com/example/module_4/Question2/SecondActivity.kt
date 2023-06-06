package com.example.module_4.Question2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.module_4.R
import com.example.module_4.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding:ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var firstnumber=intent.getIntExtra("FIRSTNUMBER",0)
        var secondnumber=intent.getIntExtra("SECONDNUMBER",0)

        var numberList= mutableListOf<Int>()
        for (i in firstnumber..secondnumber){
            numberList.add(i)
        }
        binding.tvNumber.text=numberList.joinToString(",")



    }
}