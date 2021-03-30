package com.example.cartolafilmes.response

import kotlinx.serialization.SerialName

data class MoviesListResponse(
    var results: ArrayList<Movies>? = null,
 var page: String? = ""
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