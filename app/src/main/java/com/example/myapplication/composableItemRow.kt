package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun composableItemRow(item: ItemRowCats) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
        .padding(horizontal = 3.dp)
        .background(Color.White))
         {
        Image(painter = painterResource(id = item.imageId),
            contentDescription = "Cat image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(5.dp)
                .clip(CircleShape)
                .size(64.dp)
        )
        Text(text = item.title)
    }
}