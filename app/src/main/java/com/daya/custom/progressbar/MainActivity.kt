package com.daya.custom.progressbar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "Activity created.")

        var progress = 0
        timer(period = 200) {
            progressBar1.progress = progress
            progressBar2.progress = progress
            progressBar3.progress = progress
            progress = if (progress < 100) progress + 10 else 0
            Log.d("Timer", "$progress")
        }
    }
}
