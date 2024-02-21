package com.example.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent

import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intento : Intent(this,CatalogoActivity::class.java)
        val button : Button - findViewById(R.id.boton) as Button
        button.setOnClickListener(){
            startActivity(intento)
        }
    }


}