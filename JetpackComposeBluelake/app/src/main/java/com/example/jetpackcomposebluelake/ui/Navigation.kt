//package com.example.jetpackcomposebluelake.ui
//
//<<<<<<< HEAD
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.collectAsState
//import androidx.compose.runtime.getValue
//import androidx.lifecycle.viewmodel.compose.viewModel
//import androidx.lifecycle.viewmodel.viewModelFactory
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//import com.example.jetpackcomposebluelake.MyApp
//import com.example.jetpackcomposebluelake.presentation.user.UserEvent
//import com.example.jetpackcomposebluelake.presentation.user.UserState
//import com.example.jetpackcomposebluelake.presentation.user.UserViewModel
//import com.example.jetpackcomposebluelake.ui.screen.LoginScreen
//
//@Composable
//fun Nav() {
//    val navController = rememberNavController()
//
//    NavHost(navController, startDestination = "loginScreen") {
//        composable("loginScreen") {
//
//            @Composable
//            fun NestedOutletListScreen(
//                userVM: UserViewModel = viewModel(
//                    factory = viewModelFactory {
//                        UserViewModel(MyApp.appModule.userRepository)
//                    }
//                )
//            ) {
//                val userState by userVM.state.collectAsState(initial = UserState())
//
//                LoginScreen(
//                    navController,
//                    userState,
//                    userVM::onEvent
//                )
//            }
//
//            NestedOutletListScreen()
//        }
//    }
//}
//=======
////class Navigation {
////}
//>>>>>>> Making-Dummy-Data
