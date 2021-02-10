package com.mvntst.auto.auto.testmavencentral

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mvntst.auto.auto.mvncntrltst.Echo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvHelloWorld?.setOnClickListener {
            Echo.echo()
        }
    }
}