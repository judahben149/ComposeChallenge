package com.judahben149.composechallenge.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.judahben149.composechallenge.R
import com.judahben149.composechallenge.ui.theme.BlueText
import com.judahben149.composechallenge.ui.theme.BlueTonalButton

@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    Surface(modifier = modifier) {
        val painter = painterResource(id = R.drawable.blue_dog)
        val dogName = "Peter"
        val dogAge = "12"
        val distance = "824m"
        val gender = "Male"
        val iconPainter = painterResource(id = R.drawable.baseline_location_on_24)

        ItemCard(
            painter = painter,
            dogName = dogName,
            dogAge = dogAge,
            distance = distance,
            gender = gender,
            iconPainter = iconPainter
        )
    }
}


@Composable
fun ItemCard(
    painter: Painter,
    dogName: String,
    dogAge: String,
    distance: String,
    gender: String,
    iconPainter: Painter,
    modifier: Modifier = Modifier
) {

    Card(
        modifier
            .fillMaxWidth()
            .height(120.dp)
            .padding(10.dp)
            .background(color = Color.White),
        shape = RoundedCornerShape(16.dp)
    ) {
        Row() {
            Image(
                painter = painter,
                contentDescription = "Dog's name",
                modifier
                    .size(100.dp)
                    .padding(10.dp)
                    .clip(
                        RoundedCornerShape(12.dp)
                    )
            )

            Spacer(modifier = modifier.width(10.dp))

            Column(
                verticalArrangement = Arrangement.SpaceAround,
                modifier = modifier
                    .padding(top = 10.dp, bottom = 10.dp)
                    .fillMaxHeight()
            ) {
                Text(text = dogName, fontSize = 20.sp)
                Text(text = dogName, fontSize = 15.sp)
                Row() {
                    Icon(
                        painter = iconPainter,
                        contentDescription = "location icon",
                        modifier.padding(top = 3.dp)
                    )
                    Spacer(modifier = modifier.width(5.dp))
                    Text(text = distance, fontSize = 14.sp)
                }

            }

            FilledTonalButton(onClick = {}, colors = BlueTonalButton) {
                Text(text = gender, color = BlueText)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen(modifier = Modifier)
}