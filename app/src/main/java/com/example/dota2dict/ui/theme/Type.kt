package com.example.dota2dict.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.dota2dict.R

// Set of Material typography styles to start with
val Poppins = FontFamily(
    Font(R.font.poppins_thin, FontWeight.Thin),
    Font(R.font.poppins_light, FontWeight.Light),
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_bold, FontWeight.Bold),
    Font(R.font.poppins_black, FontWeight.Black)
)

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Black,
        fontSize = 4.sp
    ),

    h2 = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Bold,
    ),

    h3 = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Normal,
    ),

    h4 = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Light,
    ),

    h5 = TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Thin,
    )
)


    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */