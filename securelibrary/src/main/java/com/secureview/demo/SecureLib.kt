package com.secureview.demo

import android.content.Context

class SecureLib {

    fun warmUp(context: Context) {
        _clientPackage = context.packageName
    }

    companion object {

        private var _clientPackage: String? = null
        val clientPackage: String? = _clientPackage
    }
}