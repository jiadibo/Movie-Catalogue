package com.jiadibo.moviecatalogue

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jiadibo.moviecatalogue.model.Movie
import kotlinx.android.synthetic.main.activity_detail.*

class DetailMovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }
}
