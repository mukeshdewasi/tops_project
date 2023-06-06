package com.example.module_4.Question4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.module_4.R
import com.example.module_4.databinding.ActivitySecondBinding
import com.example.module_4.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

        lateinit var binding:ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)




        var fragment=SplashFragment()
        var manager=supportFragmentManager
        var transaction=manager.beginTransaction()
        transaction.add(R.id.fragment_container,fragment)
        transaction.commit()


    }
}