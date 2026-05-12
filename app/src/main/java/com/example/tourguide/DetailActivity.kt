package com.example.tourguide
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val index = intent.getIntExtra("index", 0)
        val place = DataSource.places[index]

        val title = findViewById<TextView>(R.id.titleText)
        val details = findViewById<TextView>(R.id.detailText)
        val mainImage = findViewById<ImageView>(R.id.mainImage)
        val galleryLayout = findViewById<LinearLayout>(R.id.galleryLayout)
        title.text = place.name
        details.text = place.details

        Glide.with(this)
            .load(place.image)
            .into(mainImage)

        // Add gallery images dynamically
        for (imgUrl in place.gallery) {
            val imageView = ImageView(this)
            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                600
            )
            params.setMargins(0, 10, 0, 10)
            imageView.layoutParams = params
            imageView.scaleType = ImageView.ScaleType.CENTER_CROP

            Glide.with(this)
                .load(imgUrl)
                .into(imageView)

            galleryLayout.addView(imageView)
        }
    }
}