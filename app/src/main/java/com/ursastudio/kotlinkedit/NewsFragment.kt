package com.ursastudio.kotlinkedit

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ursastudio.kotlinkedit.adapter.NewsAdapter
import commons.inflate
import kotlinx.android.synthetic.main.fargment_news.*

class NewsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return container?.inflate(R.layout.fargment_news)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        newsRecycler?.setHasFixedSize(true)
        newsRecycler?.layoutManager = LinearLayoutManager(context) as RecyclerView.LayoutManager?
        intiAdapter()

    }

    private fun intiAdapter(){

        if (newsRecycler.adapter==null){
            newsRecycler.adapter=NewsAdapter()
        }
    }

}
