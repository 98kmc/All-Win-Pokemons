package com.example.allwinpokemones.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.allwinpokemones.R
import com.example.allwinpokemones.core.PokemonApiAdapter
import com.example.allwinpokemones.data.api.PokemonApiResponse
import com.example.allwinpokemones.data.model.pokemon.Pokemon
import com.example.allwinpokemones.databinding.ActivityMainBinding
import com.example.allwinpokemones.ui.main.viewmodel.MainViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by viewModels()

    private var pokList = mutableListOf<Pokemon>()
    private var puppies = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        CoroutineScope(Dispatchers.IO).launch {
            viewModel.onCreate()
            runOnUiThread{
                if (!viewModel.pokList.isNullOrEmpty()) println(viewModel.pokList[0])
            }
        }

        val navControler = findNavController(R.id.fragment_container)
        binding.bnvNavigation.setupWithNavController(navControler)
    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://raw.githubusercontent.com/Biuni/PokemonGO-Pokedex/master/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
