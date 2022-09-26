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
fun ItemCard(itemsData: ItemsData): Unit {
     Card (
        shape = RoundedCornerShape(5.dp),
        backgroundColor = Color.Black)
        {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = CenterHorizontally,
                modifier = Modifier.background(Color.Black))

                {
                    Image(
                        painter = painterResource(itemsData.itemImage),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier.size(100.dp))

                    Text(
                        text = stringResource(itemsData.itemName),
                        fontFamily = Poppins,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 10.sp,
                        color = Color.White)
                }
        }
}

/*@Preview (showBackground = true)
@Composable
fun ItemCardPreview() {
    ItemCard()
}*/
