package com.example.cartolafilmes.repository

import com.example.cartolafilmes.model.Movie
import com.example.cartolafilmes.retrofit.APIService.API_KEY
import com.example.cartolafilmes.retrofit.APIService.LANGUAGE
import com.example.cartolafilmes.retrofit.APIService.retrofit
import com.example.cartolafilmes.retrofit.MoviesService

class MoviesRepository {

    fun getMovies(): List<Movie> {
        val moviesService = retrofit.create(MoviesService::class.java)
        val result = moviesService?.getMovies(API_KEY, LANGUAGE)?.execute()
        val moviesList: ArrayList<Movie> = arrayListOf()
        if (result != null && result.isSuccessful) {
            result.body()?.results?.forEach { moviesResponse ->
                val movies = Movie()
                movies.title = moviesResponse.title ?: ""
                movies.posterPath = moviesResponse.poster_path ?: ""
                movies.backdropPath = moviesResponse.backdrop_path ?: ""
                movies.overview = moviesResponse.overview ?: ""
                movies.releaseDate = moviesResponse.release_date?: ""
                movies.voteAverage = moviesResponse.vote_average ?: ""
                movies.popularity = moviesResponse.popularity ?: ""

                moviesList.add(movies)

            }
        }
        return moviesList
    }
}