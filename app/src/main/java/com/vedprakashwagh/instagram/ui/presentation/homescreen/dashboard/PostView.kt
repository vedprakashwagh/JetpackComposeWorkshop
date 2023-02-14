package com.vedprakashwagh.instagram.ui.presentation.homescreen.dashboard

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import kotlin.random.Random

@Composable
fun PostView(
    modifier: Modifier, postInfo: PostInfo
) = Column(modifier = modifier) {

    PostTopView(
        modifier = Modifier
            .padding(start = 8.dp, end = 8.dp)
            .fillMaxWidth(),
        imageLink = postInfo.profilePictureLink,
        profileHandle = postInfo.profileHandle
    )

    AsyncImage(
        model = postInfo.postLink,
        contentDescription = null,
        modifier = Modifier
            .padding(top = 8.dp, bottom = 8.dp)
            .fillMaxWidth(),
        contentScale = ContentScale.FillWidth
    )

    PostInteractionView(
        modifier = Modifier
            .padding(start = 8.dp, end = 8.dp)
            .fillMaxWidth()
    )

    Text(
        text = buildAnnotatedString {
            withStyle(SpanStyle(fontWeight = FontWeight.Normal)) {
                append("Liked by ")
            }

            withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
                postInfo.likedBy.forEachIndexed { index, name ->
                    if (index == postInfo.likedBy.size - 1) {
                        append(name)
                    } else {
                        append("$name,")
                    }
                }
            }
        },
        fontSize = 12.sp,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        modifier = Modifier.padding(start = 8.dp, end = 8.dp)
    )

    Text(
        text = buildAnnotatedString {
            withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
                append(postInfo.profileHandle)
            }

            withStyle(SpanStyle(fontWeight = FontWeight.Normal)) {
                append(" " + postInfo.postDescription)
            }
        },
        fontSize = 12.sp,
        modifier = Modifier.padding(start = 8.dp, end = 8.dp)
    )

    Text(
        text = "View all ${Random.nextInt(from = 1, until = 1000)} comments", fontSize = 12.sp,
        modifier = Modifier.padding(start = 8.dp, end = 8.dp)
    )



}

@Composable
fun PostInteractionView(
    modifier: Modifier
) = Row(modifier, horizontalArrangement = Arrangement.spacedBy(12.dp)) {

    Icon(imageVector = Icons.Outlined.FavoriteBorder, contentDescription = null)

    Icon(imageVector = Icons.Outlined.MapsUgc, contentDescription = null)

    Icon(imageVector = Icons.Outlined.Send, contentDescription = null)

    Spacer(modifier = Modifier.weight(1f))

    Icon(imageVector = Icons.Outlined.BookmarkBorder, contentDescription = null)

}

@Composable
fun PostTopView(
    modifier: Modifier, imageLink: String, profileHandle: String
) = Row(modifier, verticalAlignment = Alignment.CenterVertically) {

    AsyncImage(
        model = imageLink,
        contentDescription = null,
        modifier = Modifier
            .size(25.dp)
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
        text = profileHandle,
        fontSize = 13.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(start = 8.dp)
    )

    Spacer(modifier = Modifier.weight(1f))

    Icon(imageVector = Icons.Default.MoreVert, contentDescription = null)

}