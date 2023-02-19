package edu.iest.calificaciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var tvAprobado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val calRecibida = intent.getIntExtra("Cal", 0)

        tvAprobado = findViewById(R.id.tvAprobado)

        tvAprobado.setText("Felicidades! Aprobaste la materia con $calRecibida")
    }
}


