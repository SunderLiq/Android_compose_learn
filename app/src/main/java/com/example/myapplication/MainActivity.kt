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
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Violet200)
                    .padding(top = 55.dp))
                     {
                itemsIndexed(
                    listOf(
                    ItemRowCats(R.drawable.cat_icon, "Boris"),
                    ItemRowCats(R.drawable.cat_icon, "Murka"),
                    ItemRowCats(R.drawable.cat_icon, "Keks"),
                    ItemRowCats(R.drawable.cat_icon, "Sergey"),
                    ItemRowCats(R.drawable.cat_icon, "Munya"),
                    ItemRowCats(R.drawable.cat_icon, "Tasya"),
                    ItemRowCats(R.drawable.cat_icon, "Homeless"),
                    ItemRowCats(R.drawable.cat_icon, "Happy"),
                    ItemRowCats(R.drawable.cat_icon, "Vlad"),
                    ItemRowCats(R.drawable.cat_icon, "Last one")
                    )
                    ){
                    _, item ->
                    composableItemRow(item = item)
                }

            }
        }
    }
}
