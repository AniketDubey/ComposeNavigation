package com.example.composepracticeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.composepracticeapp.Navigations.MainAppNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val mainAppNavigation = rememberNavController()
            MainAppNavigation(mainAppNavigation = mainAppNavigation)
        }
    }
}
