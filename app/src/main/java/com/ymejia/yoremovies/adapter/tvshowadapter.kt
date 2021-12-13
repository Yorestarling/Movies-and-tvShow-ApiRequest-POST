package com.ymejia.yoremovies.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.ymejia.yoremovies.R
import com.ymejia.yoremovies.databinding.TvshowRvItemBinding
import com.ymejia.yoremovies.general.HomeActivity
import com.ymejia.yoremovies.model.TvShow

class tvshowadapter (
    private val context: HomeActivity,
    private val tvShows : List<TvShow>,
    private val onClickTvShow : HomeActivity,
    private val onItemSelect : (tvShow : TvShow) -> Unit
) :
    RecyclerView.Adapter<tvshowadapter.ViewHolder>(){

    private val allTvShow = tvShows
    inner class ViewHolder(private val  binding: TvshowRvItemBinding)
        : RecyclerView.ViewHolder(binding.root){
        val TvShowTitle = binding.idTVTitle
        val TvShowDate = binding.idTVDate
        val TvShowImage = binding.imageView2
        val TvShowSource = binding.idSource
        val cardView = binding.cardidview
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TvshowRvItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        ))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tvShow = allTvShow[position]
        holder.TvShowTitle.text = allTvShow[position].title
        holder.TvShowDate.text = "Publish Date : "+ allTvShow[position].releasedate
        holder.TvShowSource.text = allTvShow[position].network

        val picasso = Picasso.with(context)
            .load(tvShow.image_thumbnail_path)
            .placeholder(R.drawable.movise)
            .centerCrop()
            .resize(350, 350)
            .into(holder.TvShowImage)
        holder.cardView.setOnClickListener{
            onItemSelect(tvShow)
            onClickTvShow.onClickTvShow(tvShow)
        }
    }


    override fun getItemCount(): Int {
        return allTvShow.size
    }

}


