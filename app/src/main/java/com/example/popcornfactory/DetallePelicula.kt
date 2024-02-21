package com.example.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_detalle_pelicula.*
import kotlinx.android.synthetic.main.pelicula.iv_pelicula

import kotlinx.android.synthetic.main.pelicula.tv_nombre_pelicula


class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)
        val bundle = intent.extras
        var aR = 0
        if (bundle != null){
            aR = bundle.getInt("numeroAsientos")
            iv_pelicula.setImageResource(bundle.getInt("header"))
            tv_nombre_pelicula.setText(bundle.getString("nombre"))
            tv_pelicula_desc.setText(bundle.getString("synopsis"))
            asientosRestantes.setText("$aR asientos Restantes")
        }
        if (aR == 0){
            comprarTicket.isActivated = false
        }else{
            comprarTicket.setOnClickListener{
                val intent : Intent(this,SeleccionAsientos::class.java)
                intent.putExtra("pelicula")
            }
        }
    }
}