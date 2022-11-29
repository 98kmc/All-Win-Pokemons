package com.example.allwinpokemones.data.api

import android.util.Log
import com.example.allwinpokemones.core.PokemonApiAdapter
import com.example.allwinpokemones.data.model.pokemon.PokemonList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PokemonApiService {

    suspend fun getAllPokemons(): PokemonList {
        val apiResponse = PokemonApiAdapter.getRetrofitApiService().getPokemonList()
        Log.i("response", "${apiResponse.body()}")
        return apiResponse.body() ?: PokemonList(emptyList())
    }
}