package com.jiadibo.moviecatalogue


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.jiadibo.moviecatalogue.adapters.MovieAdapter
import com.jiadibo.moviecatalogue.api.ApiClient
import com.jiadibo.moviecatalogue.api.ApiInterface
import com.jiadibo.moviecatalogue.model.Movie
import kotlinx.android.synthetic.main.fragment_movie.*
import retrofit2.awaitResponse


class MovieFragment : Fragment() {

    private val list = ArrayList<Movie>()

    private val API_KEY = "95b7396aabdb0e2e958fb2e93367c322"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getMovie(API_KEY)

    }

    private fun getMovie(api_key: String){
        ApiClient.of(ApiInterface::class.java).getMovieList(api_key).request()
    }

    private fun showRecycleList(){
        rv_movie.layoutManager = LinearLayoutManager(this.context)
        val listMovieAdapter = MovieAdapter(list)
        rv_movie.adapter = listMovieAdapter
    }
}
