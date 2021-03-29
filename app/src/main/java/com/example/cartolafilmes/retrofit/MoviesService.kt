package com.example.cartolafilmes.retrofit

import android.telecom.Call
import retrofit2.http.GET
import com.example.cartolafilmes.response.MoviesListResponse

interface MoviesService {
   @GET("3/trending/all/week?api_key=2af7a036f996b226bc467aa4f716139b&language=pt-BR")
    fun getMovies() : Call<MoviesListResponse>
}