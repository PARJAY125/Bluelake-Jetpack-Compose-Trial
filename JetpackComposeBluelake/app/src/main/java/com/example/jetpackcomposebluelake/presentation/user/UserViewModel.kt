package com.example.jetpackcomposebluelake.presentation.user

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jetpackcomposebluelake.model.User
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class UserViewModel(
    private val userRepository: UserRepository
): ViewModel() {
    private val _state = MutableStateFlow(UserState())

    private val _outlet = userRepository.getAllUser().stateIn(viewModelScope, SharingStarted.WhileSubscribed(), emptyList())

    val state = combine(_state, _outlet) { state, users ->
        state.copy(
            userListState = users
        )
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), UserState())

    fun onEvent(event: UserEvent) {
        when(event) {
            is UserEvent.DeleteUser -> {
                viewModelScope.launch {
                    userRepository.deleteUser(event.user)
                }
            }

            is UserEvent.UpdateUser -> {
                viewModelScope.launch {
                    userRepository.updateUser(event.user)
                }
            }

            is UserEvent.ReadUser -> {
                viewModelScope.launch {
                    userRepository.readUser(event.user)
                }
            }

            is UserEvent.CreateUser -> {
                viewModelScope.launch {
                    userRepository.insertUser(event.user)

                }
            }
                }
        }
}