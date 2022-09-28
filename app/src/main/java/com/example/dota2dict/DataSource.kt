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

object SupportDataSource {
    val support = listOf (
        ItemsSupportData(R.string.support_arcane_boots, "1,300", R.drawable.arcane_boots_icon),
        ItemsSupportData(R.string.support_boots_of_bearing, "4,125", R.drawable.boots_of_bearing_icon),
        ItemsSupportData(R.string.support_buckler, "425", R.drawable.buckler_icon),
        ItemsSupportData(R.string.support_drum_of_endurance, "1,700", R.drawable.drum_of_endurance_icon),
        ItemsSupportData(R.string.support_guardian_greaves, "5,150", R.drawable.guardian_greaves_icon),
        ItemsSupportData(R.string.support_headdress, "425", R.drawable.headdress_icon),
        ItemsSupportData(R.string.support_holy_locket, "2,400", R.drawable.holy_locket_icon),
        ItemsSupportData(R.string.support_medallion_of_courage, "1,025", R.drawable.medallion_of_courage_icon),
        ItemsSupportData(R.string.support_mekansm, "1,775", R.drawable.mekansm_icon),
        ItemsSupportData(R.string.support_pipe_of_insight, "3,475", R.drawable.pipe_of_insight_icon),
        ItemsSupportData(R.string.support_ring_of_basilius, "425", R.drawable.ring_of_basilius_29_icon),
        ItemsSupportData(R.string.support_spirit_vessel, "2,980", R.drawable.spirit_vessel_icon),
        ItemsSupportData(R.string.support_tranquil_boots, "925", R.drawable.tranquil_boots_29_icon),
        ItemsSupportData(R.string.support_urn_of_shadows, "880", R.drawable.urn_of_shadows_icon),
        ItemsSupportData(R.string.support_vladimrs_offering, "2,450", R.drawable.vladmir_27s_offering_icon),
        ItemsSupportData(R.string.support_wraith_pact, "4,050", R.drawable.wraith_pact_icon),
    )
}

object MagicalDataSource {
    val magical = listOf (
        ItemsMagicalData(R.string.magical_aether_lens, "2,275", R.drawable.aether_lens_icon),
        ItemsMagicalData(R.string.magical_aghanims_blessing, "5,800", R.drawable.aghanim_27s_blessing_icon),
        ItemsMagicalData(R.string.magical_aghanims_scpeter, "4,200", R.drawable.aghanim_27s_scepter_icon),
        ItemsMagicalData(R.string.magical_dagon, "2,700", R.drawable.dagon_1_icon),
        ItemsMagicalData(R.string.magical_euls_scepter_of_divinity, "2,725", R.drawable.eul_27s_scepter_of_divinity_icon),
        ItemsMagicalData(R.string.magical_force_staff, "2,200", R.drawable.force_staff_icon),
        ItemsMagicalData(R.string.magical_gleipnir, "6,150", R.drawable.gleipnir_icon),
        ItemsMagicalData(R.string.magical_glimmer_cape, "1,950", R.drawable.glimmer_cape_icon),
        ItemsMagicalData(R.string.magical_octarine_core, "5,275", R.drawable.octarine_core_icon),
        ItemsMagicalData(R.string.magical_orchid_malevolence, "3,475", R.drawable.orchid_malevolence_icon),
        ItemsMagicalData(R.string.magical_refresher_orb, "5,000", R.drawable.refresher_orb_icon),
        ItemsMagicalData(R.string.magical_revenants_brooch, "6,200", R.drawable.revenant_27s_brooch_icon),
        ItemsMagicalData(R.string.magical_rod_of_atos, "2,750", R.drawable.rod_of_atos_icon),
        ItemsMagicalData(R.string.magical_scythe_of_vsye, "5,675", R.drawable.scythe_of_vyse_icon),
        ItemsMagicalData(R.string.magical_solar_crest, "2,625", R.drawable.solar_crest_icon),
        ItemsMagicalData(R.string.magical_veil_of_discord, "1,525", R.drawable.veil_of_discord_icon),
        ItemsMagicalData(R.string.magical_wind_waker, "6,825", R.drawable.wind_waker_icon),
        ItemsMagicalData(R.string.magical_witch_blade, "2,600", R.drawable.witch_blade_icon)
    )
}
