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

class Quimica : AppCompatActivity() {
    @SuppressLint("CutPasteId", "SuspiciousIndentation", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quimica)

        val tabla: TableLayout = findViewById(R.id.tabla)
        val spinner: Spinner = findViewById(R.id.tablaperiodica)
        val buttonSali: Button = findViewById(R.id.salir)
        val buttonMostar: Button = findViewById(R.id.mostrar)


        val item = listOf(
            "Metales alcalinos",
            "Metaloides",
            "Actinoides",
            "Metales alcalinoterreos",
            "No matales reactivos",
            "Propiedades desconocidad",
            "Metales transicionales",
            "Gases nobles",
            "Metales postransionales",
            "Lantanidos"
        )
        val adaptador = ArrayAdapter(this@Quimica, android.R.layout.simple_spinner_item, item)
        spinner.adapter = adaptador


        // adaptador para escuchar que item he selecionado
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val selectedItem = p0!!.getItemAtPosition(p2).toString()
                when (selectedItem) {
                    "Metales alcalinos" -> {
                        Toast.makeText(this@Quimica, "Metales alcalinos", Toast.LENGTH_LONG)
                            .show()
                    }

                    "Metaloides" -> {
                        Toast.makeText(this@Quimica, "Metaloides", Toast.LENGTH_LONG).show()

                    }

                    "Actinoides" -> {

                        Toast.makeText(this@Quimica, "Actinoides", Toast.LENGTH_LONG).show()
                    }

                    "Metales alcalinoterreos" -> {
                        Toast.makeText(this@Quimica, "Metales alcalinoterreos", Toast.LENGTH_LONG).show()
                    }

                    "No matales reactivos" -> {
                        Toast.makeText(this@Quimica, "No matales reactivos", Toast.LENGTH_LONG)
                            .show()
                    }

                    "Propiedades desconocidad" -> {


                        Toast.makeText(
                            this@Quimica,
                            "Propiedades desconocidad",
                            Toast.LENGTH_LONG
                        )
                            .show()
                    }

                    "Metales transicionales" -> {

                        Toast.makeText(
                            this@Quimica,
                            "Metales transicionales",
                            Toast.LENGTH_LONG
                        )
                            .show()
                    }

                    "Gases nobles" -> {

                        Toast.makeText(this@Quimica, "Gases nobles", Toast.LENGTH_LONG).show()
                    }

                    "Metales postransionales" -> {

                        Toast.makeText(
                            this@Quimica,
                            "Metales postransionales",
                            Toast.LENGTH_LONG
                        )
                            .show()
                    }

                    "Lantanidos" -> {

                        Toast.makeText(this@Quimica, "Lantanidos", Toast.LENGTH_LONG).show()
                    }


                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        buttonSali.setOnClickListener {
            navegarQuimica()
        }
        buttonMostar.setOnClickListener {
            when (spinner.selectedItemId) {
                0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L-> {
                    if (spinner.toString().isEmpty()) {
                        Toast.makeText(this, "Seleccione ", Toast.LENGTH_LONG).show()
                    } else {
                        if (tabla.childCount > 0) {
                            tabla.removeAllViews() // limpiar la tabla
                            llenarTabla(spinner, tabla)
                        } else {
                            llenarTabla(spinner, tabla)
                        }
                    }
                }
            }
        }
    }

    private fun navegarQuimica() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun llenarTabla(spinner: Spinner, tabla: TableLayout) {
        when (spinner.selectedItemId) {
           0L-> {
                val tableRow40 = TableRow(this@Quimica)
                tableRow40.setBackgroundResource(R.color.naranjafuerte)
                val textView156 = TextView(this@Quimica)
                textView156.text = "N.del elemento"
                textView156.setTextColor(Color.BLACK)
                val textView157 = TextView(this@Quimica)
                textView157.text = "Símbolo"
                textView157.setTextColor(Color.BLACK)
                val textView158 = TextView(this@Quimica)
                textView158.text = "N.atómico"
                textView158.setTextColor(Color.BLACK)
                val textView159 = TextView(this@Quimica)
                textView159.text = "Masa atómica"
                textView159.setTextColor(Color.BLACK)

                tableRow40.addView(textView156)
                tableRow40.addView(textView157)
                tableRow40.addView(textView158)
                tableRow40.addView(textView159)
                tabla.addView(tableRow40)

                val tableRow1 = TableRow(this@Quimica)
                tableRow1.setBackgroundResource(R.color.verdeagua)
                val textView0 = TextView(this@Quimica)
                textView0.text = "Litio"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this@Quimica)
                textView2.text = "Li"
                textView2.setTextColor(Color.BLACK)
                val textView43 = TextView(this@Quimica)
                textView43.text = "3"
                textView43.setTextColor(Color.BLACK)
                val textView45 = TextView(this@Quimica)
                textView45.text = "6.9410"
                textView45.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tableRow1.addView(textView43)
                tableRow1.addView(textView45)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this@Quimica)
                tableRow2.setBackgroundResource(R.color.amarillo)
                val textView3 = TextView(this@Quimica)
                textView3.text = "Sodio"
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this@Quimica)
                textView4.text = "Na"
                textView4.setTextColor(Color.BLACK)
                val textView25 = TextView(this@Quimica)
                textView25.text = "11"
                textView25.setTextColor(Color.BLACK)
                val textView27 = TextView(this@Quimica)
                textView27.text = "22.990"
                textView27.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tableRow2.addView(textView25)
                tableRow2.addView(textView27)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this@Quimica)
                tableRow3.setBackgroundResource(R.color.verdeagua)
                val textView5 = TextView(this@Quimica)
                textView5.text = "Potasio"
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this@Quimica)
                textView6.text = "K"
                textView6.setTextColor(Color.BLACK)
                val textView34 = TextView(this@Quimica)
                textView34.text = "19"
                textView34.setTextColor(Color.BLACK)
                val textView33 = TextView(this@Quimica)
                textView33.text = "39.098"
                textView33.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tableRow3.addView(textView34)
                tableRow3.addView(textView33)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this@Quimica)
                tableRow4.setBackgroundResource(R.color.amarillo)
                val textView7 = TextView(this@Quimica)
                textView7.text = "Rubidio"
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this@Quimica)
                textView8.text = "Rb"
                textView8.setTextColor(Color.BLACK)
                val textView26 = TextView(this@Quimica)
                textView26.text = "37"
                textView26.setTextColor(Color.BLACK)
                val textView44 = TextView(this@Quimica)
                textView44.text = "85.468"
                textView44.setTextColor(Color.BLACK)
                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tableRow4.addView(textView26)
                tableRow4.addView(textView44)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this@Quimica)
                tableRow5.setBackgroundResource(R.color.verdeagua)
                val textView9 = TextView(this@Quimica)
                textView9.text = "Cesio"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this@Quimica)
                textView10.text = "Cs"
                textView10.setTextColor(Color.BLACK)
                val textView55 = TextView(this@Quimica)
                textView55.text = "55"
                textView55.setTextColor(Color.BLACK)
                val textView28 = TextView(this@Quimica)
                textView28.text = "132.91"
                textView28.setTextColor(Color.BLACK)


                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tableRow5.addView(textView55)
                tableRow5.addView(textView28)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this@Quimica)
                tableRow6.setBackgroundResource(R.color.amarillo)
                val textView11 = TextView(this@Quimica)
                textView11.text = "Francio"
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this@Quimica)
                textView12.text = "Fr"
                textView12.setTextColor(Color.BLACK)
                val textView29 = TextView(this@Quimica)
                textView29.text = "87"
                textView29.setTextColor(Color.BLACK)
                val textView40 = TextView(this@Quimica)
                textView40.text = "223"
                textView40.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tableRow6.addView(textView29)
                tableRow6.addView(textView40)
                tabla.addView(tableRow6)
            }

           1L-> {
                val tableRow40 = TableRow(this@Quimica)
                tableRow40.setBackgroundResource(R.color.naranjafuerte)
                val textView156 = TextView(this@Quimica)
                textView156.text = "N.del elemento"
                textView156.setTextColor(Color.BLACK)
                val textView157 = TextView(this@Quimica)
                textView157.text = "Símbolo"
                textView157.setTextColor(Color.BLACK)
                val textView158 = TextView(this@Quimica)
                textView158.text = "N.atómico"
                textView158.setTextColor(Color.BLACK)
                val textView159 = TextView(this@Quimica)
                textView159.text = "Masa atómica"
                textView159.setTextColor(Color.BLACK)
                tableRow40.addView(textView156)
                tableRow40.addView(textView157)
                tableRow40.addView(textView158)
                tableRow40.addView(textView159)
                tabla.addView(tableRow40)


                val tableRow1 = TableRow(this@Quimica)
                tableRow1.setBackgroundResource(R.color.naranja)
                val textView0 = TextView(this@Quimica)
                textView0.text = "Boro"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this@Quimica)
                textView2.text = " B "
                textView2.setTextColor(Color.BLACK)
                val textView43 = TextView(this@Quimica)
                textView43.text = " 5"
                textView43.setTextColor(Color.BLACK)
                val textView45 = TextView(this@Quimica)
                textView45.text = "10.811"
                textView45.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tableRow1.addView(textView43)
                tableRow1.addView(textView45)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this@Quimica)
                tableRow2.setBackgroundResource(R.color.cafe)
                val textView3 = TextView(this@Quimica)
                textView3.text = "Silicio "
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this@Quimica)
                textView4.text = "Si"
                textView4.setTextColor(Color.BLACK)
                val textView25 = TextView(this@Quimica)
                textView25.text = "14"
                textView25.setTextColor(Color.BLACK)
                val textView27 = TextView(this@Quimica)
                textView27.text = "28.086"
                textView27.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tableRow2.addView(textView25)
                tableRow2.addView(textView27)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this@Quimica)
                tableRow3.setBackgroundResource(R.color.naranja)
                val textView5 = TextView(this@Quimica)
                textView5.text = "Germanio "
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this@Quimica)
                textView6.text = "Ge"
                textView6.setTextColor(Color.BLACK)
                val textView34 = TextView(this@Quimica)
                textView34.text = "32"
                textView34.setTextColor(Color.BLACK)
                val textView33 = TextView(this@Quimica)
                textView33.text = "72.640"
                textView33.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tableRow3.addView(textView34)
                tableRow3.addView(textView33)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this@Quimica)
                tableRow4.setBackgroundResource(R.color.cafe)
                val textView7 = TextView(this@Quimica)
                textView7.text = "Arsénico "
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this@Quimica)
                textView8.text = "As"
                textView8.setTextColor(Color.BLACK)
                val textView26 = TextView(this@Quimica)
                textView26.text = "33"
                textView26.setTextColor(Color.BLACK)
                val textView44 = TextView(this@Quimica)
                textView44.text = "74.922"
                textView44.setTextColor(Color.BLACK)
                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tableRow4.addView(textView26)
                tableRow4.addView(textView44)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this@Quimica)
                tableRow5.setBackgroundResource(R.color.naranja)
                val textView9 = TextView(this@Quimica)
                textView9.text = "Antimonio"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this@Quimica)
                textView10.text = "Sb"
                textView10.setTextColor(Color.BLACK)
                val textView55 = TextView(this@Quimica)
                textView55.text = "51"
                textView55.setTextColor(Color.BLACK)
                val textView28 = TextView(this@Quimica)
                textView28.text = "121.76"
                textView28.setTextColor(Color.BLACK)


                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tableRow5.addView(textView55)
                tableRow5.addView(textView28)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this@Quimica)
                tableRow6.setBackgroundResource(R.color.cafe)
                val textView11 = TextView(this@Quimica)
                textView11.text = "Telurio"
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this@Quimica)
                textView12.text = "Te"
                textView12.setTextColor(Color.BLACK)
                val textView29 = TextView(this@Quimica)
                textView29.text = "52"
                textView29.setTextColor(Color.BLACK)
                val textView40 = TextView(this@Quimica)
                textView40.text = "127.60"
                textView40.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tableRow6.addView(textView29)
                tableRow6.addView(textView40)
                tabla.addView(tableRow6)

            }

           2L -> {
                val tableRow40 = TableRow(this@Quimica)
                tableRow40.setBackgroundResource(R.color.naranjafuerte)
                val textView156 = TextView(this@Quimica)
                textView156.text = "N.del elemento"
                textView156.setTextColor(Color.BLACK)
                val textView157 = TextView(this@Quimica)
                textView157.text = "Símbolo"
                textView157.setTextColor(Color.BLACK)
                val textView158 = TextView(this@Quimica)
                textView158.text = "N.atómico"
                textView158.setTextColor(Color.BLACK)
                val textView159 = TextView(this@Quimica)
                textView159.text = "Masa atómica"
                textView159.setTextColor(Color.BLACK)
                tableRow40.addView(textView156)
                tableRow40.addView(textView157)
                tableRow40.addView(textView158)
                tableRow40.addView(textView159)
                tabla.addView(tableRow40)


                val tableRow1 = TableRow(this@Quimica)
                tableRow1.setBackgroundResource(R.color.verdeclaro)
                val textView0 = TextView(this@Quimica)
                textView0.text = "Actinio"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this@Quimica)
                textView2.text = "Ac"
                textView2.setTextColor(Color.BLACK)
                val textView43 = TextView(this@Quimica)
                textView43.text = "89"
                textView43.setTextColor(Color.BLACK)
                val textView45 = TextView(this@Quimica)
                textView45.text = "227"
                textView45.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tableRow1.addView(textView43)
                tableRow1.addView(textView45)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this@Quimica)
                tableRow2.setBackgroundResource(R.color.azul)
                val textView3 = TextView(this@Quimica)
                textView3.text = "Torio"
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this@Quimica)
                textView4.text = "Th"
                textView4.setTextColor(Color.BLACK)
                val textView25 = TextView(this@Quimica)
                textView25.text = "90"
                textView25.setTextColor(Color.BLACK)
                val textView27 = TextView(this@Quimica)
                textView27.text = "232.04"
                textView27.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tableRow2.addView(textView25)
                tableRow2.addView(textView27)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this@Quimica)
                tableRow3.setBackgroundResource(R.color.verdeclaro)
                val textView5 = TextView(this@Quimica)
                textView5.text = "Protactinio"
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this@Quimica)
                textView6.text = "Pa"
                textView6.setTextColor(Color.BLACK)
                val textView34 = TextView(this@Quimica)
                textView34.text = "91"
                textView34.setTextColor(Color.BLACK)
                val textView33 = TextView(this@Quimica)
                textView33.text = "231.04"
                textView33.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tableRow3.addView(textView34)
                tableRow3.addView(textView33)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this@Quimica)
                tableRow4.setBackgroundResource(R.color.azul)
                val textView7 = TextView(this@Quimica)
                textView7.text = "Uranio"
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this@Quimica)
                textView8.text = "U"
                textView8.setTextColor(Color.BLACK)
                val textView26 = TextView(this@Quimica)
                textView26.text = "92"
                textView26.setTextColor(Color.BLACK)
                val textView44 = TextView(this@Quimica)
                textView44.text = "238.03"
                textView44.setTextColor(Color.BLACK)
                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tableRow4.addView(textView26)
                tableRow4.addView(textView44)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this@Quimica)
                tableRow5.setBackgroundResource(R.color.verdeclaro)
                val textView9 = TextView(this@Quimica)
                textView9.text = "Neptunio"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this@Quimica)
                textView10.text = "Np"
                textView10.setTextColor(Color.BLACK)
                val textView55 = TextView(this@Quimica)
                textView55.text = "93"
                textView55.setTextColor(Color.BLACK)
                val textView28 = TextView(this@Quimica)
                textView28.text = "237.05"
                textView28.setTextColor(Color.BLACK)


                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tableRow5.addView(textView55)
                tableRow5.addView(textView28)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this@Quimica)
                tableRow6.setBackgroundResource(R.color.azul)
                val textView11 = TextView(this@Quimica)
                textView11.text = "Plutonio"
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this@Quimica)
                textView12.text = "Te"
                textView12.setTextColor(Color.BLACK)
                val textView29 = TextView(this@Quimica)
                textView29.text = "94"
                textView29.setTextColor(Color.BLACK)
                val textView40 = TextView(this@Quimica)
                textView40.text = "244"
                textView40.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tableRow6.addView(textView29)
                tableRow6.addView(textView40)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this@Quimica)
                tableRow7.setBackgroundResource(R.color.verdeclaro)
                val textView13 = TextView(this@Quimica)
                textView13.text = "Americio"
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this@Quimica)
                textView14.text = "Am"
                textView14.setTextColor(Color.BLACK)
                val textView70 = TextView(this@Quimica)
                textView70.text = "95"
                textView70.setTextColor(Color.BLACK)
                val textView71 = TextView(this@Quimica)
                textView71.text = "243"
                textView71.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tableRow7.addView(textView70)
                tableRow7.addView(textView71)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this@Quimica)
                tableRow8.setBackgroundResource(R.color.azul)
                val textView15 = TextView(this@Quimica)
                textView15.text = "Curio"
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this@Quimica)
                textView16.text = "Cm"
                textView16.setTextColor(Color.BLACK)
                val textView78 = TextView(this@Quimica)
                textView78.text = "96"
                textView78.setTextColor(Color.BLACK)
                val textView79 = TextView(this@Quimica)
                textView79.text = "247"
                textView79.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tableRow8.addView(textView78)
                tableRow8.addView(textView79)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this@Quimica)
                tableRow9.setBackgroundResource(R.color.verdeclaro)
                val textView17 = TextView(this@Quimica)
                textView17.text = "Berkelio"
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this@Quimica)
                textView18.text = "Bk"
                textView18.setTextColor(Color.BLACK)
                val textView80 = TextView(this@Quimica)
                textView80.text = "97"
                textView80.setTextColor(Color.BLACK)
                val textView81 = TextView(this@Quimica)
                textView81.text = "247"
                textView81.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tableRow9.addView(textView80)
                tableRow9.addView(textView81)
                tabla.addView(tableRow9)

                val tableRow10 = TableRow(this@Quimica)
                tableRow10.setBackgroundResource(R.color.azul)
                val textView19 = TextView(this@Quimica)
                textView19.text = "Californio"
                textView19.setTextColor(Color.BLACK)
                val textView20 = TextView(this@Quimica)
                textView20.text = "Cf"
                textView20.setTextColor(Color.BLACK)
                val textView82 = TextView(this@Quimica)
                textView82.text = "98"
                textView82.setTextColor(Color.BLACK)
                val textView83 = TextView(this@Quimica)
                textView83.text = "251"
                textView83.setTextColor(Color.BLACK)

                tableRow10.addView(textView19)
                tableRow10.addView(textView20)
                tableRow10.addView(textView82)
                tableRow10.addView(textView83)
                tabla.addView(tableRow10)

                val tableRow11 = TableRow(this@Quimica)
                tableRow11.setBackgroundResource(R.color.verdeclaro)
                val textView21 = TextView(this@Quimica)
                textView21.text = "Einstenio"
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this@Quimica)
                textView22.text = "Es"
                textView22.setTextColor(Color.BLACK)
                val textView84 = TextView(this@Quimica)
                textView84.text = "99"
                textView84.setTextColor(Color.BLACK)
                val textView85 = TextView(this@Quimica)
                textView85.text = "252"
                textView85.setTextColor(Color.BLACK)

                tableRow11.addView(textView21)
                tableRow11.addView(textView22)
                tableRow11.addView(textView84)
                tableRow11.addView(textView85)
                tabla.addView(tableRow11)

                val tableRow12 = TableRow(this@Quimica)
                tableRow12.setBackgroundResource(R.color.azul)
                val textView23 = TextView(this@Quimica)
                textView23.text = "Fermio"
                textView23.setTextColor(Color.BLACK)
                val textView24 = TextView(this@Quimica)
                textView24.text = "Fm"
                textView24.setTextColor(Color.BLACK)
                val textView86 = TextView(this@Quimica)
                textView86.text = "100"
                textView86.setTextColor(Color.BLACK)
                val textView87 = TextView(this@Quimica)
                textView87.text = "257"
                textView87.setTextColor(Color.BLACK)


                tableRow12.addView(textView23)
                tableRow12.addView(textView24)
                tableRow12.addView(textView86)
                tableRow12.addView(textView87)
                tabla.addView(tableRow12)

                val tableRow13 = TableRow(this@Quimica)
                tableRow13.setBackgroundResource(R.color.verdeclaro)
                val textView57 = TextView(this@Quimica)
                textView57.text = "Mendelevio"
                textView57.setTextColor(Color.BLACK)
                val textView36 = TextView(this@Quimica)
                textView36.text = "Md"
                textView36.setTextColor(Color.BLACK)
                val textView88 = TextView(this@Quimica)
                textView88.text = "101"
                textView88.setTextColor(Color.BLACK)
                val textView89 = TextView(this@Quimica)
                textView89.text = "258"
                textView89.setTextColor(Color.BLACK)

                tableRow13.addView(textView57)
                tableRow13.addView(textView36)
                tableRow13.addView(textView88)
                tableRow13.addView(textView89)
                tabla.addView(tableRow13)

                val tableRow14 = TableRow(this@Quimica)
                tableRow14.setBackgroundResource(R.color.azul)
                val textView58 = TextView(this@Quimica)
                textView58.text = "Nobelio"
                textView58.setTextColor(Color.BLACK)
                val textView59 = TextView(this@Quimica)
                textView59.text = "No"
                textView59.setTextColor(Color.BLACK)
                val textView90 = TextView(this@Quimica)
                textView90.text = "102"
                textView90.setTextColor(Color.BLACK)
                val textView91 = TextView(this@Quimica)
                textView91.text = "259"
                textView91.setTextColor(Color.BLACK)

                tableRow14.addView(textView58)
                tableRow14.addView(textView59)
                tableRow14.addView(textView90)
                tableRow14.addView(textView91)
                tabla.addView(tableRow14)

                val tableRow21 = TableRow(this@Quimica)
                tableRow21.setBackgroundResource(R.color.verdeclaro)
                val textView61 = TextView(this@Quimica)
                textView61.text = "Lawrencio"
                textView61.setTextColor(Color.BLACK)
                val textView30 = TextView(this@Quimica)
                textView30.text = "Lr"
                textView30.setTextColor(Color.BLACK)
                val textView92 = TextView(this@Quimica)
                textView92.text = "103"
                textView92.setTextColor(Color.BLACK)
                val textView93 = TextView(this@Quimica)
                textView93.text = "262"
                textView93.setTextColor(Color.BLACK)

                tableRow21.addView(textView61)
                tableRow21.addView(textView30)
                tableRow21.addView(textView92)
                tableRow21.addView(textView93)
                tabla.addView(tableRow21)
            }

            3L -> {
                val tableRow40 = TableRow(this@Quimica)
                tableRow40.setBackgroundResource(R.color.naranjafuerte)
                val textView156 = TextView(this@Quimica)
                textView156.text = "N.del elemento"
                textView156.setTextColor(Color.BLACK)
                val textView157 = TextView(this@Quimica)
                textView157.text = "Símbolo"
                textView157.setTextColor(Color.BLACK)
                val textView158 = TextView(this@Quimica)
                textView158.text = "N.atómico"
                textView158.setTextColor(Color.BLACK)
                val textView159 = TextView(this@Quimica)
                textView159.text = "Masa atómica"
                textView159.setTextColor(Color.BLACK)
                tableRow40.addView(textView156)
                tableRow40.addView(textView157)
                tableRow40.addView(textView158)
                tableRow40.addView(textView159)
                tabla.addView(tableRow40)

                val tableRow1 = TableRow(this@Quimica)
                tableRow1.setBackgroundResource(R.color.morado)
                val textView0 = TextView(this@Quimica)
                textView0.text = "Berilio"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this@Quimica)
                textView2.text = "Be"
                textView2.setTextColor(Color.BLACK)
                val textView43 = TextView(this@Quimica)
                textView43.text = "4"
                textView43.setTextColor(Color.BLACK)
                val textView45 = TextView(this@Quimica)
                textView45.text = "9.0122"
                textView45.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tableRow1.addView(textView43)
                tableRow1.addView(textView45)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this@Quimica)
                tableRow2.setBackgroundResource(R.color.rosa)
                val textView3 = TextView(this@Quimica)
                textView3.text = "Magnesio"
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this@Quimica)
                textView4.text = "Mg"
                textView4.setTextColor(Color.BLACK)
                val textView25 = TextView(this@Quimica)
                textView25.text = "12"
                textView25.setTextColor(Color.BLACK)
                val textView27 = TextView(this@Quimica)
                textView27.text = "24.305"
                textView27.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tableRow2.addView(textView25)
                tableRow2.addView(textView27)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this@Quimica)
                tableRow3.setBackgroundResource(R.color.morado)
                val textView5 = TextView(this@Quimica)
                textView5.text = "Calcio"
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this@Quimica)
                textView6.text = "Ca"
                textView6.setTextColor(Color.BLACK)
                val textView34 = TextView(this@Quimica)
                textView34.text = "20"
                textView34.setTextColor(Color.BLACK)
                val textView33 = TextView(this@Quimica)
                textView33.text = "40.078"
                textView33.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tableRow3.addView(textView34)
                tableRow3.addView(textView33)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this@Quimica)
                tableRow4.setBackgroundResource(R.color.rosa)
                val textView7 = TextView(this@Quimica)
                textView7.text = "Estroncio"
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this@Quimica)
                textView8.text = "Sr"
                textView8.setTextColor(Color.BLACK)
                val textView26 = TextView(this@Quimica)
                textView26.text = "38"
                textView26.setTextColor(Color.BLACK)
                val textView44 = TextView(this@Quimica)
                textView44.text = "87.620"
                textView44.setTextColor(Color.BLACK)
                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tableRow4.addView(textView26)
                tableRow4.addView(textView44)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this@Quimica)
                tableRow5.setBackgroundResource(R.color.morado)
                val textView9 = TextView(this@Quimica)
                textView9.text = "Bario"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this@Quimica)
                textView10.text = "Ba"
                textView10.setTextColor(Color.BLACK)
                val textView55 = TextView(this@Quimica)
                textView55.text = "56"
                textView55.setTextColor(Color.BLACK)
                val textView28 = TextView(this@Quimica)
                textView28.text = "137.33"
                textView28.setTextColor(Color.BLACK)


                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tableRow5.addView(textView55)
                tableRow5.addView(textView28)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this@Quimica)
                tableRow6.setBackgroundResource(R.color.rosa)
                val textView11 = TextView(this@Quimica)
                textView11.text = "Radio"
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this@Quimica)
                textView12.text = "Ra"
                textView12.setTextColor(Color.BLACK)
                val textView29 = TextView(this@Quimica)
                textView29.text = "88"
                textView29.setTextColor(Color.BLACK)
                val textView40 = TextView(this@Quimica)
                textView40.text = "226"
                textView40.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tableRow6.addView(textView29)
                tableRow6.addView(textView40)
                tabla.addView(tableRow6)
            }

            4L -> {
                val tableRow40 = TableRow(this@Quimica)
                tableRow40.setBackgroundResource(R.color.naranjafuerte)
                val textView156 = TextView(this@Quimica)
                textView156.text = "N.del elemento"
                textView156.setTextColor(Color.BLACK)
                val textView157 = TextView(this@Quimica)
                textView157.text = "Símbolo"
                textView157.setTextColor(Color.BLACK)
                val textView158 = TextView(this@Quimica)
                textView158.text = "N.atómico"
                textView158.setTextColor(Color.BLACK)
                val textView159 = TextView(this@Quimica)
                textView159.text = "Masa atómica"
                textView159.setTextColor(Color.BLACK)
                tableRow40.addView(textView156)
                tableRow40.addView(textView157)
                tableRow40.addView(textView158)
                tableRow40.addView(textView159)
                tabla.addView(tableRow40)

                val tableRow11 = TableRow(this@Quimica)
                tableRow11.setBackgroundResource(R.color.amarillo)
                val textView21 = TextView(this@Quimica)
                textView21.text = "Hidrógeno"
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this@Quimica)
                textView22.text = "H"
                textView22.setTextColor(Color.BLACK)
                val textView84 = TextView(this@Quimica)
                textView84.text = "1"
                textView84.setTextColor(Color.BLACK)
                val textView85 = TextView(this@Quimica)
                textView85.text = "1.0078"
                textView85.setTextColor(Color.BLACK)

                tableRow11.addView(textView21)
                tableRow11.addView(textView22)
                tableRow11.addView(textView84)
                tableRow11.addView(textView85)
                tabla.addView(tableRow11)


                val tableRow1 = TableRow(this@Quimica)
                tableRow1.setBackgroundResource(R.color.rosa)
                val textView0 = TextView(this@Quimica)
                textView0.text = "Carbono"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this@Quimica)
                textView2.text = "C"
                textView2.setTextColor(Color.BLACK)
                val textView43 = TextView(this@Quimica)
                textView43.text = "6"
                textView43.setTextColor(Color.BLACK)
                val textView45 = TextView(this@Quimica)
                textView45.text = "12.011"
                textView45.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tableRow1.addView(textView43)
                tableRow1.addView(textView45)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this@Quimica)
                tableRow2.setBackgroundResource(R.color.amarillo)
                val textView3 = TextView(this@Quimica)
                textView3.text = "Nitrógeno"
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this@Quimica)
                textView4.text = "N"
                textView4.setTextColor(Color.BLACK)
                val textView25 = TextView(this@Quimica)
                textView25.text = "7"
                textView25.setTextColor(Color.BLACK)
                val textView27 = TextView(this@Quimica)
                textView27.text = "14.007"
                textView27.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tableRow2.addView(textView25)
                tableRow2.addView(textView27)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this@Quimica)
                tableRow3.setBackgroundResource(R.color.rosa)
                val textView5 = TextView(this@Quimica)
                textView5.text = "Oxígeno"
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this@Quimica)
                textView6.text = "O"
                textView6.setTextColor(Color.BLACK)
                val textView34 = TextView(this@Quimica)
                textView34.text = "8"
                textView34.setTextColor(Color.BLACK)
                val textView33 = TextView(this@Quimica)
                textView33.text = "15.999"
                textView33.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tableRow3.addView(textView34)
                tableRow3.addView(textView33)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this@Quimica)
                tableRow4.setBackgroundResource(R.color.amarillo)
                val textView7 = TextView(this@Quimica)
                textView7.text = "Flúor"
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this@Quimica)
                textView8.text = "F"
                textView8.setTextColor(Color.BLACK)
                val textView26 = TextView(this@Quimica)
                textView26.text = "9"
                textView26.setTextColor(Color.BLACK)
                val textView44 = TextView(this@Quimica)
                textView44.text = "18.988"
                textView44.setTextColor(Color.BLACK)
                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tableRow4.addView(textView26)
                tableRow4.addView(textView44)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this@Quimica)
                tableRow5.setBackgroundResource(R.color.rosa)
                val textView9 = TextView(this@Quimica)
                textView9.text = "Fósforo"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this@Quimica)
                textView10.text = "P"
                textView10.setTextColor(Color.BLACK)
                val textView55 = TextView(this@Quimica)
                textView55.text = "15"
                textView55.setTextColor(Color.BLACK)
                val textView28 = TextView(this@Quimica)
                textView28.text = "30.974"
                textView28.setTextColor(Color.BLACK)


                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tableRow5.addView(textView55)
                tableRow5.addView(textView28)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this@Quimica)
                tableRow6.setBackgroundResource(R.color.amarillo)
                val textView11 = TextView(this@Quimica)
                textView11.text = "Azufre"
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this@Quimica)
                textView12.text = "S"
                textView12.setTextColor(Color.BLACK)
                val textView29 = TextView(this@Quimica)
                textView29.text = "16"
                textView29.setTextColor(Color.BLACK)
                val textView40 = TextView(this@Quimica)
                textView40.text = "32.065"
                textView40.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tableRow6.addView(textView29)
                tableRow6.addView(textView40)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this@Quimica)
                tableRow7.setBackgroundResource(R.color.rosa)
                val textView13 = TextView(this@Quimica)
                textView13.text = "Cloro"
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this@Quimica)
                textView14.text = "CL"
                textView14.setTextColor(Color.BLACK)
                val textView70 = TextView(this@Quimica)
                textView70.text = "17"
                textView70.setTextColor(Color.BLACK)
                val textView71 = TextView(this@Quimica)
                textView71.text = "35.453"
                textView71.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tableRow7.addView(textView70)
                tableRow7.addView(textView71)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this@Quimica)
                tableRow8.setBackgroundResource(R.color.amarillo)
                val textView15 = TextView(this@Quimica)
                textView15.text = "Selenio"
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this@Quimica)
                textView16.text = "Se"
                textView16.setTextColor(Color.BLACK)
                val textView78 = TextView(this@Quimica)
                textView78.text = "34"
                textView78.setTextColor(Color.BLACK)
                val textView79 = TextView(this@Quimica)
                textView79.text = "78.960"
                textView79.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tableRow8.addView(textView78)
                tableRow8.addView(textView79)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this@Quimica)
                tableRow9.setBackgroundResource(R.color.rosa)
                val textView17 = TextView(this@Quimica)
                textView17.text = "Bromo"
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this@Quimica)
                textView18.text = "Br"
                textView18.setTextColor(Color.BLACK)
                val textView80 = TextView(this@Quimica)
                textView80.text = "35"
                textView80.setTextColor(Color.BLACK)
                val textView81 = TextView(this@Quimica)
                textView81.text = "79.904"
                textView81.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tableRow9.addView(textView80)
                tableRow9.addView(textView81)
                tabla.addView(tableRow9)

                val tableRow10 = TableRow(this@Quimica)
                tableRow10.setBackgroundResource(R.color.amarillo)
                val textView19 = TextView(this@Quimica)
                textView19.text = "Yodo"
                textView19.setTextColor(Color.BLACK)
                val textView20 = TextView(this@Quimica)
                textView20.text = "I"
                textView20.setTextColor(Color.BLACK)
                val textView82 = TextView(this@Quimica)
                textView82.text = "53"
                textView82.setTextColor(Color.BLACK)
                val textView83 = TextView(this@Quimica)
                textView83.text = "126.90"
                textView83.setTextColor(Color.BLACK)

                tableRow10.addView(textView19)
                tableRow10.addView(textView20)
                tableRow10.addView(textView82)
                tableRow10.addView(textView83)
                tabla.addView(tableRow10)
            }

            5L -> {

                val tableRow40 = TableRow(this@Quimica)
                tableRow40.setBackgroundResource(R.color.naranjafuerte)
                val textView156 = TextView(this@Quimica)
                textView156.text = "N.del elemento"
                textView156.setTextColor(Color.BLACK)
                val textView157 = TextView(this@Quimica)
                textView157.text = "Símbolo"
                textView157.setTextColor(Color.BLACK)
                val textView158 = TextView(this@Quimica)
                textView158.text = "N.atómico"
                textView158.setTextColor(Color.BLACK)
                val textView159 = TextView(this@Quimica)
                textView159.text = "Masa atómica"
                textView159.setTextColor(Color.BLACK)
                textView159.setTextColor(Color.BLACK)
                tableRow40.addView(textView156)
                tableRow40.addView(textView157)
                tableRow40.addView(textView158)
                tableRow40.addView(textView159)
                tabla.addView(tableRow40)

                val tableRow1 = TableRow(this@Quimica)
                tableRow1.setBackgroundResource(R.color.verdeagua)
                val textView0 = TextView(this@Quimica)
                textView0.text = "Meitnerio"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this@Quimica)
                textView2.text = "Mt"
                textView2.setTextColor(Color.BLACK)
                val textView43 = TextView(this@Quimica)
                textView43.text = "109"
                textView43.setTextColor(Color.BLACK)
                val textView45 = TextView(this@Quimica)
                textView45.text = "278"
                textView45.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tableRow1.addView(textView43)
                tableRow1.addView(textView45)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this@Quimica)
                tableRow2.setBackgroundResource(R.color.rosa)
                val textView3 = TextView(this@Quimica)
                textView3.text = "Darmstatio"
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this@Quimica)
                textView4.text = "Ds"
                textView4.setTextColor(Color.BLACK)
                val textView25 = TextView(this@Quimica)
                textView25.text = "110"
                textView25.setTextColor(Color.BLACK)
                val textView27 = TextView(this@Quimica)
                textView27.text = "281"
                textView27.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tableRow2.addView(textView25)
                tableRow2.addView(textView27)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this@Quimica)
                tableRow3.setBackgroundResource(R.color.verdeagua)
                val textView5 = TextView(this@Quimica)
                textView5.text = "Roentgenio"
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this@Quimica)
                textView6.text = "Rg"
                textView6.setTextColor(Color.BLACK)
                val textView34 = TextView(this@Quimica)
                textView34.text = "111"
                textView34.setTextColor(Color.BLACK)
                val textView33 = TextView(this@Quimica)
                textView33.text = "282"
                textView33.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tableRow3.addView(textView34)
                tableRow3.addView(textView33)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this@Quimica)
                tableRow4.setBackgroundResource(R.color.rosa)
                val textView7 = TextView(this@Quimica)
                textView7.text = "Nihonio"
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this@Quimica)
                textView8.text = "Nh"
                textView8.setTextColor(Color.BLACK)
                val textView26 = TextView(this@Quimica)
                textView26.text = "113"
                textView26.setTextColor(Color.BLACK)
                val textView44 = TextView(this@Quimica)
                textView44.text = "286"
                textView44.setTextColor(Color.BLACK)
                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tableRow4.addView(textView26)
                tableRow4.addView(textView44)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this@Quimica)
                tableRow5.setBackgroundResource(R.color.verdeagua)
                val textView9 = TextView(this@Quimica)
                textView9.text = "Flerovio"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this@Quimica)
                textView10.text = "FL"
                textView10.setTextColor(Color.BLACK)
                val textView55 = TextView(this@Quimica)
                textView55.text = "114"
                textView55.setTextColor(Color.BLACK)
                val textView28 = TextView(this@Quimica)
                textView28.text = "289"
                textView28.setTextColor(Color.BLACK)


                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tableRow5.addView(textView55)
                tableRow5.addView(textView28)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this@Quimica)
                tableRow6.setBackgroundResource(R.color.rosa)
                val textView11 = TextView(this@Quimica)
                textView11.text = "Moscovio"
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this@Quimica)
                textView12.text = "Mc"
                textView12.setTextColor(Color.BLACK)
                val textView29 = TextView(this@Quimica)
                textView29.text = "115"
                textView29.setTextColor(Color.BLACK)
                val textView40 = TextView(this@Quimica)
                textView40.text = "289"
                textView40.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tableRow6.addView(textView29)
                tableRow6.addView(textView40)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this@Quimica)
                tableRow7.setBackgroundResource(R.color.verdeagua)
                val textView13 = TextView(this@Quimica)
                textView13.text = "Livermorio"
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this@Quimica)
                textView14.text = "Lv"
                textView14.setTextColor(Color.BLACK)
                val textView70 = TextView(this@Quimica)
                textView70.text = "116"
                textView70.setTextColor(Color.BLACK)
                val textView71 = TextView(this@Quimica)
                textView71.text = "293"
                textView71.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tableRow7.addView(textView70)
                tableRow7.addView(textView71)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this@Quimica)
                tableRow8.setBackgroundResource(R.color.rosa)
                val textView15 = TextView(this@Quimica)
                textView15.text = "Teneso"
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this@Quimica)
                textView16.text = "Ts"
                textView16.setTextColor(Color.BLACK)
                val textView78 = TextView(this@Quimica)
                textView78.text = "117"
                textView78.setTextColor(Color.BLACK)
                val textView79 = TextView(this@Quimica)
                textView79.text = "294"
                textView79.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tableRow8.addView(textView78)
                tableRow8.addView(textView79)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this@Quimica)
                tableRow9.setBackgroundResource(R.color.verdeagua)
                val textView17 = TextView(this@Quimica)
                textView17.text = "Oganesón"
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this@Quimica)
                textView18.text = "Og"
                textView18.setTextColor(Color.BLACK)
                val textView80 = TextView(this@Quimica)
                textView80.text = "118"
                textView80.setTextColor(Color.BLACK)
                val textView81 = TextView(this@Quimica)
                textView81.text = "294"
                textView81.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tableRow9.addView(textView80)
                tableRow9.addView(textView81)
                tabla.addView(tableRow9)
            }

           6L -> {
                val tableRow40 = TableRow(this@Quimica)
                tableRow40.setBackgroundResource(R.color.naranjafuerte)
                val textView156 = TextView(this@Quimica)
                textView156.text = "N.del elemento"
                textView156.setTextColor(Color.BLACK)
                val textView157 = TextView(this@Quimica)
                textView157.text = "Símbolo"
                textView157.setTextColor(Color.BLACK)
                val textView158 = TextView(this@Quimica)
                textView158.text = "N.atómico"
                textView158.setTextColor(Color.BLACK)
                val textView159 = TextView(this@Quimica)
                textView159.text = "Masa atómica"
                textView159.setTextColor(Color.BLACK)

                tableRow40.addView(textView156)
                tableRow40.addView(textView157)
                tableRow40.addView(textView158)
                tableRow40.addView(textView159)
                tabla.addView(tableRow40)

                val tableRow1 = TableRow(this@Quimica)
                tableRow1.setBackgroundResource(R.color.amarillo)
                val textView0 = TextView(this@Quimica)
                textView0.text = "Escandio"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this@Quimica)
                textView2.text = "Sc"
                textView2.setTextColor(Color.BLACK)
                val textView43 = TextView(this@Quimica)
                textView43.text = "21"
                textView43.setTextColor(Color.BLACK)
                val textView45 = TextView(this@Quimica)
                textView45.text = "44.956"
                textView45.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tableRow1.addView(textView43)
                tableRow1.addView(textView45)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this@Quimica)
                tableRow2.setBackgroundResource(R.color.naranja)
                val textView3 = TextView(this@Quimica)
                textView3.text = "Itrio"
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this@Quimica)
                textView4.text = "Y"
                textView4.setTextColor(Color.BLACK)
                val textView25 = TextView(this@Quimica)
                textView25.text = "39"
                textView25.setTextColor(Color.BLACK)
                val textView27 = TextView(this@Quimica)
                textView27.text = "88.906"
                textView27.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tableRow2.addView(textView25)
                tableRow2.addView(textView27)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this@Quimica)
                tableRow3.setBackgroundResource(R.color.amarillo)
                val textView5 = TextView(this@Quimica)
                textView5.text = "Titanio"
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this@Quimica)
                textView6.text = "Ti"
                textView6.setTextColor(Color.BLACK)
                val textView34 = TextView(this@Quimica)
                textView34.text = "22"
                textView34.setTextColor(Color.BLACK)
                val textView33 = TextView(this@Quimica)
                textView33.text = "47.867"
                textView33.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tableRow3.addView(textView34)
                tableRow3.addView(textView33)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this@Quimica)
                tableRow4.setBackgroundResource(R.color.naranja)
                val textView7 = TextView(this@Quimica)
                textView7.text = "Vanio"
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this@Quimica)
                textView8.text = "V"
                textView8.setTextColor(Color.BLACK)
                val textView26 = TextView(this@Quimica)
                textView26.text = "23"
                textView26.setTextColor(Color.BLACK)
                val textView44 = TextView(this@Quimica)
                textView44.text = "50.942"
                textView44.setTextColor(Color.BLACK)
                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tableRow4.addView(textView26)
                tableRow4.addView(textView44)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this@Quimica)
                tableRow5.setBackgroundResource(R.color.amarillo)
                val textView9 = TextView(this@Quimica)
                textView9.text = "Cromo"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this@Quimica)
                textView10.text = "Cr"
                textView10.setTextColor(Color.BLACK)
                val textView55 = TextView(this@Quimica)
                textView55.text = "24"
                textView55.setTextColor(Color.BLACK)
                val textView28 = TextView(this@Quimica)
                textView28.text = "51.996"
                textView28.setTextColor(Color.BLACK)


                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tableRow5.addView(textView55)
                tableRow5.addView(textView28)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this@Quimica)
                tableRow6.setBackgroundResource(R.color.naranja)
                val textView11 = TextView(this@Quimica)
                textView11.text = "Manganeso"
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this@Quimica)
                textView12.text = "Mn"
                textView12.setTextColor(Color.BLACK)
                val textView29 = TextView(this@Quimica)
                textView29.text = "25"
                textView29.setTextColor(Color.BLACK)
                val textView40 = TextView(this@Quimica)
                textView40.text = "54.938"
                textView40.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tableRow6.addView(textView29)
                tableRow6.addView(textView40)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this@Quimica)
                tableRow7.setBackgroundResource(R.color.amarillo)
                val textView13 = TextView(this@Quimica)
                textView13.text = "Hierro"
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this@Quimica)
                textView14.text = "Fe"
                textView14.setTextColor(Color.BLACK)
                val textView70 = TextView(this@Quimica)
                textView70.text = "26"
                textView70.setTextColor(Color.BLACK)
                val textView71 = TextView(this@Quimica)
                textView71.text = "55.845"
                textView71.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tableRow7.addView(textView70)
                tableRow7.addView(textView71)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this@Quimica)
                tableRow8.setBackgroundResource(R.color.naranja)
                val textView15 = TextView(this@Quimica)
                textView15.text = "Cobalto"
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this@Quimica)
                textView16.text = "Co"
                textView16.setTextColor(Color.BLACK)
                val textView78 = TextView(this@Quimica)
                textView78.text = "27"
                textView78.setTextColor(Color.BLACK)
                val textView79 = TextView(this@Quimica)
                textView79.text = "58.933"
                textView79.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tableRow8.addView(textView78)
                tableRow8.addView(textView79)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this@Quimica)
                tableRow9.setBackgroundResource(R.color.amarillo)
                val textView17 = TextView(this@Quimica)
                textView17.text = "Níquel"
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this@Quimica)
                textView18.text = "Ni"
                textView18.setTextColor(Color.BLACK)
                val textView80 = TextView(this@Quimica)
                textView80.text = "28"
                textView80.setTextColor(Color.BLACK)
                val textView81 = TextView(this@Quimica)
                textView81.text = "58.693"
                textView81.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tableRow9.addView(textView80)
                tableRow9.addView(textView81)
                tabla.addView(tableRow9)

                val tableRow10 = TableRow(this@Quimica)
                tableRow10.setBackgroundResource(R.color.naranja)
                val textView19 = TextView(this@Quimica)
                textView19.text = "Cobre"
                textView19.setTextColor(Color.BLACK)
                val textView20 = TextView(this@Quimica)
                textView20.text = "Cu"
                textView20.setTextColor(Color.BLACK)
                val textView82 = TextView(this@Quimica)
                textView82.text = "29"
                textView82.setTextColor(Color.BLACK)
                val textView83 = TextView(this@Quimica)
                textView83.text = "63.546"
                textView83.setTextColor(Color.BLACK)

                tableRow10.addView(textView19)
                tableRow10.addView(textView20)
                tableRow10.addView(textView82)
                tableRow10.addView(textView83)
                tabla.addView(tableRow10)

                val tableRow11 = TableRow(this@Quimica)
                tableRow11.setBackgroundResource(R.color.amarillo)
                val textView21 = TextView(this@Quimica)
                textView21.text = "Zinc"
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this@Quimica)
                textView22.text = "Zn"
                textView22.setTextColor(Color.BLACK)
                val textView84 = TextView(this@Quimica)
                textView84.text = "30"
                textView84.setTextColor(Color.BLACK)
                val textView85 = TextView(this@Quimica)
                textView85.text = "65.380"
                textView85.setTextColor(Color.BLACK)

                tableRow11.addView(textView21)
                tableRow11.addView(textView22)
                tableRow11.addView(textView84)
                tableRow11.addView(textView85)
                tabla.addView(tableRow11)

                val tableRow12 = TableRow(this@Quimica)
                tableRow12.setBackgroundResource(R.color.naranja)
                val textView23 = TextView(this@Quimica)
                textView23.text = "Circonio"
                textView23.setTextColor(Color.BLACK)
                val textView24 = TextView(this@Quimica)
                textView24.text = "Zr"
                textView24.setTextColor(Color.BLACK)
                val textView86 = TextView(this@Quimica)
                textView86.text = "40"
                textView86.setTextColor(Color.BLACK)
                val textView87 = TextView(this@Quimica)
                textView87.text = "91.224"
                textView87.setTextColor(Color.BLACK)


                tableRow12.addView(textView23)
                tableRow12.addView(textView24)
                tableRow12.addView(textView86)
                tableRow12.addView(textView87)
                tabla.addView(tableRow12)

                val tableRow13 = TableRow(this@Quimica)
                tableRow13.setBackgroundResource(R.color.amarillo)
                val textView57 = TextView(this@Quimica)
                textView57.text = "Niobio"
                textView57.setTextColor(Color.BLACK)
                val textView36 = TextView(this@Quimica)
                textView36.text = "Nb"
                textView36.setTextColor(Color.BLACK)
                val textView88 = TextView(this@Quimica)
                textView88.text = "41"
                textView88.setTextColor(Color.BLACK)
                val textView89 = TextView(this@Quimica)
                textView89.text = "92.906"
                textView89.setTextColor(Color.BLACK)

                tableRow13.addView(textView57)
                tableRow13.addView(textView36)
                tableRow13.addView(textView88)
                tableRow13.addView(textView89)
                tabla.addView(tableRow13)

                val tableRow14 = TableRow(this@Quimica)
                tableRow14.setBackgroundResource(R.color.naranja)
                val textView58 = TextView(this@Quimica)
                textView58.text = "Molibdeno"
                textView58.setTextColor(Color.BLACK)
                val textView59 = TextView(this@Quimica)
                textView59.text = "Mo"
                textView59.setTextColor(Color.BLACK)
                val textView90 = TextView(this@Quimica)
                textView90.text = "42"
                textView90.setTextColor(Color.BLACK)
                val textView91 = TextView(this@Quimica)
                textView91.text = "95.950"
                textView91.setTextColor(Color.BLACK)

                tableRow14.addView(textView58)
                tableRow14.addView(textView59)
                tableRow14.addView(textView90)
                tableRow14.addView(textView91)
                tabla.addView(tableRow14)

                val tableRow21 = TableRow(this@Quimica)
                tableRow21.setBackgroundResource(R.color.amarillo)
                val textView61 = TextView(this@Quimica)
                textView61.text = "Tecnecio"
                textView61.setTextColor(Color.BLACK)
                val textView30 = TextView(this@Quimica)
                textView30.text = "Tc"
                textView30.setTextColor(Color.BLACK)
                val textView92 = TextView(this@Quimica)
                textView92.text = "43"
                textView92.setTextColor(Color.BLACK)
                val textView93 = TextView(this@Quimica)
                textView93.text = "98"
                textView93.setTextColor(Color.BLACK)

                tableRow21.addView(textView61)
                tableRow21.addView(textView30)
                tableRow21.addView(textView92)
                tableRow21.addView(textView93)
                tabla.addView(tableRow21)

                val tableRow15 = TableRow(this@Quimica)
                tableRow15.setBackgroundResource(R.color.naranja)
                val textView31 = TextView(this@Quimica)
                textView31.text = "Rutenio"
                textView31.setTextColor(Color.BLACK)
                val textView32 = TextView(this@Quimica)
                textView32.text = "Ru"
                textView32.setTextColor(Color.BLACK)
                val textView99 = TextView(this@Quimica)
                textView99.text = "44"
                textView99.setTextColor(Color.BLACK)
                val textView100 = TextView(this@Quimica)
                textView100.text = "101.07"
                textView100.setTextColor(Color.BLACK)

                tableRow15.addView(textView31)
                tableRow15.addView(textView32)
                tableRow15.addView(textView99)
                tableRow15.addView(textView100)
                tabla.addView(tableRow15)

                val tableRow16 = TableRow(this@Quimica)
                tableRow16.setBackgroundResource(R.color.amarillo)
                val textView62 = TextView(this@Quimica)
                textView62.text = "Rodio"
                textView62.setTextColor(Color.BLACK)
                val textView63 = TextView(this@Quimica)
                textView63.text = "Rh"
                textView63.setTextColor(Color.BLACK)
                val textView101 = TextView(this@Quimica)
                textView101.text = "45"
                textView101.setTextColor(Color.BLACK)
                val textView102 = TextView(this@Quimica)
                textView102.text = "102.91"
                textView102.setTextColor(Color.BLACK)

                tableRow16.addView(textView62)
                tableRow16.addView(textView63)
                tableRow16.addView(textView101)
                tableRow16.addView(textView102)
                tabla.addView(tableRow16)

                val tableRow17 = TableRow(this@Quimica)
                tableRow17.setBackgroundResource(R.color.naranja)
                val textView65 = TextView(this@Quimica)
                textView65.text = "Paladio"
                textView65.setTextColor(Color.BLACK)
                val textView35 = TextView(this@Quimica)
                textView35.text = "Pd"
                textView35.setTextColor(Color.BLACK)
                val textView103 = TextView(this@Quimica)
                textView103.text = "46"
                textView103.setTextColor(Color.BLACK)
                val textView104 = TextView(this@Quimica)
                textView104.text = "106.42"
                textView104.setTextColor(Color.BLACK)

                tableRow17.addView(textView65)
                tableRow17.addView(textView35)
                tableRow17.addView(textView103)
                tableRow17.addView(textView104)
                tabla.addView(tableRow17)

                val tableRow18 = TableRow(this@Quimica)
                tableRow18.setBackgroundResource(R.color.amarillo)
                val textView41 = TextView(this@Quimica)
                textView41.text = "Plata"
                textView41.setTextColor(Color.BLACK)
                val textView37 = TextView(this@Quimica)
                textView37.text = "Ag"
                textView37.setTextColor(Color.BLACK)
                val textView105 = TextView(this@Quimica)
                textView105.text = "47"
                textView105.setTextColor(Color.BLACK)
                val textView106 = TextView(this@Quimica)
                textView106.text = "107.87"
                textView106.setTextColor(Color.BLACK)


                tableRow18.addView(textView41)
                tableRow18.addView(textView37)
                tableRow18.addView(textView105)
                tableRow18.addView(textView106)
                tabla.addView(tableRow18)

                val tableRow19 = TableRow(this@Quimica)
                tableRow19.setBackgroundResource(R.color.naranja)
                val textView67 = TextView(this@Quimica)
                textView67.text = "Cadmio"
                textView67.setTextColor(Color.BLACK)
                val textView38 = TextView(this@Quimica)
                textView38.text = "Cd"
                textView38.setTextColor(Color.BLACK)
                val textView107 = TextView(this@Quimica)
                textView107.text = "48"
                textView107.setTextColor(Color.BLACK)
                val textView108 = TextView(this@Quimica)
                textView108.text = "112.41"
                textView108.setTextColor(Color.BLACK)

                tableRow19.addView(textView67)
                tableRow19.addView(textView38)
                tableRow19.addView(textView107)
                tableRow19.addView(textView108)
                tabla.addView(tableRow19)

                val tableRow20 = TableRow(this@Quimica)
                tableRow20.setBackgroundResource(R.color.amarillo)
                val textView68 = TextView(this@Quimica)
                textView68.text = "Hafnio"
                textView68.setTextColor(Color.BLACK)
                val textView46 = TextView(this@Quimica)
                textView46.text = "Hf"
                textView46.setTextColor(Color.BLACK)
                val textView109 = TextView(this@Quimica)
                textView109.text = "72"
                textView109.setTextColor(Color.BLACK)
                val textView110 = TextView(this@Quimica)
                textView110.text = "178.49"
                textView110.setTextColor(Color.BLACK)

                tableRow20.addView(textView68)
                tableRow20.addView(textView46)
                tableRow20.addView(textView109)
                tableRow20.addView(textView110)
                tabla.addView(tableRow20)

                val tableRow22 = TableRow(this@Quimica)
                tableRow22.setBackgroundResource(R.color.naranja)
                val textView47 = TextView(this@Quimica)
                textView47.text = "Tántalo"
                textView47.setTextColor(Color.BLACK)
                val textView60 = TextView(this@Quimica)
                textView60.text = "Ta"
                textView60.setTextColor(Color.BLACK)
                val textView111 = TextView(this@Quimica)
                textView111.text = "73"
                textView111.setTextColor(Color.BLACK)
                val textView112 = TextView(this@Quimica)
                textView112.text = "180.95"
                textView112.setTextColor(Color.BLACK)

                tableRow22.addView(textView47)
                tableRow22.addView(textView60)
                tableRow22.addView(textView111)
                tableRow22.addView(textView112)
                tabla.addView(tableRow22)

                val tableRow23 = TableRow(this@Quimica)
                tableRow23.setBackgroundResource(R.color.amarillo)
                val textView48 = TextView(this@Quimica)
                textView48.text = "Wolframio"
                textView48.setTextColor(Color.BLACK)
                val textView50 = TextView(this@Quimica)
                textView50.text = "W"
                textView50.setTextColor(Color.BLACK)
                val textView113 = TextView(this@Quimica)
                textView113.text = "74"
                textView113.setTextColor(Color.BLACK)
                val textView114 = TextView(this@Quimica)
                textView114.text = "183.84"
                textView114.setTextColor(Color.BLACK)

                tableRow23.addView(textView48)
                tableRow23.addView(textView50)
                tableRow23.addView(textView113)
                tableRow23.addView(textView114)
                tabla.addView(tableRow23)

                val tableRow24 = TableRow(this@Quimica)
                tableRow24.setBackgroundResource(R.color.naranja)
                val textView51 = TextView(this@Quimica)
                textView51.text = "Renio"
                textView51.setTextColor(Color.BLACK)
                val textView52 = TextView(this@Quimica)
                textView52.text = "Re"
                textView52.setTextColor(Color.BLACK)
                val textView115 = TextView(this@Quimica)
                textView115.text = "75"
                textView115.setTextColor(Color.BLACK)
                val textView116 = TextView(this@Quimica)
                textView116.text = "186.21"
                textView116.setTextColor(Color.BLACK)

                tableRow24.addView(textView51)
                tableRow24.addView(textView52)
                tableRow24.addView(textView115)
                tableRow24.addView(textView116)
                tabla.addView(tableRow24)

                val tableRow30 = TableRow(this@Quimica)
                tableRow30.setBackgroundResource(R.color.amarillo)
                val textView69 = TextView(this@Quimica)
                textView69.text = "Osmio"
                textView69.setTextColor(Color.BLACK)
                val textView56 = TextView(this@Quimica)
                textView56.text = "Os"
                textView56.setTextColor(Color.BLACK)
                val textView117 = TextView(this@Quimica)
                textView117.text = "76"
                textView117.setTextColor(Color.BLACK)
                val textView118 = TextView(this@Quimica)
                textView118.text = "190.23"
                textView118.setTextColor(Color.BLACK)

                tableRow30.addView(textView69)
                tableRow30.addView(textView56)
                tableRow30.addView(textView117)
                tableRow30.addView(textView118)
                tabla.addView(tableRow30)

                val tableRow31 = TableRow(this@Quimica)
                tableRow31.setBackgroundResource(R.color.naranja)
                val textView119 = TextView(this@Quimica)
                textView119.text = "Iridio"
                textView119.setTextColor(Color.BLACK)
                val textView120 = TextView(this@Quimica)
                textView120.text = "Ir"
                textView120.setTextColor(Color.BLACK)
                val textView121 = TextView(this@Quimica)
                textView121.text = "77"
                textView121.setTextColor(Color.BLACK)
                val textView122 = TextView(this@Quimica)
                textView122.text = "192.22"
                textView122.setTextColor(Color.BLACK)

                tableRow31.addView(textView119)
                tableRow31.addView(textView120)
                tableRow31.addView(textView121)
                tableRow31.addView(textView122)
                tabla.addView(tableRow31)

                val tableRow32 = TableRow(this@Quimica)
                tableRow32.setBackgroundResource(R.color.amarillo)
                val textView123 = TextView(this@Quimica)
                textView123.text = "Platino"
                textView123.setTextColor(Color.BLACK)
                val textView124 = TextView(this@Quimica)
                textView124.text = "Pt"
                textView124.setTextColor(Color.BLACK)
                val textView125 = TextView(this@Quimica)
                textView125.text = "78"
                textView125.setTextColor(Color.BLACK)
                val textView126 = TextView(this@Quimica)
                textView126.text = "195.08"
                textView126.setTextColor(Color.BLACK)

                tableRow32.addView(textView123)
                tableRow32.addView(textView124)
                tableRow32.addView(textView125)
                tableRow32.addView(textView126)
                tabla.addView(tableRow32)

                val tableRow33 = TableRow(this@Quimica)
                tableRow33.setBackgroundResource(R.color.naranja)
                val textView127 = TextView(this@Quimica)
                textView127.text = "Oro"
                textView127.setTextColor(Color.BLACK)
                val textView128 = TextView(this@Quimica)
                textView128.text = "Au"
                textView128.setTextColor(Color.BLACK)
                val textView129 = TextView(this@Quimica)
                textView129.text = "79"
                textView129.setTextColor(Color.BLACK)
                val textView130 = TextView(this@Quimica)
                textView130.text = "196.97"
                textView130.setTextColor(Color.BLACK)

                tableRow33.addView(textView127)
                tableRow33.addView(textView128)
                tableRow33.addView(textView129)
                tableRow33.addView(textView130)
                tabla.addView(tableRow33)

                val tableRow34 = TableRow(this@Quimica)
                tableRow34.setBackgroundResource(R.color.amarillo)
                val textView131 = TextView(this@Quimica)
                textView131.text = "Mercurio"
                textView131.setTextColor(Color.BLACK)
                val textView132 = TextView(this@Quimica)
                textView132.text = "Hg"
                textView132.setTextColor(Color.BLACK)
                val textView133 = TextView(this@Quimica)
                textView133.text = "80"
                textView133.setTextColor(Color.BLACK)
                val textView134 = TextView(this@Quimica)
                textView134.text = "200.59"
                textView134.setTextColor(Color.BLACK)

                tableRow34.addView(textView131)
                tableRow34.addView(textView132)
                tableRow34.addView(textView133)
                tableRow34.addView(textView134)
                tabla.addView(tableRow34)

                val tableRow35 = TableRow(this@Quimica)
                tableRow35.setBackgroundResource(R.color.naranja)
                val textView135 = TextView(this@Quimica)
                textView135.text = "Retherfordio"
                textView135.setTextColor(Color.BLACK)
                val textView136 = TextView(this@Quimica)
                textView136.text = "Rf"
                textView136.setTextColor(Color.BLACK)
                val textView137 = TextView(this@Quimica)
                textView137.text = "104"
                textView137.setTextColor(Color.BLACK)
                val textView138 = TextView(this@Quimica)
                textView138.text = "267"
                textView138.setTextColor(Color.BLACK)

                tableRow35.addView(textView135)
                tableRow35.addView(textView136)
                tableRow35.addView(textView137)
                tableRow35.addView(textView138)
                tabla.addView(tableRow35)

                val tableRow36 = TableRow(this@Quimica)
                tableRow36.setBackgroundResource(R.color.amarillo)
                val textView139 = TextView(this@Quimica)
                textView139.text = "Dubnio"
                textView139.setTextColor(Color.BLACK)
                val textView140 = TextView(this@Quimica)
                textView140.text = "Db"
                textView140.setTextColor(Color.BLACK)
                val textView141 = TextView(this@Quimica)
                textView141.text = "105"
                textView141.setTextColor(Color.BLACK)
                val textView142 = TextView(this@Quimica)
                textView142.text = "262"
                textView142.setTextColor(Color.BLACK)

                tableRow36.addView(textView139)
                tableRow36.addView(textView140)
                tableRow36.addView(textView141)
                tableRow36.addView(textView142)
                tabla.addView(tableRow36)

                val tableRow37 = TableRow(this@Quimica)
                tableRow37.setBackgroundResource(R.color.naranja)
                val textView143 = TextView(this@Quimica)
                textView143.text = "Seaborgio"
                textView143.setTextColor(Color.BLACK)
                val textView144 = TextView(this@Quimica)
                textView144.text = "Sg"
                textView144.setTextColor(Color.BLACK)
                val textView145 = TextView(this@Quimica)
                textView145.text = "106"
                textView145.setTextColor(Color.BLACK)
                val textView146 = TextView(this@Quimica)
                textView146.text = "269"
                textView146.setTextColor(Color.BLACK)

                tableRow37.addView(textView143)
                tableRow37.addView(textView144)
                tableRow37.addView(textView145)
                tableRow37.addView(textView146)
                tabla.addView(tableRow37)

                val tableRow38 = TableRow(this@Quimica)
                tableRow38.setBackgroundResource(R.color.amarillo)
                val textView147 = TextView(this@Quimica)
                textView147.text = "Bohrio"
                textView147.setTextColor(Color.BLACK)
                val textView148 = TextView(this@Quimica)
                textView148.text = "Bh"
                textView148.setTextColor(Color.BLACK)
                val textView149 = TextView(this@Quimica)
                textView149.text = "107"
                textView149.setTextColor(Color.BLACK)
                val textView150 = TextView(this@Quimica)
                textView150.text = "264"
                textView150.setTextColor(Color.BLACK)

                tableRow38.addView(textView147)
                tableRow38.addView(textView148)
                tableRow38.addView(textView149)
                tableRow38.addView(textView150)
                tabla.addView(tableRow38)

                val tableRow39 = TableRow(this@Quimica)
                tableRow39.setBackgroundResource(R.color.amarillo)
                val textView151 = TextView(this@Quimica)
                textView151.text = "Hasio"
                textView151.setTextColor(Color.BLACK)
                val textView152 = TextView(this@Quimica)
                textView152.text = "Hs"
                textView152.setTextColor(Color.BLACK)
                val textView153 = TextView(this@Quimica)
                textView153.text = "108"
                textView153.setTextColor(Color.BLACK)
                val textView154 = TextView(this@Quimica)
                textView154.text = "269"
                textView154.setTextColor(Color.BLACK)

                tableRow39.addView(textView151)
                tableRow39.addView(textView152)
                tableRow39.addView(textView153)
                tableRow39.addView(textView154)
                tabla.addView(tableRow39)

            }

           7L -> {
                val tableRow40 = TableRow(this@Quimica)
                tableRow40.setBackgroundResource(R.color.naranjafuerte)
                val textView156 = TextView(this@Quimica)
                textView156.text = "N.del elemento"
                textView156.setTextColor(Color.BLACK)
                val textView157 = TextView(this@Quimica)
                textView157.text = "Símbolo"
                textView157.setTextColor(Color.BLACK)
                val textView158 = TextView(this@Quimica)
                textView158.text = "N.atómico"
                textView158.setTextColor(Color.BLACK)
                val textView159 = TextView(this@Quimica)
                textView159.text = "Masa atómica"
                textView159.setTextColor(Color.BLACK)
                textView159.setTextColor(Color.BLACK)
                tableRow40.addView(textView156)
                tableRow40.addView(textView157)
                tableRow40.addView(textView158)
                tableRow40.addView(textView159)
                tabla.addView(tableRow40)

                val tableRow1 = TableRow(this@Quimica)
                tableRow1.setBackgroundResource(R.color.verdeagua)
                val textView0 = TextView(this@Quimica)
                textView0.text = "Helio"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this@Quimica)
                textView2.text = "He"
                textView2.setTextColor(Color.BLACK)
                val textView43 = TextView(this@Quimica)
                textView43.text = "2"
                textView43.setTextColor(Color.BLACK)
                val textView45 = TextView(this@Quimica)
                textView45.text = "4.0026"
                textView45.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tableRow1.addView(textView43)
                tableRow1.addView(textView45)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this@Quimica)
                tableRow2.setBackgroundResource(R.color.cafe)
                val textView3 = TextView(this@Quimica)
                textView3.text = "Neón"
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this@Quimica)
                textView4.text = "Ne"
                textView4.setTextColor(Color.BLACK)
                val textView25 = TextView(this@Quimica)
                textView25.text = "10"
                textView25.setTextColor(Color.BLACK)
                val textView27 = TextView(this@Quimica)
                textView27.text = "20.180"
                textView27.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tableRow2.addView(textView25)
                tableRow2.addView(textView27)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this@Quimica)
                tableRow3.setBackgroundResource(R.color.verdeagua)
                val textView5 = TextView(this@Quimica)
                textView5.text = "Argón"
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this@Quimica)
                textView6.text = "Ar"
                textView6.setTextColor(Color.BLACK)
                val textView34 = TextView(this@Quimica)
                textView34.text = "18"
                textView34.setTextColor(Color.BLACK)
                val textView33 = TextView(this@Quimica)
                textView33.text = "39.948"
                textView33.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tableRow3.addView(textView34)
                tableRow3.addView(textView33)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this@Quimica)
                tableRow4.setBackgroundResource(R.color.cafe)
                val textView7 = TextView(this@Quimica)
                textView7.text = "Kriptón"
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this@Quimica)
                textView8.text = "Kr"
                textView8.setTextColor(Color.BLACK)
                val textView26 = TextView(this@Quimica)
                textView26.text = "36"
                textView26.setTextColor(Color.BLACK)
                val textView44 = TextView(this@Quimica)
                textView44.text = "83.798"
                textView44.setTextColor(Color.BLACK)
                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tableRow4.addView(textView26)
                tableRow4.addView(textView44)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this@Quimica)
                tableRow5.setBackgroundResource(R.color.verdeagua)
                val textView9 = TextView(this@Quimica)
                textView9.text = "Xenón"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this@Quimica)
                textView10.text = "Xe"
                textView10.setTextColor(Color.BLACK)
                val textView55 = TextView(this@Quimica)
                textView55.text = "54"
                textView55.setTextColor(Color.BLACK)
                val textView28 = TextView(this@Quimica)
                textView28.text = "131.29"
                textView28.setTextColor(Color.BLACK)


                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tableRow5.addView(textView55)
                tableRow5.addView(textView28)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this@Quimica)
                tableRow6.setBackgroundResource(R.color.cafe)
                val textView11 = TextView(this@Quimica)
                textView11.text = "Radón"
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this@Quimica)
                textView12.text = "Rn"
                textView12.setTextColor(Color.BLACK)
                val textView29 = TextView(this@Quimica)
                textView29.text = "86"
                textView29.setTextColor(Color.BLACK)
                val textView40 = TextView(this@Quimica)
                textView40.text = "222"
                textView40.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tableRow6.addView(textView29)
                tableRow6.addView(textView40)
                tabla.addView(tableRow6)
            }

            8L -> {
                val tableRow40 = TableRow(this@Quimica)
                tableRow40.setBackgroundResource(R.color.naranjafuerte)
                val textView156 = TextView(this@Quimica)
                textView156.text = "N.del elemento"
                textView156.setTextColor(Color.BLACK)
                val textView157 = TextView(this@Quimica)
                textView157.text = "Símbolo"
                textView157.setTextColor(Color.BLACK)
                val textView158 = TextView(this@Quimica)
                textView158.text = "N.atómico"
                textView158.setTextColor(Color.BLACK)
                val textView159 = TextView(this@Quimica)
                textView159.text = "Masa atómica"
                textView159.setTextColor(Color.BLACK)
                textView159.setTextColor(Color.BLACK)
                tableRow40.addView(textView156)
                tableRow40.addView(textView157)
                tableRow40.addView(textView158)
                tableRow40.addView(textView159)
                tabla.addView(tableRow40)

                val tableRow11 = TableRow(this@Quimica)
                tableRow11.setBackgroundResource(R.color.rosa)
                val textView21 = TextView(this@Quimica)
                textView21.text = "Aluminio"
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this@Quimica)
                textView22.text = "Al"
                textView22.setTextColor(Color.BLACK)
                val textView84 = TextView(this@Quimica)
                textView84.text = "13"
                textView84.setTextColor(Color.BLACK)
                val textView85 = TextView(this@Quimica)
                textView85.text = "26.982"
                textView85.setTextColor(Color.BLACK)

                tableRow11.addView(textView21)
                tableRow11.addView(textView22)
                tableRow11.addView(textView84)
                tableRow11.addView(textView85)
                tabla.addView(tableRow11)


                val tableRow1 = TableRow(this@Quimica)
                tableRow1.setBackgroundResource(R.color.morado)
                val textView0 = TextView(this@Quimica)
                textView0.text = "Galio"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this@Quimica)
                textView2.text = "Ga"
                textView2.setTextColor(Color.BLACK)
                val textView43 = TextView(this@Quimica)
                textView43.text = "31"
                textView43.setTextColor(Color.BLACK)
                val textView45 = TextView(this@Quimica)
                textView45.text = "69.732"
                textView45.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tableRow1.addView(textView43)
                tableRow1.addView(textView45)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this@Quimica)
                tableRow2.setBackgroundResource(R.color.rosa)
                val textView3 = TextView(this@Quimica)
                textView3.text = "Indio"
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this@Quimica)
                textView4.text = "In"
                textView4.setTextColor(Color.BLACK)
                val textView25 = TextView(this@Quimica)
                textView25.text = "49"
                textView25.setTextColor(Color.BLACK)
                val textView27 = TextView(this@Quimica)
                textView27.text = "114.82"
                textView27.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tableRow2.addView(textView25)
                tableRow2.addView(textView27)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this@Quimica)
                tableRow3.setBackgroundResource(R.color.morado)
                val textView5 = TextView(this@Quimica)
                textView5.text = "Estaño"
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this@Quimica)
                textView6.text = "Sn"
                textView6.setTextColor(Color.BLACK)
                val textView34 = TextView(this@Quimica)
                textView34.text = "50"
                textView34.setTextColor(Color.BLACK)
                val textView33 = TextView(this@Quimica)
                textView33.text = "118.71"
                textView33.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tableRow3.addView(textView34)
                tableRow3.addView(textView33)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this@Quimica)
                tableRow4.setBackgroundResource(R.color.rosa)
                val textView7 = TextView(this@Quimica)
                textView7.text = "Talio"
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this@Quimica)
                textView8.text = "Tl"
                textView8.setTextColor(Color.BLACK)
                val textView26 = TextView(this@Quimica)
                textView26.text = "81"
                textView26.setTextColor(Color.BLACK)
                val textView44 = TextView(this@Quimica)
                textView44.text = "204.38"
                textView44.setTextColor(Color.BLACK)
                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tableRow4.addView(textView26)
                tableRow4.addView(textView44)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this@Quimica)
                tableRow5.setBackgroundResource(R.color.morado)
                val textView9 = TextView(this@Quimica)
                textView9.text = "Plomo"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this@Quimica)
                textView10.text = "Pb"
                textView10.setTextColor(Color.BLACK)
                val textView55 = TextView(this@Quimica)
                textView55.text = "82"
                textView55.setTextColor(Color.BLACK)
                val textView28 = TextView(this@Quimica)
                textView28.text = "207.20"
                textView28.setTextColor(Color.BLACK)


                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tableRow5.addView(textView55)
                tableRow5.addView(textView28)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this@Quimica)
                tableRow6.setBackgroundResource(R.color.rosa)
                val textView11 = TextView(this@Quimica)
                textView11.text = "Bismuto"
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this@Quimica)
                textView12.text = "Bi"
                textView12.setTextColor(Color.BLACK)
                val textView29 = TextView(this@Quimica)
                textView29.text = "83"
                textView29.setTextColor(Color.BLACK)
                val textView40 = TextView(this@Quimica)
                textView40.text = "208.98"
                textView40.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tableRow6.addView(textView29)
                tableRow6.addView(textView40)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this@Quimica)
                tableRow7.setBackgroundResource(R.color.morado)
                val textView13 = TextView(this@Quimica)
                textView13.text = "Polonio"
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this@Quimica)
                textView14.text = "Po"
                textView14.setTextColor(Color.BLACK)
                val textView70 = TextView(this@Quimica)
                textView70.text = "84"
                textView70.setTextColor(Color.BLACK)
                val textView71 = TextView(this@Quimica)
                textView71.text = "209"
                textView71.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tableRow7.addView(textView70)
                tableRow7.addView(textView71)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this@Quimica)
                tableRow8.setBackgroundResource(R.color.rosa)
                val textView15 = TextView(this@Quimica)
                textView15.text = "Astato"
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this@Quimica)
                textView16.text = "At"
                textView16.setTextColor(Color.BLACK)
                val textView78 = TextView(this@Quimica)
                textView78.text = "85"
                textView78.setTextColor(Color.BLACK)
                val textView79 = TextView(this@Quimica)
                textView79.text = "210"
                textView79.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tableRow8.addView(textView78)
                tableRow8.addView(textView79)
                tabla.addView(tableRow8)
            }

           9L -> {
                val tableRow40 = TableRow(this@Quimica)
                tableRow40.setBackgroundResource(R.color.naranjafuerte)
                val textView156 = TextView(this@Quimica)
                textView156.text = "N.del elemento"
                textView156.setTextColor(Color.BLACK)
                val textView157 = TextView(this@Quimica)
                textView157.text = "Símbolo"
                textView157.setTextColor(Color.BLACK)
                val textView158 = TextView(this@Quimica)
                textView158.text = "N.atómico"
                textView158.setTextColor(Color.BLACK)
                val textView159 = TextView(this@Quimica)
                textView159.text = "Masa atómica"
                textView159.setTextColor(Color.BLACK)
                textView159.setTextColor(Color.BLACK)
                tableRow40.addView(textView156)
                tableRow40.addView(textView157)
                tableRow40.addView(textView158)
                tableRow40.addView(textView159)
                tabla.addView(tableRow40)

                val tableRow1 = TableRow(this@Quimica)
                tableRow1.setBackgroundResource(R.color.verdeagua)
                val textView0 = TextView(this@Quimica)
                textView0.text = "Lantano"
                textView0.setTextColor(Color.BLACK)
                val textView2 = TextView(this@Quimica)
                textView2.text = "La"
                textView2.setTextColor(Color.BLACK)
                val textView43 = TextView(this@Quimica)
                textView43.text = "57"
                textView43.setTextColor(Color.BLACK)
                val textView45 = TextView(this@Quimica)
                textView45.text = "138.91"
                textView45.setTextColor(Color.BLACK)


                tableRow1.addView(textView0)
                tableRow1.addView(textView2)
                tableRow1.addView(textView43)
                tableRow1.addView(textView45)
                tabla.addView(tableRow1)


                val tableRow2 = TableRow(this@Quimica)
                tableRow2.setBackgroundResource(R.color.verdeclaro)
                val textView3 = TextView(this@Quimica)
                textView3.text = "Cerio"
                textView3.setTextColor(Color.BLACK)
                val textView4 = TextView(this@Quimica)
                textView4.text = "Ce"
                textView4.setTextColor(Color.BLACK)
                val textView25 = TextView(this@Quimica)
                textView25.text = "58"
                textView25.setTextColor(Color.BLACK)
                val textView27 = TextView(this@Quimica)
                textView27.text = "140.12"
                textView27.setTextColor(Color.BLACK)

                tableRow2.addView(textView3)
                tableRow2.addView(textView4)
                tableRow2.addView(textView25)
                tableRow2.addView(textView27)
                tabla.addView(tableRow2)

                val tableRow3 = TableRow(this@Quimica)
                tableRow3.setBackgroundResource(R.color.verdeagua)
                val textView5 = TextView(this@Quimica)
                textView5.text = "Praseodimio"
                textView5.setTextColor(Color.BLACK)
                val textView6 = TextView(this@Quimica)
                textView6.text = "Pr"
                textView6.setTextColor(Color.BLACK)
                val textView34 = TextView(this@Quimica)
                textView34.text = "59"
                textView34.setTextColor(Color.BLACK)
                val textView33 = TextView(this@Quimica)
                textView33.text = "140.91"
                textView33.setTextColor(Color.BLACK)

                tableRow3.addView(textView5)
                tableRow3.addView(textView6)
                tableRow3.addView(textView34)
                tableRow3.addView(textView33)
                tabla.addView(tableRow3)

                val tableRow4 = TableRow(this@Quimica)
                tableRow4.setBackgroundResource(R.color.verdeclaro)
                val textView7 = TextView(this@Quimica)
                textView7.text = "Neodimio"
                textView7.setTextColor(Color.BLACK)
                val textView8 = TextView(this@Quimica)
                textView8.text = "Nd"
                textView8.setTextColor(Color.BLACK)
                val textView26 = TextView(this@Quimica)
                textView26.text = "60"
                textView26.setTextColor(Color.BLACK)
                val textView44 = TextView(this@Quimica)
                textView44.text = "144.24"
                textView44.setTextColor(Color.BLACK)
                tableRow4.addView(textView7)
                tableRow4.addView(textView8)
                tableRow4.addView(textView26)
                tableRow4.addView(textView44)
                tabla.addView(tableRow4)

                val tableRow5 = TableRow(this@Quimica)
                tableRow5.setBackgroundResource(R.color.verdeagua)
                val textView9 = TextView(this@Quimica)
                textView9.text = "Prometio"
                textView9.setTextColor(Color.BLACK)
                val textView10 = TextView(this@Quimica)
                textView10.text = "Pm"
                textView10.setTextColor(Color.BLACK)
                val textView55 = TextView(this@Quimica)
                textView55.text = "61"
                textView55.setTextColor(Color.BLACK)
                val textView28 = TextView(this@Quimica)
                textView28.text = "145"
                textView28.setTextColor(Color.BLACK)


                tableRow5.addView(textView9)
                tableRow5.addView(textView10)
                tableRow5.addView(textView55)
                tableRow5.addView(textView28)
                tabla.addView(tableRow5)

                val tableRow6 = TableRow(this@Quimica)
                tableRow6.setBackgroundResource(R.color.verdeclaro)
                val textView11 = TextView(this@Quimica)
                textView11.text = "Samario"
                textView11.setTextColor(Color.BLACK)
                val textView12 = TextView(this@Quimica)
                textView12.text = "Sm"
                textView12.setTextColor(Color.BLACK)
                val textView29 = TextView(this@Quimica)
                textView29.text = "62"
                textView29.setTextColor(Color.BLACK)
                val textView40 = TextView(this@Quimica)
                textView40.text = "150.36"
                textView40.setTextColor(Color.BLACK)

                tableRow6.addView(textView11)
                tableRow6.addView(textView12)
                tableRow6.addView(textView29)
                tableRow6.addView(textView40)
                tabla.addView(tableRow6)

                val tableRow7 = TableRow(this@Quimica)
                tableRow7.setBackgroundResource(R.color.verdeagua)
                val textView13 = TextView(this@Quimica)
                textView13.text = "Europio"
                textView13.setTextColor(Color.BLACK)
                val textView14 = TextView(this@Quimica)
                textView14.text = "Eu"
                textView14.setTextColor(Color.BLACK)
                val textView70 = TextView(this@Quimica)
                textView70.text = "63"
                textView70.setTextColor(Color.BLACK)
                val textView71 = TextView(this@Quimica)
                textView71.text = "151.96"
                textView71.setTextColor(Color.BLACK)

                tableRow7.addView(textView13)
                tableRow7.addView(textView14)
                tableRow7.addView(textView70)
                tableRow7.addView(textView71)
                tabla.addView(tableRow7)

                val tableRow8 = TableRow(this@Quimica)
                tableRow8.setBackgroundResource(R.color.verdeclaro)
                val textView15 = TextView(this@Quimica)
                textView15.text = "Gadolinio"
                textView15.setTextColor(Color.BLACK)
                val textView16 = TextView(this@Quimica)
                textView16.text = "Gd"
                textView16.setTextColor(Color.BLACK)
                val textView78 = TextView(this@Quimica)
                textView78.text = "64"
                textView78.setTextColor(Color.BLACK)
                val textView79 = TextView(this@Quimica)
                textView79.text = "157.25"
                textView79.setTextColor(Color.BLACK)

                tableRow8.addView(textView15)
                tableRow8.addView(textView16)
                tableRow8.addView(textView78)
                tableRow8.addView(textView79)
                tabla.addView(tableRow8)


                val tableRow9 = TableRow(this@Quimica)
                tableRow9.setBackgroundResource(R.color.verdeagua)
                val textView17 = TextView(this@Quimica)
                textView17.text = "Terbio"
                textView17.setTextColor(Color.BLACK)
                val textView18 = TextView(this@Quimica)
                textView18.text = "Tb"
                textView18.setTextColor(Color.BLACK)
                val textView80 = TextView(this@Quimica)
                textView80.text = "65"
                textView80.setTextColor(Color.BLACK)
                val textView81 = TextView(this@Quimica)
                textView81.text = "158.93"
                textView81.setTextColor(Color.BLACK)

                tableRow9.addView(textView17)
                tableRow9.addView(textView18)
                tableRow9.addView(textView80)
                tableRow9.addView(textView81)
                tabla.addView(tableRow9)

                val tableRow10 = TableRow(this@Quimica)
                tableRow10.setBackgroundResource(R.color.verdeclaro)
                val textView19 = TextView(this@Quimica)
                textView19.text = "Disprosio"
                textView19.setTextColor(Color.BLACK)
                val textView20 = TextView(this@Quimica)
                textView20.text = "Dy"
                textView20.setTextColor(Color.BLACK)
                val textView82 = TextView(this@Quimica)
                textView82.text = "66"
                textView82.setTextColor(Color.BLACK)
                val textView83 = TextView(this@Quimica)
                textView83.text = "162.5"
                textView83.setTextColor(Color.BLACK)

                tableRow10.addView(textView19)
                tableRow10.addView(textView20)
                tableRow10.addView(textView82)
                tableRow10.addView(textView83)
                tabla.addView(tableRow10)

                val tableRow11 = TableRow(this@Quimica)
                tableRow11.setBackgroundResource(R.color.verdeagua)
                val textView21 = TextView(this@Quimica)
                textView21.text = "Holmio"
                textView21.setTextColor(Color.BLACK)
                val textView22 = TextView(this@Quimica)
                textView22.text = "Ho"
                textView22.setTextColor(Color.BLACK)
                val textView84 = TextView(this@Quimica)
                textView84.text = "67"
                textView84.setTextColor(Color.BLACK)
                val textView85 = TextView(this@Quimica)
                textView85.text = "164.93"
                textView85.setTextColor(Color.BLACK)

                tableRow11.addView(textView21)
                tableRow11.addView(textView22)
                tableRow11.addView(textView84)
                tableRow11.addView(textView85)
                tabla.addView(tableRow11)

                val tableRow12 = TableRow(this@Quimica)
                tableRow12.setBackgroundResource(R.color.verdeclaro)
                val textView23 = TextView(this@Quimica)
                textView23.text = "Erbio"
                textView23.setTextColor(Color.BLACK)
                val textView24 = TextView(this@Quimica)
                textView24.text = "Er"
                textView24.setTextColor(Color.BLACK)
                val textView86 = TextView(this@Quimica)
                textView86.text = "68"
                textView86.setTextColor(Color.BLACK)
                val textView87 = TextView(this@Quimica)
                textView87.text = "167.26"
                textView87.setTextColor(Color.BLACK)


                tableRow12.addView(textView23)
                tableRow12.addView(textView24)
                tableRow12.addView(textView86)
                tableRow12.addView(textView87)
                tabla.addView(tableRow12)

                val tableRow13 = TableRow(this@Quimica)
                tableRow13.setBackgroundResource(R.color.verdeagua)
                val textView57 = TextView(this@Quimica)
                textView57.text = "Tulio"
                textView57.setTextColor(Color.BLACK)
                val textView36 = TextView(this@Quimica)
                textView36.text = "Tm"
                textView36.setTextColor(Color.BLACK)
                val textView88 = TextView(this@Quimica)
                textView88.text = "69"
                textView88.setTextColor(Color.BLACK)
                val textView89 = TextView(this@Quimica)
                textView89.text = "168.93"
                textView89.setTextColor(Color.BLACK)

                tableRow13.addView(textView57)
                tableRow13.addView(textView36)
                tableRow13.addView(textView88)
                tableRow13.addView(textView89)
                tabla.addView(tableRow13)

                val tableRow14 = TableRow(this@Quimica)
                tableRow14.setBackgroundResource(R.color.verdeclaro)
                val textView58 = TextView(this@Quimica)
                textView58.text = "Iterbio"
                textView58.setTextColor(Color.BLACK)
                val textView59 = TextView(this@Quimica)
                textView59.text = "Yb"
                textView59.setTextColor(Color.BLACK)
                val textView90 = TextView(this@Quimica)
                textView90.text = "70"
                textView90.setTextColor(Color.BLACK)
                val textView91 = TextView(this@Quimica)
                textView91.text = "173.04"
                textView91.setTextColor(Color.BLACK)

                tableRow14.addView(textView58)
                tableRow14.addView(textView59)
                tableRow14.addView(textView90)
                tableRow14.addView(textView91)
                tabla.addView(tableRow14)

                val tableRow21 = TableRow(this@Quimica)
                tableRow21.setBackgroundResource(R.color.verdeagua)
                val textView61 = TextView(this@Quimica)
                textView61.text = "Lutecio"
                textView61.setTextColor(Color.BLACK)
                val textView30 = TextView(this@Quimica)
                textView30.text = "Lu"
                textView30.setTextColor(Color.BLACK)
                val textView92 = TextView(this@Quimica)
                textView92.text = "71"
                textView92.setTextColor(Color.BLACK)
                val textView93 = TextView(this@Quimica)
                textView93.text = "174.97"
                textView93.setTextColor(Color.BLACK)

                tableRow21.addView(textView61)
                tableRow21.addView(textView30)
                tableRow21.addView(textView92)
                tableRow21.addView(textView93)
                tabla.addView(tableRow21)
            }

        }
    }
}
