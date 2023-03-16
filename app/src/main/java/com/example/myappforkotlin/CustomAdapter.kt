package com.example.myappforkotlin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class CustomAdapter (val animalList: ArrayList<Animal>, val context: Context):RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val imageView: ImageView = itemView.findViewById(R.id.tv_image)
        val textViewName: TextView = itemView.findViewById(R.id.tv_name)
        val textViewDescShort: TextView = itemView.findViewById(R.id.tv_detail)
        val button: Button = itemView.findViewById(R.id.item_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return animalList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val animal = animalList[position]
        holder.imageView.setImageResource(animal.image_icon)
        holder.textViewName.text = animal.name
        holder.textViewDescShort.text = animal.shortDesc

        holder.button.setOnClickListener {
            var passingName = animalList[position].name
            var passingDescFull = animalList[position].shortDesc
            var passingFullDesc = animalList[position].fullDesc


            var intent = Intent(context, SecondActivity:: class.java)
            intent.putExtra("passingName", passingName)
            intent.putExtra("passingDescFull", passingDescFull)
            intent.putExtra("passingFullDesc", passingFullDesc)

            context.startActivity(intent)
        }
    }



}































/*import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    val titles = arrayOf("Barsik",
    "Bobik",
    "Izabella")

    val details = arrayOf("Cat",
    "Dog",
    "Rabbit")

    val images = intArrayOf(
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground)

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])
    }


    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
        }
    }
}*/