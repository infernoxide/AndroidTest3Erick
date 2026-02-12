package com.example.androidtest3.presentation.composables

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidtest3.presentation.theme.AndroidTest3Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar(title: String, showBackButton: Boolean = false, onClickBackButton: () -> Unit) {
    TopAppBar(
        title = { Text(text = title, color = Color.White, fontWeight = FontWeight.Medium) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Color.Blue
        ),
        navigationIcon = {
            if (showBackButton) {
                IconButton(onClick = { onClickBackButton() }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Regresar",
                        tint = Color.White
                    )
                }
            }
        }
    )
}

@Preview(showBackground = true, name = "top bar de prueba")
@Composable
fun PreviewMainTopBarHome() {
    AndroidTest3Theme {
        MainTopBar(
            title = "Rick sanchez",
            showBackButton = true,
            onClickBackButton = { }
        )
    }
}