package com.ymejia.yoremovies.general

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.google.gson.Gson
import com.squareup.picasso.Picasso
import com.ymejia.yoremovies.ApiRequestViewModel
import com.ymejia.yoremovies.R
import com.ymejia.yoremovies.databinding.ActivityDetailsBinding
import com.ymejia.yoremovies.model.TvShow

class DetailsActivity : AppCompatActivity() {

    lateinit var binding: ActivityDetailsBinding
    lateinit var viewModel: ApiRequestViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_details)


        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val gson = Gson()
        val tvshow = gson.fromJson<TvShow>(intent.getStringExtra("tvshow"),TvShow::class.java)


        binding.tvTitleDeta.text = tvshow.title
        binding.txtDate.text = tvshow.releasedate
        binding.Txtdescription.text = tvshow.description
        binding.Txtstatus.text = tvshow.status
        binding.txtCount.text = tvshow.country
        binding.txtLink.text = tvshow.network

        Picasso.with(this)
            .load(tvshow.image_thumbnail_path)
            .placeholder(R.drawable.movise)
            .centerCrop()
            .resize(800, 800)
            .into(binding.imageView3)

    }
}