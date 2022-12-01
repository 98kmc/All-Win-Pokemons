package com.example.allwinpokemones.data.repository

import com.example.allwinpokemones.data.model.PokemonApiService
import com.example.allwinpokemones.data.model.pokemon.PokemonList
import com.example.allwinpokemones.data.model.PokemonProvider
import javax.inject.Inject

class PokemonRepository @Inject constructor(
    private val apiService : PokemonApiService,
    private val pokProvider : PokemonProvider
){

    suspend fun getAllPokemons(): PokemonList {
        val response =  apiService.getAllPokemons()
        pokProvider.pokemonList = response.pokemonList
        return response
    }
}