package com.example.dota2dict

class GeneralUpdateDataSource {
    fun loadGeneralUpdates(): List<GeneralUpdatesData> {
        return listOf<GeneralUpdatesData>(
            GeneralUpdatesData(R.string.text1),
            GeneralUpdatesData(R.string.text2),
            GeneralUpdatesData(R.string.text3),
            GeneralUpdatesData(R.string.text4),
            GeneralUpdatesData(R.string.text5),
            GeneralUpdatesData(R.string.text6),
            GeneralUpdatesData(R.string.text7),
            GeneralUpdatesData(R.string.text8),
            GeneralUpdatesData(R.string.text9),
            GeneralUpdatesData(R.string.text10),
            GeneralUpdatesData(R.string.text11),
            GeneralUpdatesData(R.string.text12),
            GeneralUpdatesData(R.string.text13),
            GeneralUpdatesData(R.string.text14),
            GeneralUpdatesData(R.string.text15),
            GeneralUpdatesData(R.string.text16),
            GeneralUpdatesData(R.string.text17),
            GeneralUpdatesData(R.string.text18),
            GeneralUpdatesData(R.string.text19)
        )
    }
}

class ItemUpdateDataSource {
    fun loadItemUpdates(): List<ItemUpdatesData> {
        return listOf<ItemUpdatesData> (
            ItemUpdatesData(R.string.item1, R.string.item_description1, R.drawable.bracer_icon),
            ItemUpdatesData(R.string.item2, R.string.item_description2, R.drawable.soul_ring_icon),
            ItemUpdatesData(R.string.item3, R.string.item_description3, R.drawable.spirit_vessel_icon),
            ItemUpdatesData(R.string.item4, R.string.item_description4, R.drawable.urn_of_shadows_icon),
            ItemUpdatesData(R.string.item5, R.string.item_description5, R.drawable.wraith_band_icon)
                )
    }
}

class NeutralItemUpdateDataSource {
    fun loadNeutralItemUpdates(): List<NeutralItemUpdatesData> {
        return  listOf<NeutralItemUpdatesData> (
            NeutralItemUpdatesData(R.string.neutral_item1, R.string.neutral_item_description1, R.drawable.occult_bracelet_icon),
            NeutralItemUpdatesData(R.string.neutral_item2, R.string.neutral_item_description2, R.drawable.specialists_array_icon),
            NeutralItemUpdatesData(R.string.neutral_item3, R.string.neutral_item_description3, R.drawable.ogre_seal_totem_icon)
                )
    }
}

class AccessoriesItemDataSource {
    fun loadAccessoriesItemDataSource(): List<ItemsAccessoriesData> {
        return listOf<ItemsAccessoriesData> (
            ItemsAccessoriesData(R.string.accessories_boots_of_travel, "2,500", R.drawable.boots_of_travel_1_icon),
            ItemsAccessoriesData(R.string.accessories_bracer, "505", R.drawable.bracer_icon),
            ItemsAccessoriesData(R.string.accessories_falcon_blade, "1,125", R.drawable.falcon_blade_icon),
            ItemsAccessoriesData(R.string.accessories_hand_of_midas, "2,200", R.drawable.hand_of_midas_icon),
            ItemsAccessoriesData(R.string.accessories_helm_of_dominator, "2,400", R.drawable.helm_of_the_dominator_icon),
            ItemsAccessoriesData(R.string.accessories_helm_of_the_overload, "6,175", R.drawable.helm_of_the_overlord_icon),
            ItemsAccessoriesData(R.string.accessories_magic_wand, "450", R.drawable.magic_wand_icon),
            ItemsAccessoriesData(R.string.accessories_mask_of_madness, "1,775", R.drawable.mask_of_madness_icon),
            ItemsAccessoriesData(R.string.accessories_moon_shard, "4,000", R.drawable.moon_shard_icon),
            ItemsAccessoriesData(R.string.accessories_null_talisman, "505", R.drawable.null_talisman_icon),
            ItemsAccessoriesData(R.string.accessories_oblivion_staff, "1,500", R.drawable.oblivion_staff_icon),
            ItemsAccessoriesData(R.string.accessories_orb_of_corrosion, "925", R.drawable.orb_of_corrosion_icon),
            ItemsAccessoriesData(R.string.accessories_perseverance, "1,650", R.drawable.perseverance_icon),
            ItemsAccessoriesData(R.string.accessories_phase_boots, "1,500", R.drawable.phase_boots_icon),
            ItemsAccessoriesData(R.string.accessories_power_threads, "1,400", R.drawable.power_treads_icon),
            ItemsAccessoriesData(R.string.accessories_soul_ring, "855", R.drawable.soul_ring_icon),
            ItemsAccessoriesData(R.string.accessories_wraith_band, "505", R.drawable.wraith_band_icon)
        )
    }
}

object AccessoriesDataSource {
    val accessories = listOf (
        ItemsAccessoriesData(R.string.accessories_boots_of_travel, "2,500", R.drawable.boots_of_travel_1_icon),
        ItemsAccessoriesData(R.string.accessories_bracer, "505", R.drawable.bracer_icon),
        ItemsAccessoriesData(R.string.accessories_falcon_blade, "1,125", R.drawable.falcon_blade_icon),
        ItemsAccessoriesData(R.string.accessories_hand_of_midas, "2,200", R.drawable.hand_of_midas_icon),
        ItemsAccessoriesData(R.string.accessories_helm_of_dominator, "2,400", R.drawable.helm_of_the_dominator_icon),
        ItemsAccessoriesData(R.string.accessories_helm_of_the_overload, "6,175", R.drawable.helm_of_the_overlord_icon),
        ItemsAccessoriesData(R.string.accessories_magic_wand, "450", R.drawable.magic_wand_icon),
        ItemsAccessoriesData(R.string.accessories_mask_of_madness, "1,775", R.drawable.mask_of_madness_icon),
        ItemsAccessoriesData(R.string.accessories_moon_shard, "4,000", R.drawable.moon_shard_icon),
        ItemsAccessoriesData(R.string.accessories_null_talisman, "505", R.drawable.null_talisman_icon),
        ItemsAccessoriesData(R.string.accessories_oblivion_staff, "1,500", R.drawable.oblivion_staff_icon),
        ItemsAccessoriesData(R.string.accessories_orb_of_corrosion, "925", R.drawable.orb_of_corrosion_icon),
        ItemsAccessoriesData(R.string.accessories_perseverance, "1,650", R.drawable.perseverance_icon),
        ItemsAccessoriesData(R.string.accessories_phase_boots, "1,500", R.drawable.phase_boots_icon),
        ItemsAccessoriesData(R.string.accessories_power_threads, "1,400", R.drawable.power_treads_icon),
        ItemsAccessoriesData(R.string.accessories_soul_ring, "855", R.drawable.soul_ring_icon),
        ItemsAccessoriesData(R.string.accessories_wraith_band, "505", R.drawable.wraith_band_icon)
        )
}
