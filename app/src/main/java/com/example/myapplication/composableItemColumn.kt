package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ComposableItemColumn(item: ItemColumnCats) {
    var isExpandedMessagePreview by remember {
        mutableStateOf(false)
    }
    Row (modifier = Modifier
        .padding(vertical = 2.dp)
        .background(Color.White)
        .fillMaxWidth()) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
            .padding(horizontal = 3.dp))

        {
            Image(painter = painterResource(id = item.imageId),
                contentDescription = "Cat image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(5.dp)
                    .clip(CircleShape)
                    .size(64.dp)
            )
        }
        Column (modifier = Modifier
            .padding(start = 5.dp, top = 5.dp)
            .clickable {
                isExpandedMessagePreview = !isExpandedMessagePreview
            }) {
            Text(text = item.personName)
            Text(modifier = Modifier.padding(top = 3.dp, bottom = 5.dp),
                maxLines = if (isExpandedMessagePreview) 10 else 2
                ,text = item.messagePreview)
        }
    }

}