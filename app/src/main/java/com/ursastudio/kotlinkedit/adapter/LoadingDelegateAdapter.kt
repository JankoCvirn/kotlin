package com.ursastudio.kotlinkedit.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.ursastudio.kotlinkedit.R
import commons.inflate

/**
 * Created by jankocvirn on 15/01/2018.
 */

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHolder(parent)


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {

    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(parent.inflate(R.layout.item_loading)) {


    }

}