package com.ursastudio.kotlinkedit

import android.os.Bundle
import android.support.annotation.MainThread
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ursastudio.kotlinkedit.adapter.NewsAdapter
import com.ursastudio.kotlinkedit.model.NewsItem
import com.ursastudio.kotlinkedit.commons.inflate
import com.ursastudio.kotlinkedit.fragments.BaseFragment
import com.ursastudio.kotlinkedit.manager.NewsManager
import kotlinx.android.synthetic.main.fargment_news.*
import rx.schedulers.Schedulers

class NewsFragment : BaseFragment() {


    //will be init. only when called
    private val newsManager by lazy { NewsManager() }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return container?.inflate(R.layout.fargment_news)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        newsRecycler.setHasFixedSize(true)
        newsRecycler.layoutManager = LinearLayoutManager(context)
        intiAdapter()

        if (savedInstanceState==null){
            requestNews()
        }


    }

    private fun intiAdapter(){

        if (newsRecycler.adapter==null){
            newsRecycler.adapter=NewsAdapter()
        }
    }


    private fun requestNews(){
        // (news_list.adapter as NewsAdapter).addNews(news)

        val subscription=newsManager.getNews()
                .subscribeOn(Schedulers.io())
                .subscribe(

                        {

                            receivedNews ->
                            (newsRecycler.adapter as NewsAdapter).addNews(receivedNews)

                        },
                        {
                            e->
                            Snackbar.make(newsRecycler,R.string.cannt_connect,Snackbar.LENGTH_SHORT).show()

                        }

                )
        subscriptions.add(subscription)

    }

}
