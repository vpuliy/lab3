package com.example.lab3.data.remote

import com.example.lab3.data.remote.model.MoviesModel
import retrofit2.Response

class RemoteRepository {
    suspend fun getMovies(): Response<MoviesModel>{
        return ApiFactory.api.getPopularMovie()
    }
}