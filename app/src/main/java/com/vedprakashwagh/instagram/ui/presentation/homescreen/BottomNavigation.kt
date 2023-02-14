package com.vedprakashwagh.instagram.ui.presentation.homescreen

import android.graphics.drawable.VectorDrawable
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.vedprakashwagh.instagram.ui.theme.InstagramTheme


@Composable
fun BottomNavigation(
    modifier: Modifier,
    onItemClicked: (index: Int) -> Unit
) = Row(modifier = modifier, horizontalArrangement = Arrangement.SpaceAround) {

    val iconList = remember {
        listOf(
            Icons.Default.Home,
            Icons.Default.Search,
            Icons.Default.AddCircle,
            Icons.Default.Subscriptions,
            Icons.Default.Person
        )
    }

    iconList.forEachIndexed { index, icon ->
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.clickable {
                onItemClicked(index)
            },
            tint = Color.White
        )
    }

}

@Preview
@Composable
fun BottomNavigationPreview() {
    InstagramTheme() {
        BottomNavigation(modifier = Modifier.fillMaxWidth(), onItemClicked = {

        })
    }
}
