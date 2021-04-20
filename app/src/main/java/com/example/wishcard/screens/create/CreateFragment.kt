package com.example.wishcard.screens.create

import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.wishcard.R
import com.example.wishcard.databinding.FragmentCreateBinding

class CreateFragment : Fragment() {

    private lateinit var binding: FragmentCreateBinding
    private lateinit var viewModel: CreateViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_create, container, false
        )

        viewModel = ViewModelProvider(this).get(CreateViewModel::class.java)

        binding.titleField.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                viewModel.data.title = binding.titleField.text.toString()
                return@OnKeyListener true
            }
            false
        })

        binding.nameField.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                viewModel.data.name = binding.nameField.text.toString()
                return@OnKeyListener true
            }
            false
        })

        binding.textField.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                viewModel.data.text = binding.textField.text.toString()
                return@OnKeyListener true
            }
            false
        })

        binding.btnStart.setOnClickListener { onMoveToStart() }

        binding.btnLaunch.setOnClickListener { onMoveToStart() }

        return binding.root
    }



    private fun onMoveToStart() {
        val action = CreateFragmentDirections.actionCreateFragmentToStartFragment()

        findNavController().navigate(action)
    }

}