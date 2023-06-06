package com.example.module_4.Question5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.module_4.R
import com.example.module_4.databinding.ActivityWebBinding

class WebActivity : AppCompatActivity() {

    lateinit var binding:ActivityWebBinding
    private lateinit var webView:WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityWebBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webView.webViewClient=object:WebViewClient(){
            override fun onPageFinished(view: WebView?, url: String?) {

            }
        }
        binding.webView.loadUrl("https://www.google.com")

        binding.btnBack.setOnClickListener { webView.goBack() }
        binding.btnForward.setOnClickListener { webView.goForward() }

    }
}