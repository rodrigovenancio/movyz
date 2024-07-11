package com.movyz.repository

import com.movyz.data.remote.MovieApi
import com.movyz.data.remote.responses.MovieList
import com.movyz.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class MovieRepository @Inject constructor(
    private val api: MovieApi
) {

    suspend fun getMovieList(page: Int): Resource<MovieList> {
        val response = try {
            api.getMovieList(page)
        } catch (e: Exception) {
            e.printStackTrace()
            return Resource.Error("Unknown error")
        }
        return Resource.Success(response)
    }


}