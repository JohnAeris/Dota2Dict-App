package com.example.dota2dict

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.dota2dict.ui.theme.Dota2DictTheme
import com.example.dota2dict.ui.theme.Poppins
import com.google.gson.Gson

@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}


@Composable
fun TopBar() {
    TopAppBar (
        backgroundColor = colorResource(R.color.black),
        contentColor = colorResource(R.color.white))

    {
        Image(
            painter = painterResource(R.drawable.dota2_logo),
            contentDescription = "Logo",
            modifier = Modifier
                .size(60.dp)
                .padding(start = 20.dp, top = 10.dp))

        Spacer(modifier = Modifier.width(5.dp))

        Text(
            text = stringResource(R.string.app_name),
            fontFamily = Poppins,
            fontSize = 32.sp,
            fontWeight = FontWeight.Black,
            modifier = Modifier
                .background(colorResource(R.color.black))
                .padding(start = 10.dp, top = 10.dp))
    }
}

@Preview(name = "Top Bar", showBackground = true)
@Composable
fun TopBarPreview() {
    Dota2DictTheme {
        TopBar()
    }
}

@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Heroes,
        NavigationItem.Items,
    )
    BottomNavigation(
        backgroundColor = colorResource(R.color.black)
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(painterResource(item.icon),
                        modifier = Modifier.size(30.dp),
                        contentDescription = item.title)},
                label = { Text(text = item.title)},
                selectedContentColor = colorResource(R.color.violet),
                unselectedContentColor = colorResource(R.color.violet).copy(0.4f),
                alwaysShowLabel = true,
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }

                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomNavigationBar(navController) },
        content = { padding ->
            Box(modifier = Modifier.padding(padding)) {
                Navigation(navController = navController)
        }},
        backgroundColor = colorResource(R.color.black)
    )
}

@ExperimentalFoundationApi
@Preview (name = "Main Screen", showBackground = true, showSystemUi = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}

@ExperimentalFoundationApi
@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = NavigationItem.Home.route) {
        composable(NavigationItem.Home.route) {
            HomePageScreen()
        }
        composable(NavigationItem.Heroes.route) {
            NavigationHero()
        }
        composable(NavigationItem.Items.route) {
            ItemsPageScreen()
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun NavigationHero() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavigationScreen.HeroesPageScreen.route) {
        composable(route = NavigationScreen.HeroesPageScreen.route) {
            HeroesPageScreen(navController = navController)
        }
        composable(route = NavigationScreen.HeroDetails.route + "?item={item}",
            arguments = listOf(
                navArgument("item") {
                    type = NavType.StringType
                    nullable = true
                })

            ){
                navBackStackEntry ->
            navBackStackEntry.arguments?.getString("item")?.let { json ->
                val item = Gson().fromJson(json, HeroInfoData::class.java)
                HeroDetails(data = item)
            }

        }
    }
}



