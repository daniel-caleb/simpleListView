package com.example.mysimplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ListView=findViewById<ListView>(R.id.ListView)
        val latenames= arrayOf("Mercedes Benz","Audi","Jaguar","BMW","Range Rover")
        var arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1,latenames)
        ListView.adapter=arrayAdapter
        ListView.setOnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(this, "A German Luxury Car" +latenames[position], Toast.LENGTH_LONG).show()
        }
    }
}