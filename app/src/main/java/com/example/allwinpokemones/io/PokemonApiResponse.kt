package com.example.allwinpokemones.io

import com.example.allwinpokemones.model.DogsResponse
import com.example.allwinpokemones.model.PokemonList
import com.example.allwinpokemones.model.PokemonList2
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface PokemonApiResponse {
    @GET
    suspend fun getPokemonList(@Url url:String): Response<PokemonList>

    @GET("pokemon?limit=100000&offset=0")
    fun getPokemonList2(): Call<PokemonList2?>?

    @GET
    suspend fun getDogsByBreeds(@Url url:String):Response<DogsResponse>
}