package com.example.jetpackcomposebluelake.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposebluelake.di.MyApp
import com.example.jetpackcomposebluelake.presentation.user.UserEvent
import com.example.jetpackcomposebluelake.presentation.user.UserState
import com.example.jetpackcomposebluelake.presentation.user.UserViewModel
import com.example.jetpackcomposebluelake.ui.screen.AbsensiScreen
import com.example.jetpackcomposebluelake.ui.screen.AbsensiSelesai
import com.example.jetpackcomposebluelake.ui.screen.AlamatEmailTerkirim
import com.example.jetpackcomposebluelake.ui.screen.AlertPengajuan
import com.example.jetpackcomposebluelake.ui.screen.DataMasuk
import com.example.jetpackcomposebluelake.ui.screen.DetailAbsen
import com.example.jetpackcomposebluelake.ui.screen.FaceCamera
import com.example.jetpackcomposebluelake.ui.screen.GetThePhotos
import com.example.jetpackcomposebluelake.ui.screen.HistoryAbsen
import com.example.jetpackcomposebluelake.ui.screen.HistoryCuti
import com.example.jetpackcomposebluelake.ui.screen.HomePage
import com.example.jetpackcomposebluelake.ui.screen.LoginScreen
import com.example.jetpackcomposebluelake.ui.screen.LupaKataSandi
import com.example.jetpackcomposebluelake.ui.screen.PengajuanScreen
import com.example.jetpackcomposebluelake.ui.screen.ProfilePage
import com.example.jetpackcomposebluelake.ui.screen.RegisterKaryawan
import com.example.jetpackcomposebluelake.ui.screen.RegisterPerusahaan
import com.example.jetpackcomposebluelake.ui.screen.UserListScreen
import com.example.jetpackcomposebluelake.ui.screen.WalletScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "loginScreen") {
        composable("loginScreen") {

            @Composable
            fun NestedOutletListScreen(
                outletVM: UserViewModel = viewModel(
                    factory = viewModelFactory {
                        UserViewModel(MyApp.appModule.userRepository)
                    }
                )
            ) {
                val outletState by outletVM.state.collectAsState(initial = UserState())
                UserListScreen(outletState, outletVM::onEvent)
            }

            NestedOutletListScreen()
        }
        composable("registerKaryawan") {
            RegisterKaryawan(navController)
        }
        composable("registerPerusahaan") {
            RegisterPerusahaan(navController)
        }
        composable("lupaKataSandiScreen") {
            LupaKataSandi(navController)
        }
        composable("alamatEmailTerkirim") {
            AlamatEmailTerkirim(navController)
        }
        composable("profilePage") {
            ProfilePage(navController)
        }
        composable("homePage") {
            HomePage(navController)
        }
        composable("absensiHistory") {
            HistoryAbsen(navController)
        }
        composable("cutiHistory") {
            HistoryCuti(navController)
        }
        composable("absenPage") {
            AbsensiScreen(navController)
        }
        composable("dataMasuk") {
            DataMasuk(navController)
        }
        composable("pengajuanPage") {
            PengajuanScreen(navController)
        }
        composable("walletPage") {
            WalletScreen(navController)
        }
        composable("pengajuanIjin") {
            PengajuanScreen(navController)
        }
        composable("alertPengajuan") {
            AlertPengajuan(navController)
        }
        composable("absenSelesai") {
            DataMasuk(navController)
        }
        composable("faceCamera") {
            FaceCamera(navController)
        }
        composable("ambilGambar") {
            GetThePhotos(navController)
        }
        composable("absensiSelesai") {
            AbsensiSelesai(navController)
        }
        composable("detailAbsen") {
            DetailAbsen(navController)
        }
    }
}