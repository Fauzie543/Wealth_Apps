package com.example.projek

import com.example.projek.data.local.AppDatabase
import com.example.projek.data.local.entity.UserEntity

class AppRepository(private val  appDatabase: AppDatabase) {
    suspend fun insertUser(user: UserEntity) {
        appDatabase.userDao().insertUser(user)
    }
}