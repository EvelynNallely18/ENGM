package com.nallely.engm

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.MenuItem
import android.view.PixelCopy
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.PictureInPictureModeChangedInfo
import androidx.core.content.ContentProviderCompat.requireContext
import org.xml.sax.DTDHandler
import java.io.PipedWriter

class Fisica : AppCompatActivity() {

    @SuppressLint("CutPasteId", "SuspiciousIndentation", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fisica)

        // declaracion de variables de objetos en tu activity
        val et1: EditText = findViewById(R.id.cantidad)
        val tabla: TableLayout = findViewById(R.id.tabla)
        val spinner: Spinner = findViewById(R.id.conversores)
        val spinner2: Spinner = findViewById(R.id.conversoresCantidad)
        val buttonResolver: Button = findViewById(R.id.result)
        val buttonSali : Button = findViewById(R.id.salir)

        // listas de item de spinner
        val item = listOf("Temperatura", "Peso", "Longitud", "Volumen")
        val temperaturaItem = listOf("Celsius", "Kelvin", "Farhrenheit")
        val longitudItem = listOf("Millas", "Yardas", "Pie", "Pulgadas")
        val pesoItem = listOf("Libras", "Onzas", "Kilogramos", "Gramos")
        val volumenItem = listOf("Litro","Galon(USA)")


        // codigo para cargar los item en el spinner
        val adaptador = ArrayAdapter(this@Fisica, android.R.layout.simple_spinner_item, item)
        spinner.adapter = adaptador


        // adaptador para escuchar que item he selecionado
        spinner.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val selectedItem = p0!!.getItemAtPosition(p2).toString()
                when (selectedItem) {
                    "Temperatura" -> {
                        val adaptadorT = ArrayAdapter(
                            this@Fisica,
                            android.R.layout.simple_spinner_item,
                            temperaturaItem
                        )
                        spinner2.adapter = adaptadorT
                        Toast.makeText(this@Fisica, "Temperatura", Toast.LENGTH_LONG).show()
                    }

                    "Longitud" -> {
                        val adaptadorL = ArrayAdapter(
                            this@Fisica,
                            android.R.layout.simple_spinner_item,
                            longitudItem
                        )
                        spinner2.adapter = adaptadorL
                        Toast.makeText(this@Fisica, "Longitud", Toast.LENGTH_LONG).show()

                    }

                    "Peso" -> {
                        val adaptadorP = ArrayAdapter(
                            this@Fisica,
                            android.R.layout.simple_spinner_item,
                            pesoItem
                        )
                        spinner2.adapter = adaptadorP


                    }
                    "Volumen" -> {
                        val adaptadorP = ArrayAdapter(
                            this@Fisica,
                            android.R.layout.simple_spinner_item,
                            volumenItem
                        )
                        spinner2.adapter = adaptadorP


                    }
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
        buttonSali.setOnClickListener {
            navegarFisica()
        }
        // boton para caLcular
        buttonResolver.setOnClickListener {
            if (et1.text.toString().isEmpty()) {
                Toast.makeText(this, "Vacio ingrese un datos ", Toast.LENGTH_LONG).show()
            } else {
                if (tabla.childCount > 0) {
                    tabla.removeAllViews() // limpiar la tabla
                    llenarTabla(spinner2, et1, tabla)
                } else {
                    llenarTabla(spinner2, et1, tabla)
                }
            }
        }
    }
//BOTON SALIR
    private fun navegarFisica() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    //SPINNER
    fun llenarTabla(spinner: Spinner, et1: EditText, tabla: TableLayout) {
        when (spinner.selectedItem) {
            "Celsius" -> {
                val datoUsuario = et1.text.toString().toFloat()
                // calcular de celsius a kelvin
                val CK = datoUsuario + 273.15f
                val CF = ((9f * datoUsuario) / 5) + 32f

                val tableRow0 = TableRow(this)
                tableRow0.setBackgroundResource(R.color.naranja)
                //Crear Headers para la tabla
                val textView0 = TextView(this)
                textView0.text = " Celcius "
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this)
                textView2.text = " Kelvin "
                textView2.setTextColor(Color.BLACK)
                val textView3 = TextView(this)
                textView3.text = " Farenheit "
                textView3.setTextColor(Color.BLACK)
                //agregar textView a la fila de la tabla:
                tableRow0.addView(textView0)
                tableRow0.addView(textView2)
                tableRow0.addView(textView3)
                tabla.addView(tableRow0)

//
                val tablaRow1 = TableRow(this)
                val celsius = TextView(this)
                val kelvin = TextView(this)
                val fahrenheit = TextView(this)

                celsius.text = datoUsuario.toString()
                kelvin.text = CK.toString()
                fahrenheit.text = CF.toString()

                tablaRow1.addView(celsius)
                tablaRow1.addView(kelvin)
                tablaRow1.addView(fahrenheit)

                tabla.addView(tablaRow1)

            }

            "Kelvin" -> {
                val dtUsuario = et1.text.toString().toFloat()
                val KC = dtUsuario - 273.15
                val KF = ((9 * (dtUsuario - 273.15)) / 5) + 32
                val tableRow1 = TableRow(this)
                tableRow1.setBackgroundResource(R.color.morado)
                val textView2 = TextView(this)
                textView2.text = " Kelvin "
                textView2.setTextColor(Color.BLACK)
                val textView3 = TextView(this)
                textView3.text = "Celsius"
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this)
                textView4.text = "Fahrenheit"
                textView4.setTextColor(Color.BLACK)

                tableRow1.addView(textView2)
                tableRow1.addView(textView3)
                tableRow1.addView(textView4)
                tabla.addView(tableRow1)

                val tablaRow2 = TableRow(this)
                val kelvin = TextView(this)
                val celsius = TextView(this)
                val fahrenheit = TextView(this)
                kelvin.text = dtUsuario.toString()
                celsius.text = KC.toString()
                fahrenheit.text = KF.toString()

                tablaRow2.addView(kelvin)
                tablaRow2.addView(celsius)
                tablaRow2.addView(fahrenheit)

                tabla.addView(tablaRow2)
            }

            "Farhrenheit" -> {
                val dtUsuario = et1.text.toString().toFloat()
                val FC = (5 * (dtUsuario - 32)) / 9
                val FK = ((5 * (dtUsuario - 32)) / 9) + 273.15
                val tableRow2 = TableRow(this)
                tableRow2.setBackgroundResource(R.color.verde)
                val textView5 = TextView(this)
                textView5.text = " Farherenheit "
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this)
                textView6.text = "Celsius"
                textView6.setTextColor(Color.BLACK)
                val textView7 = TextView(this)
                textView7.text = "Kelvin"
                textView7.setTextColor(Color.BLACK)

                tableRow2.addView(textView5)
                tableRow2.addView(textView6)
                tableRow2.addView(textView7)
                tabla.addView(tableRow2)

                val tablaRow3 = TableRow(this)
                val fahrenheit = TextView(this)
                val celsius = TextView(this)
                val kelvin = TextView(this)

                fahrenheit.text = dtUsuario.toString()
                celsius.text = FC.toString()
                kelvin.text = FK.toString()

                tablaRow3.addView(fahrenheit)
                tablaRow3.addView(celsius)
                tablaRow3.addView(kelvin)



                tabla.addView(tablaRow3)


            }

            "Millas" -> {
                val dtUsuario = et1.text.toString().toFloat()
                val MY = dtUsuario * (1760 / 1.0)
                val MP = dtUsuario * (5280 / 1.0)
                val MPL = dtUsuario * (63360 / 1.0)

                val tableRow3 = TableRow(this)
                tableRow3.setBackgroundResource(R.color.amarillo)
                val textView8 = TextView(this)
                textView8.text = "Millas "
                textView8.setTextColor(Color.BLACK)
                val textView9 = TextView(this)
                textView9.text = "Yardas"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this)
                textView10.text = "Pies"
                textView10.setTextColor(Color.BLACK)
                val textView11 = TextView(this)
                textView11.text = "Pulgadas"
                textView11.setTextColor(Color.BLACK)

                tableRow3.addView(textView8)
                tableRow3.addView(textView9)
                tableRow3.addView(textView10)
                tableRow3.addView(textView11)
                tabla.addView(tableRow3)

                val tablaRow4 = TableRow(this)
                val Millas = TextView(this)
                val Yardas = TextView(this)
                val Pies = TextView(this)
                val Pulgadas = TextView(this)

                Millas.text = dtUsuario.toString()
                Yardas.text = MY.toString()
                Pies.text = MP.toString()
                Pulgadas.text = MPL.toString()

                tablaRow4.addView(Millas)
                tablaRow4.addView(Yardas)
                tablaRow4.addView(Pies)
                tablaRow4.addView(Pulgadas)

                tabla.addView(tablaRow4)
            }

            "Yardas" -> {
                val dtUsuario = et1.text.toString().toFloat()
                val YM = dtUsuario * (1.0 / 1760)
                val YP = dtUsuario * (3.0 / 1.0)
                val YPL = dtUsuario * (36 / 1.0)

                val tableRow4 = TableRow(this)
                tableRow4.setBackgroundResource(R.color.verdeagua)
                val textView12 = TextView(this)
                textView12.text = "Yardas "
                textView12.setTextColor(Color.BLACK)
                val textView13 = TextView(this)
                textView13.text = "Millas"
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this)
                textView14.text = "Pies"
                textView14.setTextColor(Color.BLACK)
                val textView15 = TextView(this)
                textView15.text = "Pulgadas"
                textView15.setTextColor(Color.BLACK)

                tableRow4.addView(textView12)
                tableRow4.addView(textView13)
                tableRow4.addView(textView14)
                tableRow4.addView(textView15)
                tabla.addView(tableRow4)

                val tablaRow5 = TableRow(this)
                val Yardas = TextView(this)
                val Millas = TextView(this)
                val Pies = TextView(this)
                val Pulgadas = TextView(this)

                Yardas.text = dtUsuario.toString()
                Millas.text = YM.toString()
                Pies.text = YP.toString()
                Pulgadas.text = YPL.toString()

                tablaRow5.addView(Yardas)
                tablaRow5.addView(Millas)
                tablaRow5.addView(Pies)
                tablaRow5.addView(Pulgadas)

                tabla.addView(tablaRow5)
            }

            "Pie" -> {
                val dtUsuario = et1.text.toString().toFloat()
                val PM = dtUsuario * (1 / 5280)
                val PY = dtUsuario * (0.333 / 1.0)
                val PPL = dtUsuario * 12.0

                val tableRow5 = TableRow(this)
                tableRow5.setBackgroundResource(R.color.azul)
                val textView16 = TextView(this)
                textView16.text = "Pie"
                textView16.setTextColor(Color.BLACK)
                val textView17 = TextView(this)
                textView17.text = "Yardas "
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this)
                textView18.text = "Millas"
                textView18.setTextColor(Color.BLACK)
                val textView19 = TextView(this)
                textView19.text = "Pulgadas"
                textView19.setTextColor(Color.BLACK)

                tableRow5.addView(textView16)
                tableRow5.addView(textView17)
                tableRow5.addView(textView18)
                tableRow5.addView(textView19)
                tabla.addView(tableRow5)

                val tablaRow6 = TableRow(this)
                val Pie = TextView(this)
                val Yardas = TextView(this)
                val Millas = TextView(this)
                val Pulgadas = TextView(this)

                Pie.text = dtUsuario.toString()
                Yardas.text = PY.toString()
                Millas.text = PM.toString()
                Pulgadas.text = PPL.toString()

                tablaRow6.addView(Pie)
                tablaRow6.addView(Yardas)
                tablaRow6.addView(Millas)
                tablaRow6.addView(Pulgadas)

                tabla.addView(tablaRow6)
            }

            "Pulgadas" -> {
                val dtUsuario = et1.text.toString().toFloat()
                val PUM = dtUsuario / 63360
                val PUY = dtUsuario * (1.0 / 36)
                val PPI = dtUsuario * (1.0 / 12.0)

                val tableRow6 = TableRow(this)
                tableRow6.setBackgroundResource(R.color.turquesa)
                val textView20 = TextView(this)
                textView20.text = "Pulgadas"
                textView20.setTextColor(Color.BLACK)
                val textView21 = TextView(this)
                textView21.text = "Millas "
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this)
                textView22.text = "Yardas"
                textView22.setTextColor(Color.BLACK)
                val textView23 = TextView(this)
                textView23.text = "Pies"
                textView23.setTextColor(Color.BLACK)

                tableRow6.addView(textView20)
                tableRow6.addView(textView21)
                tableRow6.addView(textView22)
                tableRow6.addView(textView23)
                tabla.addView(tableRow6)

                val tablaRow7 = TableRow(this)
                val Pulgadas = TextView(this)
                val Millas = TextView(this)
                val Yardas = TextView(this)
                val Pies = TextView(this)

                Pulgadas.text = dtUsuario.toString()
                Millas.text = PUM.toString()
                Yardas.text = PUY.toString()
                Pies.text = PPI.toString()

                tablaRow7.addView(Pulgadas)
                tablaRow7.addView(Millas)
                tablaRow7.addView(Yardas)
                tablaRow7.addView(Pies)

                tabla.addView(tablaRow7)
            }

            "Libras" -> {
                val dtUsuario = et1.text.toString().toFloat()
                val LO = dtUsuario * (16.0/1.0)
                val LK = dtUsuario * (1.0 / 2.204)
                val LG = dtUsuario * (453.59/1.0  )

                val tableRow8 = TableRow(this)
                tableRow8.setBackgroundResource(R.color.amarillo)
                val textView24 = TextView(this)
                textView24.text = "Libras"
                textView24.setTextColor(Color.BLACK)
                val textView25 = TextView(this)
                textView25.text = "Onzas"
                textView25.setTextColor(Color.BLACK)
                val textView26 = TextView(this)
                textView26.text = "Kilogramos"
                textView26.setTextColor(Color.BLACK)
                val textView27 = TextView(this)
                textView27.text = "Gramo"
                textView27.setTextColor(Color.BLACK)

                tableRow8.addView(textView24)
                tableRow8.addView(textView25)
                tableRow8.addView(textView26)
                tableRow8.addView(textView27)
                tabla.addView(tableRow8)

                val tablaRow9 = TableRow(this)
                val Libras = TextView(this)
                val Onzas = TextView(this)
                val Kilogramos = TextView(this)
                val Gramo = TextView(this)

                Libras.text = dtUsuario.toString()
                Onzas.text = LO.toString()
                Kilogramos.text = LK.toString()
                Gramo.text = LG.toString()

                tablaRow9.addView(Libras)
                tablaRow9.addView(Onzas)
                tablaRow9.addView(Kilogramos)
                tablaRow9.addView(Gramo)

                tabla.addView(tablaRow9)
            }
            "Onzas" -> {
                val dtUsuario = et1.text.toString().toFloat()
                val OL = dtUsuario * (1.0/16.0)
                val Ok = dtUsuario * (1.0 / 35.273 )
                val OG = dtUsuario * ( 28.345 /1.0 )

                val tableRow9 = TableRow(this)
                tableRow9.setBackgroundResource(R.color.morado)
                val textView29 = TextView(this)
                textView29.text = "Onzas"
                textView29.setTextColor(Color.BLACK)
                val textView28 = TextView(this)
                textView28.text = "Libras"
                textView28.setTextColor(Color.BLACK)
                val textView31 = TextView(this)
                textView31.text = "Kilogramos"
                textView31.setTextColor(Color.BLACK)
                val textView32 = TextView(this)
                textView32.text = "Gramo"
                textView32.setTextColor(Color.BLACK)

                tableRow9.addView(textView29)
                tableRow9.addView(textView28)
                tableRow9.addView(textView31)
                tableRow9.addView(textView32)
                tabla.addView(tableRow9)

                val tablaRow10 = TableRow(this)
                val Onzas = TextView(this)
                val Libras = TextView(this)
                val Kilogramos = TextView(this)
                val Gramo = TextView(this)

                Onzas.text = dtUsuario.toString()
                Libras.text = OL.toString()
                Kilogramos.text = Ok.toString()
                Gramo.text = OG.toString()

                tablaRow10.addView(Onzas)
                tablaRow10.addView(Libras)
                tablaRow10.addView(Kilogramos)
                tablaRow10.addView(Gramo)

                tabla.addView(tablaRow10)
            }
            "Kilogramos" -> {
                val dtUsuario = et1.text.toString().toFloat()
                val KL = dtUsuario * (2.204/1.0)
                val KO = dtUsuario * (1.0 / 0.0283 )
                val KG = dtUsuario * (1000/1.0  )

                val tableRow10 = TableRow(this)
                tableRow10.setBackgroundResource(R.color.rojo)
                val textView35 = TextView(this)
                textView35.text = "Kilogramos"
                textView35.setTextColor(Color.BLACK)
                val textView34 = TextView(this)
                textView34.text = "Libras"
                textView34.setTextColor(Color.BLACK)
                val textView33 = TextView(this)
                textView33.text = "Onzas"
                textView33.setTextColor(Color.BLACK)
                val textView36 = TextView(this)
                textView36.text = "Gramo"
                textView36.setTextColor(Color.BLACK)

                tableRow10.addView(textView35)
                tableRow10.addView(textView34)
                tableRow10.addView(textView33)
                tableRow10.addView(textView36)
                tabla.addView(tableRow10)

                val tablaRow11 = TableRow(this)
                val Kilogramos = TextView(this)
                val Libras = TextView(this)
                val Onzas = TextView(this)
                val Gramo = TextView(this)

                Kilogramos.text = dtUsuario.toString()
                Libras.text = KL.toString()
                Onzas.text = KO.toString()
                Gramo.text = KG.toString()

                tablaRow11.addView(Kilogramos)
                tablaRow11.addView(Libras)
                tablaRow11.addView(Onzas)
                tablaRow11.addView(Gramo)

                tabla.addView(tablaRow11)
            }
            "Gramos" -> {
                val dtUsuario = et1.text.toString().toFloat()
                val GL = dtUsuario / 453.59
                val GO = dtUsuario /28.349
                val GK = dtUsuario * (1.0/ 1000  )

                val tableRow11 = TableRow(this)
                tableRow11.setBackgroundResource(R.color.naranja)
                val textView37 = TextView(this)
                textView37.text = "Gramo"
                textView37.setTextColor(Color.BLACK)
                val textView38 = TextView(this)
                textView38.text = "Libras"
                textView38.setTextColor(Color.BLACK)
                val textView39 = TextView(this)
                textView39.text = "Kilogramos"
                textView39.setTextColor(Color.BLACK)
                val textView40 = TextView(this)
                textView40.text = "Onzas"
                textView40.setTextColor(Color.BLACK)


                tableRow11.addView(textView37)
                tableRow11.addView(textView38)
                tableRow11.addView(textView39)
                tableRow11.addView(textView40)
                tabla.addView(tableRow11)

                val tablaRow12 = TableRow(this)
                val Gramo = TextView(this)
                val Libras = TextView(this)
                val Kilogramos = TextView(this)
                val Onzas = TextView(this)

                Gramo.text = dtUsuario.toString()
                Libras.text = GL.toString()
                Kilogramos.text = GK .toString()
                Onzas.text = GO.toString()

                tablaRow12.addView(Gramo)
                tablaRow12.addView(Libras)
                tablaRow12.addView(Kilogramos)
                tablaRow12.addView(Onzas)

                tabla.addView(tablaRow12)
            }
            "Litro" -> {
                val dtUsuario = et1.text.toString().toFloat()
                val LGU = dtUsuario * (1.0/3.785)

                val tableRow12 = TableRow(this)
                tableRow12.setBackgroundResource(R.color.dorado)
                val textView42 = TextView(this)
                textView42.text = "Litro"
                textView42.setTextColor(Color.BLACK)
                val textView41 = TextView(this)
                textView41.text = "Galón(Usa)"
                textView41.setTextColor(Color.BLACK)


                tableRow12.addView(textView42)
                tableRow12.addView(textView41)
                tabla.addView(tableRow12)

                val tablaRow14 = TableRow(this)
                val Litro = TextView(this)
                val Galon = TextView(this)

                Litro.text = dtUsuario.toString()
                Galon.text = LGU.toString()


                tablaRow14.addView( Litro)
                tablaRow14.addView(Galon)

                tabla.addView(tablaRow14)
            }
            "Galon(USA)" -> {
                val dtUsuario = et1.text.toString().toFloat()
                val GUL = dtUsuario * (3.785/1.0)

                val tableRow13 = TableRow(this)
                tableRow13.setBackgroundResource(R.color.verdeagua)
                val textView43 = TextView(this)
                textView43.text = "Galón(Usa)"
                textView43.setTextColor(Color.BLACK)
                val textView44 = TextView(this)
                textView44.text = "Litro"
                textView44.setTextColor(Color.BLACK)



                tableRow13.addView(textView43)
                tableRow13.addView(textView44)
                tabla.addView(tableRow13)

                val tablaRow15 = TableRow(this)
                val Galon = TextView(this)
                val Litro = TextView(this)

                Galon.text = dtUsuario.toString()
                Litro.text = GUL.toString()

                tablaRow15.addView(Galon)
                tablaRow15.addView( Litro)


                tabla.addView(tablaRow15)
            }

        }


    }
}


