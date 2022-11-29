package com.example.allwinpokemones.data.api

import com.example.allwinpokemones.core.PokemonApiAdapter
import com.example.allwinpokemones.data.model.pokemon.PokemonList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PokemonApiService {

    suspend fun getAllPokemons(): PokemonList {
        return withContext(Dispatchers.IO){
            val apiResponse = PokemonApiAdapter.getRetrofitApiService().getPokemonList()
            apiResponse.body() ?: PokemonList(emptyList())
        }
    }
}