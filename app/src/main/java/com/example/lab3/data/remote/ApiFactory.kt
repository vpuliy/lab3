package com.example.lab3.data.remote

import com.example.lab3.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: MoviesApi by lazy {
        retrofit.create(MoviesApi::class.java)
    }

}