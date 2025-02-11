package com.example.composepracticeapp.InsideLock

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.composepracticeapp.Navigations.InsideLockScreenNavigation

@Composable
fun InsideLockScreenLandingPage() {
    /*Box(modifier = Modifier.fillMaxSize()) {
        Button(onClick = { mainAppNavigation.navigate("InsideLockScreenSecond") }) {
            Text(text = "InsideLockScreen")
        }
    }*/
    val insideLockScreenNav = rememberNavController()
    InsideLockScreenNavigation(insideLockScreenNav = insideLockScreenNav)
}