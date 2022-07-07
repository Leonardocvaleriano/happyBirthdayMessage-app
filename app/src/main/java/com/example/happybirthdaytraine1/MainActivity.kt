package com.example.happybirthdaytraine1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val title = findViewById<TextView>(R.id.title)
        title.text = "Happy Birthday!"

        val firstText = findViewById<TextView>(R.id.firstText)
        firstText.text = "I'm glad it's your birthday, I hope you have a wonderful birthday!"

        val secondText = findViewById<TextView>(R.id.secondText)
        secondText.text = "I wish you all the best on your special day."

        val fourtyText = findViewById<TextView>(R.id.thirdText)
        fourtyText.text = "I love u..."

        val endText = findViewById<TextView>(R.id.endText)
        endText.text = "From Leo."

    }
}