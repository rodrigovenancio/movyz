package com.movyz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.movyz.movielist.MovieListScreen
import com.movyz.ui.theme.MovyzTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.serialization.Serializable

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovyzTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = MovieListScreen
                ) {
                    composable<MovieListScreen> {
                        MovieListScreen(navController = navController)
                    }
                }
            }
        }
    }
}

@Serializable
object MovieListScreen