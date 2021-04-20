package com.example.wishcard.screens.show

import androidx.lifecycle.ViewModel
import com.example.wishcard.screens.create.WishData

class StartViewModel(info : WishData) : ViewModel() {

    var data = info

    init {

    }
}