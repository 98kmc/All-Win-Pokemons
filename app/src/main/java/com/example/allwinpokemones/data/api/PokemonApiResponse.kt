package com.example.allwinpokemones.data.api

import com.example.allwinpokemones.data.model.pokemon.PokemonList
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApiResponse {
    @GET("pokedex.json")
    suspend fun getPokemonList(): Response<PokemonList>

}