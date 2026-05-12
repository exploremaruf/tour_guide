package com.example.tourguide
import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val names = DataSource.places.map { it.name }

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            names
        )

        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val place = DataSource.places[position]

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("index", position)
            startActivity(intent)
        }
    }
}