package com.ymejia.yoremovies.model

class pagination (var page: Int,var total : Int, var pages : Int){
    val totalPages : Int = pages / 20
}
