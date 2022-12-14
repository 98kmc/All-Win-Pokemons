package com.example.allwinpokemones.data.repository

import com.example.allwinpokemones.data.api.PokemonApiService
import com.example.allwinpokemones.data.model.pokemon.PokemonList
import com.example.allwinpokemones.data.model.PokemonProvider
import com.example.allwinpokemones.data.model.pokemon.Pokemon

class PokemonRepository {
    private val apiService = PokemonApiService()
    private val pokProvider = PokemonProvider()

    suspend fun getAllPokemons(): PokemonList {
        val response =  apiService.getAllPokemons()
        pokProvider.pokemonList = response.pokemonList
        return response
    }
}