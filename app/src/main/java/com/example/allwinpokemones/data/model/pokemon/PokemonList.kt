package com.example.allwinpokemones.data.model.pokemon

import com.google.gson.annotations.SerializedName

data class PokemonList( @SerializedName("pokemon") val pokemonList : List<Pokemon>)
