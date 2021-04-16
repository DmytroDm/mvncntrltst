package com.mvntst.auto.auto.testmavencentral

import android.content.Context
import android.util.AttributeSet
import com.mvntst.auto.auto.mvncntrltst.BaseEchoView

class CustomEchoView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : BaseEchoView(context, attrs, defStyleAttr) {

    /**
     * Print echo log
     */
    fun echo() {
        secureEcho()
    }
}