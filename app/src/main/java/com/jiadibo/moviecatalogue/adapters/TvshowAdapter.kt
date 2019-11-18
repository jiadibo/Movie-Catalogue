package com.jiadibo.moviecatalogue.adapters

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.jiadibo.moviecatalogue.DetailTvActivity
import com.jiadibo.moviecatalogue.R
import com.jiadibo.moviecatalogue.model.Tvshow
import kotlinx.android.synthetic.main.item_movie.view.*

class TvshowAdapter (private val listTv : ArrayList<Tvshow>) : RecyclerView.Adapter<TvshowAdapter.ListViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount() = listTv.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listTv[position])
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(tvshow: Tvshow){
            with(itemView){
                Glide.with(itemView.context)
                    .load(tvshow.photo)
                    .apply(RequestOptions().override(350,550))
                    .into(img_movie)
                tv_name.text = tvshow.name
                tv_desc.text = tvshow.desc

                itemView.setOnClickListener {
                    val intent = Intent(context, DetailTvActivity::class.java)
                    intent.putExtra("tvshow", tvshow)
                    context.startActivity(intent)
                }
            }
        }
    }


}