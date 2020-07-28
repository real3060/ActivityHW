package com.example.activityhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class FilmDescriptionActivity : AppCompatActivity() {
    private lateinit var filmTitle: TextView
    private lateinit var filmImg: ImageView
    private lateinit var filmDescriptionText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.film_description_layout)
        val intent = Intent()
        filmTitle = findViewById(R.id.film_title)
        filmImg = findViewById(R.id.film_imgView)
        filmDescriptionText = findViewById(R.id.film_description_textView)

        val filmTitleIntent = getIntent().extras?.getString("filmTitle")
        if (filmTitleIntent != null) filmTitle.setText(filmTitleIntent.toString())
        val filmImgIntent = getIntent().extras?.getInt("filmImg")
        if (filmImgIntent != null) {
            filmImg.setImageResource(filmImgIntent)
        }
        val filmFullDescriptionIntent = getIntent().extras?.getString("filmDesc")
        Log.i("test", "${filmFullDescriptionIntent}")
        if(filmFullDescriptionIntent != null) filmDescriptionText.setText(filmFullDescriptionIntent.toString())

    }
}