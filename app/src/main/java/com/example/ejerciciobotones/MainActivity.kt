package com.example.ejerciciobotones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var bOne: Button
    private lateinit var bTwo: Button
    private lateinit var bThree: Button
    private lateinit var tvDescription: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bOne = findViewById(R.id.bOne)
        bTwo = findViewById(R.id.bTwo)
        bThree = findViewById(R.id.bThree)
        tvDescription = findViewById(R.id.tvDescription)

        bOne.setOnClickListener{
            tvDescription.text = "Uno"
        }

        bTwo.setOnClickListener {
            tvDescription.text = "Dos"
        }

        bThree.setOnClickListener {
            tvDescription.text = "Tres"
        }
    }
}