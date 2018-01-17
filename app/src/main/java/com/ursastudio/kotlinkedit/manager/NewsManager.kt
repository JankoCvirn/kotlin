package com.ursastudio.kotlinkedit.manager

import com.ursastudio.kotlinkedit.model.NewsItem
import rx.Observable
import rx.Subscriber
import rx.internal.operators.OperatorToObservableList

/**
 * Created by jankocvirn on 16/01/2018.
 */
class NewsManager {

    fun getNews():Observable<List<NewsItem>> {

        return Observable.create{

            subscriber ->

            val news= mutableListOf<NewsItem>()

            for (i in 1..10){

                news.add(NewsItem("author$i","title$i",i,1457207701L - i * 200,"http://lorempixel.com/200/200/technics/$i","url"))
            }
            subscriber.onNext(news)
            subscriber.onCompleted()
        }

    }
}