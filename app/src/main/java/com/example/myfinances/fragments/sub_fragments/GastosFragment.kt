package com.example.myfinances.fragments.sub_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myfinances.databinding.FragmentGastosBinding

class GastosFragment : Fragment() {
    private lateinit var gastosBinding: FragmentGastosBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gastosBinding = FragmentGastosBinding.inflate(inflater, container, false)
        return gastosBinding.root
    }
}
