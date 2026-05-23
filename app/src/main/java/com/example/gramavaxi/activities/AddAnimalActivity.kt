package com.example.gramavaxi.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gramavaxi.R

class AddAnimalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_animal)

        val etAnimalName = findViewById<EditText>(R.id.etAnimalName)
        val etAnimalType = findViewById<EditText>(R.id.etAnimalType)
        val etOwnerName = findViewById<EditText>(R.id.etOwnerName)
        val etVillageName = findViewById<EditText>(R.id.etVillageName)
        val etVaccineDate = findViewById<EditText>(R.id.etVaccineDate)

        val btnSaveAnimal = findViewById<Button>(R.id.btnSaveAnimal)
        val btnVaccination = findViewById<Button>(R.id.btnVaccination)

        btnSaveAnimal.setOnClickListener {

            val animalName = etAnimalName.text.toString()
            val animalType = etAnimalType.text.toString()
            val ownerName = etOwnerName.text.toString()
            val villageName = etVillageName.text.toString()
            val vaccineDate = etVaccineDate.text.toString()

            Toast.makeText(
                this,
                "Animal Added Successfully",
                Toast.LENGTH_SHORT
            ).show()
        }

        btnVaccination.setOnClickListener {

            val intent = Intent(
                this,
                VaccinationActivity::class.java
            )

            startActivity(intent)
        }
    }
}