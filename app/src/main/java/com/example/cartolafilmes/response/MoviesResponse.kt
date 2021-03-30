package com.example.cartolafilmes.response

import kotlinx.serialization.SerialName

data class MoviesListResponse(
    var results: ArrayList<Movies>? = null,
 var page: String? = ""
)

data class Movies (
var title: String? = "",

var overview: String? = "",

var releaseDate: String? = "",

var backdropPath: String? = "",

var posterPath: String? = "",

var voteAverage: String? = "",

var popularity: String? = "",
)