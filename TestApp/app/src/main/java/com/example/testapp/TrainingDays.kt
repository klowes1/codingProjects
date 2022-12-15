package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextClock
import android.widget.TextView

class TrainingDays : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_training_days)

        val marathonBtn = findViewById<Button>(R.id.marathon_input_button)
        val triathlonBtn = findViewById<Button>(R.id.Traithlon_input_button)
        val pentathlonBtn = findViewById<Button>(R.id.pentathlon_input_button)

        marathonBtn.setOnClickListener {
            val daysCalculation = findViewById<TextView>(R.id.training_days_calculation)
            val userNameInput = findViewById<EditText>(R.id.user_name_input_training_days).text
            val marathonResponse = ", you will need to train for 50 days in order to be prepared for the Marathon."

            daysCalculation.text = String.format("%s%s", userNameInput.toString(), marathonResponse)
        }

        triathlonBtn.setOnClickListener {
            val daysCalculation = findViewById<TextView>(R.id.training_days_calculation)
            val userNameInput = findViewById<EditText>(R.id.user_name_input_training_days).text

            daysCalculation.text = String.format("%s%s", userNameInput.toString(), ", you will need to train for 100 days in order to be prepared for the Triathlon.")
        }

        pentathlonBtn.setOnClickListener {
            val daysCalculation = findViewById<TextView>(R.id.training_days_calculation)
            val userNameInput = findViewById<EditText>(R.id.user_name_input_training_days).text

            daysCalculation.text = String.format("%s%s", userNameInput.toString(), ", you will need to train for 200 days in order to be prepared for the Pentathlon.")
        }
    }
}