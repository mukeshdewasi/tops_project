package com.example.module_4.Question6

import android.content.Context
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.module_4.R
import com.example.module_4.databinding.ActivityWebBinding
import com.example.module_4.databinding.ActivityWebViewInternetBinding

class WebViewInternet : AppCompatActivity() {

    lateinit var binding: ActivityWebViewInternetBinding
    private lateinit var webView:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityWebViewInternetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webView.webViewClient=object: WebViewClient(){
            override fun onPageFinished(view: WebView?, url: String?) {

            }
        }
        binding.webView.loadUrl("https://www.google.com")


        binding.btnBack.setOnClickListener { webView.goBack() }
        binding.btnForward.setOnClickListener { webView.goForward() }

        //check for internet connection


    }
    private fun isInternetAvailable():Boolean{
        val connectivityManager=
            getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo=connectivityManager.activeNetworkInfo
        return networkInfo!=null && networkInfo.isConnected
    }
}