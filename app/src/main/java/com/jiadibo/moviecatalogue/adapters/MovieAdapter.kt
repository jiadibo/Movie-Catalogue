package com.jiadibo.moviecatalogue.adapters

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jiadibo.moviecatalogue.DetailMovieActivity
import com.jiadibo.moviecatalogue.R
import com.jiadibo.moviecatalogue.model.Movie
import kotlinx.android.synthetic.main.item_movie.view.*

class MovieAdapter(private val listMovie : ArrayList<Movie>) : RecyclerView.Adapter<MovieAdapter.ListViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount() = listMovie.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listMovie[position])
    }


    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(movie: Movie){
            with(itemView){

            }
        }
    }


}