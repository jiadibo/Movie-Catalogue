package com.jiadibo.moviecatalogue


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.jiadibo.moviecatalogue.adapters.TvshowAdapter
import com.jiadibo.moviecatalogue.model.Tvshow
import kotlinx.android.synthetic.main.fragment_tvshow.*


class TvshowFragment : Fragment() {

    private val list = ArrayList<Tvshow>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tvshow, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rv_tv.setHasFixedSize(true)
        list.addAll(getListTv())
        showRecycleList()
    }

    fun getListTv() : ArrayList<Tvshow>{
        val dataNameTv = resources.getStringArray(R.array.data_tv)
        val dataDescTv = resources.getStringArray(R.array.data_desctv)
        val dataPhotoTv = resources.getStringArray(R.array.data_phototv)

        val listTv = ArrayList<Tvshow>()
        for (p in dataNameTv.indices){
            val tv = Tvshow(
                dataNameTv[p],
                dataDescTv[p],
                dataPhotoTv[p]
            )
            listTv.add(tv)
        }
        return listTv
    }

    private fun showRecycleList(){
        rv_tv.layoutManager = LinearLayoutManager(this.context)
        val listTvAdapter = TvshowAdapter(list)
        rv_tv.adapter = listTvAdapter
    }


}
