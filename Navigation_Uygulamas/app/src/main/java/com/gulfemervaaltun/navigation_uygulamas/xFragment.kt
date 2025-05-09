package com.gulfemervaaltun.navigation_uygulamas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.gulfemervaaltun.navigation_uygulamas.databinding.FragmentAnaBinding
import com.gulfemervaaltun.navigation_uygulamas.databinding.FragmentXBinding

class xFragment : Fragment() {
    private lateinit var binding: FragmentXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentXBinding.inflate(inflater, container, false)
        binding.XdenYgec.setOnClickListener{
            it.findNavController().navigate(R.id.action_xFragment_to_yFragment)
        }
        return binding.root
    }


}