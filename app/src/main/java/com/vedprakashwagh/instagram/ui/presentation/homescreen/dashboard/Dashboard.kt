package com.vedprakashwagh.instagram.ui.presentation.homescreen.dashboard

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vedprakashwagh.instagram.ui.theme.InstagramTheme

@Composable
fun Dashboard(
    modifier: Modifier
) = Column(modifier = modifier) {

    val posts = remember {
        posts
    }

    DashboardToolbar(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    )

    LazyColumn(modifier = Modifier.weight(1f)) {

        item {
            UserStories(modifier = Modifier.fillMaxWidth())
        }

        items(posts) { postInfo ->
            PostView(modifier = Modifier
                .padding(top = 4.dp, bottom = 4.dp)
                .fillMaxWidth(), postInfo = postInfo)
        }

    }

}

@Composable
fun DashboardToolbar(
    modifier: Modifier
) = Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {

    Text(
        text = "Instagram",
        fontWeight = FontWeight.ExtraBold,
        fontFamily = FontFamily.Cursive,
        fontSize = 25.sp
    )

    Icon(imageVector = Icons.Default.ExpandMore, contentDescription = "Expand more")

    Spacer(modifier = Modifier.weight(1f))

    Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = null)

    Icon(
        imageVector = Icons.Outlined.Send,
        contentDescription = null,
        modifier = Modifier.padding(start = 12.dp)
    )

}

@Preview(
    showBackground = true,
    backgroundColor = 0xfafafa
)
@Composable
fun DashboardPreview() {
    InstagramTheme {
        Dashboard(modifier = Modifier.fillMaxSize())
    }
}

val posts = listOf(
    PostInfo(
        profilePictureLink = "https://www.cdc.gov/healthypets/images/pets/cute-dog-headshot.jpg",
        profileHandle = "sanika_jadhav",
        postLink = "https://www.rd.com/wp-content/uploads/2021/01/GettyImages-1175550351.jpg",
        likedBy = listOf(
            "Srishti Sinha",
            "Hyalij Pooja",
            "Kapase Akanksha",
            "ACM Student Chapter",
            "Sanika Jadhav",
            "Riya Sangale",
            "Babalsure Mrudagandha"
        ),
        postDescription = "This is a cute image of a cat!"
    ),
    PostInfo(
        profilePictureLink = "https://www.cdc.gov/healthypets/images/pets/cute-dog-headshot.jpg",
        profileHandle = "sanika_jadhav",
        postLink = "https://www.cdc.gov/healthypets/images/pets/cute-dog-headshot.jpg",
        likedBy = listOf(
            "Srishti Sinha",
            "Hyalij Pooja",
            "Kapase Akanksha"
        ),
        postDescription = "This is a cute image of a cat!"
    ),
    PostInfo(
        profilePictureLink = "https://www.cdc.gov/healthypets/images/pets/cute-dog-headshot.jpg",
        profileHandle = "sanika_jadhav",
        postLink = "https://hips.hearstapps.com/hmg-prod/images/close-up-of-cat-wearing-sunglasses-while-sitting-royalty-free-image-1571755145.jpg",
        likedBy = listOf(
            "Srishti Sinha",
            "Hyalij Pooja",
            "Kapase Akanksha"
        ),
        postDescription = "This is a cute image of a cat!"
    ),
    PostInfo(
        profilePictureLink = "https://www.cdc.gov/healthypets/images/pets/cute-dog-headshot.jpg",
        profileHandle = "sanika_jadhav",
        postLink = "https://www.rd.com/wp-content/uploads/2021/01/GettyImages-1175550351.jpg",
        likedBy = listOf(
            "Srishti Sinha",
            "Hyalij Pooja",
            "Kapase Akanksha"
        ),
        postDescription = "This is a cute image of a cat!"
    ),
    PostInfo(
        profilePictureLink = "https://www.cdc.gov/healthypets/images/pets/cute-dog-headshot.jpg",
        profileHandle = "sanika_jadhav",
        postLink = "https://www.cdc.gov/healthypets/images/pets/cute-dog-headshot.jpg",
        likedBy = listOf(
            "Srishti Sinha",
            "Hyalij Pooja",
            "Kapase Akanksha"
        ),
        postDescription = "This is a cute image of a cat!"
    ),
    PostInfo(
        profilePictureLink = "https://www.cdc.gov/healthypets/images/pets/cute-dog-headshot.jpg",
        profileHandle = "sanika_jadhav",
        postLink = "https://hips.hearstapps.com/hmg-prod/images/close-up-of-cat-wearing-sunglasses-while-sitting-royalty-free-image-1571755145.jpg",
        likedBy = listOf(
            "Srishti Sinha",
            "Hyalij Pooja",
            "Kapase Akanksha"
        ),
        postDescription = "This is a cute image of a cat!"
    ),
    PostInfo(
        profilePictureLink = "https://www.cdc.gov/healthypets/images/pets/cute-dog-headshot.jpg",
        profileHandle = "sanika_jadhav",
        postLink = "https://www.rd.com/wp-content/uploads/2021/01/GettyImages-1175550351.jpg",
        likedBy = listOf(
            "Srishti Sinha",
            "Hyalij Pooja",
            "Kapase Akanksha"
        ),
        postDescription = "This is a cute image of a cat!"
    ),
    PostInfo(
        profilePictureLink = "https://www.cdc.gov/healthypets/images/pets/cute-dog-headshot.jpg",
        profileHandle = "sanika_jadhav",
        postLink = "https://www.cdc.gov/healthypets/images/pets/cute-dog-headshot.jpg",
        likedBy = listOf(
            "Srishti Sinha",
            "Hyalij Pooja",
            "Kapase Akanksha"
        ),
        postDescription = "This is a cute image of a cat!"
    ),
    PostInfo(
        profilePictureLink = "https://www.cdc.gov/healthypets/images/pets/cute-dog-headshot.jpg",
        profileHandle = "sanika_jadhav",
        postLink = "https://hips.hearstapps.com/hmg-prod/images/close-up-of-cat-wearing-sunglasses-while-sitting-royalty-free-image-1571755145.jpg",
        likedBy = listOf(
            "Srishti Sinha",
            "Hyalij Pooja",
            "Kapase Akanksha"
        ),
        postDescription = "This is a cute image of a cat!"
    )
)

data class PostInfo(
    val profilePictureLink: String,
    val profileHandle: String,
    val postLink: String,
    val likedBy: List<String>,
    val postDescription: String
)