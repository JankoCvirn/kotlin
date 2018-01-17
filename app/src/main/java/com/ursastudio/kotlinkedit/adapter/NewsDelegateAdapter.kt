package com.ursastudio.kotlinkedit.adapter

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.ViewGroup
import com.ursastudio.kotlinkedit.R
import com.ursastudio.kotlinkedit.model.NewsItem
import com.ursastudio.kotlinkedit.commons.inflate
import com.ursastudio.kotlinkedit.commons.load
import com.ursastudio.kotlinkedit.commons.loadImage
import kotlinx.android.synthetic.main.item_news.view.*

/**
 * Created by jankocvirn on 15/01/2018.
 */

class NewsDelegateAdapter:ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {

        return TurnsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {

        holder as TurnsViewHolder
        holder.bind(item as NewsItem)
    }

    class TurnsViewHolder (parent: ViewGroup):RecyclerView.ViewHolder(parent.inflate(R.layout.item_news)){

        fun bind(item:NewsItem) = with(itemView){

            textViewAuthor.text=item.author
            textViewTitle.text=item.title
            textViewCounter.text= "${item.numComments}"
            imageView2.loadImage(item.thumbnail)
            Log.d("TEST",item.thumbnail+"|"+item.url)
            imageView2.load(item.thumbnail) { request -> request.centerCrop() }
        }

    }
}