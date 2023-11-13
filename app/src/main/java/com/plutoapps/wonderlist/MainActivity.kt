package com.plutoapps.wonderlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.compose.WonderListTheme
import com.plutoapps.wonderlist.ui.screens.TodoListScreen
import com.plutoapps.wonderlist.ui.screens.TodoScreen

enum class Routes {
    Todos,
    Todo
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WonderListApp()
        }
    }
}

@Composable
fun WonderListApp() {

    val navController = rememberNavController()

    val goToTodo : (String?) -> Unit = {
        navController.navigate("${Routes.Todo.name}/${it ?: "new"}")
    }

    val navigateUp : () -> Unit = {
        navController.navigateUp()
    }

    WonderListTheme {
        NavHost(navController = navController,
            startDestination = Routes.Todos.name){
            composable(Routes.Todos.name){
                TodoListScreen(goToTodo = goToTodo)
            }
            composable("${Routes.Todo.name}/{todoId}",
                arguments = listOf(navArgument("todoId") { type = NavType.StringType })){
                    backStackEntry ->
                        TodoScreen(id = backStackEntry.arguments?.getString("todoId"),
                            navigateUp = navigateUp)
            }
        }
    }
}

@Preview
@Composable
fun WonderListAppPreview() {
    WonderListApp()
}
