package com.example.dota2dict

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2dict.ui.theme.Poppins

@Composable
fun HomePageScreen() {
    LazyColumn(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier
            .background(colorResource(R.color.black)))
    {

//        GENERAL UPDATES

        item {
            Box {
                Spacer(modifier = Modifier.height(40.dp))

                Text(
                    text = stringResource(R.string.heading1),
                    color = colorResource(R.color.white),
                    fontSize = 24.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 5.sp,
                    modifier = Modifier.padding(start = 20.dp, top = 20.dp)
                )

                Text(
                    text = stringResource(R.string.update_version),
                    color = colorResource(R.color.violet),
                    fontSize = 40.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 20.dp, top = 40.dp))
            }
        }

        item {
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = stringResource(R.string.heading2),
                color = colorResource(R.color.white),
                fontSize = 32.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 20.dp)
            )
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))
                
                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp))

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text1),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp))

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text2),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp))

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text3),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp))

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text4),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp))

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text5),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp))

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text6),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp))

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text7),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp))

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text8),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp))

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text9),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp))

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text10),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp))

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text11),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp))

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text12),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp))

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text13),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp))

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text14),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp))

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text15),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp))

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text16),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp))

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text17),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp))

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text18),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

        item {
            Row {
                Spacer(modifier = Modifier.width(20.dp))

                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp)
                )

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = stringResource(R.string.text19),
                    color = colorResource(R.color.white),
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(end = 20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))
            }
        }

//        ITEM UPDATES

        item {
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = stringResource(R.string.heading3),
                color = colorResource(R.color.white),
                fontSize = 32.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 20.dp)
            )
        }

        item {
            Column (verticalArrangement = Arrangement.spacedBy(5.dp)) {
                Row {
                    Spacer(modifier = Modifier.width(20.dp))

                    Image(
                        painter = painterResource(R.drawable.bracer_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp))

                    Spacer(modifier = Modifier.width(20.dp))

                    Text(
                        text = stringResource(R.string.item1),
                        color = colorResource(R.color.white),
                        fontSize = 24.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 5.dp, end = 20.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))
                }

                Row {
                    Spacer(modifier = Modifier.width(20.dp))

                    Image(
                        painter = painterResource(R.drawable.ic_bullet_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(20.dp))

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(
                        text = stringResource(R.string.item_description1),
                        color = colorResource(R.color.white),
                        fontSize = 14.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(end = 20.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))
                }
            }
        }

        item {
            Column (verticalArrangement = Arrangement.spacedBy(5.dp)) {
                Row {
                    Spacer(modifier = Modifier.width(20.dp))

                    Image(
                        painter = painterResource(R.drawable.spirit_vessel_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp))

                    Spacer(modifier = Modifier.width(20.dp))

                    Text(
                        text = stringResource(R.string.item2),
                        color = colorResource(R.color.white),
                        fontSize = 24.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 5.dp, end = 20.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))
                }

                Row {
                    Spacer(modifier = Modifier.width(20.dp))

                    Image(
                        painter = painterResource(R.drawable.ic_bullet_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(20.dp))

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(
                        text = stringResource(R.string.item_description2),
                        color = colorResource(R.color.white),
                        fontSize = 14.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(end = 20.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))
                }
            }
        }

        item {
            Column (verticalArrangement = Arrangement.spacedBy(5.dp)) {
                Row {
                    Spacer(modifier = Modifier.width(20.dp))

                    Image(
                        painter = painterResource(R.drawable.soul_ring_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp))

                    Spacer(modifier = Modifier.width(20.dp))

                    Text(
                        text = stringResource(R.string.item3),
                        color = colorResource(R.color.white),
                        fontSize = 24.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 5.dp, end = 20.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))
                }

                Row {
                    Spacer(modifier = Modifier.width(20.dp))

                    Image(
                        painter = painterResource(R.drawable.ic_bullet_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(20.dp))

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(
                        text = stringResource(R.string.item_description3),
                        color = colorResource(R.color.white),
                        fontSize = 14.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(end = 20.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))
                }
            }
        }

        item {
            Column (verticalArrangement = Arrangement.spacedBy(5.dp)) {
                Row {
                    Spacer(modifier = Modifier.width(20.dp))

                    Image(
                        painter = painterResource(R.drawable.urn_of_shadows_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp))

                    Spacer(modifier = Modifier.width(20.dp))

                    Text(
                        text = stringResource(R.string.item4),
                        color = colorResource(R.color.white),
                        fontSize = 24.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 5.dp, end = 20.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))
                }

                Row {
                    Spacer(modifier = Modifier.width(20.dp))

                    Image(
                        painter = painterResource(R.drawable.ic_bullet_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(20.dp))

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(
                        text = stringResource(R.string.item_description4),
                        color = colorResource(R.color.white),
                        fontSize = 14.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(end = 20.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))
                }
            }
        }

        item {
            Column (verticalArrangement = Arrangement.spacedBy(5.dp)) {
                Row {
                    Spacer(modifier = Modifier.width(20.dp))

                    Image(
                        painter = painterResource(R.drawable.wraith_band_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp))

                    Spacer(modifier = Modifier.width(20.dp))

                    Text(
                        text = stringResource(R.string.item5),
                        color = colorResource(R.color.white),
                        fontSize = 24.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 5.dp, end = 20.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))
                }

                Row {
                    Spacer(modifier = Modifier.width(20.dp))

                    Image(
                        painter = painterResource(R.drawable.ic_bullet_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(20.dp))

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(
                        text = stringResource(R.string.item_description5),
                        color = colorResource(R.color.white),
                        fontSize = 14.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(end = 20.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))
                }
            }
        }

//        NEUTRAL ITEM UPDATES

        item {
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = stringResource(R.string.heading4),
                color = colorResource(R.color.white),
                fontSize = 32.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 20.dp)
            )
        }

        item {
            Column (verticalArrangement = Arrangement.spacedBy(10.dp)) {
                Row {
                    Spacer(modifier = Modifier.width(20.dp))

                    Image(
                        painter = painterResource(R.drawable.occult_bracelet_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp))

                    Spacer(modifier = Modifier.width(20.dp))

                    Text(
                        text = stringResource(R.string.neutral_item1),
                        color = colorResource(R.color.white),
                        fontSize = 24.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 5.dp, end = 20.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))
                }

                Row {
                    Spacer(modifier = Modifier.width(20.dp))

                    Image(
                        painter = painterResource(R.drawable.ic_bullet_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(20.dp))

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(
                        text = stringResource(R.string.neutral_item_description1),
                        color = colorResource(R.color.white),
                        fontSize = 14.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(end = 20.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))
                }
            }
        }

        item {
            Column (verticalArrangement = Arrangement.spacedBy(5.dp)) {
                Row {
                    Spacer(modifier = Modifier.width(20.dp))

                    Image(
                        painter = painterResource(R.drawable.ogre_seal_totem_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp))

                    Spacer(modifier = Modifier.width(20.dp))

                    Text(
                        text = stringResource(R.string.neutral_item2),
                        color = colorResource(R.color.white),
                        fontSize = 24.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 5.dp, end = 20.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))
                }

                Row {
                    Spacer(modifier = Modifier.width(20.dp))

                    Image(
                        painter = painterResource(R.drawable.ic_bullet_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(20.dp))

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(
                        text = stringResource(R.string.neutral_item_description2),
                        color = colorResource(R.color.white),
                        fontSize = 14.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(end = 20.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))
                }
            }
        }

        item {
            Column (verticalArrangement = Arrangement.spacedBy(5.dp)) {
                Row {
                    Spacer(modifier = Modifier.width(20.dp))

                    Image(
                        painter = painterResource(R.drawable.specialists_array_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp))

                    Spacer(modifier = Modifier.width(20.dp))

                    Text(
                        text = stringResource(R.string.neutral_item3),
                        color = colorResource(R.color.white),
                        fontSize = 24.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 5.dp, end = 20.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))
                }

                Row {
                    Spacer(modifier = Modifier.width(20.dp))

                    Image(
                        painter = painterResource(R.drawable.ic_bullet_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(20.dp))

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(
                        text = stringResource(R.string.neutral_item_description3),
                        color = colorResource(R.color.white),
                        fontSize = 14.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(end = 20.dp)
                    )

                    Spacer(modifier = Modifier.width(20.dp))
                }
            }
        }

        item { 
            Spacer(modifier = Modifier.height(20.dp))
        }





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
        Text(text = "Items Screen", color = colorResource(R.color.white), fontSize = 40.sp)
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