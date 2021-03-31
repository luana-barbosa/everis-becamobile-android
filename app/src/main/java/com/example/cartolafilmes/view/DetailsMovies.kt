package com.example.cartolafilmes.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cartolafilmes.R
import com.example.cartolafilmes.model.Movie
import com.example.cartolafilmes.response.Movies
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_details_movies.*
import kotlinx.android.synthetic.main.activity_details_movies.title_movie

class DetailsMovies : AppCompatActivity() {

    private lateinit var movies : Movies;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_movies)

        movies = intent.getParcelableExtra<Movie>("movie_extra") as Movies
        title_movie.text = movies.title
        overview_movie.text = movies.overview
        date_movie.text = movies.releaseDate
        Picasso.get().load(movies.backdropPath).into(backdrop_movie)
        Picasso.get().load(movies.posterPath).into(poster_movie)
        //val voteAverage = findViewById<TextView>(R.id.title_movie)
       // val popularity = findViewById<TextView>(R.id.title_movie)

    movies?.let{
        title_movie.text = it.title
        overview_movie.text = it.overview
        date_movie.text = it.releaseDate
        if(it.posterPath?.isNotEmpty() == true){
            Picasso.get().load(movies.posterPath).into(poster_movie)
             if(!it.backdropPath?.isEmpty()!!){
                 Picasso.get().load(movies.backdropPath).into(backdrop_movie)
            }else{
                Picasso.get().load(R.mipmap.ic_launcher).into(poster_movie)
            }
        }
    }
}
}