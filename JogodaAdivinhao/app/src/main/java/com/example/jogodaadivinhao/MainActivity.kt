package com.example.jogodaadivinhao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val randomValue = Random.nextInt(0, 1000)

    fun adivinharNumero(view: View) {
        val palpite: EditText = findViewById(R.id.palpite)
        val dica: TextView = findViewById(R.id.dica)
        val like: ImageView = findViewById(R.id.like)
        val deslike: ImageView = findViewById(R.id.deslike)

        if(palpite.text.toString().toInt() < randomValue) {
            dica.text = "Seu palpite foi menor do que o número sorteado"
            deslike.visibility = View.VISIBLE
        }else if(palpite.text.toString().toInt() > randomValue) {
            dica.text = "Seu palpite foi maior do que o número sorteado"
            deslike.visibility = View.VISIBLE
        }else{
            dica.text = "ACERTOU!!!"
            deslike.visibility = View.INVISIBLE
            like.visibility = View.VISIBLE
        }
    }
}