package com.example.jetpackcomposebluelake.presentation.user

import com.example.jetpackcomposebluelake.model.User


data class UserState(
        val outlets: List<User> = emptyList()
    )
