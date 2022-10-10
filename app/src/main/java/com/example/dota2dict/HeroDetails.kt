package com.example.dota2dict

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HeroDetails(data: HeroInfoData) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(
                id = when(data.imageId) {
                    1 -> R.drawable.abaddon_profile
                    2 -> R.drawable.alchemist_profile
                    3 -> R.drawable.ancient_apparition_profile
                    4 -> R.drawable.antimage_profile
                    5 -> R.drawable.arc_warden_profile
                    else -> R.drawable.abaddon_profile
                }),
            contentDescription = "Profile Image",
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp)),
            alignment = Alignment.Center
        )

        Spacer(modifier = Modifier.padding(1.dp))

        Text(
            text = data.heroDescription,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(20.dp),
            color = Color.Black,
            fontSize =  16.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Justify
        )
    }
}