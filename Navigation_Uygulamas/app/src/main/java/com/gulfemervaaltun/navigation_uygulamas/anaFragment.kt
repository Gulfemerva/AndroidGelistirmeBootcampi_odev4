package com.gulfemervaaltun.navigation_uygulamas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.gulfemervaaltun.navigation_uygulamas.databinding.FragmentAnaBinding

class anaFragment : Fragment() {
    private lateinit var binding: FragmentAnaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =FragmentAnaBinding.inflate(inflater, container, false)
        binding.aGec.setOnClickListener{
            it.findNavController().navigate(R.id.action_anaFragment_to_aFragment)
        }
        binding.xGec.setOnClickListener{
            it.findNavController().navigate(R.id.action_anaFragment_to_xFragment)
        }
        return binding.root
    }
}