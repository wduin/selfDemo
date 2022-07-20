package com.example.mvvmproject.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel : ViewModel() {
    // 只能被设置为MutableLiveData 或 LiveData
    val name : MutableLiveData<String> = MutableLiveData()

    fun setVal() {
        name.value = Random.nextFloat().toString()
    }
}