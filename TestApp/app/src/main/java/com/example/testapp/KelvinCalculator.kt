package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.NumberPicker
import android.widget.TextView
import androidx.core.view.minusAssign
import org.w3c.dom.Text

class KelvinCalculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelvin_calculator)

        val calculateTemp = findViewById<Button>(R.id.Calculate_Button)


        calculateTemp.setOnClickListener {

            val newtonTempCalculation = findViewById<TextView>(R.id.Temp_Calculations)
            val celsiusTempCalculation = findViewById<TextView>(R.id.Celsius_Temp_Calculations)
            val fahrenheitTempCalculation = findViewById<TextView>(R.id.fahrenheit_Temp_Calculations)

            val tempInput = findViewById<EditText>(R.id.editTextNumber)
            val tempValue = Integer.parseInt(tempInput.text.toString())


            val celsius = tempValue.minus(273)
            val fahrenheit = celsius.times(1.8).plus(32)
            val newton = celsius.times(0.33)

            val newtonAns = "The temperature in Newton is "
            val celsiusAns = "The temperature in Celsius is "
            val fahrenheitAns = "The temperature in Fahrenheit is "

            newtonTempCalculation.text = String.format("%s%s", newtonAns, newton.toString())
            celsiusTempCalculation.text = String.format("%s%s", celsiusAns, celsius.toString())
            fahrenheitTempCalculation.text = String.format("%s%s", fahrenheitAns, fahrenheit.toString())

        }
    }
}