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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Violet200


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Gray)
            ) {
            }
            LazyColumn(
                modifier = Modifier
                    .background(Color.Gray)
                    .fillMaxWidth()
                    .padding(top = 55.dp),
            )
                     {
                itemsIndexed(
                        listOf(
                            ItemColumnCats(R.drawable.cat_icon, "Boris", "Hello, how are you?"),
                            ItemColumnCats(R.drawable.cat_icon, "Murka", "Stop giving me Whiskas"),
                            ItemColumnCats(R.drawable.cat_icon, "Sergey", "Murka is my best friend"),
                            ItemColumnCats(R.drawable.cat_icon, "Keks", "Who da fuck name cat Sergey???!"),
                            ItemColumnCats(R.drawable.cat_icon, "Munya", "Are you alone?"),
                            ItemColumnCats(R.drawable.cat_icon, "Tasya", "Guys, you too receiving messages from Homeless? I think his account is cracked." +
                                    "And he need some help. Are you have his phone number?\n" +
                                    "And one more. My brother Murka in hospital, and i need to visit him now." +
                                    "Print me whatever you hand, and i will answer lather"),
                            ItemColumnCats(R.drawable.cat_icon, "Homeless 1","Hey guys, we need to make home party"),
                            ItemColumnCats(R.drawable.cat_icon, "Homeless 2","Hey guys, we need to make home party"),
                            ItemColumnCats(R.drawable.cat_icon, "Homeless 3 ","Hey guys, we need to make home party"),
                            ItemColumnCats(R.drawable.cat_icon, "Homeless 4 ","Hey guys, we need to make home party"),
                            ItemColumnCats(R.drawable.cat_icon, "Homeless 5 ","Hey guys, we need to make home party"),
                            ItemColumnCats(R.drawable.cat_icon, "Homeless 6 ","Hey guys, we need to make home party"),
                            ItemColumnCats(R.drawable.cat_icon, "ReallyNotHomeless","Hey guys, we need to make street party")
                    )
                    ){
                    _, item ->
                    ComposableItemColumn(item = item)
                }

            }
        }
    }
}
