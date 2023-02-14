package com.vedprakashwagh.instagram.ui.presentation.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.vedprakashwagh.instagram.ui.presentation.homescreen.dashboard.Dashboard
import com.vedprakashwagh.instagram.ui.presentation.profile.UserProfile
import com.vedprakashwagh.instagram.ui.theme.InstagramTheme

@Composable
fun Homescreen(
    modifier: Modifier
) = Column(modifier = modifier) {

    val systemUiController = rememberSystemUiController()

    LaunchedEffect(key1 = Unit, block = {
        systemUiController.setStatusBarColor(Color.White)
        systemUiController.setNavigationBarColor(Color.Black)
    })

    var selectedScreen = remember {
        mutableStateOf(0)
    }

    Column(modifier = Modifier.weight(1f)) {
        when (selectedScreen.value) {

            0 -> {
                Dashboard(modifier = Modifier.fillMaxWidth())
            }

            1 -> {

            }

            2 -> {

            }

            3 -> {

            }

            4 -> {
                UserProfile(modifier = Modifier.fillMaxWidth())
            }
        }
    }

    BottomNavigation(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(top = 8.dp, bottom = 8.dp),
        onItemClicked = { index ->
            selectedScreen.value = index
        })


}

@Preview
@Composable
fun HomescreenPreview() {
    InstagramTheme() {
        Homescreen(modifier = Modifier.fillMaxSize())
    }
}
