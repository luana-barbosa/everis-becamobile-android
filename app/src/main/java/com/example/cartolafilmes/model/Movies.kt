package com.example.cartolafilmes.model

import kotlinx.serialization.Serializable

@Serializable
open class Movie {
    var title: String = ""

    var overview: String = ""

    var releaseDate: String = ""

    var backdropPath: String = ""

    var posterPath: String = ""

    var voteAverage: String = ""

    var popularity: String = ""
}
