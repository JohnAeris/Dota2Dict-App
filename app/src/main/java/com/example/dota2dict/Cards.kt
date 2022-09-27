package com.example.dota2dict

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2dict.ui.theme.Poppins

@Composable
fun UpdatesGeneralCard(generalUpdate: GeneralUpdatesData, modifier: Modifier = Modifier): Unit {
    Card(elevation = 4.dp) {
        Box (modifier = Modifier.background(Color.Black)) {
            Row {
                Image(
                    painter = painterResource(R.drawable.ic_bullet_icon),
                    contentDescription = null,
                    modifier = Modifier.padding(start = 20.dp, top = 5.dp))

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

