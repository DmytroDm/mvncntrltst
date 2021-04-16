package com.mvntst.auto.auto.mvncntrltst

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import androidx.annotation.RestrictTo
import com.google.android.material.textview.MaterialTextView

class EchoView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : MaterialTextView(context, attrs, defStyleAttr) {

    /**
     * Print echo log
     */
    fun echo() {
        val stackTrace = Thread.currentThread().stackTrace
        Log.d("Test", "stackTrace = $stackTrace")
        Echo.echo()
    }
}