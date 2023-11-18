package com.example.projek

import com.example.projek.data.local.LocalRepository
import com.example.projek.data.local.entity.UserEntity
import com.example.projek.data.remote.RemoteRepository

class Repository(private val localRepository: LocalRepository, private val remoteRepository: RemoteRepository) {
    suspend fun insertUser(userEntity: UserEntity){
        localRepository.insertUser(userEntity)
    }

    suspend fun getUser(email: String, password: String): UserEntity {
        return localRepository.getUser(email, password)
    }
}