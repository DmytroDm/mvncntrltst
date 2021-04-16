package com.mvntst.auto.auto.testmavencentral

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mvntst.auto.auto.mvncntrltst.Echo
import com.mvntst.auto.auto.mvncntrltst.EchoView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<EchoView>(R.id.tvHelloWorld)?.let { echoView ->
            echoView.setOnClickListener {
                Echo().printEcho()
            }
        }
        findViewById<TextView>(R.id.tvHelloWorldCustom)?.let { echoView ->
            echoView.setOnClickListener {
                CustomEcho().secureEcho()
            }
        }
    }
}