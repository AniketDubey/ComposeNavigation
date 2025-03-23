package com.example.composepracticeapp

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.composepracticeapp.BottomNav.BottomNavigationScreens
import com.example.composepracticeapp.BottomNav.AppBottomNavigation
import com.example.composepracticeapp.Navigations.MainScreenNavigationConfigurations

@Composable
fun MainScreen(mainAppNavigation: NavHostController) {

    val insideMainScreenNav = rememberNavController()

    val bottomNavigationItems = listOf(
        BottomNavigationScreens.Person,
        BottomNavigationScreens.Lock,
        BottomNavigationScreens.Home
    )
    Scaffold(
        bottomBar = {
            AppBottomNavigation(insideMainScreenNav, bottomNavigationItems)
        },
    ) {
        it.calculateTopPadding()
        MainScreenNavigationConfigurations(insideMainScreenNav,mainAppNavigation)
    }
}