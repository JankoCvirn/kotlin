@file:JvmName("ExtensionUtils")
package commons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by jankocvirn on 15/01/2018.
 */

fun ViewGroup.inflate(layoutId:Int,attachToRoot:Boolean=false): View {

    return LayoutInflater.from(context).inflate(layoutId,this,attachToRoot)
}
