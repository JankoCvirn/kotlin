package com.ursastudio.kotlinkedit.model

import com.ursastudio.kotlinkedit.adapter.AdapterConstants
import com.ursastudio.kotlinkedit.adapter.ViewType

/**
 * Created by jankocvirn on 15/01/2018.
 */
class NewsItem(val author: String, val title: String, val numComments: Int, val created: Long, val thumbnail: String, val url: String) : ViewType {
    override fun getViewType() = AdapterConstants.NEWS
}