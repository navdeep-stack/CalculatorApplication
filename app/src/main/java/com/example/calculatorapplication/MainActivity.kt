package com.example.calculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var isNewobj = true
    var previousNumber = ""
    var operator = "+"

    lateinit var edt_text: EditText
    lateinit var btnOne: Button
    lateinit var btntwo: Button
    lateinit var btnThree: Button
    lateinit var btnFour: Button
    lateinit var btnFive: Button
    lateinit var btnSix: Button
    lateinit var btnSeven: Button
    lateinit var btnEight: Button
    lateinit var btnNine: Button
    lateinit var btnZero: Button
    lateinit var btnDot: Button
    lateinit var btnplusminus: Button
    lateinit var btnplus: Button
    lateinit var btndivide: Button
    lateinit var btnmultiply: Button
    lateinit var btnminus: Button
    lateinit var btnpercent: Button
    lateinit var btnDel: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt_text = findViewById(R.id.edit_Text)
        btnOne = findViewById(R.id.btnOne)
        btntwo = findViewById(R.id.btnTwo)
        btnThree = findViewById(R.id.btnThree)
        btnFour = findViewById(R.id.btnFour)
        btnFive = findViewById(R.id.btnFive)
        btnSix = findViewById(R.id.btnSix)
        btnSeven = findViewById(R.id.btnSeven)
        btnEight = findViewById(R.id.btnEight)
        btnNine = findViewById(R.id.btnNine)
        btnZero = findViewById(R.id.btnzero)
        btnDot = findViewById(R.id.btnDot)
        btnplusminus = findViewById(R.id.btnPlusMinus)
        btnplus = findViewById(R.id.btnPlus)
        btndivide = findViewById(R.id.btnDivision)
        btnmultiply = findViewById(R.id.btnMultiply)
        btnminus = findViewById(R.id.btnSubtraction)
        btnpercent = findViewById(R.id.btnPercentage)
        btnDel = findViewById(R.id.btnDel)


    }

    fun numberInput(view: View) {
        if (isNewobj)
            edt_text.setText("")
        isNewobj = false

        var btnclick = edt_text.text.toString()
        val btnselect = view as Button
        when (btnselect.id) {
            btnOne.id -> {
                btnclick += "1"
            }
            btntwo.id -> {
                btnclick += "2"
            }
            btnThree.id -> {
                btnclick += "3"
            }
            btnFour.id -> {
                btnclick += "4"
            }
            btnFive.id -> {
                btnclick += "5"
            }
            btnSix.id -> {
                btnclick += "6"
            }
            btnSeven.id -> {
                btnclick += "7"
            }
            btnEight.id -> {
                btnclick += "8"
            }
            btnNine.id -> {
                btnclick += "9"
            }
            btnZero.id -> {
                btnclick += "0"
            }
            btnDot.id -> {
                btnclick += "."
            }
            btnplusminus.id -> {
                btnclick = "-$btnclick"
            }
        }
        edt_text.setText(btnclick)

    }

    fun operatorFunction(view: View) {
        isNewobj = true
        previousNumber = edt_text.text.toString()
        var btnselect = view as Button
        when (btnselect.id) {
            btnplus.id -> {
                operator = "+"
            }
            btndivide.id -> {
                operator = "/"
            }
            btnmultiply.id -> {
                operator = "*"
            }
            btnminus.id -> {
                operator = "-"
            }


        }

    }

    fun equalInput(view: View) {
        var newNumber = edt_text.text.toString()
        var result = 0.0
        when (operator) {
            "+" -> {
                result = previousNumber.toDouble() + newNumber.toDouble()
            }
            "-" -> {
                result = previousNumber.toDouble() - newNumber.toDouble()
            }
            "*" -> {
                result = previousNumber.toDouble() * newNumber.toDouble()
            }
            "/" -> {
                result = previousNumber.toDouble() / newNumber.toDouble()
            }
        }
        edt_text.setText(result.toString())

    }

    fun clearScreen(view: View) {
        edt_text.setText("0")
        isNewobj = true

    }

    fun percenatgeConverter(view: View) {

        var number = edt_text.text.toString().toDouble() / 100
        edt_text.setText(number.toString())
        isNewobj = true

    }

    fun deloperand(view: View) {
        val result: String
        val text = edt_text.text.toString()
        if (text.isNotEmpty()) {
            //edt_text.text=text.drop(1)
        }
        result = ""
    }
}

