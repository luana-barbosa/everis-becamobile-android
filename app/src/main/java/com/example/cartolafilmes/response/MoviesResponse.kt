package com.example.cartolafilmes.response

import com.example.cartolafilmes.model.Movies

data class MoviesListResponse(
    var movies: ArrayList<Movies>? = null
)

data class Movies (
var title: String? = "",

var overview: String? = "",

var release_date: String? = "",

var backdrop_path: String? = "",

var poster_path: String? = "",

var vote_average: String? = "",

var popularity: String? = "",
)