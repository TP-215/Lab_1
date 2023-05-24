package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSpider = findViewById<Button>(R.id.button_hedgehog)
        buttonSpider.setOnClickListener {
            HedgehogIntent()
        }
        val buttonHippo = findViewById<Button>(R.id.button_panda)
        buttonHippo.setOnClickListener {
            PandaIntent()
        }
        val buttonCrocodile = findViewById<Button>(R.id.button_cat)
        buttonCrocodile.setOnClickListener {
            CatIntent()
        }
    }

    val Hedgehog = Animal("Роман Яблукович", "Я люблю банани")
    val Panda = Animal("Мфрійка Миколаївна", "Я люблю каву")
    val Cat = Animal("Мурзик Васильович", "Я ловелас")
    fun HedgehogIntent() {
        val secActivity = Intent(this, ActivityInfo::class.java).also{
            it.putExtra("name", Hedgehog.about)
            startActivity(it)
        }
    }

    fun PandaIntent() {
        val secActivity = Intent(this, ActivityInfo::class.java).also{
            it.putExtra("name", Panda.about)
            startActivity(it)
        }
    }

    fun CatIntent() {
        val secActivity = Intent(this, ActivityInfo::class.java).also{
            it.putExtra("name", Cat.about)
            startActivity(it)
        }
    }

}
data class Animal(val name: String, val about: String) {}