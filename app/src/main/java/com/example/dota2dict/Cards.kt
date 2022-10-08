package com.example.dota2dict

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dota2dict.ui.theme.Poppins
import com.google.accompanist.pager.ExperimentalPagerApi
import kotlinx.coroutines.launch

//HOME PAGE | GENERAL UPDATE CARD

@Composable
fun UpdatesGeneralCard(generalUpdate: GeneralUpdatesData) {
    Card(elevation = 4.dp) {
        Box (modifier = Modifier.background(Color.Black)) {
            Row {
                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 30.dp, top = 5.dp)
                        .size(20.dp)
                        .shadow(16.dp))

                Spacer(modifier = Modifier.width(10.dp))

                Text(
                    text = stringResource(id = generalUpdate.stringResourceID),
                    fontFamily = Poppins,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.White,
                    modifier = Modifier
                        .padding(end = 20.dp, top = 5.dp, bottom = 10.dp))
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun GeneralUpdatesCardPreview() {
    UpdatesGeneralCard(GeneralUpdatesData(R.string.text1))
}

//HOME PAGE | ITEMS UPDATE CARD

@Composable
fun UpdatesItemCard(itemUpdate: ItemUpdatesData) {
    Card(
        elevation = 4.dp,
        backgroundColor = Color.Black,
        modifier = Modifier
            .padding(bottom = 10.dp)) {

        Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(Color.Black)
                    .padding(start = 20.dp, end = 20.dp)
            )

        {
                Image(
                    painter = painterResource(id = itemUpdate.itemImage),
                    contentDescription = stringResource(id = itemUpdate.itemName),
                    modifier = Modifier.size(80.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column(
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = stringResource(id = itemUpdate.itemName),
                        fontFamily = Poppins,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    )

                    Text(
                        text = stringResource(id = itemUpdate.itemDescription),
                        fontFamily = Poppins,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White
                    )
                }
        }
    }
}


@Preview (showBackground = true)
@Composable
fun UpdatesItemCardPreview() {
    UpdatesItemCard(ItemUpdatesData(R.string.item1, R.string.item_description1, R.drawable.bracer_icon))
}

//HOME PAGE | NEUTRAL ITEMS UPDATE CARD
@Composable
fun UpdatesNeutralItemCard(neutralItemUpdate: NeutralItemUpdatesData) {
    Card(
        elevation = 4.dp,
        backgroundColor = Color.Black,
        modifier = Modifier
            .padding(bottom = 10.dp)) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(Color.Black)
                .padding(start = 20.dp, end = 20.dp)
        )

        {
            Image(
                painter = painterResource(id = neutralItemUpdate.neutralItemImage),
                contentDescription = stringResource(id = neutralItemUpdate.neutralItemName),
                modifier = Modifier.size(80.dp)
            )

            Spacer(modifier = Modifier.width(20.dp))

            Column(
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(id = neutralItemUpdate.neutralItemName),
                    fontFamily = Poppins,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )

                Text(
                    text = stringResource(id = neutralItemUpdate.neutralItemDescription),
                    fontFamily = Poppins,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.White
                )
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun NeutralUpdatesItemCardPreview() {
    UpdatesNeutralItemCard(NeutralItemUpdatesData(R.string.neutral_item1, R.string.neutral_item_description1, R.drawable.occult_bracelet_icon))
}

//ITEM PAGE | ACCESSORIES CARD
@Composable
fun AccessoriesItemCard(accessoriesItem: ItemsAccessoriesData) {
    Card(
        modifier = Modifier.size(height = 60.dp, width = 200.dp),
        border = BorderStroke(2.dp, colorResource(R.color.yellow)),
        elevation = 4.dp,
        backgroundColor = Color.Black,
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(Color.Black)
        )

        {
            Image(
                painter = painterResource(id = accessoriesItem.itemImage),
                contentDescription = stringResource(id = accessoriesItem.itemName),
                modifier = Modifier
                    .size(60.dp)
                    .aspectRatio(1f)
                    .padding(start = 10.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column(modifier = Modifier.padding(end = 10.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(id = accessoriesItem.itemName),
                    fontFamily = Poppins,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = accessoriesItem.itemCost,
                        fontFamily = Poppins,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White
                    )
                    
                    Spacer(modifier = Modifier.width(5.dp))
                    
                    Image(
                        painter = painterResource(R.drawable.gold_icon),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun AccessoriesItemCardPreview() {
    AccessoriesItemCard(ItemsAccessoriesData(R.string.accessories_boots_of_travel, "2,500", R.drawable.boots_of_travel_1_icon))
}

//ITEM PAGE | SUPPORT CARD
@Composable
fun SupportItemCard(supportItem: ItemsSupportData) {
    Card(
        modifier = Modifier.size(height = 60.dp, width = 200.dp),
        border = BorderStroke(2.dp, colorResource(R.color.yellow)),
        elevation = 4.dp,
        backgroundColor = Color.Black,
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(Color.Black)
        )

        {
            Image(
                painter = painterResource(id = supportItem.itemImage),
                contentDescription = stringResource(id = supportItem.itemName),
                modifier = Modifier
                    .size(60.dp)
                    .aspectRatio(1f)
                    .padding(start = 10.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column(modifier = Modifier.padding(end = 10.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(id = supportItem.itemName),
                    fontFamily = Poppins,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = supportItem.itemCost,
                        fontFamily = Poppins,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.width(5.dp))

                    Image(
                        painter = painterResource(R.drawable.gold_icon),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }
    }
}

//ITEM PAGE | MAGICAL CARD
@Composable
fun MagicalItemCard(magicalItem: ItemsMagicalData) {
    Card(
        modifier = Modifier.size(height = 60.dp, width = 200.dp),
        border = BorderStroke(2.dp, colorResource(R.color.yellow)),
        elevation = 4.dp,
        backgroundColor = Color.Black,
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(Color.Black)
        )

        {
            Image(
                painter = painterResource(id = magicalItem.itemImage),
                contentDescription = stringResource(id = magicalItem.itemName),
                modifier = Modifier
                    .size(60.dp)
                    .aspectRatio(1f)
                    .padding(start = 10.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column(modifier = Modifier.padding(end = 10.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(id = magicalItem.itemName),
                    fontFamily = Poppins,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = magicalItem.itemCost,
                        fontFamily = Poppins,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.width(5.dp))

                    Image(
                        painter = painterResource(R.drawable.gold_icon),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }
    }
}

//ITEM PAGE | ARMOR CARD
@Composable
fun ArmorItemCard(armorItem: ItemsArmorData) {
    Card(
        modifier = Modifier.size(height = 60.dp, width = 200.dp),
        border = BorderStroke(2.dp, colorResource(R.color.yellow)),
        elevation = 4.dp,
        backgroundColor = Color.Black,
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(Color.Black)
        )

        {
            Image(
                painter = painterResource(id = armorItem.itemImage),
                contentDescription = stringResource(id = armorItem.itemName),
                modifier = Modifier
                    .size(60.dp)
                    .aspectRatio(1f)
                    .padding(start = 10.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column(modifier = Modifier.padding(end = 10.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(id = armorItem.itemName),
                    fontFamily = Poppins,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = armorItem.itemCost,
                        fontFamily = Poppins,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.width(5.dp))

                    Image(
                        painter = painterResource(R.drawable.gold_icon),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }
    }
}

//ITEM PAGE | WEAPON CARD
@Composable
fun WeaponItemCard(weaponItem: ItemsWeaponData) {
    Card(
        modifier = Modifier.size(height = 60.dp, width = 200.dp),
        border = BorderStroke(2.dp, colorResource(R.color.yellow)),
        elevation = 4.dp,
        backgroundColor = Color.Black,
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(Color.Black)
        )

        {
            Image(
                painter = painterResource(id = weaponItem.itemImage),
                contentDescription = stringResource(id = weaponItem.itemName),
                modifier = Modifier
                    .size(60.dp)
                    .aspectRatio(1f)
                    .padding(start = 10.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column(modifier = Modifier.padding(end = 10.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(id = weaponItem.itemName),
                    fontFamily = Poppins,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = weaponItem.itemCost,
                        fontFamily = Poppins,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.width(5.dp))

                    Image(
                        painter = painterResource(R.drawable.gold_icon),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }
    }
}

//ITEM PAGE | ARTIFACT CARD
@Composable
fun ArtifactItemCard(artifactItem: ItemsArtifactData) {
    Card(
        modifier = Modifier.size(height = 60.dp, width = 200.dp),
        border = BorderStroke(2.dp, colorResource(R.color.yellow)),
        elevation = 4.dp,
        backgroundColor = Color.Black
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(Color.Black)
        )

        {
            Image(
                painter = painterResource(id = artifactItem.itemImage),
                contentDescription = stringResource(id = artifactItem.itemName),
                modifier = Modifier
                    .size(60.dp)
                    .aspectRatio(1f)
                    .padding(start = 10.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column(modifier = Modifier.padding(end = 10.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(id = artifactItem.itemName),
                    fontFamily = Poppins,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = artifactItem.itemCost,
                        fontFamily = Poppins,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.width(5.dp))

                    Image(
                        painter = painterResource(R.drawable.gold_icon),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }
    }
}


@Composable
fun HeroProfileCard(heroProfile: HeroesProfilePictureData, navController: NavController) {
    Card(
        elevation = 4.dp,
        backgroundColor = Color.Black,
        modifier = Modifier.clickable { navController.navigate(NavigationScreen.HeroInformation.route) }
    )
    {
        Box(
            contentAlignment = Alignment.BottomCenter,
            modifier = Modifier.background(Color.Black))
        {
            Image(
                painter = painterResource(heroProfile.heroImage),
                contentDescription = stringResource(heroProfile.heroName),
                modifier = Modifier
                    .fillMaxSize())
        }
    }
}


/*@Preview (showBackground = true)
@Composable
fun HeroProfileCardPreview() {
    HeroProfileCard(HeroesProfilePictureData(R.drawable.abaddon_1_ ,R.string.abaddon))
}*/







