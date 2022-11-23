package com.example.allwinpokemones.model

import com.google.gson.annotations.SerializedName

data class PokemonList( @SerializedName("pokemon") val pokemon : List<Pokemon>)
