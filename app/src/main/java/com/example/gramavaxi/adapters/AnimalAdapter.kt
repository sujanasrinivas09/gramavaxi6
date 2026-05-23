package com.example.gramavaxi.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gramavaxi.R
import com.example.gramavaxi.models.AnimalModel

class AnimalAdapter(
    private val animalList: List<AnimalModel>
) : RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    class AnimalViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val animalName: TextView =
            itemView.findViewById(R.id.animalNameText)

        val animalType: TextView =
            itemView.findViewById(R.id.animalTypeText)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AnimalViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.animal_item, parent, false)

        return AnimalViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: AnimalViewHolder,
        position: Int
    ) {

        val animal = animalList[position]

        holder.animalName.text = animal.animalName
        holder.animalType.text = animal.animalType
    }

    override fun getItemCount(): Int {
        return animalList.size
    }
}