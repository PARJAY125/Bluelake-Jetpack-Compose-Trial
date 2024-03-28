package com.example.jetpackcomposebluelake.presentation.user

import com.example.jetpackcomposebluelake.model.User

sealed interface UserEvent {
    data class CreateUser(val user: User): UserEvent
    data class UpdateUser(val user: User): UserEvent
    data class ReadUser(val user: User):UserEvent
    data class DeleteUser(val user: User):UserEvent

}