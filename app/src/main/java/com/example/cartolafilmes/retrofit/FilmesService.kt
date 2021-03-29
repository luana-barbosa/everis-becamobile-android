package com.example.cartolafilmes.retrofit

import android.telecom.Call
import com.example.cartolafilmes.response.FilmesListResponse
import retrofit2.http.GET

interface FilmesService {

    // https://api.themoviedb.org/3/trending/all/week?api_key=2af7a036f996b226bc467aa4f716139b&language=pt-BR

    @GET("3/trending/all/week?api_key=2af7a036f996b226bc467aa4f716139b&language=pt-BR")
    //fun getFilmes() : Call<FilmesListResponse>
}