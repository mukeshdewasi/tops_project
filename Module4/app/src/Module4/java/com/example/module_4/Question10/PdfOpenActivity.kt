package com.example.module_4.Question10

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.module_4.databinding.ActivityPdfOpenBinding
import com.example.module_4.databinding.ActivityTableLayoutBinding
import java.io.File

class PdfOpenActivity : AppCompatActivity() {

    lateinit var binding: ActivityPdfOpenBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPdfOpenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnOpemPdf.setOnClickListener {
            val pdffile = File("C:\\Users\\Admin\\Pictures\\Saved Pictures\\pdf.png")//Replace your path
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setDataAndType(Uri.fromFile(pdffile), "application/pdf")
            intent.flags = Intent.FLAG_ACTIVITY_NO_HISTORY
            startActivity(intent)


            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "No PDF viewer app installed", Toast.LENGTH_SHORT).show()
            }

        }
    }

}