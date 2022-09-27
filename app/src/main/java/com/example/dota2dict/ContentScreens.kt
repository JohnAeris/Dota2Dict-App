package com.example.dota2dict

import android.widget.GridLayout
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2dict.ui.theme.Poppins
import javax.sql.DataSource

@Composable
private fun GeneralUpdatesList(
    generalUpdatesList: List<GeneralUpdatesData>,
    modifier: Modifier = Modifier) {
    LazyColumn (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(Color.Black))

    {
        items(generalUpdatesList) { generalUpdate ->
            UpdatesGeneralCard(generalUpdate = generalUpdate)
        }
        
    }
}

@Composable
fun HomePageScreen() {
    GeneralUpdatesList(generalUpdatesList = GeneralUpdateDataSource().loadGeneralUpdates())
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