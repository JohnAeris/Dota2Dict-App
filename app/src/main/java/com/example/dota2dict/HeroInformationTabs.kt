package com.example.dota2dict

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState



@OptIn(ExperimentalPagerApi::class)
@Composable
fun HeroTabLayout() {
    val pagerState= rememberPagerState(pageCount = 4)
    
    Column(
        modifier = Modifier.background(Color.Black))
    {

        HeroTabContent(pagerState = pagerState)

    }
}

@Composable
@Preview
fun HeroTabLayoutPrev() {
    HeroTabLayout()
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun HeroTabContent(pagerState: PagerState) {

    HorizontalPager(state = pagerState) {
        page -> when (page) {
            0 -> HeroTabScreen(data = "Page 1")
        
            1 -> HeroTabScreen(data = "Page 2")
        
            2 -> HeroTabScreen(data = "Page 3")
        
            3 -> HeroTabScreen(data = "Page 4")
        }
    }
}

@Composable
fun HeroTabScreen(data: String) {
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

