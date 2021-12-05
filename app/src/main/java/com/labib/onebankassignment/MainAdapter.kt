package com.labib.onebankassignment

import android.content.Context
import android.content.Intent
import androidx.recyclerview.widget.RecyclerView



import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup

import android.widget.TextView
import androidx.cardview.widget.CardView


/***
 * Created by labib on 05,December,2021.
 */

class MainAdapter     // Construct the Primary method for this class and determine its mandatory inputs
    (// Declaring the inputs for the Adapter class
  private val  context: Context, private val newsHeadlines: ArrayList<String>, private val newsSnippet: String
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    // Instantiate the UI Elements from the Content Layout
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var textView: TextView
        var textBody: TextView

        init {
            textView = view.findViewById(R.id.textTitle)
            textBody = view.findViewById(R.id.textBody)
            textView.setOnClickListener {

            }
        }
    }

    // Inflate the Content Layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(com.labib.onebankassignment.R.layout.card_layout, parent, false)
        return ViewHolder(view)
    }

    // Bind or assign the data elements to the UI Elements
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        // Get content of Device List
        val deviceName = newsHeadlines[position]

        // Assign the content to each RecyclerView row
        val itemHolder = holder as ViewHolder
        itemHolder.textView.text = deviceName
        itemHolder.textBody.text = newsSnippet

        itemHolder.textView.setOnClickListener {
            context.startActivity(Intent(context, OfferActivity::class.java))
        }
    }

    // Getting the Data Source size
    override fun getItemCount(): Int {
        return newsHeadlines.size
    }
}