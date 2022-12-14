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

data class ItemsSupportData(
    @StringRes val itemName: Int,
    val itemCost: String,
    @DrawableRes val itemImage: Int
)

data class ItemsMagicalData(
    @StringRes val itemName: Int,
    val itemCost: String,
    @DrawableRes val itemImage: Int
)

data class ItemsArmorData(
    @StringRes val itemName: Int,
    val itemCost: String,
    @DrawableRes val itemImage: Int
)

data class ItemsWeaponData(
    @StringRes val itemName: Int,
    val itemCost: String,
    @DrawableRes val itemImage: Int
)

data class ItemsArtifactData(
    @StringRes val itemName: Int,
    val itemCost: String,
    @DrawableRes val itemImage: Int
)

data class HeroesProfilePictureData(
    val heroImage: Int,
    @StringRes val heroName: Int
)

data class HeroInfoData(
    val imageId: Int,
    val heroName: String,
    val heroDescription: String,
    val heroHistory: String,
    val typeImage: Int,
    val heroType: String,
    val attackTypeImage: Int,
    val attackType: String,
    val complexityImage: Int,
    val roleCarry: Int,
    val roleSupport: Int,
    val roleNuker: Int,
    val roleDisabler: Int,
    val roleJungler: Int,
    val roleDurable: Int,
    val roleEscape: Int,
    val rolePusher: Int,
    val roleInitiator: Int,
    val statMovementSpeed: String,
    val statAttackDamage: String,
    val statVision: String,
    val statAttackTime: String,
    val statArmor: String,
    val statAttackRange: String,
    val attributeStrength: String,
    val attributeAgility: String,
    val attributeIntelligence: String,
    val skillName1: String,
    val skillName1Cd: String,
    val skillName1Mana: String,
    val skillName1Description: String,
    val skillName2: String,
    val skillName2Cd: String,
    val skillName2Mana: String,
    val skillName2Description: String,
    val skillName3: String,
    val skillName3Cd: String,
    val skillName3Mana: String,
    val skillName3Description: String,
    val skillName4: String,
    val skillName4Cd: String,
    val skillName4Mana: String,
    val skillName4Description: String
)





