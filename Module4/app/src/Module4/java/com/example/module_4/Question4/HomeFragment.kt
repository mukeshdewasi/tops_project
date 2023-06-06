package com.example.module_4.Question4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.module_4.R
import com.example.module_4.databinding.FragmentHomeBinding
import com.example.module_4.databinding.FragmentLoginBinding


class HomeFragment : Fragment() {

    lateinit var binding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    binding=FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root


    }


}