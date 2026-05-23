package com.example.gramavaxi.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gramavaxi.R
import com.example.gramavaxi.adapters.AnimalAdapter
import com.example.gramavaxi.models.AnimalModel

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val addAnimalButton =
            findViewById<Button>(R.id.addAnimalButton)

        val recyclerView =
            findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager =
            LinearLayoutManager(this)

        val animalList = listOf(

            AnimalModel(
                "Lakshmi",
                "Cow",
                "Ramesh",
                "Angondhalli",
                "FMD Vaccine",
                "20-05-2026",
                5
            ),

            AnimalModel(
                "Bunny",
                "Goat",
                "Suresh",
                "Kolar",
                "Goat Pox Vaccine",
                "25-05-2026",
                2
            )

        )

        recyclerView.adapter =
            AnimalAdapter(animalList)

        addAnimalButton.setOnClickListener {

            startActivity(
                Intent(this, AddAnimalActivity::class.java)
            )

        }
    }
}