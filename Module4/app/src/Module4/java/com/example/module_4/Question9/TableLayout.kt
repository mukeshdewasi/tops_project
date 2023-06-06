package com.example.module_4.Question9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableRow
import android.widget.TextView
import com.example.module_4.databinding.ActivityTableLayoutBinding

class TableLayout : AppCompatActivity() {

    lateinit var binding:ActivityTableLayoutBinding
    val tablerow = TableRow(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTableLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val textview=TextView(this)
        textview.text="Hello Tops"
        var layoutparams=TableRow.LayoutParams(
            TableRow.LayoutParams.WRAP_CONTENT ,
            TableRow.LayoutParams.WRAP_CONTENT
        )
        textview.layoutParams=layoutparams

        tablerow.addView(textview)
        binding.tabbleLayout.addView(tablerow)




    }
}