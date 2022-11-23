package com.example.allwinpokemones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.allwinpokemones.io.PokemonApiAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch{
            val call = PokemonApiAdapter.getApiService().getPokemonList("pokedex.json")
            val pokList = call.body()
            runOnUiThread{
                println(pokList?.pokemon)
            }
        }
    }
}