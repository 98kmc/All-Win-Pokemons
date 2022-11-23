package com.example.allwinpokemones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.allwinpokemones.io.PokemonApiAdapter
import com.example.allwinpokemones.io.PokemonApiResponse
import com.example.allwinpokemones.model.Pokemon
import com.example.allwinpokemones.model.Pokemon2
import com.example.allwinpokemones.model.PokemonList
import com.example.allwinpokemones.model.PokemonList2
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Callback

class MainActivity : AppCompatActivity()  {
    private var pokList = mutableListOf<Pokemon>()
    private var puppies = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initApi()

        }
    private fun initApi(){

        CoroutineScope(Dispatchers.IO).launch{
            val call = PokemonApiAdapter.getApiService().getDogsByBreeds("hound/images")
            val puppieses = call.body()
            runOnUiThread{
                if(call.isSuccessful){
                    puppies.clear()
                    puppies.addAll(puppieses?.images ?: emptyList())
                }else{
                    //show error
                    println("Hello")
                }
            }

        }
    }
    }
