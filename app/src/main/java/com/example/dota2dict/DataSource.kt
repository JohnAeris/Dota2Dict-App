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

object ArmorDataSource {
    val armor = listOf (
        ItemsArmorData(R.string.armor_aeon_disk, "3,000", R.drawable.aeon_disk_icon),
        ItemsArmorData(R.string.armor_assualt_cuirass, "5,125", R.drawable.assault_cuirass_icon),
        ItemsArmorData(R.string.armor_black_king_bar, "4,050", R.drawable.black_king_bar_icon),
        ItemsArmorData(R.string.armor_blade_mail, "2,100", R.drawable.blade_mail_icon),
        ItemsArmorData(R.string.armor_bloodstone_icon, "4,400", R.drawable.bloodstone_icon),
        ItemsArmorData(R.string.armor_crimson_guard, "3,600", R.drawable.crimson_guard_icon),
        ItemsArmorData(R.string.armor_eternal_shroud, "3,300", R.drawable.eternal_shroud_icon),
        ItemsArmorData(R.string.armor_heart_of_tarrasque, "5,000", R.drawable.heart_of_tarrasque_icon),
        ItemsArmorData(R.string.armor_hood_of_defiance, "1,500", R.drawable.hood_of_defiance_icon),
        ItemsArmorData(R.string.armor_hurricane_pike, "4,450", R.drawable.hurricane_pike_icon),
        ItemsArmorData(R.string.armor_linken_sphere, "4,600", R.drawable.linken_27s_sphere_icon),
        ItemsArmorData(R.string.armor_lotus_orb, "3,850", R.drawable.lotus_orb_icon),
        ItemsArmorData(R.string.armor_manta_style, "4,600", R.drawable.manta_style_icon),
        ItemsArmorData(R.string.armor_shivas_guard, "4,850", R.drawable.shiva_27s_guard_icon),
        ItemsArmorData(R.string.armor_soul_booster, "3,000", R.drawable.soul_booster_icon),
        ItemsArmorData(R.string.armor_vanguard, "1,825", R.drawable.vanguard_icon)
    )
}

object WeaponDataSource {
    val weapon = listOf (
        ItemsWeaponData(R.string.weapon_abyssal_blade, "6,250", R.drawable.abyssal_blade_icon),
        ItemsWeaponData(R.string.weapon_armlet_of_mordiggian, "2,500", R.drawable.armlet_of_mordiggian_29_icon),
        ItemsWeaponData(R.string.weapon_battle_fury, "4,100", R.drawable.battle_fury_icon),
        ItemsWeaponData(R.string.weapon_bloodthorn, "6,800", R.drawable.bloodthorn_icon),
        ItemsWeaponData(R.string.weapon_butterfly, "4,975", R.drawable.butterfly_icon),
        ItemsWeaponData(R.string.weapon_crystalys, "1,950", R.drawable.crystalys_icon),
        ItemsWeaponData(R.string.weapon_daedalus, "5,150", R.drawable.daedalus_icon),
        ItemsWeaponData(R.string.weapon_desolator, "3,500", R.drawable.desolator_icon),
        ItemsWeaponData(R.string.weapon_divine_rapier, "5,950", R.drawable.divine_rapier_icon),
        ItemsWeaponData(R.string.weapon_ethereal_blade, "4,650", R.drawable.ethereal_blade_icon),
        ItemsWeaponData(R.string.weapon_meteor_hammer, "2,350", R.drawable.meteor_hammer_icon),
        ItemsWeaponData(R.string.weapon_monkey_king_bar, "4,975", R.drawable.monkey_king_bar_icon),
        ItemsWeaponData(R.string.weapon_nullifier, "4,725", R.drawable.nullifier_icon),
        ItemsWeaponData(R.string.weapon_radiance, "5,050", R.drawable.radiance_29_icon),
        ItemsWeaponData(R.string.weapon_shadow_blade, "3,000", R.drawable.shadow_blade_icon),
        ItemsWeaponData(R.string.weapon_silver_edge, "5,450", R.drawable.silver_edge_icon),
        ItemsWeaponData(R.string.weapon_skull_basher, "2,875", R.drawable.skull_basher_icon)
            )
}

object ArtifactDataSource {
    val artifact = listOf (
        ItemsArtifactData(R.string.artifact_arcane_blink, "6,800", R.drawable.arcane_blink_icon),
        ItemsArtifactData(R.string.artifact_diffusal_blade, "2,500", R.drawable.diffusal_blade_1_icon),
        ItemsArtifactData(R.string.artifact_dragon_lance, "1,900", R.drawable.dragon_lance_icon),
        ItemsArtifactData(R.string.artifact_echo_sabre, "2,500", R.drawable.echo_sabre_icon),
        ItemsArtifactData(R.string.artifact_eye_of_skadi, "5,300", R.drawable.eye_of_skadi_icon),
        ItemsArtifactData(R.string.artifact_heavens_halberd, "3,550", R.drawable.heaven_27s_halberd_icon),
        ItemsArtifactData(R.string.artifact_kaya_and_sange, "4,100", R.drawable.kaya_and_sange_icon),
        ItemsArtifactData(R.string.artifact_kaya, "2,050", R.drawable.kaya_icon),
        ItemsArtifactData(R.string.artifact_maelstrom, "2,700", R.drawable.maelstrom_icon),
        ItemsArtifactData(R.string.artifact_mage_slayer, "2,400", R.drawable.mage_slayer_icon),
        ItemsArtifactData(R.string.artifact_mjollnir, "2,700", R.drawable.mjollnir_icon),
        ItemsArtifactData(R.string.artifact_overwhelming_blink, "6,800", R.drawable.overwhelming_blink_icon),
        ItemsArtifactData(R.string.artifact_sange_and_yasha, "4,100", R.drawable.sange_and_yasha_icon),
        ItemsArtifactData(R.string.artifact_sange, "2,050", R.drawable.sange_icon),
        ItemsArtifactData(R.string.artifact_satanic, "5,050", R.drawable.satanic_icon),
        ItemsArtifactData(R.string.artifact_swift_blink, "6,800", R.drawable.swift_blink_icon),
        ItemsArtifactData(R.string.artifact_yasha_and_kaya, "4,100", R.drawable.yasha_and_kaya_icon),
        ItemsArtifactData(R.string.artifact_yasha, "2,050", R.drawable.yasha_icon)
            )
}
