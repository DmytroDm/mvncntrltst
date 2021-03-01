package com.mvntst.auto.auto.mvncntrltst

import android.content.Context
import android.util.AttributeSet
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
        Echo.echo()
    }
}