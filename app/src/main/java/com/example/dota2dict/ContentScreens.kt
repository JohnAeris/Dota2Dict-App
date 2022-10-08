package com.example.dota2dict

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2dict.ui.theme.Poppins
import androidx.compose.foundation.lazy.items
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


//HOME PAGE SCREEN | START

@Composable
private fun UpdatesList(
    generalUpdatesList: List<GeneralUpdatesData>,
    itemUpdatesList: List<ItemUpdatesData>,
    neutralUpdatesList: List<NeutralItemUpdatesData>) {
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

//HEROES PAGE SCREEN | START

@Composable
fun HeroesPageScreen(navController: NavController) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(70.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier
            .background(Color.Black)
            .padding(start = 20.dp, end = 20.dp, top = 20.dp),
        content = {

            item(span = { GridItemSpan(maxCurrentLineSpan) }) {
                Column {
                    Box {
                        Text(
                            text = stringResource(R.string.heading1_heroes_page),
                            fontFamily = Poppins,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Black,
                            color = Color.White,
                            letterSpacing = 5.sp,
                        )

                        Text(
                            text = stringResource(R.string.heading2_heroes_page),
                            fontFamily = Poppins,
                            fontSize = 36.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = colorResource(R.color.violet),
                            modifier = Modifier.padding(top = 18.dp)
                        )
                    }
                }
            }

            items(HeroProfilePictureDataSource.heroImage) { heroProfile ->
                HeroProfileCard(heroProfile = heroProfile, navController = navController)
            }

        })

}

/*@Preview(name = "Heroes Screen", showBackground = true, showSystemUi = true)
@Composable
fun HeroesPageScreenPreview() {
    HeroesPageScreen()
}*/

//HEROES PAGE SCREEN | END

//ITEMS PAGE SCREEN | START
@Composable
fun ItemsPageScreen() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .background(Color.Black)
            .padding(start = 20.dp, end = 20.dp, top = 20.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp),
        content = {

            item(span = { GridItemSpan(maxCurrentLineSpan) }) {
                Column {
                    Box {
                        Text(
                            text = stringResource(R.string.heading1_items_page),
                            fontFamily = Poppins,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Black,
                            color = Color.White,
                            letterSpacing = 5.sp,
                        )

                        Text(
                            text = stringResource(R.string.heading2_items_page),
                            fontFamily = Poppins,
                            fontSize = 36.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = colorResource(R.color.violet),
                            modifier = Modifier.padding(top = 18.dp)
                        )
                    }
                }
            }

            item(span = { GridItemSpan(maxCurrentLineSpan)}) {
                Text(
                    text = stringResource(R.string.heading3_items_page_description),
                    textAlign = TextAlign.Justify,
                    fontFamily = Poppins,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.White
                )
            }

            item(span = { GridItemSpan(maxCurrentLineSpan)}) {
                Text(
                    text = stringResource(R.string.heading3_items_accessories),
                    fontFamily = Poppins,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Black,
                    color = colorResource(R.color.violet),
                    letterSpacing = 3.sp
                )
            }

            items(AccessoriesDataSource.accessories) { accessoriesItem ->
                AccessoriesItemCard(accessoriesItem = accessoriesItem)
            }

            item(span = { GridItemSpan(currentLineSpan = 3)}) {
                Text(
                    text = stringResource(R.string.heading3_items_support),
                    fontFamily = Poppins,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Black,
                    color = colorResource(R.color.violet),
                    letterSpacing = 3.sp
                )
            }

            items(SupportDataSource.support) { supportItem ->
                SupportItemCard(supportItem = supportItem)
            }

            item(span = { GridItemSpan(currentLineSpan = 2)}) {
                Text(
                    text = stringResource(R.string.heading3_items_magical),
                    fontFamily = Poppins,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Black,
                    color = colorResource(R.color.violet),
                    letterSpacing = 3.sp
                )
            }

            items(MagicalDataSource.magical) { magicalItem ->
                MagicalItemCard(magicalItem = magicalItem)
            }

            item(span = { GridItemSpan(currentLineSpan = 2)}) {
                Text(
                    text = stringResource(R.string.heading3_items_armor),
                    fontFamily = Poppins,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Black,
                    color = colorResource(R.color.violet),
                    letterSpacing = 3.sp
                )
            }

            items(ArmorDataSource.armor) { armorItem ->
                ArmorItemCard(armorItem = armorItem)
            }

            item(span = { GridItemSpan(currentLineSpan = 2)}) {
                Text(
                    text = stringResource(R.string.heading3_items_weapons),
                    fontFamily = Poppins,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Black,
                    color = colorResource(R.color.violet),
                    letterSpacing = 3.sp
                )
            }

            items(WeaponDataSource.weapon) { weaponItem ->
                WeaponItemCard(weaponItem = weaponItem)
            }

            item(span = { GridItemSpan(currentLineSpan = 2)}) {
                Text(
                    text = stringResource(R.string.heading3_items_artifacts),
                    fontFamily = Poppins,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Black,
                    color = colorResource(R.color.violet),
                    letterSpacing = 3.sp
                )
            }

            items(ArtifactDataSource.artifact) { artifactItem ->
                ArtifactItemCard(artifactItem = artifactItem)
            }

        }
    )
}



@Preview(name = "Items Screen", showBackground = true, showSystemUi = true)
@Composable
fun ItemsPageScreenPreview() {
    ItemsPageScreen()
}

//ITEMS PAGE SCREEN | END

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