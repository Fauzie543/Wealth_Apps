package com.example.database_projek.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity
class User (
    @PrimaryKey(autoGenerate = true) var uid: Int? = null,
    @ColumnInfo(name = "full_name") var fullName: String?,
    @ColumnInfo(name = "email") var email: String?,
    @ColumnInfo(name = "password") var password: String?


)