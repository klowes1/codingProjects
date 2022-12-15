package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class RockPaperScissors : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rock_paper_scissors)

        val rockBtn = findViewById<Button>(R.id.rock_input_button)
        val paperBtn = findViewById<Button>(R.id.paper_input_button)
        val scissorsBtn = findViewById<Button>(R.id.scissors_input_button)

        rockBtn.setOnClickListener {
            val randomNumber = Random.nextInt(0, 3)
            val userChoice = "Rock"
            var cpuChoice = "Undetermined"
            val winnerAnnoucement = findViewById<TextView>(R.id.training_days_calculation)
            val userName = findViewById<EditText>(R.id.user_name_input).text

            if (randomNumber == 1) {
                cpuChoice = "Rock"
            } else if (randomNumber == 2) {
                cpuChoice = "Paper"
            } else {
                cpuChoice = "Scissors"
            }

            if(userChoice == cpuChoice) {
                winnerAnnoucement.text = String.format("The game is a tie!")
            } else if (cpuChoice == "Paper") {
                winnerAnnoucement.text = String.format("The computer has won the game!")
            } else if (cpuChoice == "Scissors") {
                winnerAnnoucement.text = String.format("%s%s", userName.toString(), " has won the game!")
            }

        }

        paperBtn.setOnClickListener {
            val randomNumber = Random.nextInt(0, 3)
            val userChoice = "Paper"
            var cpuChoice = "Undetermined"
            val winnerAnnoucement = findViewById<TextView>(R.id.training_days_calculation)
            val userName = findViewById<EditText>(R.id.user_name_input).text

            if (randomNumber == 1) {
                cpuChoice = "Rock"
            } else if (randomNumber == 2) {
                cpuChoice = "Paper"
            } else {
                cpuChoice = "Scissors"
            }

            if(userChoice == cpuChoice) {
                winnerAnnoucement.text = String.format("The game is a tie!")
            } else if (cpuChoice == "Scissors") {
                winnerAnnoucement.text = String.format("The computer has won the game!")
            } else if (cpuChoice == "Rock") {
                winnerAnnoucement.text = String.format("%s%s", userName.toString(), " has won the game!")
            }
        }

        scissorsBtn.setOnClickListener {
            val randomNumber = Random.nextInt(0, 3)
            val userChoice = "Scissors"
            var cpuChoice = "Undetermined"
            val winnerAnnoucement = findViewById<TextView>(R.id.training_days_calculation)
            val userName = findViewById<EditText>(R.id.user_name_input).text

            if (randomNumber == 1) {
                cpuChoice = "Rock"
            } else if (randomNumber == 2) {
                cpuChoice = "Paper"
            } else {
                cpuChoice = "Scissors"
            }

            if(userChoice == cpuChoice) {
                winnerAnnoucement.text = String.format("The game is a tie!")
            } else if (cpuChoice == "Rock") {
                winnerAnnoucement.text = String.format("The computer has won the game!")
            } else if (cpuChoice == "Paper") {
                winnerAnnoucement.text = String.format("%s%s", userName.toString(), " has won the game!")
            }
        }
    }
}