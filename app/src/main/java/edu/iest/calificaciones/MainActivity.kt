package edu.iest.calificaciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var bnEnviar: Button? = null
    private var etCalificacion : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inicializarVistas()
        asignarEventos()
        //var califRecibida = intent.getIntExtra("Cal", 0)
    }

    override fun onClick(p0: View?){
        val number = etCalificacion?.text.toString().toIntOrNull()

        if(number == null){
            Toast.makeText(this, "Debes llenar el formulario", Toast.LENGTH_LONG).show()
            return
        }

        when(p0?.id){
            R.id.bnEnviar -> {
                if (number >= 7){
                    bnEnviar?.setOnClickListener{
                        val i1 = Intent(this, SecondActivity::class.java)
                        i1.putExtra("Cal", number)
                        //start next activity
                        startActivity(i1)
                        finish()
                    }
                } else {
                    bnEnviar?.setOnClickListener{
                        val i2 = Intent(this, ThirdActivity::class.java)
                        i2.putExtra("Cal", number)
                        //start next activity
                        startActivity(i2)
                        finish()
                    }
                }
            }
        }
    }

    private fun inicializarVistas(){
        bnEnviar = findViewById(R.id.bnEnviar)
        etCalificacion = findViewById(R.id.etCalificacion)
    }

    private fun asignarEventos(){
        bnEnviar?.setOnClickListener(this)
    }
}