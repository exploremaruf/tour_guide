package com.example.tourguide

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val listView = findViewById<ListView>(R.id.listView)
//
//        // টেস্ট করার জন্য কাস্টম অ্যাডাপ্টার সেট (২০ বার রিপিট হবে)
//        val adapter = TestListAdapter(itemCount = 20)
//        listView.adapter = adapter
//
//        listView.setOnItemClickListener { _, _, position, _ ->
//            // টেস্ট রান সফল হলে এখানে আসল ডাটা পজিশন অনুযায়ী পাঠানো যাবে
//            val intent = Intent(this, DetailActivity::class.java)
//            intent.putExtra("index", position)
//            startActivity(intent)
//        }
    }

    // টেস্টের জন্য কাস্টম লিস্ট অ্যাডাপ্টার
    class TestListAdapter(private val itemCount: Int) : BaseAdapter() {

        override fun getCount(): Int = itemCount

        override fun getItem(position: Int): Any = position

        override fun getItemId(position: Int): Long = position.toLong()

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val view = convertView ?: LayoutInflater.from(parent?.context)
                .inflate(R.layout.item_place, parent, false)

            val placeName = view.findViewById<TextView>(R.id.placeName)
            val placeDescription = view.findViewById<TextView>(R.id.placeDescription)

            // টেস্ট করার জন্য নামের শেষে নাম্বার যোগ করে দিচ্ছি
            placeName.text = "Chittagong Spot ${position + 1}"
            placeDescription.text = "Beautiful sea port city with hills and natural beauty. (Spot No. ${position + 1})"

            return view
        }
    }
}