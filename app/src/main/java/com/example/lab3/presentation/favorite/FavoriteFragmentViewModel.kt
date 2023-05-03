package com.example.lab3.presentation.favorite

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.lab3.REALIZATION
import com.example.lab3.data.remote.model.MovieItem

class FavoriteFragmentViewModel: ViewModel() {
    fun getAllMovies(): LiveData<List<MovieItem>> {
        return REALIZATION.allMovies
    }
}