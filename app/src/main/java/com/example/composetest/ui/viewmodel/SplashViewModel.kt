package com.example.composetest.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(): ViewModel() {
    var preFetchCompleted = MutableLiveData(false)

    init {
        viewModelScope.launch(Dispatchers.IO) {
            delay(2000)
            preFetchCompleted.postValue(true)
        }
    }
}