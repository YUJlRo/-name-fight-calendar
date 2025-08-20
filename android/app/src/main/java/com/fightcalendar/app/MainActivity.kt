package com.fightcalendar.app

import android.os.Bundle
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = FrameLayout(this)
        val tv = TextView(this).apply {
            text = "Fight Calendar"
            textSize = 20f
            setPadding(32, 32, 32, 32)
            gravity = Gravity.CENTER
        }
        root.addView(tv)
        setContentView(root)
    }
}
