package com.vedprakashwagh.instagram.ui.presentation.homescreen.dashboard

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.vedprakashwagh.instagram.ui.theme.InstagramTheme

@Composable
fun UserStories(modifier: Modifier) {
    val storyItems = remember {
        listOf(
            StoryDetails(
                storyImageLink = "https://www.cdc.gov/healthypets/images/pets/cute-dog-headshot.jpg",
                "sanika_jadhav"
            ),
            StoryDetails(
                storyImageLink = "https://www.rd.com/wp-content/uploads/2021/01/GettyImages-1175550351.jpg",
                "ashutosh"
            ),
            StoryDetails(
                storyImageLink = "https://hips.hearstapps.com/hmg-prod/images/close-up-of-cat-wearing-sunglasses-while-sitting-royalty-free-image-1571755145.jpg",
                "akanksha_kapase"
            ),
            StoryDetails(
                storyImageLink = "https://www.cdc.gov/healthypets/images/pets/cute-dog-headshot.jpg",
                "sanika_jadhav"
            ),
            StoryDetails(
                storyImageLink = "https://www.rd.com/wp-content/uploads/2021/01/GettyImages-1175550351.jpg",
                "ashutosh"
            ),
            StoryDetails(
                storyImageLink = "https://hips.hearstapps.com/hmg-prod/images/close-up-of-cat-wearing-sunglasses-while-sitting-royalty-free-image-1571755145.jpg",
                "akanksha_kapase"
            ),
            StoryDetails(
                storyImageLink = "https://www.cdc.gov/healthypets/images/pets/cute-dog-headshot.jpg",
                "sanika_jadhav"
            ),
            StoryDetails(
                storyImageLink = "https://www.rd.com/wp-content/uploads/2021/01/GettyImages-1175550351.jpg",
                "ashutosh"
            ),
            StoryDetails(
                storyImageLink = "https://hips.hearstapps.com/hmg-prod/images/close-up-of-cat-wearing-sunglasses-while-sitting-royalty-free-image-1571755145.jpg",
                "akanksha_kapase"
            ),
            StoryDetails(
                storyImageLink = "https://www.cdc.gov/healthypets/images/pets/cute-dog-headshot.jpg",
                "sanika_jadhav"
            ),
            StoryDetails(
                storyImageLink = "https://www.rd.com/wp-content/uploads/2021/01/GettyImages-1175550351.jpg",
                "ashutosh"
            ),
            StoryDetails(
                storyImageLink = "https://hips.hearstapps.com/hmg-prod/images/close-up-of-cat-wearing-sunglasses-while-sitting-royalty-free-image-1571755145.jpg",
                "akanksha_kapase"
            ),
            StoryDetails(
                storyImageLink = "https://www.cdc.gov/healthypets/images/pets/cute-dog-headshot.jpg",
                "sanika_jadhav"
            ),
            StoryDetails(
                storyImageLink = "https://www.rd.com/wp-content/uploads/2021/01/GettyImages-1175550351.jpg",
                "ashutosh"
            ),
            StoryDetails(
                storyImageLink = "https://hips.hearstapps.com/hmg-prod/images/close-up-of-cat-wearing-sunglasses-while-sitting-royalty-free-image-1571755145.jpg",
                "akanksha_kapase"
            ),
        )
    }

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(start = 8.dp, end = 8.dp)
    ) {
        item {
            Box(modifier = Modifier.width(80.dp)) {
                StoryView(
                    modifier = Modifier.width(80.dp),
                    storyDetails = StoryDetails(
                        "https://avatars.githubusercontent.com/u/36099618?v=4",
                        "Your Story"
                    )
                )
                Icon(
                    imageVector = Icons.Filled.AddCircle,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(bottom = 15.dp, end = 12.dp)
                        .align(Alignment.BottomEnd)
                        .size(20.dp),
                    tint = Color.Blue,
                )
            }
        }

        items(storyItems) { story ->
            StoryView(
                modifier = Modifier.width(80.dp), storyDetails = story
            )
        }
    }


}

@Composable
fun StoryView(modifier: Modifier, storyDetails: StoryDetails) =
    Column(modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        AsyncImage(
            model = storyDetails.storyImageLink,
            contentDescription = null,
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)
                .border(
                    width = 2.dp, brush = Brush.linearGradient(
                        listOf(
                            Color.Yellow, Color.Red, Color.Magenta
                        )
                    ), shape = CircleShape
                ),
            contentScale = ContentScale.Crop
        )
        Text(
            text = storyDetails.storyOwnerHandle,
            fontSize = 11.sp,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
            modifier = Modifier.padding(top = 4.dp)
        )
    }

data class StoryDetails(
    val storyImageLink: String,
    val storyOwnerHandle: String
)

@Preview
@Composable
fun StoryViewPreview() {
    InstagramTheme {
        StoryView(
            modifier = Modifier.width(80.dp),
            storyDetails = StoryDetails(
                storyImageLink = "whatever",
                storyOwnerHandle = "vedprakash_wagh"
            )
        )
    }
}