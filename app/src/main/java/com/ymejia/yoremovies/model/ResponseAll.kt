package com.ymejia.yoremovies.model

import com.google.gson.annotations.SerializedName

data class ResponseAll (
    @SerializedName("tvShow") val tvShow: TvShow
)

