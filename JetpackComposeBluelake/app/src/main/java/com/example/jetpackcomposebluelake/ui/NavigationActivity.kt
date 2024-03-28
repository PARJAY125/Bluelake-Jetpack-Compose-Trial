package com.example.jetpackcomposebluelake.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposebluelake.ui.screen.AbsensiScreen
import com.example.jetpackcomposebluelake.ui.screen.AlamatEmailTerkirim
import com.example.jetpackcomposebluelake.ui.screen.HistoryAbsen
import com.example.jetpackcomposebluelake.ui.screen.HistoryCuti
import com.example.jetpackcomposebluelake.ui.screen.HomePage
import com.example.jetpackcomposebluelake.ui.screen.LoginScreen
import com.example.jetpackcomposebluelake.ui.screen.LupaKataSandi
import com.example.jetpackcomposebluelake.ui.screen.PengajuanScreen
import com.example.jetpackcomposebluelake.ui.screen.ProfilePage
import com.example.jetpackcomposebluelake.ui.screen.RegisterKaryawan
import com.example.jetpackcomposebluelake.ui.screen.RegisterPerusahaan
import com.example.jetpackcomposebluelake.ui.screen.WalletScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "loginScreen") {
        composable("loginScreen") {
            LoginScreen(navController)
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
        composable("pengajuanPage") {
            PengajuanScreen(navController)
        }
        composable("walletPage") {
            WalletScreen(navController)
        }
    }
}