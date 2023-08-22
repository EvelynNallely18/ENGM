package com.nallely.engm

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
import androidx.core.view.isVisible

class Matematicas : AppCompatActivity() {
    @SuppressLint("CutPasteId", "SuspiciousIndentation", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matematicas)

        // declaracion de variables de objetos en tu activity
        val et1: EditText = findViewById(R.id.ingreso)
        val tabla: TableLayout = findViewById(R.id.tabla2)
        val spinner: Spinner = findViewById(R.id.tablamultiplicar)
        val buttonResolver: Button = findViewById(R.id.result2)
        val buttonSali: Button = findViewById(R.id.salir2)
        val et2: EditText = findViewById(R.id.ingreso1)

        // listas de item de spinner

        val item = listOf("Suma", "Resta", "Multiplicacion", "Division")
        val adaptador = ArrayAdapter(this@Matematicas, android.R.layout.simple_spinner_item, item)
        spinner.adapter = adaptador

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val selectedItem = p0!!.getItemAtPosition(p2).toString()
                when (selectedItem) {
                    "Suma" -> {
                        Toast.makeText(this@Matematicas, "Suma", Toast.LENGTH_LONG).show()
                        if (et2.visibility == View.GONE) {
                            et2.visibility = View.VISIBLE
                        }

                    }

                    "Resta" -> {
                        Toast.makeText(this@Matematicas, "Resta", Toast.LENGTH_LONG).show()
                        if (et2.visibility == View.GONE) {
                            et2.visibility = View.VISIBLE
                        }
                    }

                    "Multiplicacion" -> {
                        Toast.makeText(this@Matematicas, "Multiplicacion", Toast.LENGTH_LONG).show()
                        if (et2.visibility == View.VISIBLE) {
                            et2.visibility = View.GONE
                        }
                    }

                    "Division" -> {
                        Toast.makeText(this@Matematicas, "Division", Toast.LENGTH_LONG).show()
                        if (et2.visibility == View.GONE) {
                            et2.visibility = View.VISIBLE
                        }
                    }
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }



        buttonSali.setOnClickListener {
            navegarMatematicas()
        }


        // boton para caLcular
        buttonResolver.setOnClickListener {
            when (spinner.selectedItemId) {
                0L, 1L, 3L -> {
                    if (et1.text.toString().isEmpty()) {
                        Toast.makeText(this, "Vacio ingrese un dato ", Toast.LENGTH_LONG).show()
                    }
                    if (et2.text.toString().isEmpty()) {
                        Toast.makeText(this, "Vacio ingrese un dato ", Toast.LENGTH_LONG).show()
                    }
                   else
                    {
                        if (tabla.childCount > 0) {
                            tabla.removeAllViews() // limpiar la tabla
                            SRDTabla(spinner, et1,et2, tabla)
                        } else {
                            SRDTabla(spinner, et1,et2 , tabla)
                        }
                    }

                }

                2L -> {
                    if (et1.text.toString().isEmpty()) {
                        Toast.makeText(this, "Vacio ingrese un datos ", Toast.LENGTH_LONG).show()
                    } else {
                        if (tabla.childCount > 0) {
                            tabla.removeAllViews() // limpiar la tabla
                            Tabla(spinner, et1, tabla)
                        } else {
                            Tabla(spinner, et1, tabla)
                        }
                    }
                }

            }


        }

    }


    fun Tabla(spinner: Spinner, et1: EditText, tabla: TableLayout) {
        when (spinner.selectedItemId) {
            2L -> {
                Log.e("mul", "aqui")
                val datoUsuario = et1.text.toString().toFloat()
                val tableRow0 = TableRow(this@Matematicas)
                tableRow0.setBackgroundResource(R.color.naranja)
                val textView2 = TextView(this@Matematicas)
                textView2.text = " Tabla de multiplicación"
                textView2.setTextColor(Color.BLACK)
                tableRow0.addView(textView2)
                tabla.addView(tableRow0)

                val n = datoUsuario
                for (i in 0..11) {
                    val tablaRow = TableRow(this@Matematicas)
                    val textView3 = TextView(this@Matematicas)
                    val textView6 = TextView(this@Matematicas)
                    val textView7 = TextView(this@Matematicas)
                    val textView4 = TextView(this@Matematicas)
                    val textView5 = TextView(this@Matematicas)
                    textView3.text = n.toInt().toString()
                    textView6.text = "x"
                    textView4.text = "${(i + 1)}"
                    textView7.text = "="
                    textView5.text = "${(n * (i + 1)).toInt()}"

                    tablaRow.addView(textView3)
                    tablaRow.addView(textView6)
                    tablaRow.addView(textView4)
                    tablaRow.addView(textView7)
                    tablaRow.addView(textView5)
                    tabla.addView(tablaRow)
                    Log.e("mul", "${n.toInt()} x ${i + 1} = ${(n * (i + 1)).toInt()}")

                }
            }

        }

    }

    fun SRDTabla(spinner: Spinner, et1: EditText, et2: EditText, tabla: TableLayout) {
        when (spinner.selectedItemId) {
            3L -> {
                val datoUsuario = et1.text.toString().toFloat()
                val dtUsuario = et2.text.toString().toFloat()

                val R = datoUsuario / dtUsuario

                val tableRow4 = TableRow(this@Matematicas)
                tableRow4.setBackgroundResource(com.nallely.engm.R.color.dorado)
                //Crear Headers para la tabla
                val textView8 = TextView(this@Matematicas)
                textView8.text = " Division"
                textView8.setTextColor(Color.BLACK)
                //agregar textView a la fila de la tabla:
                tableRow4.addView(textView8)

                tabla.addView(tableRow4)


                val tablaRow6 = TableRow(this@Matematicas)
                val Dt = TextView(this@Matematicas)
                val signo = TextView(this@Matematicas)
                val Dtl = TextView(this@Matematicas)
                val resul = TextView(this@Matematicas)
                val Resultado = TextView(this@Matematicas)

                Dt.text = datoUsuario.toString()
                signo.text = "÷"
                Dtl.text = dtUsuario.toString()
                resul.text= "="
                Resultado.text = R.toString()

                tablaRow6.addView(Dt)
                tablaRow6.addView(signo)
                tablaRow6.addView(Dtl)
                tablaRow6.addView(resul)
                tablaRow6.addView(Resultado)

                tabla.addView(tablaRow6)

                }

            0L -> {
                val datoUsuario = et1.text.toString().toFloat()
                val dtUsuario = et2.text.toString().toFloat()
                // calcular de celsius a kelvin
                val R = datoUsuario + dtUsuario

                val tableRow2 = TableRow(this@Matematicas)
                tableRow2.setBackgroundResource(com.nallely.engm.R.color.rojo)
                //Crear Headers para la tabla
                val textView3 = TextView(this@Matematicas)
                textView3.text = " Suma"
                textView3.setTextColor(Color.BLACK)

                //agregar textView a la fila de la tabla:
                tableRow2.addView(textView3)
                tabla.addView(tableRow2)


                val tablaRow3 = TableRow(this@Matematicas)
                val Dt1 = TextView(this@Matematicas)
                val signo = TextView(this@Matematicas)
                val Dt2 = TextView(this@Matematicas)
                val Resultad4 = TextView(this@Matematicas)
                val Resultado = TextView(this@Matematicas)


                Dt1.text = datoUsuario.toString()
                signo.text = "+"
                Dt2.text = dtUsuario.toString()
                Resultad4.text= "="
                Resultado.text = R.toString()

                tablaRow3.addView(Dt1)
                tablaRow3.addView(signo)
                tablaRow3.addView(Dt2)
                tablaRow3.addView(Resultad4)
                tablaRow3.addView(Resultado)

                tabla.addView(tablaRow3)

            }
            1L ->{
                val datoUsuario = et1.text.toString().toFloat()
                val dtUsuario = et2.text.toString().toFloat()

                val R = datoUsuario - dtUsuario

                val tableRow7 = TableRow(this@Matematicas)
                tableRow7.setBackgroundResource(com.nallely.engm.R.color.verdeagua)
                val textView10 = TextView(this@Matematicas)
                textView10.text = " Resta"
                textView10.setTextColor(Color.BLACK)

                tableRow7.addView(textView10)
                tabla.addView(tableRow7)


                val tablaRow8 = TableRow(this@Matematicas)
                val Dt2 = TextView(this@Matematicas)
                val signo = TextView(this@Matematicas)
                val Dt4 = TextView(this@Matematicas)
                val igual = TextView(this@Matematicas)
                val Resulta = TextView(this@Matematicas)

                Dt2.text = datoUsuario.toString()
                signo.text = "-"
                Dt4.text = dtUsuario.toString()
                igual.text = "="
                Resulta.text = R.toString()

                tablaRow8.addView(Dt2)
                tablaRow8.addView(Dt4)
                tablaRow8.addView(Resulta)

                tabla.addView(tablaRow8)
            }
        }
    }


    fun navegarMatematicas() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}








