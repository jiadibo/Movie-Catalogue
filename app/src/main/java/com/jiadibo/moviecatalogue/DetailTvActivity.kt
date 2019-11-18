package com.jiadibo.moviecatalogue


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.jiadibo.moviecatalogue.model.Tvshow
import kotlinx.android.synthetic.main.activity_detail_tv.*

class DetailTvActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tv)

        val intentTv = intent.getParcelableExtra<Tvshow>("tvshow")
        tv_nameTv.text = intentTv.name
        tv_descTv.text = intentTv.desc
        Glide.with(this)
            .load(intentTv.photo)
            .apply(RequestOptions().override(350,550))
            .into(img_detailTv)
    }
}
