package com.example.composepracticeapp.Navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composepracticeapp.BottomNav.BottomNavigationScreens
import com.example.composepracticeapp.NavigationScreen.HomeScreen
import com.example.composepracticeapp.NavigationScreen.LockScreen
import com.example.composepracticeapp.NavigationScreen.PersonScreen

@Composable
fun MainScreenNavigationConfigurations(
    insideMainScreenNav: NavHostController,
    mainAppNavigation: NavHostController
) {
    NavHost(insideMainScreenNav, startDestination = BottomNavigationScreens.Person.route) {
        composable(BottomNavigationScreens.Lock.route) {
            LockScreen(mainAppNavigation)
        }
        composable(BottomNavigationScreens.Person.route) {
            PersonScreen()
        }
        composable(BottomNavigationScreens.Home.route) {
            HomeScreen()
        }
    }
}