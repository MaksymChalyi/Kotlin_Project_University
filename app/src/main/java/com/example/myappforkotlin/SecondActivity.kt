package com.example.myappforkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var fullName: TextView // For example: Bobik
    lateinit var desc: TextView // For example: cat
    lateinit var picture: ImageView
    lateinit var fullDesc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        // Look for our fields on SecondActivity
        fullName = findViewById(R.id.tv_secondName)
        picture = findViewById(R.id.imageView2)
        desc = findViewById(R.id.tv_secondDesc)
        fullDesc = findViewById(R.id.tv_descFact)

        // Take parameters from MainActivity by key
        var passingName = intent.getStringExtra("passingName") // Accepts parameters from the first activity
        var passingDescFull = intent.getStringExtra("passingDescFull")
        var passingFullDesc = intent.getStringExtra("passingFullDesc")

        // Set parametrs on SecondActivity
        fullName.text = passingName
        desc.text = passingDescFull
        fullDesc.text = passingFullDesc

        // Set image on SecondActivity
        when(passingName){
            getString(R.string.NameAnimal1)->picture.setImageResource(R.drawable.cat_full) // If the name is 'cat', then set a photo of the cat
            getString(R.string.NameAnimal2)->picture.setImageResource(R.drawable.dog_full)
            getString(R.string.NameAnimal3)->picture.setImageResource(R.drawable.rabbit_full)
        }

    }
}