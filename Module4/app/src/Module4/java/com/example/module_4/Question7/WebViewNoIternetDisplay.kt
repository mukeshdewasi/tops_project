package com.example.module_4.Question7

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.module_4.R
import com.example.module_4.databinding.ActivityWebViewInternetBinding
import com.example.module_4.databinding.ActivityWebViewNoIternetDisplayBinding

class WebViewNoIternetDisplay : AppCompatActivity() {

    lateinit var binding: ActivityWebViewNoIternetDisplayBinding
    private lateinit var webView: WebView

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityWebViewNoIternetDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webView.settings.javaScriptEnabled=true

        binding.webView.webViewClient=object: WebViewClient(){
            override fun onPageFinished(view: WebView?, url: String?) {

                binding.btnBack.isEnabled=binding.webView.canGoBack()
                binding.btnForward.isEnabled=binding.webView.canGoForward()
            }
        }
        binding.webView.loadUrl("https://www.google.com")

        binding.btnBack.setOnClickListener {
            if (binding.webView.canGoBack()){
                webView.goBack()
            }
        }
        binding.btnForward.setOnClickListener {
            if (binding.webView.canGoForward()){
                webView.goForward()
            }
        }




        if(!isInternetAvailable()){
            Toast.makeText(this, "No internet connection", Toast.LENGTH_SHORT).show()
        }


    }


    @RequiresApi(Build.VERSION_CODES.M)
    private fun isInternetAvailable():Boolean{
        val connectivityManager=
            getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo=connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
        return networkInfo!= null &&
                (networkInfo.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) ||
                networkInfo.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR))
    }
}


