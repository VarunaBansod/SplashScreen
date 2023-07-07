package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            val imgView: ImageView = findViewById(R.id.imageView)
            Glide.with(this).load(R.drawable.netflix_icon).into(imgView)

            val intent = Intent(applicationContext, NextScreen::class.java)
            startActivity(intent)
        }, 15000)
    }
}
//        showGif()
////        val letsGoBtn=findViewById<Button>(R.id.LetsGoBtn)
////
////        letsGoBtn.setOnClickListener{
////            intent = Intent(applicationContext, Screen2::class.java)
////            startActivity(intent)   }
//    }
//    private fun showGif()
//    {
//        val imgView: ImageView = findViewById(R.id.imageView)
//        Glide.with(this).load(R.drawable.netflix_icon).into(imgView)
//    }
//    }
