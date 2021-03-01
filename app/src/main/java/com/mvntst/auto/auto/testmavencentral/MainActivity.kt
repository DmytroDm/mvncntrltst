package com.mvntst.auto.auto.testmavencentral

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mvntst.auto.auto.mvncntrltst.EchoView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<EchoView>(R.id.tvHelloWorld)?.let { echoView ->
            echoView.setOnClickListener {
                echoView.echo()
            }
        }
    }
}