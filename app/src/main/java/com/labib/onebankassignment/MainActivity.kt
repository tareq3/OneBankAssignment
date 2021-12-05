package com.labib.onebankassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import androidx.recyclerview.widget.LinearLayoutManager


import androidx.recyclerview.widget.RecyclerView
import android.widget.CompoundButton
import androidx.recyclerview.widget.GridLayoutManager


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val headline: ArrayList<String> = ArrayList()
        headline.add("Why some Japanese feel like foreigners in their own country")
        headline.add("Swiss set to vote on immigration")
        headline.add("Navalny out of hospital after poisoning")
        headline.add("Chinese state media slams 'dirty' TikTok deal")
        headline.add("Cindy McCain endorses Biden")
        headline.add("This EU country relies on coal for 80 percent of domestic energy")
        headline.add("India and China come to agreement to stabilize tensions at disputed border")
        headline.add("Teen accused of Tessa Majors' murder allegedly confessed to dad on recorded line")
        headline.add("Fight over Supreme Court already shaking up Senate races")
        headline.add("53-year-old charged for allegedly yelling racial slur and throwing glass bottle at jogger")
        headline.add("Huawei says 'survival is the goal'")
        headline.add("Duke and Duchess of Sussex weigh in on upcoming US election")
        headline.add("Court sentences two men to death after ruling a fire that killed 260 people was arson")
        headline.add("This data is ringing 'alarm bells'")
        headline.add("Have sex, live longer, heart attack victims told")
        // Instantiate RecyclerView
        // Instantiate RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler)

        // Setting Up RecyclerView
        findViewById<Switch>(R.id.switch1).setOnCheckedChangeListener { buttonView, isChecked ->
            // do something, the isChecked will be
            // true if the switch is in the On position
            if(isChecked){
                // Setting Up RecyclerView
                recyclerView.layoutManager = LinearLayoutManager(this)

                // Connect RecyclerView to the List Adapter and Data Sources

                // Connect RecyclerView to the List Adapter and Data Sources
                val listAdapter =MainAdapter(this, headline, "body")

                // Display the RecyclerView

                // Display the RecyclerView
                recyclerView.adapter = listAdapter
            }else{
                // Setting Up RecyclerView
                recyclerView.layoutManager = GridLayoutManager(this, 2)

                // Connect RecyclerView to the List Adapter and Data Sources

                // Connect RecyclerView to the List Adapter and Data Sources
                val listAdapter =MainAdapter(this, headline, "body")

                // Display the RecyclerView

                // Display the RecyclerView
                recyclerView.adapter = listAdapter
            }
        }
        // Setting Up RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Connect RecyclerView to the List Adapter and Data Sources

        // Connect RecyclerView to the List Adapter and Data Sources
        val listAdapter =MainAdapter(this, headline, "body")

        // Display the RecyclerView

        // Display the RecyclerView
        recyclerView.adapter = listAdapter
    }
}