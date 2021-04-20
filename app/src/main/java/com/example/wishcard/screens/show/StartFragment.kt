package com.example.wishcard.screens.show

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.wishcard.R
import com.example.wishcard.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    private lateinit var binding : FragmentStartBinding
    private lateinit var viewModel : StartViewModel
    private lateinit var viewModelFactory: StartViewModelFactory

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_start, container, false
        )



        return binding.root
    }
    }
