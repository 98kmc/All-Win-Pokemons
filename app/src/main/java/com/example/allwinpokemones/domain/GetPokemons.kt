package com.example.allwinpokemones.domain

import com.example.allwinpokemones.data.repository.PokemonRepository
import com.example.allwinpokemones.data.model.pokemon.PokemonList
import javax.inject.Inject

class GetPokemons @Inject constructor(private val repository : PokemonRepository){

    suspend operator fun invoke() : PokemonList = repository.getAllPokemons()
}