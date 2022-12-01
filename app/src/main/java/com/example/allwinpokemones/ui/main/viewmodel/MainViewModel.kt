package com.example.allwinpokemones.ui.main.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.allwinpokemones.data.model.pokemon.PokemonList
import com.example.allwinpokemones.data.model.PokemonProvider
import com.example.allwinpokemones.data.model.pokemon.Pokemon
import com.example.allwinpokemones.domain.GetPokemons
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val pokemonModel = MutableLiveData<PokemonList>()
    var pokList = listOf<Pokemon>()
    val getPokemonsUseCase : GetPokemons

    fun onCreate(){
        viewModelScope.launch {
            var result = getPokemonsUseCase()
            pokemonModel.postValue(result)
            pokList= result.pokemonList
        }

    }

}