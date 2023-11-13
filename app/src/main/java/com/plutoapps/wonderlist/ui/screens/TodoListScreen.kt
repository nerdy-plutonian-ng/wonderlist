package com.plutoapps.wonderlist.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.plutoapps.wonderlist.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodoListScreen(modifier: Modifier = Modifier, goToTodo: (String?) -> Unit) {
    Scaffold(
        topBar = { CenterAlignedTopAppBar(title = { Text(text = stringResource(id = R.string.app_name)) }) },
        floatingActionButton = { LargeFloatingActionButton(onClick = { goToTodo(null) }) {
            Icon(Icons.Default.Add,null)
        }
        }
    ) {
        values -> Box(modifier = modifier.padding(values))
    }
}

@Preview
@Composable
fun TodoListScreenPrev() {
    TodoListScreen(goToTodo = { })
}