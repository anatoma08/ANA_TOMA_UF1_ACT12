package com.example.ana_toma_uf1_act12

import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val horizontalScrollView = findViewById<HorizontalScrollView>(R.id.horizontalScrollView)
        val toggleScroll = findViewById<ToggleButton>(R.id.toggleScroll)


        toggleScroll.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {

                horizontalScrollView.isHorizontalScrollBarEnabled = false
            } else {

                horizontalScrollView.isHorizontalScrollBarEnabled = true
            }
        }
    }
}