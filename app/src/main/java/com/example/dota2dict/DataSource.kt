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
