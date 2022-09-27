package com.example.dota2dict

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2dict.ui.theme.Poppins

//HOME PAGE SCREEN | START

@Composable
private fun UpdatesList(
    generalUpdatesList: List<GeneralUpdatesData>,
    itemUpdatesList: List<ItemUpdatesData>,
    neutralUpdatesList: List<NeutralItemUpdatesData>,
    modifier: Modifier = Modifier) {
    LazyColumn (
        modifier = Modifier.background(Color.Black))

    {
        item {
            Box {
                Text(
                    text = stringResource(R.string.heading1),
                    fontFamily = Poppins,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Black,
                    color = Color.White,
                    letterSpacing = 5.sp,
                    modifier = Modifier.padding(start = 20.dp, top = 20.dp)
                )

                Text(
                    text = stringResource(R.string.update_version),
                    fontFamily = Poppins,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = colorResource(R.color.violet),
                    modifier = Modifier.padding(start = 20.dp, top = 40.dp)
                )
            }
        }

        item {
            Text(
                text = stringResource(R.string.heading2),
                fontFamily = Poppins,
                fontSize = 24.sp,
                fontWeight = FontWeight.Black,
                color = colorResource(R.color.violet),
                letterSpacing = 3.sp,
                modifier = Modifier.padding(start = 20.dp)
            )
        }

        items(generalUpdatesList) { generalUpdate ->
            UpdatesGeneralCard(generalUpdate = generalUpdate)
        }

        item {
            Text(
                text = stringResource(R.string.heading3),
                fontFamily = Poppins,
                fontSize = 24.sp,
                fontWeight = FontWeight.Black,
                color = colorResource(R.color.violet),
                letterSpacing = 3.sp,
                modifier = Modifier.padding(start = 20.dp)
            )
        }

        items(itemUpdatesList) { itemUpdate ->
            UpdatesItemCard(itemUpdate = (itemUpdate))
        }

        item {
            Text(
                text = stringResource(R.string.heading4),
                fontFamily = Poppins,
                fontSize = 24.sp,
                fontWeight = FontWeight.Black,
                color = colorResource(R.color.violet),
                letterSpacing = 3.sp,
                modifier = Modifier.padding(start = 20.dp)
            )
        }

        items(neutralUpdatesList) { neutralItemUpdate ->
            UpdatesNeutralItemCard(neutralItemUpdate = neutralItemUpdate)
        }
        
    }
}


@Composable
fun HomePageScreen() {
    UpdatesList(
        generalUpdatesList = GeneralUpdateDataSource().loadGeneralUpdates(),
        itemUpdatesList = ItemUpdateDataSource().loadItemUpdates(),
        neutralUpdatesList = NeutralItemUpdateDataSource().loadNeutralItemUpdates()
        )
}

@Preview(name = "Home Screen", showBackground = true, showSystemUi = true)
@Composable
fun HomePageScreenPreview() {
    HomePageScreen()
}

//HOME PAGE SCREEN | END















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