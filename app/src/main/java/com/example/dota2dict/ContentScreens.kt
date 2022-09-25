package com.example.dota2dict

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun HomePageScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.black))
            .wrapContentSize(Alignment.Center))
    {
        Text(text = "Home Screen", color = colorResource(R.color.white), fontSize = 40.sp)
    }
}

@Preview(name = "Home Screen", showBackground = true, showSystemUi = true)
@Composable
fun HomePageScreenPreview() {
    HomePageScreen()
}

@Composable
fun HeroesPageScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.black))
            .wrapContentSize(Alignment.Center))
    {
        Text(text = "Heroes Screen", color = colorResource(R.color.white), fontSize = 40.sp)
    }
}

@Preview(name = "Heroes Screen", showBackground = true, showSystemUi = true)
@Composable
fun HeroesPageScreenPreview() {
    HeroesPageScreen()
}

@Composable
fun ItemsPageScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.black))
            .wrapContentSize(Alignment.Center))
    {
        Text(text = "Items Screen", color = colorResource(R.color.white), fontSize = 40.sp)
    }
}

@Preview(name = "Items Screen", showBackground = true, showSystemUi = true)
@Composable
fun ItemsPageScreenPreview() {
    ItemsPageScreen()
}

@Composable
fun SettingsPageScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.black))
            .wrapContentSize(Alignment.Center))
    {
        Text(text = "Settings Screen", color = colorResource(R.color.white), fontSize = 40.sp)
    }
}

@Preview(name = "Settings Screen", showBackground = true, showSystemUi = true)
@Composable
fun SettingsPageScreenPreview() {
    SettingsPageScreen()
}