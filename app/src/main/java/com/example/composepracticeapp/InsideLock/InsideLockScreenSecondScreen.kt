package com.example.composepracticeapp.InsideLock

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun InsideLockScreenSecondScreen(insideLockScreenNav: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Button(onClick = {  }) {
            Text(text = "InsideLockScreenSecondScreen")
        }
    }
}