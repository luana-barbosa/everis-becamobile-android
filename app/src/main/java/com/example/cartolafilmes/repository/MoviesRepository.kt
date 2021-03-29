package com.example.cartolafilmes.repository

import com.example.cartolafilmes.response.Movies
import com.example.cartolafilmes.retrofit.APIService.retrofit
import com.example.cartolafilmes.retrofit.MoviesService

class MoviesRepository {

    fun getMovies() : List<Movies>{
        val moviesService = retrofit?.create(MoviesService::class.java)
        val result =  moviesService?.getMovies()?.execute()
        val moviesList : ArrayList<Movies> = arrayListOf()
        if(result!= null && result.isSuccessful) {
            result.body()?.movies?.forEach { moviesResponse ->
                val movies = Movies()
                movies.title = moviesResponse.title ?: ""
                movies.poster_path = moviesResponse.poster_path ?:""
                movies.backdrop_path = moviesResponse.backdrop_path ?:""
                movies.overview = moviesResponse.overview ?:""
                movies.release_date = moviesResponse.release_date ;
                movies.vote_average = moviesResponse.vote_average ?:""
                movies.popularity = moviesResponse.popularity ?:""
            }
            moviesList.add(movies)
        }
    }
    return moviesList
}