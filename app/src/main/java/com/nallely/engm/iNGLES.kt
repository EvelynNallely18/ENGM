package com.nallely.engm

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast

class iNGLES : AppCompatActivity() {
    @SuppressLint("CutPasteId", "SuspiciousIndentation", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingles)


        val tabla: TableLayout = findViewById(R.id.tabla)
        val spinner: Spinner = findViewById(R.id.verbs)
        val spinner2: Spinner = findViewById(R.id.objeto)
        val buttonMostar: Button = findViewById(R.id.mostrar)
        val buttonSali: Button = findViewById(R.id.salir)


        val item = listOf("Numeros", "Animales", "Preguntas", "Saludos")
        val NumerosItem = listOf("1 al 10", "10 al 20", "20 al 30", "30 al 40", "40 al 50", "50 al 60", "60 al 70", "70 al 80", "80 al 90", "90 al 100")
        val AnimalesItem = listOf("Pajaros", "Peces", "Mamiferos", "Reptiles", "Insectos", "Animales de granja")
        val PreguntasItem = listOf("Preguntas")
        val SaludosItem = listOf("Formales", "Informales")


        // codigo para cargar los item en el spinner
        val adaptador = ArrayAdapter(this@iNGLES, android.R.layout.simple_spinner_item, item)
        spinner.adapter = adaptador


        // adaptador para escuchar que item he selecionado
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val selectedItem = p0!!.getItemAtPosition(p2).toString()
                when (selectedItem) {
                    "Numeros" -> {
                        val adaptadorT = ArrayAdapter(
                            this@iNGLES,
                            android.R.layout.simple_spinner_item,
                            NumerosItem
                        )
                        spinner2.adapter = adaptadorT
                        Toast.makeText(this@iNGLES, "Numeros", Toast.LENGTH_LONG).show()
                    }

                    "Animales" -> {
                        val adaptadorL = ArrayAdapter(
                            this@iNGLES,
                            android.R.layout.simple_spinner_item,
                            AnimalesItem
                        )
                        spinner2.adapter = adaptadorL
                        Toast.makeText(this@iNGLES, "Animales", Toast.LENGTH_LONG).show()

                    }

                    "Preguntas" -> {
                        val adaptadorP = ArrayAdapter(
                            this@iNGLES,
                            android.R.layout.simple_spinner_item,
                            PreguntasItem
                        )
                        spinner2.adapter = adaptadorP
                        Toast.makeText(this@iNGLES, "Preguntas", Toast.LENGTH_LONG).show()

                    }

                    "Saludos" -> {
                        val adaptadorP = ArrayAdapter(
                            this@iNGLES,
                            android.R.layout.simple_spinner_item,
                            SaludosItem
                        )
                        spinner2.adapter = adaptadorP
                        Toast.makeText(this@iNGLES, "Saludos", Toast.LENGTH_LONG).show()

                    }
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        buttonSali.setOnClickListener {
            navegariNGLES()
        }
        // boton para caLcular
        buttonMostar.setOnClickListener {
            if (spinner2.toString().isEmpty()) {
                Toast.makeText(this, "Seleccione  ", Toast.LENGTH_LONG).show()
            } else {
                if (tabla.childCount > 0) {
                    tabla.removeAllViews() // limpiar la tabla
                    llenarTabla(spinner2, tabla)
                } else {
                    llenarTabla(spinner2, tabla)
                }
            }
        }
    }

    //BOTON SALIR
    private fun navegariNGLES() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    //SPINNER
    fun llenarTabla(spinner: Spinner, tabla: TableLayout) {
        when (spinner.selectedItem) {
            "1 al 10" -> {
                val tableRow1 = TableRow(this)
                tableRow1.setBackgroundResource(R.color.verdeagua)
                val textView0 = TextView(this)
                textView0.text = " Numero "
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this)
                textView2.text = " Ingles "
                textView2.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this)
                tableRow2.setBackgroundResource(R.color.verde)
                val textView3 = TextView(this)
                textView3.text = " 0 "
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this)
                textView4.text = "zero "
                textView4.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this)
                tableRow3.setBackgroundResource(R.color.naranja)
                val textView5 = TextView(this)
                textView5.text = " 1 "
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this)
                textView6.text = "one "
                textView6.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this)
                tableRow4.setBackgroundResource(R.color.verde)
                val textView7 = TextView(this)
                textView7.text = " 2 "
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this)
                textView8.text = "two"
                textView8.setTextColor(Color.BLACK)

                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this)
                tableRow5.setBackgroundResource(R.color.naranja)
                val textView9 = TextView(this)
                textView9.text = " 3 "
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this)
                textView10.text = "three"
                textView10.setTextColor(Color.BLACK)

                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this)
                tableRow6.setBackgroundResource(R.color.verde)
                val textView11 = TextView(this)
                textView11.text = " 4 "
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this)
                textView12.text = "four"
                textView12.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this)
                tableRow7.setBackgroundResource(R.color.naranja)
                val textView13 = TextView(this)
                textView13.text = " 5 "
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this)
                textView14.text = " five"
                textView14.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this)
                tableRow8.setBackgroundResource(R.color.verde)
                val textView15 = TextView(this)
                textView15.text = " 6 "
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this)
                textView16.text = "six"
                textView16.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this)
                tableRow9.setBackgroundResource(R.color.naranja)
                val textView17 = TextView(this)
                textView17.text = " 7 "
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this)
                textView18.text = "seven"
                textView18.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tabla.addView(tableRow9)

                val tableRow10 = TableRow(this)
                tableRow10.setBackgroundResource(R.color.verde)
                val textView19 = TextView(this)
                textView19.text = " 8 "
                textView19.setTextColor(Color.BLACK)
                val textView20 = TextView(this)
                textView20.text = "eight"
                textView20.setTextColor(Color.BLACK)

                tableRow10.addView(textView19)
                tableRow10.addView(textView20)
                tabla.addView(tableRow10)

                val tableRow11 = TableRow(this)
                tableRow11.setBackgroundResource(R.color.naranja)
                val textView21 = TextView(this)
                textView21.text = " 9 "
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this)
                textView22.text = "nine"
                textView22.setTextColor(Color.BLACK)

                tableRow11.addView(textView21)
                tableRow11.addView(textView22)
                tabla.addView(tableRow11)

                val tableRow12 = TableRow(this)
                tableRow12.setBackgroundResource(R.color.verde)
                val textView23 = TextView(this)
                textView23.text = " 10 "
                textView23.setTextColor(Color.BLACK)
                val textView24 = TextView(this)
                textView24.text = "ten"
                textView24.setTextColor(Color.BLACK)

                tableRow12.addView(textView23)
                tableRow12.addView(textView24)
                tabla.addView(tableRow12)

            }

            "10 al 20" -> {
                val tableRow1 = TableRow(this)
                tableRow1.setBackgroundResource(R.color.verde)
                val textView0 = TextView(this)
                textView0.text = " 10"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this)
                textView2.text = " ten "
                textView2.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this)
                tableRow2.setBackgroundResource(R.color.morado)
                val textView3 = TextView(this)
                textView3.text = " 11 "
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this)
                textView4.text = "eleven "
                textView4.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this)
                tableRow3.setBackgroundResource(R.color.verde)
                val textView5 = TextView(this)
                textView5.text = " 12 "
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this)
                textView6.text = "twelve "
                textView6.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this)
                tableRow4.setBackgroundResource(R.color.morado)
                val textView7 = TextView(this)
                textView7.text = " 13 "
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this)
                textView8.text = "thirteen"
                textView8.setTextColor(Color.BLACK)

                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this)
                tableRow5.setBackgroundResource(R.color.verde)
                val textView9 = TextView(this)
                textView9.text = " 14 "
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this)
                textView10.text = "fourteen"
                textView10.setTextColor(Color.BLACK)

                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this)
                tableRow6.setBackgroundResource(R.color.morado)
                val textView11 = TextView(this)
                textView11.text = " 15 "
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this)
                textView12.text = "fifteen"
                textView12.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this)
                tableRow7.setBackgroundResource(R.color.verde)
                val textView13 = TextView(this)
                textView13.text = " 16 "
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this)
                textView14.text = " sixteen"
                textView14.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this)
                tableRow8.setBackgroundResource(R.color.morado)
                val textView15 = TextView(this)
                textView15.text = " 17 "
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this)
                textView16.text = "seventeen"
                textView16.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this)
                tableRow9.setBackgroundResource(R.color.verde)
                val textView17 = TextView(this)
                textView17.text = " 18 "
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this)
                textView18.text = "eigteen"
                textView18.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tabla.addView(tableRow9)

                val tableRow10 = TableRow(this)
                tableRow10.setBackgroundResource(R.color.morado)
                val textView19 = TextView(this)
                textView19.text = " 19 "
                textView19.setTextColor(Color.BLACK)
                val textView20 = TextView(this)
                textView20.text = "nineteen"
                textView20.setTextColor(Color.BLACK)

                tableRow10.addView(textView19)
                tableRow10.addView(textView20)
                tabla.addView(tableRow10)

                val tableRow11 = TableRow(this)
                tableRow11.setBackgroundResource(R.color.verde)
                val textView21 = TextView(this)
                textView21.text = " 20 "
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this)
                textView22.text = "twenty"
                textView22.setTextColor(Color.BLACK)

                tableRow11.addView(textView21)
                tableRow11.addView(textView22)
                tabla.addView(tableRow11)

            }

            "20 al 30" -> {
                val tableRow1 = TableRow(this)
                tableRow1.setBackgroundResource(R.color.rosa)
                val textView0 = TextView(this)
                textView0.text = " 20"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this)
                textView2.text = " twenty "
                textView2.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this)
                tableRow2.setBackgroundResource(R.color.verdeclaro)
                val textView3 = TextView(this)
                textView3.text = " 21 "
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this)
                textView4.text = "twenty-one "
                textView4.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this)
                tableRow3.setBackgroundResource(R.color.rosa)
                val textView5 = TextView(this)
                textView5.text = " 22 "
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this)
                textView6.text = "twenty-two "
                textView6.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this)
                tableRow4.setBackgroundResource(R.color.verdeclaro)
                val textView7 = TextView(this)
                textView7.text = " 23 "
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this)
                textView8.text = "twenty-three"
                textView8.setTextColor(Color.BLACK)

                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this)
                tableRow5.setBackgroundResource(R.color.rosa)
                val textView9 = TextView(this)
                textView9.text = " 24 "
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this)
                textView10.text = "twenty-four"
                textView10.setTextColor(Color.BLACK)

                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this)
                tableRow6.setBackgroundResource(R.color.verdeclaro)
                val textView11 = TextView(this)
                textView11.text = " 25 "
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this)
                textView12.text = "twenty-five"
                textView12.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this)
                tableRow7.setBackgroundResource(R.color.rosa)
                val textView13 = TextView(this)
                textView13.text = " 26 "
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this)
                textView14.text = " twenty-six"
                textView14.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this)
                tableRow8.setBackgroundResource(R.color.verdeclaro)
                val textView15 = TextView(this)
                textView15.text = " 27 "
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this)
                textView16.text = "twenty-seven"
                textView16.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this)
                tableRow9.setBackgroundResource(R.color.rosa)
                val textView17 = TextView(this)
                textView17.text = " 28 "
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this)
                textView18.text = "twenty-eight"
                textView18.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tabla.addView(tableRow9)

                val tableRow10 = TableRow(this)
                tableRow10.setBackgroundResource(R.color.verdeclaro)
                val textView19 = TextView(this)
                textView19.text = " 29 "
                textView19.setTextColor(Color.BLACK)
                val textView20 = TextView(this)
                textView20.text = "twenty-nine"
                textView20.setTextColor(Color.BLACK)

                tableRow10.addView(textView19)
                tableRow10.addView(textView20)
                tabla.addView(tableRow10)

                val tableRow11 = TableRow(this)
                tableRow11.setBackgroundResource(R.color.rosa)
                val textView21 = TextView(this)
                textView21.text = " 30 "
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this)
                textView22.text = "thirty"
                textView22.setTextColor(Color.BLACK)

                tableRow11.addView(textView21)
                tableRow11.addView(textView22)
                tabla.addView(tableRow11)
            }

            "30 al 40" -> {
                val tableRow1 = TableRow(this)
                tableRow1.setBackgroundResource(R.color.verdeagua)
                val textView0 = TextView(this)
                textView0.text = " 30"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this)
                textView2.text = " thirty "
                textView2.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this)
                tableRow2.setBackgroundResource(R.color.amarillo)
                val textView3 = TextView(this)
                textView3.text = " 31 "
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this)
                textView4.text = " thirty-one "
                textView4.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this)
                tableRow3.setBackgroundResource(R.color.verdeagua)
                val textView5 = TextView(this)
                textView5.text = " 32 "
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this)
                textView6.text = " thirty-two "
                textView6.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this)
                tableRow4.setBackgroundResource(R.color.amarillo)
                val textView7 = TextView(this)
                textView7.text = " 33 "
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this)
                textView8.text = " thirty-three"
                textView8.setTextColor(Color.BLACK)

                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this)
                tableRow5.setBackgroundResource(R.color.verdeagua)
                val textView9 = TextView(this)
                textView9.text = " 34 "
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this)
                textView10.text = " thirty-four"
                textView10.setTextColor(Color.BLACK)

                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this)
                tableRow6.setBackgroundResource(R.color.amarillo)
                val textView11 = TextView(this)
                textView11.text = " 35 "
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this)
                textView12.text = " thirty-five"
                textView12.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this)
                tableRow7.setBackgroundResource(R.color.verdeagua)
                val textView13 = TextView(this)
                textView13.text = " 36 "
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this)
                textView14.text = "  thirty-six"
                textView14.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this)
                tableRow8.setBackgroundResource(R.color.amarillo)
                val textView15 = TextView(this)
                textView15.text = " 37 "
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this)
                textView16.text = " thirty-seven"
                textView16.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this)
                tableRow9.setBackgroundResource(R.color.verdeagua)
                val textView17 = TextView(this)
                textView17.text = " 38 "
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this)
                textView18.text = " thirty-eight"
                textView18.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tabla.addView(tableRow9)

                val tableRow10 = TableRow(this)
                tableRow10.setBackgroundResource(R.color.amarillo)
                val textView19 = TextView(this)
                textView19.text = " 39 "
                textView19.setTextColor(Color.BLACK)
                val textView20 = TextView(this)
                textView20.text = " thirty-nine"
                textView20.setTextColor(Color.BLACK)

                tableRow10.addView(textView19)
                tableRow10.addView(textView20)
                tabla.addView(tableRow10)

                val tableRow11 = TableRow(this)
                tableRow11.setBackgroundResource(R.color.verdeagua)
                val textView21 = TextView(this)
                textView21.text = " 40 "
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this)
                textView22.text = "forty"
                textView22.setTextColor(Color.BLACK)

                tableRow11.addView(textView21)
                tableRow11.addView(textView22)
                tabla.addView(tableRow11)
            }

            "40 al 50" -> {
                val tableRow1 = TableRow(this)
                tableRow1.setBackgroundResource(R.color.naranja)
                val textView0 = TextView(this)
                textView0.text = " 40"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this)
                textView2.text = "forty"
                textView2.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this)
                tableRow2.setBackgroundResource(R.color.dorado)
                val textView3 = TextView(this)
                textView3.text = " 41 "
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this)
                textView4.text = " forty-one "
                textView4.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this)
                tableRow3.setBackgroundResource(R.color.naranja)
                val textView5 = TextView(this)
                textView5.text = " 42 "
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this)
                textView6.text = " forty-two "
                textView6.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this)
                tableRow4.setBackgroundResource(R.color.dorado)
                val textView7 = TextView(this)
                textView7.text = " 43 "
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this)
                textView8.text = " forty-three"
                textView8.setTextColor(Color.BLACK)

                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this)
                tableRow5.setBackgroundResource(R.color.naranja)
                val textView9 = TextView(this)
                textView9.text = " 44 "
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this)
                textView10.text = " forty-four"
                textView10.setTextColor(Color.BLACK)

                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this)
                tableRow6.setBackgroundResource(R.color.dorado)
                val textView11 = TextView(this)
                textView11.text = " 45 "
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this)
                textView12.text = " forty-five"
                textView12.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this)
                tableRow7.setBackgroundResource(R.color.naranja)
                val textView13 = TextView(this)
                textView13.text = " 46 "
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this)
                textView14.text = "  forty-six"
                textView14.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this)
                tableRow8.setBackgroundResource(R.color.dorado)
                val textView15 = TextView(this)
                textView15.text = " 47 "
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this)
                textView16.text = "forty-seven"
                textView16.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this)
                tableRow9.setBackgroundResource(R.color.naranja)
                val textView17 = TextView(this)
                textView17.text = " 48 "
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this)
                textView18.text = " forty-eight"
                textView18.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tabla.addView(tableRow9)

                val tableRow10 = TableRow(this)
                tableRow10.setBackgroundResource(R.color.dorado)
                val textView19 = TextView(this)
                textView19.text = " 49 "
                textView19.setTextColor(Color.BLACK)
                val textView20 = TextView(this)
                textView20.text = "forty-nine"
                textView20.setTextColor(Color.BLACK)

                tableRow10.addView(textView19)
                tableRow10.addView(textView20)
                tabla.addView(tableRow10)

                val tableRow11 = TableRow(this)
                tableRow11.setBackgroundResource(R.color.naranja)
                val textView21 = TextView(this)
                textView21.text = " 50 "
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this)
                textView22.text = "fiffty"
                textView22.setTextColor(Color.BLACK)

                tableRow11.addView(textView21)
                tableRow11.addView(textView22)
                tabla.addView(tableRow11)

            }

            "50 al 60" -> {
                    val tableRow2 = TableRow(this)
                    tableRow2.setBackgroundResource(R.color.verde)
                    val textView3 = TextView(this)
                    textView3.text = " 50 "
                    textView3.setTextColor(Color.BLACK)
                    val textView4 = TextView(this)
                    textView4.text = "fifty"
                    textView4.setTextColor(Color.BLACK)

                    tableRow2.addView(textView3)
                    tableRow2.addView(textView4)
                    tabla.addView(tableRow2)

                    val tableRow3 = TableRow(this)
                    tableRow3.setBackgroundResource(R.color.naranja)
                    val textView5 = TextView(this)
                    textView5.text = " 51 "
                    textView5.setTextColor(Color.BLACK)
                    val textView6 = TextView(this)
                    textView6.text = "fifty-one "
                    textView6.setTextColor(Color.BLACK)

                    tableRow3.addView(textView5)
                    tableRow3.addView(textView6)
                    tabla.addView(tableRow3)

                    val tableRow4 = TableRow(this)
                    tableRow4.setBackgroundResource(R.color.verde)
                    val textView7 = TextView(this)
                    textView7.text = " 52 "
                    textView7.setTextColor(Color.BLACK)
                    val textView8 = TextView(this)
                    textView8.text = "fifty-two"
                    textView8.setTextColor(Color.BLACK)

                    tableRow4.addView(textView7)
                    tableRow4.addView(textView8)
                    tabla.addView(tableRow4)

                    val tableRow5 = TableRow(this)
                    tableRow5.setBackgroundResource(R.color.naranja)
                    val textView9 = TextView(this)
                    textView9.text = "53 "
                    textView9.setTextColor(Color.BLACK)
                    val textView10 = TextView(this)
                    textView10.text = "fifty-three"
                    textView10.setTextColor(Color.BLACK)

                    tableRow5.addView(textView9)
                    tableRow5.addView(textView10)
                    tabla.addView(tableRow5)

                    val tableRow6 = TableRow(this)
                    tableRow6.setBackgroundResource(R.color.verde)
                    val textView11 = TextView(this)
                    textView11.text = "54 "
                    textView11.setTextColor(Color.BLACK)
                    val textView12 = TextView(this)
                    textView12.text = "fifty-four"
                    textView12.setTextColor(Color.BLACK)

                    tableRow6.addView(textView11)
                    tableRow6.addView(textView12)
                    tabla.addView(tableRow6)

                    val tableRow7 = TableRow(this)
                    tableRow7.setBackgroundResource(R.color.naranja)
                    val textView13 = TextView(this)
                    textView13.text = "55 "
                    textView13.setTextColor(Color.BLACK)
                    val textView14 = TextView(this)
                    textView14.text = "fifty-five"
                    textView14.setTextColor(Color.BLACK)

                    tableRow7.addView(textView13)
                    tableRow7.addView(textView14)
                    tabla.addView(tableRow7)

                    val tableRow8 = TableRow(this)
                    tableRow8.setBackgroundResource(R.color.verde)
                    val textView15 = TextView(this)
                    textView15.text = "56 "
                    textView15.setTextColor(Color.BLACK)
                    val textView16 = TextView(this)
                    textView16.text = "fifty-six"
                    textView16.setTextColor(Color.BLACK)

                    tableRow8.addView(textView15)
                    tableRow8.addView(textView16)
                    tabla.addView(tableRow8)


                    val tableRow9 = TableRow(this)
                    tableRow9.setBackgroundResource(R.color.naranja)
                    val textView17 = TextView(this)
                    textView17.text = "57 "
                    textView17.setTextColor(Color.BLACK)
                    val textView18 = TextView(this)
                    textView18.text = "fifty-seven"
                    textView18.setTextColor(Color.BLACK)

                    tableRow9.addView(textView17)
                    tableRow9.addView(textView18)
                    tabla.addView(tableRow9)

                    val tableRow10 = TableRow(this)
                    tableRow10.setBackgroundResource(R.color.verde)
                    val textView19 = TextView(this)
                    textView19.text = "58 "
                    textView19.setTextColor(Color.BLACK)
                    val textView20 = TextView(this)
                    textView20.text = "fifty-eight"
                    textView20.setTextColor(Color.BLACK)

                    tableRow10.addView(textView19)
                    tableRow10.addView(textView20)
                    tabla.addView(tableRow10)

                    val tableRow11 = TableRow(this)
                    tableRow11.setBackgroundResource(R.color.naranja)
                    val textView21 = TextView(this)
                    textView21.text = "59 "
                    textView21.setTextColor(Color.BLACK)
                    val textView22 = TextView(this)
                    textView22.text = "fifty-nine"
                    textView22.setTextColor(Color.BLACK)

                    tableRow11.addView(textView21)
                    tableRow11.addView(textView22)
                    tabla.addView(tableRow11)

                    val tableRow12 = TableRow(this)
                    tableRow12.setBackgroundResource(R.color.verde)
                    val textView23 = TextView(this)
                    textView23.text = " 60 "
                    textView23.setTextColor(Color.BLACK)
                    val textView24 = TextView(this)
                    textView24.text = "sixty"
                    textView24.setTextColor(Color.BLACK)

                    tableRow12.addView(textView23)
                    tableRow12.addView(textView24)
                    tabla.addView(tableRow12)

                }

            "60 al 70"->{
                val tableRow1 = TableRow(this)
                tableRow1.setBackgroundResource(R.color.verde)
                val textView0 = TextView(this)
                textView0.text = " 60"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this)
                textView2.text = "sixty "
                textView2.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this)
                tableRow2.setBackgroundResource(R.color.morado)
                val textView3 = TextView(this)
                textView3.text = " 61 "
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this)
                textView4.text = "sixty-one"
                textView4.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this)
                tableRow3.setBackgroundResource(R.color.verde)
                val textView5 = TextView(this)
                textView5.text = " 62 "
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this)
                textView6.text = "sixty-two "
                textView6.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this)
                tableRow4.setBackgroundResource(R.color.morado)
                val textView7 = TextView(this)
                textView7.text = " 63 "
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this)
                textView8.text = "sixty-three"
                textView8.setTextColor(Color.BLACK)

                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this)
                tableRow5.setBackgroundResource(R.color.verde)
                val textView9 = TextView(this)
                textView9.text = " 64 "
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this)
                textView10.text = "sixty-four"
                textView10.setTextColor(Color.BLACK)

                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this)
                tableRow6.setBackgroundResource(R.color.morado)
                val textView11 = TextView(this)
                textView11.text = " 65 "
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this)
                textView12.text = "sixty-five"
                textView12.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this)
                tableRow7.setBackgroundResource(R.color.verde)
                val textView13 = TextView(this)
                textView13.text = " 66"
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this)
                textView14.text = "sixty-six"
                textView14.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this)
                tableRow8.setBackgroundResource(R.color.morado)
                val textView15 = TextView(this)
                textView15.text = " 67 "
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this)
                textView16.text = "sixty-seven"
                textView16.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this)
                tableRow9.setBackgroundResource(R.color.verde)
                val textView17 = TextView(this)
                textView17.text = " 68 "
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this)
                textView18.text = "sixty-eight"
                textView18.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tabla.addView(tableRow9)

                val tableRow10 = TableRow(this)
                tableRow10.setBackgroundResource(R.color.morado)
                val textView19 = TextView(this)
                textView19.text = " 69 "
                textView19.setTextColor(Color.BLACK)
                val textView20 = TextView(this)
                textView20.text = "sixty-nine"
                textView20.setTextColor(Color.BLACK)

                tableRow10.addView(textView19)
                tableRow10.addView(textView20)
                tabla.addView(tableRow10)

                val tableRow11 = TableRow(this)
                tableRow11.setBackgroundResource(R.color.verde)
                val textView21 = TextView(this)
                textView21.text = " 70 "
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this)
                textView22.text = "seventy"
                textView22.setTextColor(Color.BLACK)

                tableRow11.addView(textView21)
                tableRow11.addView(textView22)
                tabla.addView(tableRow11)

            }

            "70 al 80"->{
                    val tableRow1 = TableRow(this)
                    tableRow1.setBackgroundResource(R.color.rosa)
                    val textView0 = TextView(this)
                    textView0.text = " 70"
                    textView0.setTextColor(Color.BLACK)
                    val textView2 = TextView(this)
                    textView2.text = " seventy"
                    textView2.setTextColor(Color.BLACK)


                    tableRow1.addView(textView0)
                    tableRow1.addView(textView2)
                    tabla.addView(tableRow1)


                    val tableRow2 = TableRow(this)
                    tableRow2.setBackgroundResource(R.color.verdeclaro)
                    val textView3 = TextView(this)
                    textView3.text = " 71 "
                    textView3.setTextColor(Color.BLACK)
                    val textView4 = TextView(this)
                    textView4.text = "seventy-one "
                    textView4.setTextColor(Color.BLACK)

                    tableRow2.addView(textView3)
                    tableRow2.addView(textView4)
                    tabla.addView(tableRow2)

                    val tableRow3 = TableRow(this)
                    tableRow3.setBackgroundResource(R.color.rosa)
                    val textView5 = TextView(this)
                    textView5.text = " 72 "
                    textView5.setTextColor(Color.BLACK)
                    val textView6 = TextView(this)
                    textView6.text = "seventy-two "
                    textView6.setTextColor(Color.BLACK)

                    tableRow3.addView(textView5)
                    tableRow3.addView(textView6)
                    tabla.addView(tableRow3)

                    val tableRow4 = TableRow(this)
                    tableRow4.setBackgroundResource(R.color.verdeclaro)
                    val textView7 = TextView(this)
                    textView7.text = " 73 "
                    textView7.setTextColor(Color.BLACK)
                    val textView8 = TextView(this)
                    textView8.text = "seventy-three"
                    textView8.setTextColor(Color.BLACK)

                    tableRow4.addView(textView7)
                    tableRow4.addView(textView8)
                    tabla.addView(tableRow4)

                    val tableRow5 = TableRow(this)
                    tableRow5.setBackgroundResource(R.color.rosa)
                    val textView9 = TextView(this)
                    textView9.text = " 74 "
                    textView9.setTextColor(Color.BLACK)
                    val textView10 = TextView(this)
                    textView10.text = "seventy-four"
                    textView10.setTextColor(Color.BLACK)

                    tableRow5.addView(textView9)
                    tableRow5.addView(textView10)
                    tabla.addView(tableRow5)

                    val tableRow6 = TableRow(this)
                    tableRow6.setBackgroundResource(R.color.verdeclaro)
                    val textView11 = TextView(this)
                    textView11.text = " 75 "
                    textView11.setTextColor(Color.BLACK)
                    val textView12 = TextView(this)
                    textView12.text = "seventy-five"
                    textView12.setTextColor(Color.BLACK)

                    tableRow6.addView(textView11)
                    tableRow6.addView(textView12)
                    tabla.addView(tableRow6)

                    val tableRow7 = TableRow(this)
                    tableRow7.setBackgroundResource(R.color.rosa)
                    val textView13 = TextView(this)
                    textView13.text = " 76 "
                    textView13.setTextColor(Color.BLACK)
                    val textView14 = TextView(this)
                    textView14.text = " seventy-six"
                    textView14.setTextColor(Color.BLACK)

                    tableRow7.addView(textView13)
                    tableRow7.addView(textView14)
                    tabla.addView(tableRow7)

                    val tableRow8 = TableRow(this)
                    tableRow8.setBackgroundResource(R.color.verdeclaro)
                    val textView15 = TextView(this)
                    textView15.text = " 77 "
                    textView15.setTextColor(Color.BLACK)
                    val textView16 = TextView(this)
                    textView16.text = "seventy-seven"
                    textView16.setTextColor(Color.BLACK)

                    tableRow8.addView(textView15)
                    tableRow8.addView(textView16)
                    tabla.addView(tableRow8)


                    val tableRow9 = TableRow(this)
                    tableRow9.setBackgroundResource(R.color.rosa)
                    val textView17 = TextView(this)
                    textView17.text = " 78 "
                    textView17.setTextColor(Color.BLACK)
                    val textView18 = TextView(this)
                    textView18.text = "seventy-eight"
                    textView18.setTextColor(Color.BLACK)

                    tableRow9.addView(textView17)
                    tableRow9.addView(textView18)
                    tabla.addView(tableRow9)

                    val tableRow10 = TableRow(this)
                    tableRow10.setBackgroundResource(R.color.verdeclaro)
                    val textView19 = TextView(this)
                    textView19.text = " 79 "
                    textView19.setTextColor(Color.BLACK)
                    val textView20 = TextView(this)
                    textView20.text = "seventy-nine"
                    textView20.setTextColor(Color.BLACK)

                    tableRow10.addView(textView19)
                    tableRow10.addView(textView20)
                    tabla.addView(tableRow10)

                    val tableRow11 = TableRow(this)
                    tableRow11.setBackgroundResource(R.color.rosa)
                    val textView21 = TextView(this)
                    textView21.text = " 80 "
                    textView21.setTextColor(Color.BLACK)
                    val textView22 = TextView(this)
                    textView22.text = "eighty"
                    textView22.setTextColor(Color.BLACK)

                    tableRow11.addView(textView21)
                    tableRow11.addView(textView22)
                    tabla.addView(tableRow11)
                }

            "80 al 90"->{
                val tableRow1 = TableRow(this)
                tableRow1.setBackgroundResource(R.color.verdeagua)
                val textView0 = TextView(this)
                textView0.text = " 80"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this)
                textView2.text = "eighty"
                textView2.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this)
                tableRow2.setBackgroundResource(R.color.amarillo)
                val textView3 = TextView(this)
                textView3.text = " 81 "
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this)
                textView4.text = " eighty-one "
                textView4.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this)
                tableRow3.setBackgroundResource(R.color.verdeagua)
                val textView5 = TextView(this)
                textView5.text = " 82 "
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this)
                textView6.text = " eighty-two "
                textView6.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this)
                tableRow4.setBackgroundResource(R.color.amarillo)
                val textView7 = TextView(this)
                textView7.text = " 83 "
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this)
                textView8.text = "eighty-three"
                textView8.setTextColor(Color.BLACK)

                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this)
                tableRow5.setBackgroundResource(R.color.verdeagua)
                val textView9 = TextView(this)
                textView9.text = " 84 "
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this)
                textView10.text = " eighty-four"
                textView10.setTextColor(Color.BLACK)

                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this)
                tableRow6.setBackgroundResource(R.color.amarillo)
                val textView11 = TextView(this)
                textView11.text = " 85 "
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this)
                textView12.text = "eighty-five"
                textView12.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this)
                tableRow7.setBackgroundResource(R.color.verdeagua)
                val textView13 = TextView(this)
                textView13.text = " 86 "
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this)
                textView14.text = " eighty-six"
                textView14.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this)
                tableRow8.setBackgroundResource(R.color.amarillo)
                val textView15 = TextView(this)
                textView15.text = " 87 "
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this)
                textView16.text = "eighty-seven"
                textView16.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this)
                tableRow9.setBackgroundResource(R.color.verdeagua)
                val textView17 = TextView(this)
                textView17.text = " 88 "
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this)
                textView18.text = " eighty-eight"
                textView18.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tabla.addView(tableRow9)

                val tableRow10 = TableRow(this)
                tableRow10.setBackgroundResource(R.color.amarillo)
                val textView19 = TextView(this)
                textView19.text = " 89 "
                textView19.setTextColor(Color.BLACK)
                val textView20 = TextView(this)
                textView20.text = "eighty-nine"
                textView20.setTextColor(Color.BLACK)

                tableRow10.addView(textView19)
                tableRow10.addView(textView20)
                tabla.addView(tableRow10)

                val tableRow11 = TableRow(this)
                tableRow11.setBackgroundResource(R.color.verdeagua)
                val textView21 = TextView(this)
                textView21.text = " 90 "
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this)
                textView22.text = "ninety"
                textView22.setTextColor(Color.BLACK)

                tableRow11.addView(textView21)
                tableRow11.addView(textView22)
                tabla.addView(tableRow11)
            }

            "90 al 100"->{
                val tableRow1 = TableRow(this)
                tableRow1.setBackgroundResource(R.color.naranja)
                val textView0 = TextView(this)
                textView0.text = " 90"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this)
                textView2.text = "ninety"
                textView2.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this)
                tableRow2.setBackgroundResource(R.color.dorado)
                val textView3 = TextView(this)
                textView3.text = " 91 "
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this)
                textView4.text = "ninety-one "
                textView4.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this)
                tableRow3.setBackgroundResource(R.color.naranja)
                val textView5 = TextView(this)
                textView5.text = " 92 "
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this)
                textView6.text = "ninety-two "
                textView6.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this)
                tableRow4.setBackgroundResource(R.color.dorado)
                val textView7 = TextView(this)
                textView7.text = " 93 "
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this)
                textView8.text = "ninety-three"
                textView8.setTextColor(Color.BLACK)

                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this)
                tableRow5.setBackgroundResource(R.color.naranja)
                val textView9 = TextView(this)
                textView9.text = " 94 "
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this)
                textView10.text = "ninety-four"
                textView10.setTextColor(Color.BLACK)

                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this)
                tableRow6.setBackgroundResource(R.color.dorado)
                val textView11 = TextView(this)
                textView11.text = "95 "
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this)
                textView12.text = " ninety-five"
                textView12.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this)
                tableRow7.setBackgroundResource(R.color.naranja)
                val textView13 = TextView(this)
                textView13.text = " 96 "
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this)
                textView14.text = "ninety-six"
                textView14.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this)
                tableRow8.setBackgroundResource(R.color.dorado)
                val textView15 = TextView(this)
                textView15.text = " 97 "
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this)
                textView16.text = "ninety-seven"
                textView16.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this)
                tableRow9.setBackgroundResource(R.color.naranja)
                val textView17 = TextView(this)
                textView17.text = " 98 "
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this)
                textView18.text = " ninety-eight"
                textView18.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tabla.addView(tableRow9)

                val tableRow10 = TableRow(this)
                tableRow10.setBackgroundResource(R.color.dorado)
                val textView19 = TextView(this)
                textView19.text = " 99 "
                textView19.setTextColor(Color.BLACK)
                val textView20 = TextView(this)
                textView20.text = "ninety-nine"
                textView20.setTextColor(Color.BLACK)

                tableRow10.addView(textView19)
                tableRow10.addView(textView20)
                tabla.addView(tableRow10)

                val tableRow11 = TableRow(this)
                tableRow11.setBackgroundResource(R.color.naranja)
                val textView21 = TextView(this)
                textView21.text = " 100 "
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this)
                textView22.text = "one hundred"
                textView22.setTextColor(Color.BLACK)

                tableRow11.addView(textView21)
                tableRow11.addView(textView22)
                tabla.addView(tableRow11)

            }

            "Preguntas" -> {
                val tableRow1 = TableRow(this)
                tableRow1.setBackgroundResource(R.color.rosa)
                val textView0 = TextView(this)
                textView0.text = " Español"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this)
                textView2.text = " Ingles"
                textView2.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this)
                tableRow2.setBackgroundResource(R.color.verdeclaro)
                val textView3 = TextView(this)
                textView3.text = " ¿Cómo? "
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this)
                textView4.text = "How? "
                textView4.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this)
                tableRow3.setBackgroundResource(R.color.rosa)
                val textView5 = TextView(this)
                textView5.text = "¿Por qué? "
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this)
                textView6.text = "Why? "
                textView6.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this)
                tableRow4.setBackgroundResource(R.color.verdeclaro)
                val textView7 = TextView(this)
                textView7.text = " ¿Quién? "
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this)
                textView8.text = "Who?"
                textView8.setTextColor(Color.BLACK)

                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this)
                tableRow5.setBackgroundResource(R.color.rosa)
                val textView9 = TextView(this)
                textView9.text = "¿Qué?"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this)
                textView10.text = "What?"
                textView10.setTextColor(Color.BLACK)

                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this)
                tableRow6.setBackgroundResource(R.color.verdeclaro)
                val textView11 = TextView(this)
                textView11.text = "¿Cuándo?"
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this)
                textView12.text = "When?"
                textView12.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this)
                tableRow7.setBackgroundResource(R.color.rosa)
                val textView13 = TextView(this)
                textView13.text = "¿Cuál?"
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this)
                textView14.text = "Which?"
                textView14.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this)
                tableRow8.setBackgroundResource(R.color.verdeclaro)
                val textView15 = TextView(this)
                textView15.text = "¿A dónde?"
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this)
                textView16.text = "Where?"
                textView16.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this)
                tableRow9.setBackgroundResource(R.color.rosa)
                val textView17 = TextView(this)
                textView17.text = "¿De quien?"
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this)
                textView18.text = "Whose?"
                textView18.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tabla.addView(tableRow9)

                val tableRow10 = TableRow(this)
                tableRow10.setBackgroundResource(R.color.verdeclaro)
                val textView19 = TextView(this)
                textView19.text = "¿Dónde?, ¿A dónde?"
                textView19.setTextColor(Color.BLACK)
                val textView20 = TextView(this)
                textView20.text = "Where?"
                textView20.setTextColor(Color.BLACK)

                tableRow10.addView(textView19)
                tableRow10.addView(textView20)
                tabla.addView(tableRow10)

                val tableRow11 = TableRow(this)
                tableRow11.setBackgroundResource(R.color.rosa)
                val textView21 = TextView(this)
                textView21.text = "¿Para qué"
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this)
                textView22.text = "What for?"
                textView22.setTextColor(Color.BLACK)

                tableRow11.addView(textView21)
                tableRow11.addView(textView22)
                tabla.addView(tableRow11)

                val tableRow12 = TableRow(this)
                tableRow12.setBackgroundResource(R.color.verdeclaro)
                val textView23 = TextView(this)
                textView23.text = "¿A quién?"
                textView23.setTextColor(Color.BLACK)
                val textView24 = TextView(this)
                textView24.text = "To whom?"
                textView24.setTextColor(Color.BLACK)

                tableRow12.addView(textView23)
                tableRow12.addView(textView24)
                tabla.addView(tableRow12)

                val tableRow13 = TableRow(this)
                tableRow13.setBackgroundResource(R.color.rosa)
                val textView25 = TextView(this)
                textView25.text = "¿Cuánto?(contable)"
                textView25.setTextColor(Color.BLACK)
                val textView26 = TextView(this)
                textView26.text = "How many?"
                textView26.setTextColor(Color.BLACK)

                tableRow13.addView(textView25)
                tableRow13.addView(textView26)
                tabla.addView(tableRow13)

                val tableRow14 = TableRow(this)
                tableRow14.setBackgroundResource(R.color.verdeclaro)
                val textView27 = TextView(this)
                textView27.text = "¿Cuánto?(incontable)"
                textView27.setTextColor(Color.BLACK)
                val textView28 = TextView(this)
                textView28.text = "Hpw much?"
                textView28.setTextColor(Color.BLACK)

                tableRow14.addView(textView27)
                tableRow14.addView(textView28)
                tabla.addView(tableRow14)

                val tableRow21 = TableRow(this)
                tableRow21.setBackgroundResource(R.color.rosa)
                val textView29 = TextView(this)
                textView29.text = "¿Con quién?"
                textView29.setTextColor(Color.BLACK)
                val textView30 = TextView(this)
                textView30.text = "With whom?"
                textView30.setTextColor(Color.BLACK)

                tableRow21.addView(textView29)
                tableRow21.addView(textView30)
                tabla.addView(tableRow21)

                val tableRow15 = TableRow(this)
                tableRow15.setBackgroundResource(R.color.verdeclaro)
                val textView31 = TextView(this)
                textView31.text = "¿De dónde?"
                textView31.setTextColor(Color.BLACK)
                val textView32 = TextView(this)
                textView32.text = "From where?"
                textView32.setTextColor(Color.BLACK)

                tableRow15.addView(textView31)
                tableRow15.addView(textView32)
                tabla.addView(tableRow15)

                val tableRow16 = TableRow(this)
                tableRow16.setBackgroundResource(R.color.rosa)
                val textView33 = TextView(this)
                textView33.text = "¿De qué?"
                textView33.setTextColor(Color.BLACK)
                val textView34 = TextView(this)
                textView34.text = "About what?"
                textView34.setTextColor(Color.BLACK)

                tableRow16.addView(textView33)
                tableRow16.addView(textView34)
                tabla.addView(tableRow16)

                val tableRow17 = TableRow(this)
                tableRow17.setBackgroundResource(R.color.verdeclaro)
                val textView40 = TextView(this)
                textView40.text = "¿De quien?"
                textView40.setTextColor(Color.BLACK)
                val textView35 = TextView(this)
                textView35.text = "About whom?"
                textView35.setTextColor(Color.BLACK)

                tableRow17.addView(textView40)
                tableRow17.addView(textView35)
                tabla.addView(tableRow17)

            }

            "Formales"->{
                val tableRow1 = TableRow(this)
                tableRow1.setBackgroundResource(R.color.verdeagua)
                val textView0 = TextView(this)
                textView0.text = " Epañol"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this)
                textView2.text = "Ingles"
                textView2.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this)
                tableRow2.setBackgroundResource(R.color.amarillo)
                val textView3 = TextView(this)
                textView3.text = "Hola"
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this)
                textView4.text = "Hello"
                textView4.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this)
                tableRow3.setBackgroundResource(R.color.verdeagua)
                val textView5 = TextView(this)
                textView5.text = "Buenos días"
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this)
                textView6.text = "Good morning"
                textView6.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this)
                tableRow4.setBackgroundResource(R.color.amarillo)
                val textView7 = TextView(this)
                textView7.text = "Buenas tardes"
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this)
                textView8.text = "Good afternoon"
                textView8.setTextColor(Color.BLACK)

                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this)
                tableRow5.setBackgroundResource(R.color.verdeagua)
                val textView9 = TextView(this)
                textView9.text = "Buenas noches "
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this)
                textView10.text = "Good evening"
                textView10.setTextColor(Color.BLACK)

                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this)
                tableRow6.setBackgroundResource(R.color.amarillo)
                val textView11 = TextView(this)
                textView11.text = "¿Cómo está usted?"
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this)
                textView12.text = "How are you?"
                textView12.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this)
                tableRow7.setBackgroundResource(R.color.verdeagua)
                val textView13 = TextView(this)
                textView13.text = "Encantada/o de conocerle"
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this)
                textView14.text = "Nice to meet you!"
                textView14.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tabla.addView(tableRow7)

            }

            "Informales"->{
                val tableRow1 = TableRow(this)
                tableRow1.setBackgroundResource(R.color.naranja)
                val textView0 = TextView(this)
                textView0.text = "Español"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this)
                textView2.text = "Ingles"
                textView2.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this)
                tableRow2.setBackgroundResource(R.color.dorado)
                val textView3 = TextView(this)
                textView3.text = "¡Hola!"
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this)
                textView4.text = "Hi! Hey!"
                textView4.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this)
                tableRow3.setBackgroundResource(R.color.naranja)
                val textView5 = TextView(this)
                textView5.text = "¿Cómo va?, ¿Qué hay?"
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this)
                textView6.text = "What's up?"
                textView6.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this)
                tableRow4.setBackgroundResource(R.color.dorado)
                val textView7 = TextView(this)
                textView7.text = "¿Qué hay de nuevo?"
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this)
                textView8.text = "What's new?"
                textView8.setTextColor(Color.BLACK)

                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this)
                tableRow5.setBackgroundResource(R.color.naranja)
                val textView9 = TextView(this)
                textView9.text = "¿Cómo va todo?"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this)
                textView10.text = "How's ir going?"
                textView10.setTextColor(Color.BLACK)

                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this)
                tableRow6.setBackgroundResource(R.color.dorado)
                val textView11 = TextView(this)
                textView11.text = "¿Qué pasó?"
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this)
                textView12.text = "What's going on?"
                textView12.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this)
                tableRow7.setBackgroundResource(R.color.naranja)
                val textView13 = TextView(this)
                textView13.text = " Qué bueno verte"
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this)
                textView14.text = "Good to see you"
                textView14.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this)
                tableRow8.setBackgroundResource(R.color.dorado)
                val textView15 = TextView(this)
                textView15.text = "¿Cómo te va el día?"
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this)
                textView16.text = "How's your day?"
                textView16.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this)
                tableRow9.setBackgroundResource(R.color.naranja)
                val textView17 = TextView(this)
                textView17.text = "¿Cómo te van las cosas?"
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this)
                textView18.text = "How are things?"
                textView18.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tabla.addView(tableRow9)

            }

            "Pajaros"-> {
                val tableRow2 = TableRow(this)
                tableRow2.setBackgroundResource(R.color.verdeclaro)
                val textView3 = TextView(this)
                textView3.text = "Español"
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this)
                textView4.text = "Ingles"
                textView4.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this)
                tableRow3.setBackgroundResource(R.color.rosa)
                val textView5 = TextView(this)
                textView5.text = "Paloma"
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this)
                textView6.text = "Dove"
                textView6.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this)
                tableRow4.setBackgroundResource(R.color.verdeclaro)
                val textView7 = TextView(this)
                textView7.text = "Gorríon"
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this)
                textView8.text = "Sparrow"
                textView8.setTextColor(Color.BLACK)

                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this)
                tableRow5.setBackgroundResource(R.color.rosa)
                val textView9 = TextView(this)
                textView9.text = "Cuervo"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this)
                textView10.text = "Crow"
                textView10.setTextColor(Color.BLACK)

                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this)
                tableRow6.setBackgroundResource(R.color.verdeclaro)
                val textView11 = TextView(this)
                textView11.text = "Águila"
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this)
                textView12.text = "Eagle"
                textView12.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this)
                tableRow7.setBackgroundResource(R.color.rosa)
                val textView13 = TextView(this)
                textView13.text = "Pato"
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this)
                textView14.text = "Duck"
                textView14.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this)
                tableRow8.setBackgroundResource(R.color.verdeclaro)
                val textView15 = TextView(this)
                textView15.text = "Pavo"
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this)
                textView16.text = "Turkey"
                textView16.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this)
                tableRow9.setBackgroundResource(R.color.rosa)
                val textView17 = TextView(this)
                textView17.text = "Pingüino"
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this)
                textView18.text = "Penguin"
                textView18.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tabla.addView(tableRow9)

                val tableRow10 = TableRow(this)
                tableRow10.setBackgroundResource(R.color.verdeclaro)
                val textView19 = TextView(this)
                textView19.text = "Buitre"
                textView19.setTextColor(Color.BLACK)
                val textView20 = TextView(this)
                textView20.text = "Vulture"
                textView20.setTextColor(Color.BLACK)

                tableRow10.addView(textView19)
                tableRow10.addView(textView20)
                tabla.addView(tableRow10)

                val tableRow11 = TableRow(this)
                tableRow11.setBackgroundResource(R.color.rosa)
                val textView21 = TextView(this)
                textView21.text = "Loro"
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this)
                textView22.text = "Parrot"
                textView22.setTextColor(Color.BLACK)

                tableRow11.addView(textView21)
                tableRow11.addView(textView22)
                tabla.addView(tableRow11)

                val tableRow12 = TableRow(this)
                tableRow12.setBackgroundResource(R.color.verdeclaro)
                val textView23 = TextView(this)
                textView23.text = "Colibrí"
                textView23.setTextColor(Color.BLACK)
                val textView24 = TextView(this)
                textView24.text = "Hummingrirb"
                textView24.setTextColor(Color.BLACK)

                tableRow12.addView(textView23)
                tableRow12.addView(textView24)
                tabla.addView(tableRow12)

                val tableRow13 = TableRow(this)
                tableRow13.setBackgroundResource(R.color.rosa)
                val textView25 = TextView(this)
                textView25.text = "Pavo real"
                textView25.setTextColor(Color.BLACK)
                val textView26 = TextView(this)
                textView26.text = "Peacock"
                textView26.setTextColor(Color.BLACK)

                tableRow13.addView(textView25)
                tableRow13.addView(textView26)
                tabla.addView(tableRow13)

                val tableRow14 = TableRow(this)
                tableRow14.setBackgroundResource(R.color.verdeclaro)
                val textView27 = TextView(this)
                textView27.text = "Avestruz"
                textView27.setTextColor(Color.BLACK)
                val textView28 = TextView(this)
                textView28.text = "Ostrich"
                textView28.setTextColor(Color.BLACK)

                tableRow14.addView(textView27)
                tableRow14.addView(textView28)
                tabla.addView(tableRow14)

                val tableRow21 = TableRow(this)
                tableRow21.setBackgroundResource(R.color.rosa)
                val textView29 = TextView(this)
                textView29.text = "Cisne"
                textView29.setTextColor(Color.BLACK)
                val textView30 = TextView(this)
                textView30.text = "Swan"
                textView30.setTextColor(Color.BLACK)

                tableRow21.addView(textView29)
                tableRow21.addView(textView30)
                tabla.addView(tableRow21)

                val tableRow15 = TableRow(this)
                tableRow15.setBackgroundResource(R.color.verdeclaro)
                val textView31 = TextView(this)
                textView31.text = "Ganso"
                textView31.setTextColor(Color.BLACK)
                val textView32 = TextView(this)
                textView32.text = "Goose"
                textView32.setTextColor(Color.BLACK)

                tableRow15.addView(textView31)
                tableRow15.addView(textView32)
                tabla.addView(tableRow15)

                val tableRow16 = TableRow(this)
                tableRow16.setBackgroundResource(R.color.rosa)
                val textView33 = TextView(this)
                textView33.text = "Gaviota"
                textView33.setTextColor(Color.BLACK)
                val textView34 = TextView(this)
                textView34.text = "Seagull"
                textView34.setTextColor(Color.BLACK)

                tableRow16.addView(textView33)
                tableRow16.addView(textView34)
                tabla.addView(tableRow16)

                val tableRow17 = TableRow(this)
                tableRow17.setBackgroundResource(R.color.verdeclaro)
                val textView40 = TextView(this)
                textView40.text = "Búho"
                textView40.setTextColor(Color.BLACK)
                val textView35 = TextView(this)
                textView35.text = "Owl"
                textView35.setTextColor(Color.BLACK)

                tableRow17.addView(textView40)
                tableRow17.addView(textView35)
                tabla.addView(tableRow17)

            }

            "Peces"-> {
                val tableRow1 = TableRow(this)
                tableRow1.setBackgroundResource(R.color.rosa)
                val textView0 = TextView(this)
                textView0.text = "Español"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this)
                textView2.text = "Ingles"
                textView2.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this)
                tableRow2.setBackgroundResource(R.color.verdeclaro)
                val textView3 = TextView(this)
                textView3.text = "Mejillón"
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this)
                textView4.text = "Mussel"
                textView4.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this)
                tableRow3.setBackgroundResource(R.color.rosa)
                val textView5 = TextView(this)
                textView5.text = "Atún"
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this)
                textView6.text = "Tuna"
                textView6.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this)
                tableRow4.setBackgroundResource(R.color.verdeclaro)
                val textView7 = TextView(this)
                textView7.text = "Bacalao"
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this)
                textView8.text = "Cod"
                textView8.setTextColor(Color.BLACK)

                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this)
                tableRow5.setBackgroundResource(R.color.rosa)
                val textView9 = TextView(this)
                textView9.text = "Langosta"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this)
                textView10.text = "Lobster"
                textView10.setTextColor(Color.BLACK)

                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this)
                tableRow6.setBackgroundResource(R.color.verdeclaro)
                val textView11 = TextView(this)
                textView11.text = "Gamba"
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this)
                textView12.text = "Prawn"
                textView12.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this)
                tableRow7.setBackgroundResource(R.color.rosa)
                val textView13 = TextView(this)
                textView13.text = "Pulpo"
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this)
                textView14.text = "Octopus"
                textView14.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this)
                tableRow8.setBackgroundResource(R.color.verdeclaro)
                val textView15 = TextView(this)
                textView15.text = "Canmgrejo"
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this)
                textView16.text = "Crab"
                textView16.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this)
                tableRow9.setBackgroundResource(R.color.rosa)
                val textView17 = TextView(this)
                textView17.text = "Cuttlefish"
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this)
                textView18.text = "Sepia"
                textView18.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tabla.addView(tableRow9)

                val tableRow10 = TableRow(this)
                tableRow10.setBackgroundResource(R.color.verdeclaro)
                val textView19 = TextView(this)
                textView19.text = "Merluza"
                textView19.setTextColor(Color.BLACK)
                val textView20 = TextView(this)
                textView20.text = "Hake"
                textView20.setTextColor(Color.BLACK)

                tableRow10.addView(textView19)
                tableRow10.addView(textView20)
                tabla.addView(tableRow10)

                val tableRow11 = TableRow(this)
                tableRow11.setBackgroundResource(R.color.rosa)
                val textView21 = TextView(this)
                textView21.text = "Oyster"
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this)
                textView22.text = "Ostra"
                textView22.setTextColor(Color.BLACK)

                tableRow11.addView(textView21)
                tableRow11.addView(textView22)
                tabla.addView(tableRow11)

                val tableRow12 = TableRow(this)
                tableRow12.setBackgroundResource(R.color.verdeclaro)
                val textView23 = TextView(this)
                textView23.text = "Tiburón"
                textView23.setTextColor(Color.BLACK)
                val textView24 = TextView(this)
                textView24.text = "Shark"
                textView24.setTextColor(Color.BLACK)

                tableRow12.addView(textView23)
                tableRow12.addView(textView24)
                tabla.addView(tableRow12)

                val tableRow13 = TableRow(this)
                tableRow13.setBackgroundResource(R.color.rosa)
                val textView25 = TextView(this)
                textView25.text = "Calamar"
                textView25.setTextColor(Color.BLACK)
                val textView26 = TextView(this)
                textView26.text = "Squid"
                textView26.setTextColor(Color.BLACK)

                tableRow13.addView(textView25)
                tableRow13.addView(textView26)
                tabla.addView(tableRow13)

                val tableRow14 = TableRow(this)
                tableRow14.setBackgroundResource(R.color.verdeclaro)
                val textView27 = TextView(this)
                textView27.text = "Pez espada"
                textView27.setTextColor(Color.BLACK)
                val textView28 = TextView(this)
                textView28.text = "Swordfish"
                textView28.setTextColor(Color.BLACK)

                tableRow14.addView(textView27)
                tableRow14.addView(textView28)
                tabla.addView(tableRow14)

                val tableRow21 = TableRow(this)
                tableRow21.setBackgroundResource(R.color.rosa)
                val textView29 = TextView(this)
                textView29.text = "Sardina"
                textView29.setTextColor(Color.BLACK)
                val textView30 = TextView(this)
                textView30.text = "Sardine"
                textView30.setTextColor(Color.BLACK)

                tableRow21.addView(textView29)
                tableRow21.addView(textView30)
                tabla.addView(tableRow21)

                val tableRow15 = TableRow(this)
                tableRow15.setBackgroundResource(R.color.verdeclaro)
                val textView31 = TextView(this)
                textView31.text = "Almeja"
                textView31.setTextColor(Color.BLACK)
                val textView32 = TextView(this)
                textView32.text = "Clam"
                textView32.setTextColor(Color.BLACK)

                tableRow15.addView(textView31)
                tableRow15.addView(textView32)
                tabla.addView(tableRow15)
            }

            "Reptiles" -> {
                val tableRow1 = TableRow(this)
                tableRow1.setBackgroundResource(R.color.naranja)
                val textView0 = TextView(this)
                textView0.text = "Español"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this)
                textView2.text = "Ingles"
                textView2.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this)
                tableRow2.setBackgroundResource(R.color.dorado)
                val textView3 = TextView(this)
                textView3.text = "Tortuga"
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this)
                textView4.text = "Tortoise"
                textView4.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this)
                tableRow3.setBackgroundResource(R.color.naranja)
                val textView5 = TextView(this)
                textView5.text = "Cocdrilo"
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this)
                textView6.text = "Crocodile"
                textView6.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this)
                tableRow4.setBackgroundResource(R.color.dorado)
                val textView7 = TextView(this)
                textView7.text = "Lagarto"
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this)
                textView8.text = "Lizard"
                textView8.setTextColor(Color.BLACK)

                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this)
                tableRow5.setBackgroundResource(R.color.naranja)
                val textView9 = TextView(this)
                textView9.text = "Sapo"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this)
                textView10.text = "Toad"
                textView10.setTextColor(Color.BLACK)

                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this)
                tableRow6.setBackgroundResource(R.color.dorado)
                val textView11 = TextView(this)
                textView11.text = "Rana"
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this)
                textView12.text = "Frog"
                textView12.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this)
                tableRow7.setBackgroundResource(R.color.naranja)
                val textView13 = TextView(this)
                textView13.text = "Serpiente"
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this)
                textView14.text = "Snake"
                textView14.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this)
                tableRow8.setBackgroundResource(R.color.dorado)
                val textView15 = TextView(this)
                textView15.text = "Iguana"
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this)
                textView16.text = "Iguana"
                textView16.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this)
                tableRow9.setBackgroundResource(R.color.naranja)
                val textView17 = TextView(this)
                textView17.text = "Camaleón"
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this)
                textView18.text = "Chameleon"
                textView18.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tabla.addView(tableRow9)

            }

            "Insectos" -> {
                val tableRow1 = TableRow(this)
                tableRow1.setBackgroundResource(R.color.naranja)
                val textView0 = TextView(this)
                textView0.text = "Español"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this)
                textView2.text = "Ingles"
                textView2.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this)
                tableRow2.setBackgroundResource(R.color.dorado)
                val textView3 = TextView(this)
                textView3.text = "Grillo"
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this)
                textView4.text = "Cricket"
                textView4.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this)
                tableRow3.setBackgroundResource(R.color.naranja)
                val textView5 = TextView(this)
                textView5.text = "Maripoosa"
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this)
                textView6.text = "Butterfly"
                textView6.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this)
                tableRow4.setBackgroundResource(R.color.dorado)
                val textView7 = TextView(this)
                textView7.text = "Cucaracha"
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this)
                textView8.text = "Cockroach"
                textView8.setTextColor(Color.BLACK)

                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this)
                tableRow5.setBackgroundResource(R.color.naranja)
                val textView9 = TextView(this)
                textView9.text = "Pulga"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this)
                textView10.text = "Flea"
                textView10.setTextColor(Color.BLACK)

                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this)
                tableRow6.setBackgroundResource(R.color.dorado)
                val textView11 = TextView(this)
                textView11.text = "Escarabajo"
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this)
                textView12.text = "Beetle"
                textView12.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this)
                tableRow7.setBackgroundResource(R.color.naranja)
                val textView13 = TextView(this)
                textView13.text = "Hormiga"
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this)
                textView14.text = "Ant"
                textView14.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this)
                tableRow8.setBackgroundResource(R.color.dorado)
                val textView15 = TextView(this)
                textView15.text = "Abeja"
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this)
                textView16.text = "Bee"
                textView16.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this)
                tableRow9.setBackgroundResource(R.color.naranja)
                val textView17 = TextView(this)
                textView17.text = "Zancudo"
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this)
                textView18.text = "Mosquito"
                textView18.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tabla.addView(tableRow9)

            }

            "Mamiferos" -> {
                val tableRow1 = TableRow(this)
                tableRow1.setBackgroundResource(R.color.rosa)
                val textView0 = TextView(this)
                textView0.text = " Español"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this)
                textView2.text = " Ingles"
                textView2.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this)
                tableRow2.setBackgroundResource(R.color.verdeclaro)
                val textView3 = TextView(this)
                textView3.text = " Ardilla "
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this)
                textView4.text = "Squirrel"
                textView4.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this)
                tableRow3.setBackgroundResource(R.color.rosa)
                val textView5 = TextView(this)
                textView5.text = "Murciélago"
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this)
                textView6.text = "Bat"
                textView6.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this)
                tableRow4.setBackgroundResource(R.color.verdeclaro)
                val textView7 = TextView(this)
                textView7.text = "Rinoceronte"
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this)
                textView8.text = "Rhinocerus"
                textView8.setTextColor(Color.BLACK)

                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this)
                tableRow5.setBackgroundResource(R.color.rosa)
                val textView9 = TextView(this)
                textView9.text = "Hipopótamo"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this)
                textView10.text = "Hippopotamus"
                textView10.setTextColor(Color.BLACK)

                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this)
                tableRow6.setBackgroundResource(R.color.verdeclaro)
                val textView11 = TextView(this)
                textView11.text = "Jirafa"
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this)
                textView12.text = "Giraffe"
                textView12.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this)
                tableRow7.setBackgroundResource(R.color.rosa)
                val textView13 = TextView(this)
                textView13.text = "Elefante"
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this)
                textView14.text = "Elephant"
                textView14.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this)
                tableRow8.setBackgroundResource(R.color.verdeclaro)
                val textView15 = TextView(this)
                textView15.text = "Tigre"
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this)
                textView16.text = "Tiger"
                textView16.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this)
                tableRow9.setBackgroundResource(R.color.rosa)
                val textView17 = TextView(this)
                textView17.text = "León"
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this)
                textView18.text = "Lion"
                textView18.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tabla.addView(tableRow9)

                val tableRow10 = TableRow(this)
                tableRow10.setBackgroundResource(R.color.verdeclaro)
                val textView19 = TextView(this)
                textView19.text = "Oso"
                textView19.setTextColor(Color.BLACK)
                val textView20 = TextView(this)
                textView20.text = "Bear"
                textView20.setTextColor(Color.BLACK)

                tableRow10.addView(textView19)
                tableRow10.addView(textView20)
                tabla.addView(tableRow10)

                val tableRow11 = TableRow(this)
                tableRow11.setBackgroundResource(R.color.rosa)
                val textView21 = TextView(this)
                textView21.text = "Ratón"
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this)
                textView22.text = "Mouse"
                textView22.setTextColor(Color.BLACK)

                tableRow11.addView(textView21)
                tableRow11.addView(textView22)
                tabla.addView(tableRow11)

                val tableRow12 = TableRow(this)
                tableRow12.setBackgroundResource(R.color.verdeclaro)
                val textView23 = TextView(this)
                textView23.text = "Caballo"
                textView23.setTextColor(Color.BLACK)
                val textView24 = TextView(this)
                textView24.text = "Horse"
                textView24.setTextColor(Color.BLACK)

                tableRow12.addView(textView23)
                tableRow12.addView(textView24)
                tabla.addView(tableRow12)

                val tableRow13 = TableRow(this)
                tableRow13.setBackgroundResource(R.color.rosa)
                val textView25 = TextView(this)
                textView25.text = "Conejo"
                textView25.setTextColor(Color.BLACK)
                val textView26 = TextView(this)
                textView26.text = "Rabbit"
                textView26.setTextColor(Color.BLACK)

                tableRow13.addView(textView25)
                tableRow13.addView(textView26)
                tabla.addView(tableRow13)

                val tableRow14 = TableRow(this)
                tableRow14.setBackgroundResource(R.color.verdeclaro)
                val textView27 = TextView(this)
                textView27.text = "Lobo"
                textView27.setTextColor(Color.BLACK)
                val textView28 = TextView(this)
                textView28.text = "Wolf"
                textView28.setTextColor(Color.BLACK)

                tableRow14.addView(textView27)
                tableRow14.addView(textView28)
                tabla.addView(tableRow14)

                val tableRow21 = TableRow(this)
                tableRow21.setBackgroundResource(R.color.rosa)
                val textView29 = TextView(this)
                textView29.text = "Vaca"
                textView29.setTextColor(Color.BLACK)
                val textView30 = TextView(this)
                textView30.text = "Cow"
                textView30.setTextColor(Color.BLACK)

                tableRow21.addView(textView29)
                tableRow21.addView(textView30)
                tabla.addView(tableRow21)

                val tableRow15 = TableRow(this)
                tableRow15.setBackgroundResource(R.color.verdeclaro)
                val textView31 = TextView(this)
                textView31.text = "Cerdo"
                textView31.setTextColor(Color.BLACK)
                val textView32 = TextView(this)
                textView32.text = "Pig"
                textView32.setTextColor(Color.BLACK)

                tableRow15.addView(textView31)
                tableRow15.addView(textView32)
                tabla.addView(tableRow15)

                val tableRow16 = TableRow(this)
                tableRow16.setBackgroundResource(R.color.rosa)
                val textView33 = TextView(this)
                textView33.text = "Oveja"
                textView33.setTextColor(Color.BLACK)
                val textView34 = TextView(this)
                textView34.text = "Sheep"
                textView34.setTextColor(Color.BLACK)

                tableRow16.addView(textView33)
                tableRow16.addView(textView34)
                tabla.addView(tableRow16)

                val tableRow17 = TableRow(this)
                tableRow17.setBackgroundResource(R.color.verdeclaro)
                val textView40 = TextView(this)
                textView40.text = "Perro"
                textView40.setTextColor(Color.BLACK)
                val textView35 = TextView(this)
                textView35.text = "Dog"
                textView35.setTextColor(Color.BLACK)

                tableRow17.addView(textView40)
                tableRow17.addView(textView35)
                tabla.addView(tableRow17)

                val tableRow18 = TableRow(this)
                tableRow18.setBackgroundResource(R.color.rosa)
                val textView41 = TextView(this)
                textView41.text = "Cebra"
                textView41.setTextColor(Color.BLACK)
                val textView37 = TextView(this)
                textView37.text = "Zebra"
                textView37.setTextColor(Color.BLACK)

                tableRow18.addView(textView41)
                tableRow18.addView(textView37)
                tabla.addView(tableRow18)

                val tableRow19 = TableRow(this)
                tableRow19.setBackgroundResource(R.color.verdeclaro)
                val textView43 = TextView(this)
                textView43.text = "Gato"
                textView43.setTextColor(Color.BLACK)
                val textView38 = TextView(this)
                textView38.text = "Cat"
                textView38.setTextColor(Color.BLACK)

                tableRow19.addView(textView43)
                tableRow19.addView(textView38)
                tabla.addView(tableRow19)

                val tableRow20 = TableRow(this)
                tableRow20.setBackgroundResource(R.color.rosa)
                val textView45 = TextView(this)
                textView45.text = "Zorro"
                textView45.setTextColor(Color.BLACK)
                val textView46 = TextView(this)
                textView46.text = "Fox"
                textView46.setTextColor(Color.BLACK)

                tableRow20.addView(textView45)
                tableRow20.addView(textView46)
                tabla.addView(tableRow20)

                val tableRow22 = TableRow(this)
                tableRow22.setBackgroundResource(R.color.verdeclaro)
                val textView47 = TextView(this)
                textView47.text = "León Marino"
                textView47.setTextColor(Color.BLACK)
                val textView60 = TextView(this)
                textView60.text = "Sea Lion"
                textView60.setTextColor(Color.BLACK)

                tableRow22.addView(textView47)
                tableRow22.addView(textView60)
                tabla.addView(tableRow22)

                val tableRow23 = TableRow(this)
                tableRow23.setBackgroundResource(R.color.rosa)
                val textView48 = TextView(this)
                textView48.text = "Canguro"
                textView48.setTextColor(Color.BLACK)
                val textView50 = TextView(this)
                textView50.text = "Kangaroo"
                textView50.setTextColor(Color.BLACK)

                tableRow23.addView(textView48)
                tableRow23.addView(textView50)
                tabla.addView(tableRow23)

                val tableRow24 = TableRow(this)
                tableRow24.setBackgroundResource(R.color.verdeclaro)
                val textView51 = TextView(this)
                textView51.text = "Venado"
                textView51.setTextColor(Color.BLACK)
                val textView52 = TextView(this)
                textView52.text = "Deer"
                textView52.setTextColor(Color.BLACK)

                tableRow24.addView(textView51)
                tableRow24.addView(textView52)
                tabla.addView(tableRow24)

                val tableRow30 = TableRow(this)
                tableRow30.setBackgroundResource(R.color.rosa)
                val textView55 = TextView(this)
                textView55.text = "Toro"
                textView55.setTextColor(Color.BLACK)
                val textView56 = TextView(this)
                textView56.text = "Bull"
                textView56.setTextColor(Color.BLACK)

                tableRow30.addView(textView55)
                tableRow30.addView(textView56)
                tabla.addView(tableRow30)



            }

            "Animales de granja" ->{
                val tableRow1 = TableRow(this)
                tableRow1.setBackgroundResource(R.color.rosa)
                val textView0 = TextView(this)
                textView0.text = "Español"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this)
                textView2.text = "Ingles"
                textView2.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this)
                tableRow2.setBackgroundResource(R.color.verdeclaro)
                val textView3 = TextView(this)
                textView3.text = "Gallina"
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this)
                textView4.text = "Hen"
                textView4.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this)
                tableRow3.setBackgroundResource(R.color.rosa)
                val textView5 = TextView(this)
                textView5.text = "Gallo"
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this)
                textView6.text = "Rooster"
                textView6.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this)
                tableRow4.setBackgroundResource(R.color.verdeclaro)
                val textView7 = TextView(this)
                textView7.text = "Pollo"
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this)
                textView8.text = "Chicken"
                textView8.setTextColor(Color.BLACK)

                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this)
                tableRow5.setBackgroundResource(R.color.rosa)
                val textView9 = TextView(this)
                textView9.text = "Vaca"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this)
                textView10.text = "Cow"
                textView10.setTextColor(Color.BLACK)

                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this)
                tableRow6.setBackgroundResource(R.color.verdeclaro)
                val textView11 = TextView(this)
                textView11.text = "Cabllo "
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this)
                textView12.text = "Horse"
                textView12.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this)
                tableRow7.setBackgroundResource(R.color.rosa)
                val textView13 = TextView(this)
                textView13.text = "Oveja"
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this)
                textView14.text = "Sheep"
                textView14.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this)
                tableRow8.setBackgroundResource(R.color.verdeclaro)
                val textView15 = TextView(this)
                textView15.text = "Cerdo"
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this)
                textView16.text = "Pig"
                textView16.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this)
                tableRow9.setBackgroundResource(R.color.rosa)
                val textView17 = TextView(this)
                textView17.text = "Pato"
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this)
                textView18.text = "Duck"
                textView18.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tabla.addView(tableRow9)

                val tableRow10 = TableRow(this)
                tableRow10.setBackgroundResource(R.color.verdeclaro)
                val textView19 = TextView(this)
                textView19.text = "Burro"
                textView19.setTextColor(Color.BLACK)
                val textView20 = TextView(this)
                textView20.text = "Donkey"
                textView20.setTextColor(Color.BLACK)

                tableRow10.addView(textView19)
                tableRow10.addView(textView20)
                tabla.addView(tableRow10)

                val tableRow11 = TableRow(this)
                tableRow11.setBackgroundResource(R.color.rosa)
                val textView21 = TextView(this)
                textView21.text = "Cordero "
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this)
                textView22.text = "Lamb"
                textView22.setTextColor(Color.BLACK)

                tableRow11.addView(textView21)
                tableRow11.addView(textView22)
                tabla.addView(tableRow11)
            }
        }
    }

}