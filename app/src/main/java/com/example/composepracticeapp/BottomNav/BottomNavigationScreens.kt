package com.example.composepracticeapp.BottomNav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationScreens(val route: String, val title: String, val icon: ImageVector) {
    data object Person : BottomNavigationScreens("Person", "Person", Icons.Filled.Person)
    data object Lock : BottomNavigationScreens("Lock", "Lock", Icons.Filled.Lock)
    data object Home : BottomNavigationScreens("Home", "Home", Icons.Filled.Home)
}