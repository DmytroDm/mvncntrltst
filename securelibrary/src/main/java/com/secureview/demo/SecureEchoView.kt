package com.secureview.demo

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import androidx.annotation.RestrictTo
import com.google.android.material.textview.MaterialTextView

class SecureEchoView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : MaterialTextView(context, attrs, defStyleAttr) {

    /**
     * Print echo log
     */
    @RestrictTo(RestrictTo.Scope.LIBRARY)
    fun echo() {
        val stackTrace = Thread.currentThread().stackTrace
        val clientPkg = context.packageName
        stackTrace.forEachIndexed { index, stackTraceElement ->
            Log.d("Test", "statTrace element = $stackTraceElement, position = $index")
            if (stackTraceElement.toString().contains(clientPkg)) {
                Log.d(
                    "Test",
                    "Called from client, statTrace element = $stackTraceElement, clientPackage = $clientPkg"
                )
            }
        }
        Log.d("Test", "stackTrace = $stackTrace")
        SecureEcho.echo()
    }
}