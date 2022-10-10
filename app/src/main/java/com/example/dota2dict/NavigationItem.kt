package com.example.dota2dict

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home: NavigationItem("home", R.drawable.ic_home_page_icon, "Home")
    object Heroes: NavigationItem("heroes", R.drawable.ic_hero_page_icon, "Heroes")
    object Items: NavigationItem("items", R.drawable.ic_item_page_icon, "Items")
    object Settings: NavigationItem("settings", R.drawable.ic_setting_page_icon, "Settings")
}

sealed class NavigationScreen(val route: String) {
    object HeroesPageScreen: NavigationScreen("hero_information_screen")
    object HeroDetails: NavigationScreen("hero_details_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}

