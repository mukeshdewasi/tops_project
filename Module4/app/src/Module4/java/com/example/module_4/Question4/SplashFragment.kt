package com.example.module_4.Question4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.module_4.R
import com.example.module_4.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {


   lateinit var binding:FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSplashBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnLogin.setOnClickListener {
            var fragment=LoginFragment()
            var manager=requireActivity().supportFragmentManager
            var transaction=manager.beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)
            transaction.commit()

        }
        binding.btnSignup.setOnClickListener {
            var fragment=SignupFragment()
            var manager=requireActivity().supportFragmentManager
            var transaction=manager.beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)
            transaction.commit()

        }
    }

}