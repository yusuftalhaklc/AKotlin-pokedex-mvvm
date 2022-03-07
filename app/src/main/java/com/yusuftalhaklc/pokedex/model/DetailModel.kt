package com.yusuftalhaklc.pokedex.model

data class DetailModel(
    val base_experience: Int,
    val height: Int,
    val held_items: List<Any>,
    val id: Int,
    val is_default: Boolean,
    val location_area_encounters: String,
    val name: String,
    val order: Int,
    val past_types: List<Any>,
    val sprites: Sprites,
    val weight: Int
)