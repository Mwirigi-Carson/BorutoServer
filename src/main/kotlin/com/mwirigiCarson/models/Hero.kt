package com.mwirigiCarson.models

import kotlinx.serialization.Serializable

@Serializable
data class Hero(
    val id : Int,
    val name : String,
    val image : String,
    val about : String,
    val rating : Double,
    val power : Int,
    val month : String, // birth month
    val day : String, // birthday
    val family : List<String>, // list of family members
    val abilities : List<String>, // list of abilities
    val natureTypes : List<String> //
)
