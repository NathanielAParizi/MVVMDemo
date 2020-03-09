package com.example.mvvmdemo.viewmodel

import android.text.Editable
import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LogInViewModel : ViewModel() {

    val userName = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    @Bindable
    val userNameStatus = "Please enter a valid user name"

    @Bindable
    val passwordStatus = "Please enter a valid password"

    fun onUserNameChanged(currentUserNameValue: Editable) {

    }

    fun onUserPasswordChanged(currentUserNameValue: Editable) {

    }


}