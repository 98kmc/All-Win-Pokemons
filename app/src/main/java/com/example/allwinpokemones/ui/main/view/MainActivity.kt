package com.example.allwinpokemones.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.allwinpokemones.R
import com.example.allwinpokemones.data.api.PokemonApiResponse
import com.example.allwinpokemones.data.model.pokemon.Pokemon
import com.example.allwinpokemones.ui.main.viewmodel.MainViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    val viewModel: MainViewModel by viewModels()

    private var pokList = mutableListOf<Pokemon>()
    private var puppies = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.onCreate()
        if (!viewModel.pokList.isNullOrEmpty()){
            println(pokList[0])
        }
        else{
            println("Fail")
        }


    }

    private fun initApi() {
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(PokemonApiResponse::class.java).getPokemonList()
            val puppieses = call.body()
            runOnUiThread {
                if (call.isSuccessful) {
                    pokList.clear()
                    pokList.addAll(puppieses?.pokemonList ?: emptyList())
                    println(pokList[0])
                } else {
                    //show error
                    println("Hello")
                }
            }
        }
    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://raw.githubusercontent.com/Biuni/PokemonGO-Pokedex/master/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
