package com.example.allwinpokemones.model

import com.google.gson.annotations.SerializedName

data class Pokemon(
     val id : Int,
     val num : String,
     val name : String,
     val img : String,
     val type : List<String>,
     val height : String,
     val weight : String,
     val candy : String,
     val candy_count : Int,
     val egg : String,
     val spawn_chance : Double,
     val avg_spawns : Double,
     val spawns_time : String,
     val multipliers : List<Double>,
     val weakness : List<String>,
     val next_evolution : List<Evolution>
)
