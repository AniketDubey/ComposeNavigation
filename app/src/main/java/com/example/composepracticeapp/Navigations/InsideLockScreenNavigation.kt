package com.example.composepracticeapp.Navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composepracticeapp.InsideLock.InsideLockScreenFirstScreen
import com.example.composepracticeapp.InsideLock.InsideLockScreenFourthScreen
import com.example.composepracticeapp.InsideLock.InsideLockScreenSecondScreen
import com.example.composepracticeapp.InsideLock.InsideLockScreenThirdScreen

@Composable
fun InsideLockScreenNavigation(
    insideLockScreenNav: NavHostController
) {
    NavHost(insideLockScreenNav, startDestination = "InsideLockScreenFirstScreen") {

        composable("InsideLockScreenFirstScreen") {
            InsideLockScreenFirstScreen(insideLockScreenNav)
        }
        composable("InsideLockScreenSecondScreen") {
            InsideLockScreenSecondScreen(insideLockScreenNav)
        }
        composable("InsideLockScreenThirdScreen") {
            InsideLockScreenThirdScreen(insideLockScreenNav)
        }
        composable("InsideLockScreenFourthScreen") {
            InsideLockScreenFourthScreen(insideLockScreenNav)
        }
    }
}