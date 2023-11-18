package com.example.projek.di

import com.example.projek.ui.login.LoginViewModel
import com.example.projek.ui.register.RegisterViewModel
import org.koin.dsl.module

val viewModelModule = module {
    single { LoginViewModel(get()) }
    single { RegisterViewModel(get()) }
}