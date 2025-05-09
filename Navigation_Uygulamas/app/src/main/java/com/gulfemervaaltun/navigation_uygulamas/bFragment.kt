package com.gulfemervaaltun.navigation_uygulamas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.gulfemervaaltun.navigation_uygulamas.databinding.FragmentBBinding

class bFragment : Fragment() {
    private lateinit var binding:FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentBBinding.inflate(inflater, container, false)
        binding.yGec.setOnClickListener{
            it.findNavController().navigate(R.id.action_bFragment_to_yFragment)
        }
        return binding.root
    }


}