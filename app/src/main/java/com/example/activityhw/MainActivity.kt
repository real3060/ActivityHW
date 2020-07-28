package com.example.activityhw

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var imgView: ImageView
    private lateinit var filmDescription: TextView
    private lateinit var fullDescription: String
    private val textColor = Color.parseColor("#ffcb27")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.the_greatest_button -> {

                val intent = Intent(this, FilmDescriptionActivity::class.java)
                textView = findViewById(R.id.the_greatest_text)
                textView.setTextColor(textColor)
                intent.putExtra("filmTitle", textView.text.toString())
                intent.putExtra("filmImg", R.drawable.thegreatestshowman)
                intent.putExtra("filmDesc", resources.getString(R.string.the_greatest_showman_full))
                startActivity(intent)
            }
            R.id.la_la_land_button -> {
                val intent = Intent(this, FilmDescriptionActivity::class.java)
                textView = findViewById(R.id.la_la_land_text)
                textView.setTextColor(textColor)
                intent.putExtra("filmTitle", textView.text.toString())
                intent.putExtra("filmImg", R.drawable.lalaland)
                intent.putExtra("filmDesc", resources.getString(R.string.la_la_land_full))
                startActivity(intent)
            }
            R.id.the_notebook_button -> {
                val intent = Intent(this, FilmDescriptionActivity::class.java)
                textView = findViewById(R.id.the_notebook_text)
                textView.setTextColor(textColor)
                intent.putExtra("filmTitle", textView.text.toString())
                intent.putExtra("filmImg", R.drawable.thenotebook)
                intent.putExtra("filmDesc", resources.getString(R.string.the_notebook_full))
                startActivity(intent)
            }
        }
    }
    override fun onResume() {
        super.onResume()
        Log.i("TAG", "onResume()")
        
//        textView.setTextColor(Color.parseColor("ffffff"))
    }
}