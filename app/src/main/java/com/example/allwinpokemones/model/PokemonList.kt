package com.example.allwinpokemones.model

import com.google.gson.annotations.SerializedName

data class PokemonList( @SerializedName("pokemon") val pokemonList : List<Pokemon>)
