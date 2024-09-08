package com.example.myapplication

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            Column (modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(top = 55.dp)
            ){
                ListItem(name = "Cat1", prof = "Funny")
                ListItem(name = "Cat2", prof = "Smart")
                ListItem(name = "Cat3", prof = "Me")
                ListItem(name = "Cat4", prof = "You")
                ListItem(name = "Cat5", prof = "You")
                ListItem(name = "Cat6", prof = "You")
                ListItem(name = "Cat6", prof = "You")
                ListItem(name = "Cat6", prof = "You")
                ListItem(name = "Cat6", prof = "You")
                ListItem(name = "Cat6", prof = "You")
                ListItem(name = "Cat6", prof = "You")
                ListItem(name = "Cat6", prof = "You")
                ListItem(name = "Cat6", prof = "You")
                ListItem(name = "Cat6", prof = "You")
                ListItem(name = "Cat6", prof = "You")
            }
        }
    }
}

@Composable
private fun ListItem(name: String, prof: String){
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .clickable {
                Log.d("MyLog", "Click")
            }
            .pointerInput(Unit){
               detectDragGesturesAfterLongPress { change, dragAmount ->
                   Log.d("MyLog", "LongPress: $dragAmount")
               }
            }
        ,
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)
    ) {
        Box(){
            Row (verticalAlignment = Alignment.CenterVertically){
                Image(
                    painter = painterResource(id = R.drawable.cat_icon),
                    contentDescription = "Meow",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(64.dp)
                        .padding(5.dp)
                        .clip(CircleShape)
                )
                Column(modifier = Modifier.padding(start = 5.dp)){
                    Text(text = name)
                    Text(text = prof)
                }
            }
        }
        }
    }