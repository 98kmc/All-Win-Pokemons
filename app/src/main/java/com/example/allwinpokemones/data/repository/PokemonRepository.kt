package com.example.allwinpokemones.data.repository

import com.example.allwinpokemones.data.api.PokemonApiService
import com.example.allwinpokemones.data.model.pokemon.PokemonList
import com.example.allwinpokemones.data.model.PokemonProvider
import com.example.allwinpokemones.data.model.pokemon.Pokemon

class PokemonRepository {
    private val apiService = PokemonApiService()

    suspend fun getAllPokemons(): PokemonList {
        val response =  apiService.getAllPokemons()
        PokemonProvider.pokemonList = response.pokemonList
        return response
    }
}