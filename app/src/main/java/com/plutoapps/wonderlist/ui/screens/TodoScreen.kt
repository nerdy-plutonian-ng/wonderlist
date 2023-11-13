package com.plutoapps.wonderlist.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.plutoapps.wonderlist.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodoScreen(modifier: Modifier = Modifier, id: String?, navigateUp: () -> Unit) {

    val isNew = id == "new"

    Scaffold(
        topBar = {
            TopAppBar(title = {
                IconButton(onClick = navigateUp) {
                    Icon(Icons.Default.ArrowBack, null)
                }
            })
        },
    ) { values ->
        Column(modifier = modifier.padding(values).padding(16.dp).fillMaxSize()) {
            if (isNew)
                OutlinedButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Default.Edit,null)
                    Spacer(modifier = modifier.width(16.dp))
                    Text(text = stringResource(R.string.edit))
                }
        }
    }
}

@Preview
@Composable
fun TodoScreenPrev() {
    TodoScreen(id = null, navigateUp = { })
}