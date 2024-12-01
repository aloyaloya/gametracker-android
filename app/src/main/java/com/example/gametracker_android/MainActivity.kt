package com.example.gametracker_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import com.example.gametracker_android.presentation.theme.GametrackerandroidTheme
import com.example.gametracker_android.presentation.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GametrackerandroidTheme(dynamicColor = false) {
                MaterialTheme(typography = Typography) {
                    App()
                }
            }
        }
    }
}
