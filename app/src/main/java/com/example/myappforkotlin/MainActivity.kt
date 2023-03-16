package com.example.myappforkotlin


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView // Create variable of RecyclerView
    lateinit var animalList: ArrayList<Animal> // Create list of Anamal(s)
    lateinit var animalAdapter: CustomAdapter // Create variable of Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView) // Find RecyclerView by id
        recyclerView.layoutManager = LinearLayoutManager(this)

        animalList = ArrayList() // Create list of animal

        animalList.add(Animal( // Add cat to list
            getString(R.string.NameAnimal1),
            getString(R.string.kindAnimal1),
            R.drawable.cat,
            getString(R.string.fullDescriptionOfCat)))

        animalList.add(Animal( // Add dog to list
            getString(R.string.NameAnimal2),
            getString(R.string.kindAnimal2),
            R.drawable.dog ,
            getString(R.string.fullDescriptionOfDog)))

        animalList.add(Animal( // Add rabbit to list
            getString(R.string.NameAnimal3),
            getString(R.string.kindAnimal3),
            R.drawable.rabbit,
            getString(R.string.fullDescriptionOfRabbit)))
        
        animalAdapter = CustomAdapter(animalList, this)
        recyclerView.adapter = animalAdapter


    }
}