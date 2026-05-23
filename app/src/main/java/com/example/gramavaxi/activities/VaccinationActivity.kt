package com.example.gramavaxi.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gramavaxi.R

class VaccinationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vaccination)

        val etAnimalId = findViewById<EditText>(R.id.etAnimalId)
        val etVaccineName = findViewById<EditText>(R.id.etVaccineName)
        val etVaccinationDate = findViewById<EditText>(R.id.etVaccinationDate)

        val btnSave = findViewById<Button>(R.id.btnSave)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnSave.setOnClickListener {

            val animalId = etAnimalId.text.toString()
            val vaccineName = etVaccineName.text.toString()
            val vaccinationDate = etVaccinationDate.text.toString()

            Toast.makeText(
                this,
                "Vaccination Saved",
                Toast.LENGTH_SHORT
            ).show()
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}