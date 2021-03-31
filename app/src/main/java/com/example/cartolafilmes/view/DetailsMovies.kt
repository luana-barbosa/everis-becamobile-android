package com.example.cartolafilmes.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.cartolafilmes.R
import com.example.cartolafilmes.model.Movie
import com.example.cartolafilmes.response.Movies
import com.example.cartolafilmes.utils.getJsonExtra
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_details_movies.*
import kotlinx.android.synthetic.main.activity_details_movies.title_movie

class DetailsMovies : AppCompatActivity() {

    private lateinit var movies : Movies;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_movies)

        movies = intent.getJsonExtra(Movies::class.java)!!
        title_movie.text = movies.title
        overview_movie.text = movies.overview
        date_movie.text = movies.releaseDate
        vote_movie.text = movies.voteAverage
        Picasso.get().load(BASE_URL_IMAGE + movies.backdropPath).into(backdrop_movie)
        Picasso.get().load(BASE_URL_IMAGE + movies.posterPath).into(poster_movie)
        //val voteAverage = findViewById<TextView>(R.id.vote_movie)
       // val popularity = findViewById<TextView>(R.id.title_movie)

        movies.let{
            title_movie.text = it.title
            overview_movie.text = it.overview
            date_movie.text = it.releaseDate
            if(it.posterPath?.isNullOrBlank() == false){
                Picasso.get().load(movies.posterPath).into(poster_movie)
                if(!it.backdropPath?.isNotBlank()!!){
                    Picasso.get().load(movies.backdropPath).into(backdrop_movie)
                }else{
                    Picasso.get().load(R.mipmap.ic_launcher).into(poster_movie)
                }
            }
        }
}
    companion object {
        const val BASE_URL_IMAGE = "https://image.tmdb.org/t/p/original"
    }
}