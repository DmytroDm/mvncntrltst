package com.mvntst.auto.auto.testmavencentral

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mvntst.auto.auto.mvncntrltst.EchoView
import com.secureview.demo.SecureEchoView
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<EchoView>(R.id.echoView)?.let { echoView ->
            echoView.setOnClickListener {
                echoView.echo()
            }
        }
        findViewById<SecureEchoView>(R.id.secureEchoView)?.let { echoView ->
            echoView.setOnClickListener {
                thread(start = true) {
                    echoView.echo()
                }
            }
        }
    }
}