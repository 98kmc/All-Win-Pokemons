package com.example.allwinpokemones.io

import com.example.allwinpokemones.model.Pokemon
import com.example.allwinpokemones.model.PokemonList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface PokemonApiResponse {
    @GET
    suspend fun getPokemonList(@Url url:String): Response<PokemonList>
}