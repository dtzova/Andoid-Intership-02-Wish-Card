package com.example.wishcard.screens.show

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.wishcard.screens.create.WishData

class StartViewModelFactory(private val info : WishData) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(StartViewModel::class.java)) {
            return StartViewModel(info) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}