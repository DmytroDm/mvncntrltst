package com.mvntst.auto.auto.mvncntrltst

import android.util.Log

private const val ECHO_VIEW = "com.mvntst.auto.auto.mvncntrltst.Echo"

abstract class BaseEcho {

    protected fun echo() {
        checkIsValidInheritance {
            Log.i("Echo", "Hello world!")
        }
    }

    private fun checkIsValidInheritance(action: () -> Unit) {
        when (val qualifiedName = this::class.qualifiedName) {
            ECHO_VIEW -> action.invoke()
            else -> throw IllegalArgumentException("This class($qualifiedName) should not inherit from BaseEcho!")
        }
    }
}