package com.example.cartolafilmes.view

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cartolafilmes.R
import com.example.cartolafilmes.response.Movies
import com.google.android.material.circularreveal.CircularRevealGridLayout
import com.squareup.picasso.Picasso

class MoviesAdapter (var movies: List<Movies>) : RecyclerView.Adapter<MoviesAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item,
            parent,false)
        val holder = ViewHolder(view)

        return holder
   }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if(movies[position].poster_path.isNotEmpty())
            Picasso.get().load(movies[position].poster_path).into(holder.poster_path)
        holder.title.text = movies[position].title
        holder.moviesView.setOnClickListener{
            val intent = Intent(holder.moviesView.context, DetailsMovies ::class.java)
            intent.putExtra("extra_movies", movies[position])
            holder.moviesView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val title: TextView = itemView.findViewById(R.id.title_movie)
        val poster_path: ImageView = itemView.findViewById(R.id.poster_movie)
        val moviesView: CircularRevealGridLayout = itemView.findViewById(R.id.moviesView)
        //val backdrop_path: TextView = itemView.findViewById(R.id.title_movie)
        //val overview: TextView = itemView.findViewById(R.id.title_movie)
        //val vote_average: TextView = itemView.findViewById(R.id.title_movie)
        //val popularity: TextView = itemView.findViewById(R.id.title_movie)

    }
}