package com.example.composepracticeapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.compositionLocalOf

val LocalEventDetailProvider = compositionLocalOf<MutableState<EventDetail>> {
    error("No EventDetail is provided")
}