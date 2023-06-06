package com.example.module_4.Question3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.module_4.R
import com.example.module_4.databinding.ActivityCalculateBinding

class CalculateActivity : AppCompatActivity() {

    lateinit var binding:ActivityCalculateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCalculateBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnCalculate.setOnClickListener {
            var number1=binding.etNumber1.text.toString().toDouble()
            var number2=binding.etNumber2.text.toString().toDouble()
            var result=0.0

            when(binding.radioGroup.checkedRadioButtonId){
                R.id.rb_add -> result=number1 +number2
                R.id.rb_subtract -> result=number1-number2
                R.id.rb_multiply -> result=number1*number2
                R.id.rb_divide -> result=number1/number2
            }
            binding.tvResult.text=result.toString()
        }


    }
}