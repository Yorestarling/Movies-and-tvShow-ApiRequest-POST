package com.ymejia.yoremovies.model

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import org.jetbrains.annotations.NotNull

class TvShow (
    @SerializedName("id") val id : Int,
    @SerializedName("name") val title : String,
    @SerializedName("url") val url : String,
    @SerializedName("description") val description : String,
    @SerializedName("description_source") val description_source : String,
    @SerializedName("start_date") val releasedate : String,
    @SerializedName("country") val country : String,
    @SerializedName("status") val status : String,
    @SerializedName("network") val network : String,
    @SerializedName("youtube_link") val youtube_link : String,
    @SerializedName("image_thumbnail_path") val image_thumbnail_path : String,



    )



