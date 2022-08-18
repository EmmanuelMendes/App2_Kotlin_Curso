package com.example.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {
    lateinit var text : TextView
    val frase = arrayOf(
        "Eu não sei o que quero ser, mas sei muito bem o que não quero me tornar; Nietzsche",
        "A esperança é o sonho do homem acordado; Aristóteles",
        "Daria tudo que sei pela metade do que ignoro.; René Descartes",
        "Tente mover o mundo – o primeiro passo será mover a si mesmo.: Platão",
        "Posso não concordar com nenhuma das palavras que você disser, mas defenderei até a morte o direito de você dizê-las.; Voltaire"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.textoFrase) as TextView


    }
    fun gerarFrase(view: View){
        val totalIntensArray= frase.size
        val fraseAleratoria = Random().nextInt(totalIntensArray)

        text.setText( frase[ fraseAleratoria])


    }

}