package com.nallely.engm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btfisica)
        button.setOnClickListener {
            navegarFisica()

        }
        val buttonmate = findViewById<Button>(R.id.btmate)
        buttonmate.setOnClickListener {
            navegarMate()

        }
        val buttoningles = findViewById<Button>(R.id.ingles)
        buttoningles.setOnClickListener {
            navegaringles()

        }
        val buttonquimica = findViewById<Button>(R.id.btquimica)
        buttonquimica.setOnClickListener {
            navegarQuimica()

        }
    }
    private fun navegarFisica() {
        val intent = Intent(this, Fisica::class.java)
        startActivity(intent)
    }

    private fun navegarMate() {
        val intent = Intent(this, Matematicas::class.java)
        startActivity(intent)
    }
    private fun navegaringles() {
        val intent = Intent(this, iNGLES::class.java)
        startActivity(intent)
    }
    private fun navegarQuimica() {
        val intent = Intent(this, Quimica::class.java)
        startActivity(intent)
    }


}
