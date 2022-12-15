package com.example.testapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class EightBall : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eight_ball)

        val askQuestion = findViewById<Button>(R.id.Ask_Question_Button)

        askQuestion.setOnClickListener {

            //val userQuestion = findViewById<EditText>(R.id.Eight_Ball_Question_Input)
            val userName = findViewById<EditText>(R.id.Eight_Ball_Name_Input_Section).text
            val questionAnswer = findViewById<TextView>(R.id.Eight_Ball_Answer)

            val randomNumber = Random.nextInt(0, 8)
            val response0 = ", It seems that my signs point to yes."
            val response1 = ", It seems that it is certain."
            val response2 = ", It seems that it is decidedly so."
            val response3 = ", It seems that my reply is hazy, try again."
            val response4 = ", It seems that I cannot predict right now, try again."
            val response5 = ", It seems that you should not count on it."
            val response6 = ", It seems that my sources say no."
            val response7 = ", It seems that the outlook is not so good."
            val response8 = ", It seems definitely not likely."



            when {
                randomNumber == 1 -> {
                    questionAnswer.text = String.format("%s%s", userName, response1)
                }
                randomNumber == 2 -> {
                    questionAnswer.text = String.format("%s%s", userName, response2)
                }
                randomNumber == 3 -> {
                    questionAnswer.text = String.format("%s%s", userName, response3)
                }
                randomNumber == 4 -> {
                    questionAnswer.text = String.format("%s%s", userName, response4)
                }
                randomNumber == 5 -> {
                    questionAnswer.text = String.format("%s%s", userName, response5)
                }
                randomNumber == 6 -> {
                    questionAnswer.text = String.format("%s%s", userName, response6)
                }
                randomNumber == 7 -> {
                    questionAnswer.text = String.format("%s%s", userName, response7)
                }
                randomNumber == 0 -> {
                    questionAnswer.text = String.format("%s%s", userName, response0)
                }
                randomNumber == 8 -> {
                    questionAnswer.text = String.format("%s%s", userName, response8)
                }

            }
        }

    }
}
