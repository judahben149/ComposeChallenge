package com.judahben149.composechallenge.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.judahben149.composechallenge.Dog
import com.judahben149.composechallenge.R
import com.judahben149.composechallenge.components.ItemCard
import com.judahben149.composechallenge.components.TopAppBar
import com.judahben149.composechallenge.data.FakeDogDatabase

@Composable
fun MainScreen(modifier: Modifier = Modifier, dogList: List<Dog>) {

    Surface(modifier) {
        LazyColumn {
            item {
                TopAppBar() {

                }
            }
            items(dogList.size) { index ->
                ItemCard(dog = dogList[index])
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen(modifier = Modifier, FakeDogDatabase.dogList)
}