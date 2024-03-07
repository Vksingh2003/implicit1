package com.example.implicit1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webbutton=findViewById<CardView>(R.id.cardweb)
        val camerabutton=findViewById<CardView>(R.id.cardCamera)
        webbutton.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.youtube.com/watch?v=LYEqeUr-158&list=RDGMEM916WJxafRUGgOvd6dVJkeQ&start_radio=1&rv=7A74vluAsNs")
            startActivity(intent)

        }
        camerabutton.setOnClickListener{
            val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}