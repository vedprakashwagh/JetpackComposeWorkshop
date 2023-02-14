package com.vedprakashwagh.instagram.ui.presentation.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.vedprakashwagh.instagram.ui.theme.InstagramTheme

@Composable
fun UserProfile(
    modifier: Modifier
) {

    Column(modifier = modifier) {
        UsernameToolbar(modifier = Modifier.fillMaxWidth(), username = "chloewest28")
    }

}

@Composable
fun UsernameToolbar(
    modifier: Modifier,
    username: String
) = Row(
    modifier,
    verticalAlignment = Alignment.CenterVertically
) {

    Icon(
        imageVector = Icons.Default.ArrowBack,
        contentDescription = "Go Back",
        modifier = Modifier
            .clickable {

            }
            .padding(16.dp)
    )

    Text(
        text = username,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.weight(1f),
        textAlign = TextAlign.Center,
        fontSize = 22.sp
    )

    Icon(
        imageVector = Icons.Default.Face,
        contentDescription = "Go Back",
        modifier = Modifier
            .clickable {

            }
            .padding(16.dp)
    )


}

@Preview(backgroundColor = 0xffffff)
@Composable
fun UserProfilePreview() {
    InstagramTheme() {
        UserProfile(
            modifier = Modifier
                .background(Color.White)
                .fillMaxSize()
        )
    }
}