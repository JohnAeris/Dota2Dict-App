package com.example.dota2dict

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2dict.ui.theme.Poppins
import com.google.accompanist.pager.*

@Composable
fun HeroDetails(data: HeroInfoData) {
    HeroTabScreen(data)
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun HeroTabScreen(data: HeroInfoData) {
    val pagerState= rememberPagerState(pageCount = 4)

    Column(
        modifier = Modifier.background(Color.Black))
    {

        HeroTabContent(pagerState = pagerState, data = data)

    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun HeroTabContent(pagerState: PagerState, data: HeroInfoData) {

    HorizontalPager(state = pagerState) {
            page -> when (page) {
        0 -> HeroTabScreen1(data)

        1 -> HeroTabScreen2(data)

        2 -> HeroTabScreen3(data = "Page 3")

        3 -> HeroTabScreen4(data = "Page 4")
    }}

}

@Composable
fun HeroTabScreen1(data: HeroInfoData) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center
    ) {
        Column(modifier = Modifier.padding(start = 30.dp, end = 30.dp)) {
            Image(
                painter = painterResource(
                    id = when(data.imageId) {
                        1 -> R.drawable.abaddon_profile
                        2 -> R.drawable.alchemist_profile
                        3 -> R.drawable.ancient_apparition_profile
                        4 -> R.drawable.antimage_profile
                        5 -> R.drawable.arc_warden_profile
                        6 -> R.drawable.axe_profile
                        7 -> R.drawable.bane_profile
                        else -> R.drawable.abaddon_profile
                    }),
                alignment = Alignment.Center,
                contentDescription = "Profile Image",
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .size(300.dp)
            )
        }


        Divider(
            thickness = 1.dp,
            color = colorResource(id = R.color.platinum),
            modifier = Modifier
                .padding(bottom = 10.dp)
        )

        Spacer(modifier = Modifier.padding(5.dp))

        Row(
            horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(
                    id = when(data.typeImage) {
                        1 -> R.drawable.hero_strength_ic
                        2 -> R.drawable.hero_agility_ic
                        3 -> R.drawable.hero_intelligence_ic
                        else -> R.drawable.hero_strength_ic
                    }),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .padding(end = 10.dp)
            )

            Text(
                text = data.heroType,
                fontSize = 15.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.Normal,
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }


        Box() {
            Text(
                text = data.heroName,
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = Poppins,
                textAlign = TextAlign.Start
            )

            Text(
                text = data.heroDescription,
                color = Color.White,
                fontSize =  16.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(top = 45.dp)
            )
        }


        Spacer(modifier = Modifier.padding(5.dp))

        Text(
            text = data.heroHistory,
            color = Color.White,
            fontSize = 12.sp,
            fontFamily = Poppins,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 5.dp, end = 5.dp)
        )

        Spacer(modifier = Modifier.padding(5.dp))

        Column(verticalArrangement = Arrangement.spacedBy(5.dp)) { 
            Text(
                text = "ATTACK TYPE",
                color = Color.White,
                fontSize = 16.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start
            )
            
            Row() {
                Image(
                    painter = painterResource(
                        id = when(data.attackTypeImage){
                            1 -> R.drawable.attack_type_ic
                            2 -> R.drawable.ranged_type_ic
                            else -> R.drawable.attack_type_ic
                        }),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )

                Spacer(modifier = Modifier.width(20.dp))

                Text(
                    text = data.attackType,
                    color = Color.White,
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Start
                )
            }

            Spacer(modifier = Modifier.padding(5.dp))

            Box {
                Text(
                    text = "COMPLEXITY",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start
                )

                Image(
                    painter = painterResource(
                        id = when(data.attackTypeImage){
                            1 -> R.drawable.complexity1_ic
                            2 -> R.drawable.complexity2_ic
                            3 -> R.drawable.complexity3_ic
                            else -> R.drawable.complexity1_ic
                        }),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .padding(top = 20.dp)
                )
            }
        }
    }
}

@Composable
@Preview (showBackground = true, showSystemUi = true)
fun HeroTabScreen1Prev() {
    HeroTabScreen1(HeroInfoData(
        1,
        "ABADDON",
        "SHIELDS HIS ALLIES OR HIMSELF FROM ATTACKS",
        "Able to transform enemy attacks into self-healing, Abaddon can survive almost any assault. Shielding allies and launching his double-edged coil at a friend or foe, he is always ready to ride into the thick of battle.",
        1,
        "Strength",
        1,
        "MELEE",
        1)
    )
}

@Composable
fun HeroTabScreen2(data: HeroInfoData) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.background(Color.Black).fillMaxSize()
    ) {
        Text(
            text = "data.heroName",
            color = Color.White)
    }
}

@Composable
@Preview (showBackground = true, showSystemUi = true)
fun HeroTabScreen2Prev() {
    HeroTabScreen2(HeroInfoData(
        1,
        "ABADDON",
        "SHIELDS HIS ALLIES OR HIMSELF FROM ATTACKS",
        "Able to transform enemy attacks into self-healing, Abaddon can survive almost any assault. Shielding allies and launching his double-edged coil at a friend or foe, he is always ready to ride into the thick of battle.",
        1,
        "Strength",
        1,
        "MELEE",
        1)
    )
}

@Composable
fun HeroTabScreen3(data: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        Text(
            text = data,
            color = Color.White,
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold)
    }
}

@Composable
fun HeroTabScreen4(data: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        Text(
            text = data,
            color = Color.White,
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold)
    }
}