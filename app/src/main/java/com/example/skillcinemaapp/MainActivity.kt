package com.example.skillcinemaapp

import android.os.Bundle
import com.example.skillcinemaapp.page.OnBoardingPage
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.skillcinemaapp.graph.RootNavGraph
import com.example.skillcinemaapp.page.HomePage
import com.example.skillcinemaapp.ui.theme.SkillCinemaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RootNavGraph()
        }
    }
}

