package com.example.lab3.presentation.first

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lab3.REALIZATION
import com.example.lab3.data.local.MoviesDatabase
import com.example.lab3.data.local.MoviesRepositoryRealization
import com.example.lab3.data.remote.RemoteRepository
import com.example.lab3.data.remote.model.MoviesModel
import kotlinx.coroutines.launch
import retrofit2.Response

class FirstFragmentViewModel(application: Application): AndroidViewModel(application) {
    private val repository = RemoteRepository()
    val myMovies: MutableLiveData<Response<MoviesModel>> = MutableLiveData()
    val context = application
    fun getMoviesRetrofit() {
        viewModelScope.launch {
            myMovies.value = repository.getMovies()
        }
    }

    fun initDatabase() {
        val daoMovie = MoviesDatabase.getInstance(context).getMoviesDao()
        REALIZATION = MoviesRepositoryRealization(daoMovie)
    }
}