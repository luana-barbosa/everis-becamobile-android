package com.example.cartolafilmes.response

data class FilmesListResponse(
    var Filmes: ArrayList<Filmes>? = null
)

data class Filmes (
var title: String? = "",

var overview: String? = "",

var release_date: String? = "",

var backdrop_path: String? = "",

var poster_path: String? = "",

var vote_average: String? = "",

var popularity: String? = "",
)