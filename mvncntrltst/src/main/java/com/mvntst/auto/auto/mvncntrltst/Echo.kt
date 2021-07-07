package com.mvntst.auto.auto.mvncntrltst

import android.util.Log

object Echo {

    private const val TAG = "Echo"

    fun echo(msg: String = "Echo!") {
        Log.i(TAG, msg)
    }
}