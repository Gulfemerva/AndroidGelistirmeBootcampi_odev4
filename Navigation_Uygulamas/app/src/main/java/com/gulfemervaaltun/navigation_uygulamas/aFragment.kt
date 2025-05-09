package com.gulfemervaaltun.navigation_uygulamas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.gulfemervaaltun.navigation_uygulamas.databinding.FragmentABinding


class aFragment : Fragment() {
    private lateinit var binding:FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentABinding.inflate(inflater, container, false)
        binding.bGec.setOnClickListener{
            it.findNavController().navigate(R.id.action_aFragment_to_bFragment)
        }
        return binding.root
    }



}