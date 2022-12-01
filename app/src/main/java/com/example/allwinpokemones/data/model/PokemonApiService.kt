package com.example.allwinpokemones.data.model

import android.util.Log
import com.example.allwinpokemones.core.PokemonApiAdapter
import com.example.allwinpokemones.data.model.pokemon.PokemonList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class PokemonApiService @Inject constructor(){

    suspend fun getAllPokemons(): PokemonList {
        return withContext(Dispatchers.IO){
            val apiResponse = PokemonApiAdapter.getRetrofitApiService().getPokemonList()
            Log.i("response", "${apiResponse.body()}")
            apiResponse.body() ?: PokemonList(emptyList())
        }

    }
}