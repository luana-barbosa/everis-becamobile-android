package com.example.cartolafilmes.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cartolafilmes.R
import com.example.cartolafilmes.response.Movies

class MoviesAdapter (var movies: List<Movies>) : RecyclerView.Adapter<MoviesAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item,
            parent,false)
   }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }
}