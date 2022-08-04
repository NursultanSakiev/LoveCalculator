package com.example.lovecalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lovecalculator.databinding.FragmentResultBinding

class result_Fragment : Fragment() {

    lateinit var binding: FragmentResultBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentResultBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setText()
    }

    private fun setText() {
        val fname=arguments?.getString("fname")
        val sname=arguments?.getString("sname")
        val percentage=arguments?.getString("percent")
        val resultArg=arguments?.getString("result")
        with(binding){
            firstName.text=fname.toString()
            secondName.text=sname.toString()
            percent.text=percentage.toString()
            result.text=resultArg.toString()
        }
    }
}