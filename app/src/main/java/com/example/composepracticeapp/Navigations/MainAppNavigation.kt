package com.example.composepracticeapp.Navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composepracticeapp.InsideLock.InsideLockScreenLandingPage
import com.example.composepracticeapp.MainScreen
import com.example.composepracticeapp.SplashScreenPage

@Composable
fun MainAppNavigation(
    mainAppNavigation: NavHostController
) {
    NavHost(mainAppNavigation, startDestination = "SplashScreen") {

        composable("SplashScreen") {
            SplashScreenPage(mainAppNavigation)
        }
        composable("MainScreen") {
            MainScreen(mainAppNavigation)
        }
        composable("InsideLockScreenLandingPage") {
            InsideLockScreenLandingPage()
        }
    }
}