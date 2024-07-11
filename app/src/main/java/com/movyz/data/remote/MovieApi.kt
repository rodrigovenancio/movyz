package com.movyz.data.remote

import com.movyz.data.remote.responses.MovieList
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    @GET("discover/movie")
    suspend fun getMovieList(
        @Query("page") page: Int
    ): MovieList

}