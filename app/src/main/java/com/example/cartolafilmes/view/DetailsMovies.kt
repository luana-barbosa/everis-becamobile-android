package com.example.cartolafilmes.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cartolafilmes.R
import com.example.cartolafilmes.response.Movies

class DetailsMovies : AppCompatActivity() {

    lateinit var movies : Movies
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_movies)


    }
}