package com.example.tourguide


data class Place(
    val name: String,
    val shortDesc: String,
    val details: String,
    val image: String,
    val gallery: List<String>
)
