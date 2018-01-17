@file:JvmName("ExtensionUtils")

package com.ursastudio.kotlinkedit.commons

import android.content.Context
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso
import com.squareup.picasso.RequestCreator
import com.ursastudio.kotlinkedit.R

/**
 * Created by jankocvirn on 15/01/2018.
 */

fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {

    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}

fun ImageView.loadImage(imageUrl: String) {

    if (TextUtils.isEmpty(imageUrl)) {
        Picasso.with(context).load(R.mipmap.ic_launcher_round).into(this)
    } else {

        Picasso.with(context).load(imageUrl).into(this)

    }

}


val Context.picasso: Picasso
    get() = Picasso.with(this)


fun ImageView.load(path: String, request: (RequestCreator) -> RequestCreator) {

    request(getContext().picasso.load(path).fit().centerCrop()).into(this)
}

