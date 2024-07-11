package com.movyz.data.remote.responses

import com.google.gson.annotations.SerializedName

data class MovieList(
    val page: Int,
    @SerializedName("total_pages")
    val totalPages: Long,
    @SerializedName("total_results")
    val totalResults: Long,
    val results: List<Result>
)