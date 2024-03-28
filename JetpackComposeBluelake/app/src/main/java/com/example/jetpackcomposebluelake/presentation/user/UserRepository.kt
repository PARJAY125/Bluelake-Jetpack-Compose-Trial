package com.example.jetpackcomposebluelake.presentation.user

import android.provider.SyncStateContract.Helpers.insert
import com.example.jetpackcomposebluelake.model.User
import kotlinx.coroutines.flow.Flow

class UserRepository() {

    fun getAllOutlets(): Flow<List<User>> = getAllOutlets()

    suspend fun insertUser(user: User) {
        insertUser(user)
    }
    suspend fun readUser(user: User) {
        readUser(user)
    }

    suspend fun updateUser(user: User) {
        updateUser(user)
    }

    suspend fun deleteUser(user: User) {
        deleteUser(user)
    }
}