package com.example.ledcontrol.ui.fire

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FireViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is FIRE FUCKING Fragment"
    }
    val text: LiveData<String> = _text
}