package com.example.dota2dict

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class GeneralUpdatesData(@StringRes val stringResourceID: Int)

data class ItemUpdatesData(
    @StringRes val itemName: Int,
    @StringRes val itemDescription: Int,
    @DrawableRes val itemImage: Int)

data class NeutralItemUpdatesData(
    @StringRes val neutralItemName: Int,
    @StringRes val neutralItemDescription: Int,
    @DrawableRes val neutralItemImage: Int
)

data class ItemsAccessoriesData(
    @StringRes val itemName: Int,
    val itemCost: String,
    @DrawableRes val itemImage: Int
)




