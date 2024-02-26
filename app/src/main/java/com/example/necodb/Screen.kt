package com.example.necodb

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Screen() {
    Text(
        text = "Test",
        modifier = Modifier.fillMaxSize()
            .wrapContentWidth()
            .wrapContentHeight()
    )

}