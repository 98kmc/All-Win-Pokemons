package com.example.allwinpokemones.data.model.pokemon

import com.google.gson.annotations.SerializedName

data class NextEvolution(
    @SerializedName("num") val num: String,
    @SerializedName("name") val name: String
)
