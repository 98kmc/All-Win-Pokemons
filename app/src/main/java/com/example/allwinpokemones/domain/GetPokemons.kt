package com.example.allwinpokemones.domain

import com.example.allwinpokemones.data.repository.PokemonRepository
import com.example.allwinpokemones.data.model.pokemon.PokemonList

class GetPokemons {
    private val repository = PokemonRepository()

    suspend operator fun invoke() : PokemonList = repository.getAllPokemons()
}