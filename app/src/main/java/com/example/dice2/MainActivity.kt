package com.example.dice2

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

//    lateinit var textView:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//        Palettes/UI elements
        val myTextView: TextView
        val myButton: Button
        val imageView: ImageView

//        Set them
        myTextView = findViewById(R.id.textView)
        myButton = findViewById(R.id.button)
        imageView = findViewById(R.id.imageView)

//        Logic
        val imageList = listOf(
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6
        )


        myButton.setOnClickListener {
            val randomNumber = Random.nextInt(0,imageList.size)

            Log.d("randomNumber", "Random number is $randomNumber")

            myTextView.text = "Your random dice number is ${randomNumber + 1}"
            imageView.setImageResource(imageList[randomNumber])

        }








    }
}