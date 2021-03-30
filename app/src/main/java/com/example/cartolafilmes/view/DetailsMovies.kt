package com.example.cartolafilmes.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.cartolafilmes.R
import com.example.cartolafilmes.model.Movie
import com.example.cartolafilmes.response.Movies
import com.example.cartolafilmes.utils.getJsonExtra

class DetailsMovies : AppCompatActivity() {

    lateinit var movies : Movies
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_movies)

        val movies: Movie? = intent.getJsonExtra(Movie::class.java)
        val title = findViewById<TextView>(R.id.title_movie)
        val overview = findViewById<TextView>(R.id.overview_movie)
        val releaseDate = findViewById<TextView>(R.id.date_movie)
        val backdropPath = findViewById<ImageView>(R.id.backdrop_movie)
        val posterPath = findViewById<ImageView>(R.id.poster_movie)
        //val voteAverage = findViewById<TextView>(R.id.title_movie)
       // val popularity = findViewById<TextView>(R.id.title_movie)
    }
}