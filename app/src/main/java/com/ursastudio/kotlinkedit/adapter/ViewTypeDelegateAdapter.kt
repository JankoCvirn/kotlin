package com.ursastudio.kotlinkedit.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by jankocvirn on 15/01/2018.
 */
interface ViewTypeDelegateAdapter{


    fun onCreateViewHolder(parent:ViewGroup):RecyclerView.ViewHolder

    fun onBindViewHolder(holder: RecyclerView.ViewHolder,item: ViewType)

}