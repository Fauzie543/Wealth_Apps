package com.example.projek.ui.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.projek.Repository
import com.example.projek.data.local.entity.UserEntity
import kotlinx.coroutines.launch

class RegisterViewModel(private val repository: Repository): ViewModel() {
    private val isRegister = MutableLiveData<Boolean>()
    fun observeIsRegister(): LiveData<Boolean> = isRegister


    fun insertUser(user: UserEntity){
        viewModelScope.launch {
            try {
                repository.insertUser(user)
                isRegister.postValue(true)
            }catch (e: Throwable) {
                e.printStackTrace()
            }
            }

    }

}