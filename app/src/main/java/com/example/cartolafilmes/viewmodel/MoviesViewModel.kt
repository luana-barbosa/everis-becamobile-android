package com.example.cartolafilmes.viewmodel

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cartolafilmes.model.Movies
import com.example.cartolafilmes.repository.MoviesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MoviesViewModel : ViewModel(){

    private var moviesRepository : MoviesRepository = MoviesRepository()

    private val moviesList : MutableLiveData<List<Movies>> = MutableLiveData()

    fun getMovies() {
        viewModelScope.launch (Dispatchers.IO){
            moviesList.postValue(moviesRepository.getMovies())
        }
    }
    fun observeMovies(
        lifecycleOwner: LifecycleOwner,
        action: (List<Movies>) -> Unit
    ) = moviesList.observe(lifecycleOwner, { action(it)})
}
