package com.example.dota2dict

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
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
    val pagerState= rememberPagerState(0)

    Column(
        modifier = Modifier.background(Color.Black))
    {

        HeroTabContent(pagerState = pagerState, data = data)
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun HeroTabContent(pagerState: PagerState, data: HeroInfoData) {

    HorizontalPager(count = 3, state = pagerState) { page ->
        when (page) {
            0 -> HeroTabScreen1(data)

            1 -> HeroTabScreen2(data)


            2 -> HeroTabScreen3(data)
        }
    }
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
                        8 -> R.drawable.batrider_profile
                        9 -> R.drawable.bloodseeker_profile
                        10 -> R.drawable.bounty_hunter_profile
                        11 -> R.drawable.brewmaster_profile
                        12 -> R.drawable.bristleback_profile
                        13 -> R.drawable.broodmother_profile
                        14 -> R.drawable.centaur_profile
                        15 -> R.drawable.chaos_knight_profile
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
                fontWeight = FontWeight.Thin,
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }


        Box {
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
            
            Row {
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
                        id = when(data.complexityImage){
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
        1,
        25, 75, 0,
        0, 0, 75,
        0, 0, 0,
        "325", "50-60", "1800/800",
        "1.7", "2.8", "150",
        "22 +2.6", "23 +1.5", "18 +2.0",
        "MIST COIL", "5.5", "50",
        "Abaddon releases a coil of deathly mist that can damage an enemy unit or heal a friendly unit at the cost of some of Abaddon's health.",
        "APHOTIC SHIELD", "12/10/8/6", "85/100/115/130",
        "Summons dark energies around an ally unit, creating a shield that absorbs a set amount of damage before expiring. When the shield is destroyed it will burst and deal damage equal to the amount it could absorb to an area around it. Removes certain types of negative buffs and stuns on cast.",
        "CURSE OF AVERNUS", "0", "0",
        "Abaddon strikes an enemy, slowing the target's movement speed. If the target gets hit 4.0 times, they become affected by a chilling curse causing them to be silenced and slowed, and all attacks against them gain an attack speed boost.",
        "BORROWED TIME", "60/50/40", "0/0/0",
        "When activated, all damage dealt to you will heal instead of harm. Most negative buffs will also be removed. If the ability is not on cooldown, it will automatically activate if your health falls below 400.0."

    )
    )
}

@Composable
fun HeroTabScreen2(data: HeroInfoData) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(Color.Black)
            .padding(20.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                painter = painterResource(
                    id = when(data.imageId) {
                        1 -> R.drawable.abaddon_1_
                        2 -> R.drawable.alchemist_1_
                        3 -> R.drawable.ancient_apparition_1_
                        4 -> R.drawable.antimage_1_
                        5 -> R.drawable.arc_warden_1_
                        6 -> R.drawable.axe_1_
                        7 -> R.drawable.bane_1_
                        8 -> R.drawable.batrider_1_
                        9 -> R.drawable.bloodseeker_1_
                        10 -> R.drawable.bounty_hunter_1_
                        11 -> R.drawable.brewmaster_1_
                        12 -> R.drawable.bristleback_1_
                        13 -> R.drawable.broodmother_1_
                        14 -> R.drawable.centaur_1_
                        15 -> R.drawable.chaos_knight_1_
                        else -> R.drawable.axe_1_
                    }),
                contentDescription = "Hero Image",
                modifier = Modifier
                    .size(100.dp)
            )
            
            Spacer(modifier = Modifier.width(25.dp))
            
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Box {
                    Text(
                        text = data.heroName,
                        color = Color.White,
                        fontSize = 16.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        maxLines = 2,
                    )

                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.padding(top = 30.dp)
                    ) {
                        Text(
                            text = "ROLES",
                            color = Color.White,
                            fontSize = 14.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Thin,
                        )

                        Text(
                            text = "|",
                            color = Color.White,
                            fontSize = 14.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Thin,
                            modifier = Modifier.padding(start = 5.dp, end = 5.dp)
                        )

                        Text(
                            text = "STATS",
                            color = Color.White,
                            fontSize = 14.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Thin
                        )

                        Text(
                            text = "|",
                            color = Color.White,
                            fontSize = 14.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Thin,
                            modifier = Modifier.padding(start = 5.dp, end = 5.dp)
                        )

                        Text(
                            text = "ATTRIBUTES",
                            color = Color.White,
                            fontSize = 14.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Thin
                        )
                    }
                }
            }
        }

        Divider(
            color = colorResource(id = R.color.platinum),
            thickness = 1.dp,
            modifier = Modifier.padding(top = 10.dp, bottom = 20.dp)
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text = "ROLES",
                color = Color.White,
                fontSize = 18.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold
            )
            
            Row(horizontalArrangement = Arrangement.Start) {

                Column(horizontalAlignment = Alignment.Start) {
                    Text(
                        text = "Carry",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Thin
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    CustomProgressBar(data.roleCarry)
                }

                Spacer(modifier = Modifier.width(10.dp))

                Column(horizontalAlignment = Alignment.Start) {
                    Text(
                        text = "Support",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Thin
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    CustomProgressBar(data.roleSupport)
                }

                Spacer(modifier = Modifier.width(10.dp))

                Column(horizontalAlignment = Alignment.Start) {
                    Text(
                        text = "Nuker",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Thin
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    CustomProgressBar(data.roleNuker)
                }
            }

            Row(horizontalArrangement = Arrangement.Start) {

                Column(horizontalAlignment = Alignment.Start) {
                    Text(
                        text = "Disabler",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Thin
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    CustomProgressBar(data.roleDisabler)
                }

                Spacer(modifier = Modifier.width(10.dp))

                Column(horizontalAlignment = Alignment.Start) {
                    Text(
                        text = "Jungler",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Thin
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    CustomProgressBar(data.roleJungler)
                }

                Spacer(modifier = Modifier.width(10.dp))

                Column(horizontalAlignment = Alignment.Start) {
                    Text(
                        text = "Durable",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Thin
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    CustomProgressBar(data.roleDurable)
                }
            }

            Row(horizontalArrangement = Arrangement.Start) {

                Column(horizontalAlignment = Alignment.Start) {
                    Text(
                        text = "Escape",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Thin
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    CustomProgressBar(data.roleEscape)
                }

                Spacer(modifier = Modifier.width(10.dp))

                Column(horizontalAlignment = Alignment.Start) {
                    Text(
                        text = "Pusher",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Thin
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    CustomProgressBar(data.rolePusher)
                }

                Spacer(modifier = Modifier.width(10.dp))

                Column(horizontalAlignment = Alignment.Start) {
                    Text(
                        text = "Initiator",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Thin
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    CustomProgressBar(data.roleInitiator)
                }
            }
        }

        Divider(
            color = colorResource(id = R.color.platinum),
            thickness = 1.dp,
            modifier = Modifier.padding(top = 20.dp, bottom = 20.dp)
        )
        
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(start = 10.dp, end = 10.dp)
        ) {
            Text(
                text = "STATS",
                color = Color.White,
                fontSize = 18.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold
            )

            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_movement_speed),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(
                            text = data.statMovementSpeed,
                            fontSize = 14.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Normal,
                            color = Color.White
                        )
                    }

                    Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_vision),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(
                            text = data.statVision,
                            fontSize = 14.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Normal,
                            color = Color.White
                        )
                    }

                    Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_armor),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(
                            text = data.statArmor,
                            fontSize = 14.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Normal,
                            color = Color.White
                        )
                    }
                }

                Spacer(modifier = Modifier.width(50.dp))

                Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_damage),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(
                            text = data.statAttackDamage,
                            fontSize = 14.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Normal,
                            color = Color.White
                        )
                    }

                    Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_attack_time),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(
                            text = data.statAttackTime,
                            fontSize = 14.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Normal,
                            color = Color.White
                        )
                    }

                    Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_attack_range),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(
                            text = data.statAttackRange,
                            fontSize = 14.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Normal,
                            color = Color.White
                        )
                    }
                }
            }




        }

        Divider(
            color = colorResource(id = R.color.platinum),
            thickness = 1.dp,
            modifier = Modifier.padding(top = 20.dp, bottom = 20.dp)
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(start = 10.dp, end = 10.dp)
        ) {
            Text(
                text = "ATTRIBUTES",
                color = Color.White,
                fontSize = 18.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold
            )

            Box(contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(id = R.drawable.hero_strength_ic),
                    contentDescription = null,
                    modifier =Modifier.size(40.dp)
                )

                Text(
                    text = "Strength",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.End,
                    modifier =Modifier.padding(end = 165.dp)
                )

                Text(
                    text = data.attributeStrength,
                    color = Color.White,
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Start,
                    modifier =Modifier.padding(start = 150.dp)
                )
            }

            Box(contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(id = R.drawable.hero_agility_ic),
                    contentDescription = null,
                    modifier =Modifier.size(40.dp)
                )

                Text(
                    text = "Agility",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.End,
                    modifier =Modifier.padding(end = 150.dp)
                )

                Text(
                    text = data.attributeAgility,
                    color = Color.White,
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Start,
                    modifier =Modifier.padding(start = 150.dp)
                )
            }

            Box(contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(id = R.drawable.hero_intelligence_ic),
                    contentDescription = null,
                    modifier =Modifier.size(40.dp)
                )

                Text(
                    text = "Intelligence",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.End,
                    modifier =Modifier.padding(end = 185.dp)
                )

                Text(
                    text = data.attributeIntelligence,
                    color = Color.White,
                    fontSize = 14.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Start,
                    modifier =Modifier.padding(start = 150.dp)
                )
            }

        }
    } 
}

@Composable
fun CustomProgressBar(per: Int) {
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val percentage: Int = per
        
        Box(modifier = Modifier
            .clip(RectangleShape)
            .height(15.dp)
            .background(
                Color.White
            )
            .width(100.dp)
        ) {
            Box(
                modifier = Modifier
                    .clip(RectangleShape)
                    .height(15.dp)
                    .background(
                        Brush.horizontalGradient(
                            listOf(Color(0xFFFFCD38), Color.Yellow)
                        )
                    )
                    .width(100.dp * percentage / 100)
            )
        }
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
        1,
        25, 75, 0,
        0, 0, 75,
        0, 0, 0,
        "325", "50-60", "1800/800",
        "1.7", "2.8", "150",
        "22 +2.6", "23 +1.5", "18 +2.0",
        "MIST COIL", "5.5", "50",
        "Abaddon releases a coil of deathly mist that can damage an enemy unit or heal a friendly unit at the cost of some of Abaddon's health.",
        "APHOTIC SHIELD", "12/10/8/6", "85/100/115/130",
        "Summons dark energies around an ally unit, creating a shield that absorbs a set amount of damage before expiring. When the shield is destroyed it will burst and deal damage equal to the amount it could absorb to an area around it. Removes certain types of negative buffs and stuns on cast.",
        "CURSE OF AVERNUS", "0", "0",
        "Abaddon strikes an enemy, slowing the target's movement speed. If the target gets hit 4.0 times, they become affected by a chilling curse causing them to be silenced and slowed, and all attacks against them gain an attack speed boost.",
        "BORROWED TIME", "60/50/40", "0/0/0",
        "When activated, all damage dealt to you will heal instead of harm. Most negative buffs will also be removed. If the ability is not on cooldown, it will automatically activate if your health falls below 400.0."

    )
    )
}

@Composable
fun HeroTabScreen3(data: HeroInfoData) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(Color.Black)
            .padding(20.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                painter = painterResource(
                    id = when(data.imageId) {
                        1 -> R.drawable.abaddon_1_
                        2 -> R.drawable.alchemist_1_
                        3 -> R.drawable.ancient_apparition_1_
                        4 -> R.drawable.antimage_1_
                        5 -> R.drawable.arc_warden_1_
                        6 -> R.drawable.axe_1_
                        7 -> R.drawable.bane_1_
                        8 -> R.drawable.batrider_1_
                        9 -> R.drawable.bloodseeker_1_
                        10 -> R.drawable.bounty_hunter_1_
                        11 -> R.drawable.brewmaster_1_
                        12 -> R.drawable.bristleback_1_
                        13 -> R.drawable.broodmother_1_
                        14 -> R.drawable.centaur_1_
                        15 -> R.drawable.chaos_knight_1_
                        else -> R.drawable.abaddon_1_
                    }),
                contentDescription = "Hero Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(16.dp))
            )

            Spacer(modifier = Modifier.width(25.dp))

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Box {
                    Text(
                        text = data.heroName,
                        color = Color.White,
                        fontSize = 16.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        maxLines = 2
                    )

                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.padding(top = 30.dp)
                    ) {
                        Text(
                            text = "ABILITIES",
                            color = Color.White,
                            fontSize = 14.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Thin,
                        )
                    }
                }
            }
        }

        Divider(
            color = colorResource(id = R.color.platinum),
            thickness =  1.dp,
            modifier = Modifier.padding(top = 10.dp, bottom = 20.dp)
        )

        Text(
            text = "ABILITIES",
            color = Color.White,
            fontSize = 18.sp,
            fontFamily = Poppins,
            fontWeight = FontWeight.Bold
        )

        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
            ) {
                Image(
                    painter = painterResource(
                        id = when(data.imageId) {
                            1 -> R.drawable.abaddon_skill_1
                            2 -> R.drawable.alchemist_skill_1
                            3 -> R.drawable.ancient_skill_1
                            4 -> R.drawable.antimage_skill_1
                            5 -> R.drawable.arc_skill_1
                            6 -> R.drawable.axe_skill_1
                            7 -> R.drawable.bane_skill_1
                            8 -> R.drawable.batrider_skill_1
                            9 -> R.drawable.bloodseeker_skill_1
                            10 -> R.drawable.bounty_hunter_skill_1
                            11 -> R.drawable.brewmaster_skill_1
                            12 -> R.drawable.bristleback_skill_1
                            13 -> R.drawable.broodmother_skill_1
                            14 -> R.drawable.centaur_skill_1
                            15 -> R.drawable.chaos_knight_skill_1
                            else -> R.drawable.dota2_logo_ic
                        }),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .border(
                            BorderStroke(1.dp, colorResource(id = R.color.yellow)),
                            shape = CircleShape
                        )
                        .clip(CircleShape)
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = data.skillName1,
                        color = Color.White,
                        fontSize = 18.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Medium,
                        maxLines = 1
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.attack_cd_icon),
                            contentDescription = null,
                            modifier = Modifier.size(10.dp)
                        )

                        Spacer(modifier = Modifier.width(5.dp))

                        Text(
                            text = data.skillName1Cd,
                            color = Color.White,
                            fontSize = 10.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Thin
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Image(
                            painter = painterResource(id = R.drawable.mana_cost_icon),
                            contentDescription = null,
                            modifier = Modifier.size(10.dp)
                        )

                        Spacer(modifier = Modifier.width(5.dp))

                        Text(
                            text = data.skillName1Mana,
                            color = Color.White,
                            fontSize = 10.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Thin
                        )
                    }
                }
            }

            Text(
                text = data.skillName1Description,
                color = Color.White,
                fontSize = 12.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(start = 10.dp, end = 10.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = painterResource(
                        id = when(data.imageId) {
                            1 -> R.drawable.abaddon_skill_2
                            2 -> R.drawable.alchemist_skill_2
                            3 -> R.drawable.ancient_skill_2
                            4 -> R.drawable.antimage_skill_2
                            5 -> R.drawable.arc_skill_2
                            6 -> R.drawable.axe_skill_2
                            7 -> R.drawable.bane_skill_2
                            8 -> R.drawable.batrider_skill_2
                            9 -> R.drawable.bloodseeker_skill_2
                            10 -> R.drawable.bounty_hunter_skill_2
                            11 -> R.drawable.brewmaster_skill_2
                            12 -> R.drawable.bristleback_skill_2
                            13 -> R.drawable.broodmother_skill_2
                            14 -> R.drawable.centaur_skill_2
                            15 -> R.drawable.chaos_knight_skill_2
                            else -> R.drawable.dota2_logo_ic
                        }),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .border(
                            BorderStroke(1.dp, colorResource(id = R.color.yellow)),
                            shape = CircleShape
                        )
                        .clip(CircleShape)
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = data.skillName2,
                        color = Color.White,
                        fontSize = 18.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Medium,
                        maxLines = 1
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.attack_cd_icon),
                            contentDescription = null,
                            modifier = Modifier.size(10.dp)
                        )

                        Spacer(modifier = Modifier.width(5.dp))

                        Text(
                            text = data.skillName2Cd,
                            color = Color.White,
                            fontSize = 10.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Thin
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Image(
                            painter = painterResource(id = R.drawable.mana_cost_icon),
                            contentDescription = null,
                            modifier = Modifier.size(10.dp)
                        )

                        Spacer(modifier = Modifier.width(5.dp))

                        Text(
                            text = data.skillName2Mana,
                            color = Color.White,
                            fontSize = 10.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Thin
                        )
                    }
                }
            }

            Text(
                text = data.skillName2Description,
                color = Color.White,
                fontSize = 12.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(start = 10.dp, end = 10.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = painterResource(
                        id = when(data.imageId) {
                            1 -> R.drawable.abaddon_skill_3
                            2 -> R.drawable.alchemist_skill_3
                            3 -> R.drawable.ancient_skill_3
                            4 -> R.drawable.antimage_skill_3
                            5 -> R.drawable.arc_skill_3
                            6 -> R.drawable.axe_skill_3
                            7 -> R.drawable.bane_skill_3
                            8 -> R.drawable.batrider_skill_3
                            9 -> R.drawable.bloodseeker_skill_3
                            10 -> R.drawable.bounty_hunter_skill_3
                            11 -> R.drawable.brewmaster_skill_3
                            12 -> R.drawable.bristleback_skill_3
                            13 -> R.drawable.broodmother_skill_3
                            14 -> R.drawable.centaur_skill_3
                            15 -> R.drawable.chaos_knight_skill_3
                            else -> R.drawable.dota2_logo_ic
                        }),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .border(
                            BorderStroke(1.dp, colorResource(id = R.color.yellow)),
                            shape = CircleShape
                        )
                        .clip(CircleShape)
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = data.skillName3,
                        color = Color.White,
                        fontSize = 18.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Medium,
                        maxLines = 1
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.attack_cd_icon),
                            contentDescription = null,
                            modifier = Modifier.size(10.dp)
                        )

                        Spacer(modifier = Modifier.width(5.dp))

                        Text(
                            text = data.skillName3Cd,
                            color = Color.White,
                            fontSize = 10.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Thin
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Image(
                            painter = painterResource(id = R.drawable.mana_cost_icon),
                            contentDescription = null,
                            modifier = Modifier.size(10.dp)
                        )

                        Spacer(modifier = Modifier.width(5.dp))

                        Text(
                            text = data.skillName3Mana,
                            color = Color.White,
                            fontSize = 10.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Thin
                        )
                    }
                }
            }

            Text(
                text = data.skillName3Description,
                color = Color.White,
                fontSize = 12.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(start = 10.dp, end = 10.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = painterResource(
                        id = when(data.imageId) {
                            1 -> R.drawable.abaddon_skill_4
                            2 -> R.drawable.alchemist_skill_4
                            3 -> R.drawable.ancient_skill_4
                            4 -> R.drawable.antimage_skill_4
                            5 -> R.drawable.arc_skill_4
                            6 -> R.drawable.axe_skill_4
                            7 -> R.drawable.bane_skill_4
                            8 -> R.drawable.batrider_skill_4
                            9 -> R.drawable.bloodseeker_skill_4
                            10 -> R.drawable.bounty_hunter_skill_4
                            11 -> R.drawable.brewmaster_skill_4
                            12 -> R.drawable.bristleback_skill_4
                            13 -> R.drawable.broodmother_skill_4
                            14 -> R.drawable.centaur_skill_4
                            15 -> R.drawable.chaos_knight_skill_4
                            else -> R.drawable.dota2_logo_ic
                        }),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .border(
                            BorderStroke(1.dp, colorResource(id = R.color.yellow)),
                            shape = CircleShape
                        )
                        .clip(CircleShape)
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = data.skillName4,
                        color = Color.White,
                        fontSize = 18.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Medium,
                        maxLines = 1
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.attack_cd_icon),
                            contentDescription = null,
                            modifier = Modifier.size(10.dp)
                        )

                        Spacer(modifier = Modifier.width(5.dp))

                        Text(
                            text = data.skillName4Cd,
                            color = Color.White,
                            fontSize = 10.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Thin
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Image(
                            painter = painterResource(id = R.drawable.mana_cost_icon),
                            contentDescription = null,
                            modifier = Modifier.size(10.dp)
                        )

                        Spacer(modifier = Modifier.width(5.dp))

                        Text(
                            text = data.skillName4Mana,
                            color = Color.White,
                            fontSize = 10.sp,
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Thin
                        )
                    }
                }
            }

            Text(
                text = data.skillName4Description,
                color = Color.White,
                fontSize = 12.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(start = 10.dp, end = 10.dp)
            )

        }
    }
}

@Composable
@Preview (showBackground = true, showSystemUi = true)
fun HeroTabScreen3Prev() {
    HeroTabScreen3(HeroInfoData(
        1,
        "ABADDON",
        "SHIELDS HIS ALLIES OR HIMSELF FROM ATTACKS",
        "Able to transform enemy attacks into self-healing, Abaddon can survive almost any assault. Shielding allies and launching his double-edged coil at a friend or foe, he is always ready to ride into the thick of battle.",
        1,
        "Strength",
        1,
        "MELEE",
        1,
        25, 75, 0,
        0, 0, 75,
        0, 0, 0,
        "325", "50-60", "1800/800",
        "1.7", "2.8", "150",
        "22 +2.6", "23 +1.5", "18 +2.0",
        "MIST COIL", "5.5", "50",
        "Abaddon releases a coil of deathly mist that can damage an enemy unit or heal a friendly unit at the cost of some of Abaddon's health.",
        "APHOTIC SHIELD", "12/10/8/6", "85/100/115/130",
        "Summons dark energies around an ally unit, creating a shield that absorbs a set amount of damage before expiring. When the shield is destroyed it will burst and deal damage equal to the amount it could absorb to an area around it. Removes certain types of negative buffs and stuns on cast.",
        "CURSE OF AVERNUS", "0", "0",
        "Abaddon strikes an enemy, slowing the target's movement speed. If the target gets hit 4.0 times, they become affected by a chilling curse causing them to be silenced and slowed, and all attacks against them gain an attack speed boost.",
        "BORROWED TIME", "60/50/40", "0/0/0",
        "When activated, all damage dealt to you will heal instead of harm. Most negative buffs will also be removed. If the ability is not on cooldown, it will automatically activate if your health falls below 400.0.",
    )
    )
}


