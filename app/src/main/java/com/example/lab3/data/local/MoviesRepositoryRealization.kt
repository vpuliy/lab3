package com.example.lab3.data.local

import androidx.lifecycle.LiveData
import com.example.lab3.data.remote.model.MovieItem

class MoviesRepositoryRealization(private val moviesDao: MoviesDao): MoviesRepository {
    override val allMovies: LiveData<List<MovieItem>>
        get() = moviesDao.getAllMovies()

    override suspend fun insertMovie(movieItemEntity: MovieItem, onSuccess: () -> Unit) {
        moviesDao.insert(movieItemEntity)
        onSuccess()
    }

    override suspend fun deleteMovie(movieItemEntity: MovieItem, onSuccess: () -> Unit) {
        moviesDao.delete(movieItemEntity)
        onSuccess()
    }

}