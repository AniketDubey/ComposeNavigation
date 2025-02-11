package com.example.composepracticeapp.NavigationScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun LockScreen(mainAppNavigation: NavHostController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Button(onClick =
        {
            mainAppNavigation.navigate("InsideLockScreen")
        }
        ) {
            Text(text = "LockScreen")
        }
    }
}