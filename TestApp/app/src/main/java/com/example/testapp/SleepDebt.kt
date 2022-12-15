package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SleepDebt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sleep_debt)

        val calculateHours = findViewById<Button>(R.id.calculate_sleep_hours1)

        calculateHours.setOnClickListener {
            val mondayHrsInput = findViewById<EditText>(R.id.monday_sleep_hrs)
            val tuesdayHrsInput = findViewById<EditText>(R.id.Tuesday_sleep_hrs)
            val wednesdayHrsInput = findViewById<EditText>(R.id.wednesday_sleep_hrs)
            val thursdayHrsInput = findViewById<EditText>(R.id.thursday_sleep_hours)
            val fridayHrsInput = findViewById<EditText>(R.id.friday_sleep_hrs)
            val saturdayHrsInput = findViewById<EditText>(R.id.saturday_sleep_hrs)
            val sundayHrsInput = findViewById<EditText>(R.id.sunday_sleep_hrs)

            val mondayHrsValue = Integer.parseInt(mondayHrsInput.text.toString())
            val tuesdayHrsValue = Integer.parseInt(tuesdayHrsInput.text.toString())
            val wednesdayHrsValue = Integer.parseInt(wednesdayHrsInput.text.toString())
            val thursdayHrsValue = Integer.parseInt(thursdayHrsInput.text.toString())
            val fridayHrsValue = Integer.parseInt(fridayHrsInput.text.toString())
            val saturdayHrsValue = Integer.parseInt(saturdayHrsInput.text.toString())
            val sundayHrsValue = Integer.parseInt(sundayHrsInput.text.toString())

            val sleepHrsAns = findViewById<TextView>(R.id.sleep_debt_calculation)
            val perfectSleep = "You got the perfect amount of sleep! You slept for "
            val notEnoughSleep = "You did not get enough sleep this week... go back to bed. You slept for "
            val moreThanEnoughSleep = "You got too much sleep this week... wouldn't consider it a bad thing though. You slept for "

            val hoursOfSleep = mondayHrsValue.plus(tuesdayHrsValue.plus(wednesdayHrsValue.plus(thursdayHrsValue.plus(fridayHrsValue.plus(saturdayHrsValue.plus(sundayHrsValue))))))
            val sleepHrsStr = hoursOfSleep.toString() + " hours!"
            if (hoursOfSleep == 56) {
                sleepHrsAns.text = String.format("%s%s", perfectSleep, sleepHrsStr)
            } else if (hoursOfSleep > 56) {
                sleepHrsAns.text = String.format("%s%s", moreThanEnoughSleep, sleepHrsStr)
            } else if (hoursOfSleep < 56) {
                sleepHrsAns.text = String.format("%s%s", notEnoughSleep, sleepHrsStr)
            }

        }
    }
}