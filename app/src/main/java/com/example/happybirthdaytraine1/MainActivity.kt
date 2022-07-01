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
        title.text = "Happy Birthday Léo!"

        val firstText = findViewById<TextView>(R.id.firstText)
        firstText.text = "I would like to wish u a happy Birthday... Also i want u to know that I'll stay by ur side forever."

        val secondText = findViewById<TextView>(R.id.secondText)
        secondText.text = "Don't forget, I'm always be here for you, my Dear Léo. Btw, you look awesome today..."

        val fourtyText = findViewById<TextView>(R.id.fourtyText)
        fourtyText.text = "I love u"

        val endText = findViewById<TextView>(R.id.endText)
        endText.text = "From Leo."

    }
}