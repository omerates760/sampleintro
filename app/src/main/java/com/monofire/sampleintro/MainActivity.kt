package com.monofire.sampleintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layout=findViewById<MotionLayout>(R.id.mmLayout)
        layout.transitionToEnd()
    }
}