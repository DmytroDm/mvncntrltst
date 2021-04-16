package com.mvntst.auto.auto.mvncntrltst

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.textview.MaterialTextView

private const val ECHO_VIEW = "com.mvntst.auto.auto.mvncntrltst.EchoView"

abstract class BaseEchoView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : MaterialTextView(context, attrs, defStyleAttr) {

    private val echo = Echo()

    protected fun secureEcho() {
        checkIsValidInheritance {
            echo.printEcho()
        }
    }

    private fun checkIsValidInheritance(action: () -> Unit) {
        when (val qualifiedName = this::class.qualifiedName) {
            ECHO_VIEW -> action.invoke()
            else -> throw IllegalArgumentException("This class($qualifiedName) should not inherit from BaseEchoView!")
        }
    }
}