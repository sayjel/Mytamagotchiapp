package com.example.mytamagotchiapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    // UI declare variables
    private lateinit var feedButton: Button
    private lateinit var cleanButton: Button
    private lateinit var playButton: Button
    private lateinit var imageView: ImageView
    private lateinit var healthTextView: TextView
    private lateinit var hungerTextView: TextView
    private lateinit var cleanTextView: TextView


    private var initialHealth = 20
    private var initialHunger = 20
    private var initialClean = 20

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val image = findViewById<ImageView>(R.id.imageView)

        val healthTextView=findViewById<EditText>(R.id.edittextHealth)
        val hungerTextView= findViewById<EditText>(R.id.edittextHunger)
        val cleanTextView= findViewById<EditText>(R.id.edittextClean)

        val feedButton=findViewById<Button>(R.id.feedButton)
        val cleanButton=findViewById<Button>(R.id.cleanButton)
        val playButton=findViewById<Button>(R.id.playButton)

        hungerTextView.setText(initialHunger.toString())
        healthTextView.setText(initialHealth.toString())
        cleanTextView.setText(initialClean.toString())

        playButton.setOnClickListener {
            initialHunger -= 10
            initialClean -= 10
            initialHealth += 10
            healthTextView.setText(initialHealth.toString())
            image.setImageResource(R.drawable.dogplay)
        }

        feedButton.setOnClickListener {
            initialHunger += 10
            initialHealth += 10
            hungerTextView.setText(initialHunger.toString())
            image.setImageResource(R.drawable.dogeat)
        }

        cleanButton.setOnClickListener {
            initialHealth += 10
            initialClean += 10
            cleanTextView.setText(initialClean.toString())
            image.setImageResource(R.drawable.dogbath)
        }
    }

}
