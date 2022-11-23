package com.example.allwinpokemones.io

import okhttp3.OkHttp
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class PokemonApiAdapter {

    companion object{
        private var API_SERVICE: PokemonApiResponse? = null

        private val BASE_URL = "https://dog.ceo/api/breed/"

        fun getApiService() : PokemonApiResponse {
            if (API_SERVICE == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                API_SERVICE = retrofit.create(PokemonApiResponse::class.java)
            }
            return API_SERVICE!!
        }
    }
}