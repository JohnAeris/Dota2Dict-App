package com.example.dota2dict

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota2dict.ui.theme.Dota2DictTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

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
                .size(70.dp)
                .padding(start = 20.dp, top = 20.dp))

        Spacer(modifier = Modifier.width(5.dp))

        Text(
            text = stringResource(R.string.app_name),
            style = MaterialTheme.typography.h1,
            modifier = Modifier
                .background(colorResource(R.color.black))
                .padding(start = 20.dp, top = 20.dp))
    }
}


@Preview(name = "Top Bar", showBackground = true)
@Composable
fun TopBarPreview() {
    Dota2DictTheme {
        TopBar()
    }
}