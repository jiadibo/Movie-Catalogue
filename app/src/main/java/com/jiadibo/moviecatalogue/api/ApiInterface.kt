package com.jiadibo.moviecatalogue.api

import com.jiadibo.moviecatalogue.BuildConfig
import com.jiadibo.moviecatalogue.model.BaseResponse
import com.jiadibo.moviecatalogue.model.Movie
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiInterface {
    @GET("3/discover/movie")
    fun getMovieList(@Query("api_key") api_key: String): Call<BaseResponse<Movie>>
}