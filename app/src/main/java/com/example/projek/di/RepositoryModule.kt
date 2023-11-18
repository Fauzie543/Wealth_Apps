package com.example.projek.di

import com.example.projek.Repository
import com.example.projek.data.local.LocalRepository
import com.example.projek.data.remote.RemoteRepository
import org.koin.core.scope.get
import org.koin.dsl.module

val repositoryModule = module {
    single { LocalRepository(get()) }
    single { RemoteRepository(get()) }
    single { Repository(get(),get()) }
}