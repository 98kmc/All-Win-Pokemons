package com.example.allwinpokemones.ui.Pokedex.view.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.allwinpokemones.data.model.pokemon.Pokemon

class PokedexAdapter (var pokedex : List<Pokemon>) : RecyclerView.Adapter<PokedexAdapter.PokedexViewHolder>() {

    inner class PokedexViewHolder(v: View): RecyclerView.ViewHolder(v){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokedexViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: PokedexViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = pokedex.size

}