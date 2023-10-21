package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textview1 = findViewById<TextView>(R.id.textView)
        val textview2 = findViewById<TextView>(R.id.textView2)
        val textview3 = findViewById<TextView>(R.id.textView3)
        val desc1 = findViewById<TextView>(R.id.desc1)
        val desc2 = findViewById<TextView>(R.id.desc2)
        val desc3 = findViewById<TextView>(R.id.desc3)
        val button1=findViewById<Button>(R.id.button2)
        val button2=findViewById<Button>(R.id.button3)
        val button3=findViewById<Button>(R.id.button4)
        data class Animals (
            val name: String,
            val desc: String,
            val shortdesc: String="House pet"
        )
        val animal2 = Animals("Dog","The dog is a domesticated descendant of the wolf. Also called the domestic dog, it is derived from extinct Pleistocene wolves")
        val animal1 = Animals("Cat","The cat is a domesticated species of small carnivorous mammal. It is the only domesticated species in the family Felidae and is commonly referred to as the domestic cat or house cat to distinguish it from the wild members of the family")
        val animal3 = Animals("Hamster","Hamsters are rodents (order Rodentia) belonging to the subfamily Cricetinae, which contains 19 species classified in seven genera")
        textview1.text=animal1.name
        textview2.text=animal2.name
        textview3.text=animal3.name
        desc1.text=animal1.shortdesc
        desc2.text=animal2.shortdesc
        desc3.text=animal3.shortdesc
        button1.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java).apply{putExtra("animal",animal1.desc)})
        }
        button2.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java).apply{putExtra("animal",animal2.desc)})
        }
        button3.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java).apply{putExtra("animal",animal3.desc)})
        }

    }
}