package com.movyz.data.remote.responses

import com.google.gson.annotations.SerializedName

data class Result(
    val id: Long,
    @SerializedName("original_title")
    val originalTitle: String,
    val overview: String,
    @SerializedName("poster_path")
    val posterPath: String
)