package com.movyz.movielist

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.movyz.data.models.MovieListEntry
import com.movyz.repository.MovieRepository
import com.movyz.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieListViewModel @Inject constructor (
    private val repository: MovieRepository
): ViewModel() {

    private var curPage = 1

    var movieList = mutableStateOf<List<MovieListEntry>>(listOf())
    var loadError = mutableStateOf("")
    var isLoading = mutableStateOf(false)
    var endReached = mutableStateOf(false)

    init {
        loadMoviesPaginated()
    }

    fun loadMoviesPaginated() {
        viewModelScope.launch {
            isLoading.value = true
            val result = repository.getMovieList(curPage)
            when(result) {
                is Resource.Success -> {
                    endReached.value = curPage >= result.data!!.totalPages
                    val movieListEntries = result.data.results.mapIndexed { index, entry ->
                        val url = "https://image.tmdb.org/t/p/w500/${entry.posterPath}"
                        MovieListEntry(entry.originalTitle, entry.overview, url)
                    }
                    curPage++

                    loadError.value = ""
                    isLoading.value = false
                    movieList.value += movieListEntries

                }
                is Resource.Error -> {
                    loadError.value = result.message!!
                    isLoading.value = false
                }
            }
        }
    }

}