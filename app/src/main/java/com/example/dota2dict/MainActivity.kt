package com.example.dota2dict

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dota2dict.ui.theme.Dota2DictTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomePage()
        }
    }
}




@Composable
fun HomePage() {
    Text(text = "Hello World")
}

@Preview(name = "Home Page", showBackground = true, showSystemUi = true)
@Composable
fun HomePagePreview() {
    Dota2DictTheme {
        HomePage()
    }
}



@Composable
fun HeroesPage() {

}

@Preview(name = "Heroes Page", showBackground = true, showSystemUi = true)
@Composable
fun HeroesPagePreview() {
    Dota2DictTheme {
        HeroesPage()
    }
}



@Composable
fun ItemsPage() {

}

@Preview(name = "Items Page", showBackground = true, showSystemUi = true)
@Composable
fun ItemsPagePreview() {
    Dota2DictTheme {
        ItemsPage()
    }
}



@Composable
fun SettingsPage() {

}

@Preview(name = "Settings Page", showBackground = true, showSystemUi = true)
@Composable
fun SettingsPagePreview() {
    Dota2DictTheme {
        SettingsPage()
    }
}