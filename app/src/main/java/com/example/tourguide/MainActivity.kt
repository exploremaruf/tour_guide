package com.example.tourguide

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.progressindicator.CircularProgressIndicator

class MainActivity : AppCompatActivity() {

    companion object {
        var isRefreshing = false
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rvTrendingDestinations = findViewById<RecyclerView>(R.id.rvTrendingDestinations)
        val loadingIndicator = findViewById<CircularProgressIndicator>(R.id.loadingIndicator)

        if (isRefreshing) {
            loadingIndicator.visibility = View.VISIBLE
            rvTrendingDestinations.alpha = 0f

            window.decorView.postDelayed({
                loadingIndicator.visibility = View.GONE
                rvTrendingDestinations.animate().alpha(1f).setDuration(300).start()
                isRefreshing = false
            }, 300)
        }

        val placesList = DataSource.places

        val adapter = TrendingPlacesAdapter(placesList) { position ->
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("index", position)
            }
            startActivity(intent)
        }

        rvTrendingDestinations.adapter = adapter

        rvTrendingDestinations.layoutManager =
            androidx.recyclerview.widget.StaggeredGridLayoutManager(
                2,
                androidx.recyclerview.widget.StaggeredGridLayoutManager.VERTICAL
            )

        val bottomBar = findViewById<AnimatedBottomBar>(R.id.animatedBottomBar)
        bottomBar.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    isRefreshing = true
                    recreate()
                    true
                }

                else -> true
            }
        }
    }

    //*******************end of on create****************************************************************

    class TrendingPlacesAdapter(
        private val places: List<Place>,
        private val onItemClick: (Int) -> Unit
    ) : RecyclerView.Adapter<TrendingPlacesAdapter.PlaceViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_destination_card, parent, false)
            return PlaceViewHolder(view)
        }

        override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
            val currentPlace = places[position]
            holder.tvDestinationTitle.text = currentPlace.name

            val layoutParams = holder.ivDestinationImage.layoutParams
            layoutParams.height = if (position % 2 == 0) 650 else 800
            holder.ivDestinationImage.layoutParams = layoutParams

            Glide.with(holder.itemView.context)
                .load(currentPlace.image)
                .apply(com.bumptech.glide.request.RequestOptions.centerCropTransform())
                .placeholder(R.drawable.japan)
                .into(holder.ivDestinationImage)

            holder.itemView.setOnClickListener { onItemClick(position) }
        }

        override fun getItemCount(): Int = places.size

        class PlaceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val ivDestinationImage: ImageView = itemView.findViewById(R.id.ivDestinationImage)
            val tvDestinationTitle: TextView = itemView.findViewById(R.id.tvDestinationTitle)
        }
    }
}