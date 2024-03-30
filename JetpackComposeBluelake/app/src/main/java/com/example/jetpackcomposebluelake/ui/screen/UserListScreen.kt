package com.example.jetpackcomposebluelake.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposebluelake.data.DummyData
import com.example.jetpackcomposebluelake.model.User
import com.example.jetpackcomposebluelake.presentation.user.UserEvent
import com.example.jetpackcomposebluelake.presentation.user.UserState
import java.lang.reflect.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth

@Composable
fun UserListScreen(
    userState: UserState,
    onEvent: (UserEvent)->Unit
) {
    LazyColumn() {
        items(userState.userListState) { user ->
            UserItem(user = user)
        }
    }
}

@Composable
fun UserItem(user: User) {
    Surface() {
        Column() {
            Text(text = user.name)
            Text(text = user.email)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MaterialTheme {
        UserListScreen(
            UserState(DummyData.dummyUsersFlow),
            onEvent = {}
        )
    }
}