package com.ursastudio.kotlinkedit.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import rx.subscriptions.CompositeSubscription

/**
 * Created by jankocvirn on 16/01/2018.
 */
open class BaseFragment() : Fragment() {

    protected var subscriptions=CompositeSubscription()

    override fun onResume() {
        super.onResume()
        subscriptions=CompositeSubscription()
    }

    override fun onPause() {
        super.onPause()
        if (!subscriptions.isUnsubscribed){
            subscriptions.unsubscribe()
        }
        subscriptions.clear()
    }


}