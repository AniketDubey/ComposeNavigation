package com.example.composepracticeapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun SplashScreenPage(
    mainAppNavigation: NavHostController,
    updateEventDetail: (EventDetail) -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Button(onClick = {
            updateEventDetail(EventDetail("100", "Updated Event Data"))
            mainAppNavigation.navigate("Screen1")
        }) {
            Text(text = "SplashScreenPage")
        }
    }
}