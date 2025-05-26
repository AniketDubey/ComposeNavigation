package com.example.composepracticeapp.BottomNav

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun SpookyAppBottomNavigation(
    insideMainAppNavigation: NavHostController,
    items: List<BottomNavigationScreens>
) {
    NavigationBar {
        //val currentRoute = currentRoute(insideMainAppNavigation)
        items.forEach { screen ->
            NavigationBarItem(
                icon = { Icon(imageVector = screen.icon, contentDescription ="" ) },
                label = { Text(text = screen.title) },
                selected = false,
                alwaysShowLabel = false, // This hides the title for the unselected items
                onClick = {
                    // This if check gives us a "singleTop" behavior where we do not create a
                    // second instance of the composable if we are already on that destination
                    /*if (currentRoute != screen.route) {
                        insideMainAppNavigation.navigate(screen.route)
                    }*/
                    insideMainAppNavigation.navigate(screen.route)
                }
            )
        }
    }
}

@Composable
private fun currentRoute(insideMainAppNavigation: NavHostController): String? {
    val navBackStackEntry by insideMainAppNavigation.currentBackStackEntryAsState()
    return navBackStackEntry?.arguments?.getString("KEY_ROUTE")
}