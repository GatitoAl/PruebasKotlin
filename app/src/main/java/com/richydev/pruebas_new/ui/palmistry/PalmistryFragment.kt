package com.richydev.pruebas_new.ui.palmistry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.richydev.pruebas_new.R
import com.richydev.pruebas_new.databinding.FragmentHoroscopoBinding
import com.richydev.pruebas_new.databinding.FragmentPalmistryBinding

class PalmistryFragment : Fragment() {
    private var _binding: FragmentPalmistryBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPalmistryBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


}