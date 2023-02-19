package edu.iest.calificaciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {

    private lateinit var tvReprobado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val calRecibida = intent.getIntExtra("Cal", 0)

        tvReprobado = findViewById(R.id.tvReprobado)

        tvReprobado.setText("Obtuviste un $calRecibida")

        val bnRegresar = findViewById<Button>(R.id.bnRegresar)
        bnRegresar.setOnClickListener {
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}