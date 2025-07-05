package com.example.composepracticeapp.Navigations

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composepracticeapp.InsideLock.InsideLockScreenLandingPage
import com.example.composepracticeapp.MainScreen
import com.example.composepracticeapp.SplashScreenPage

@Composable
fun MainAppNavigation(
    mainAppNavigation: NavHostController
) {
    NavHost(mainAppNavigation, startDestination = "SplashScreen") {

        composable("SplashScreen") {
            SplashScreenPage(mainAppNavigation)
        }
        composable("MainScreen") {
            MainScreen(mainAppNavigation)
        }
        composable("Screen1") {
            Screen1(mainAppNavigation)
        }
        composable("Screen2") {
            Screen2(mainAppNavigation)
        }
        composable("Screen3") {
            Screen3(mainAppNavigation)
        }
        composable("Screen4") {
            Screen4(mainAppNavigation)
        }

        composable("InsideLockScreen") {
            InsideLockScreenLandingPage()
        }
    }
}

@Composable
fun Screen4(mainAppNavigation: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Button(onClick = {
//            mainAppNavigation.navigate("MainScreen")
//            mainAppNavigation.popBackStack("Screen1",true)
        }) {
            Text(text = "Screen4")
        }
    }
    val lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current

    val tag = "Screen4"
    DisposableEffect(lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            when (event) {
                Lifecycle.Event.ON_CREATE -> {
                    Log.d(tag, "Screen4: ON_CREATE")
                }
                Lifecycle.Event.ON_START -> {
                    Log.d(tag, "Screen4: ON_START")
                }
                Lifecycle.Event.ON_RESUME -> {
                    Log.d(tag, "Screen4: ON_RESUME")
                }
                Lifecycle.Event.ON_PAUSE -> {
                    Log.d(tag, "Screen4: ON_PAUSE")
                }
                Lifecycle.Event.ON_STOP -> {
                    Log.d(tag, "Screen4: ON_STOP")
                }
                Lifecycle.Event.ON_DESTROY -> {
                    Log.d(tag, "Screen4: ON_DESTROY")
                }
                else -> {}
            }
        }

        lifecycleOwner.lifecycle.addObserver(observer)

        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)

        }
    }
}

@Composable
fun Screen3(mainAppNavigation: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Button(onClick = {
            mainAppNavigation.navigate("Screen4")
        }) {
            Text(text = "Screen3")
        }
    }
}

@Composable
fun Screen2(mainAppNavigation: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Button(onClick = {
            mainAppNavigation.navigate("Screen3")
        }) {
            Text(text = "Screen2")
        }
    }
}

@Composable
fun Screen1(mainAppNavigation: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Button(onClick = {
            mainAppNavigation.navigate("Screen2")
        }) {
            Text(text = "Screen1")
        }
    }
}
