package com.example.cartolafilmes.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
open class Movies (
    var title: String = "",

    var overview: String = "",

    var release_date: String = "",

    var backdrop_path: String = "",

    var poster_path: String = "",

    var vote_average: String = "",

    var popularity: String = "",
) : Parcelable