package com.example.cartolafilmes.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.cartolafilmes.R
import com.example.cartolafilmes.model.Movie
import com.example.cartolafilmes.response.Movies
import com.example.cartolafilmes.view.MoviesAdapter.Companion.BASE_URL_IMAGE
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_details_movies.*
import kotlinx.android.synthetic.main.activity_details_movies.title_movie

class DetailsMovies : AppCompatActivity() {

    private var movie : Movie? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_movies)

        movie = intent.getParcelableExtra<Movie>(EXTRA_MOVIE)

        title_movie.text = movie?.title
        overview_movie.text = movie?.overview
        date_movie.text = movie?.releaseDate
        vote_movie.text = movie?.voteAverage
        val backgroundImagePath = BASE_URL_BACK + movie?.backdropPath
        val posterImagePath = BASE_URL_BACK + movie?.posterPath
        Picasso.get().load(backgroundImagePath).into(backdrop_movie)
        Picasso.get().load(posterImagePath).into(poster_movie)
}
    companion object {
        const val BASE_URL_BACK = "https://image.tmdb.org/t/p/original"
        const val EXTRA_MOVIE = "extra_movie"
    }
}