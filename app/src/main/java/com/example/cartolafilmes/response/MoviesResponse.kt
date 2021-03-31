package com.example.cartolafilmes.response

import com.google.gson.annotations.SerializedName

data class MoviesListResponse(
    var results: ArrayList<Movies>? = null,
 var page: String? = ""
)

data class Movies (
    var title: String? = "",

    var overview: String? = "",

    var releaseDate: String? = "",

    @SerializedName("backdrop_path")
    var backdropPath: String? = "",

    @SerializedName("poster_path")
    var posterPath: String? = "",

    var voteAverage: String? = "",

    var popularity: String? = "",
)