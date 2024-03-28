package com.example.prelim

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.prelim.R

class MainActivity : AppCompatActivity() {

    var questionNo = 0
    var questions = listOf("Sino ang laging late? \n\n A) Claire and Paul \n\n B) MJ \n\n C) Jake", "Sino pinakamatangkad sa kanila? \n\n A) MJ \n\n B) Claire \n\n C) Jake", "Sino ang pinakamasipag? \n\n A) Paul and Jake \n\n B) Claire \n\n C) Mj")
    var rightAnswers = listOf(1, 2, 1, 1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val textView_a = findViewById<TextView>(R.id.textView)

        button1.setOnClickListener {
            showToast(1)
        }

        button2.setOnClickListener {
            showToast(2)
        }

        button3.setOnClickListener {
            showToast(3)
        }
    }

    fun showToast(answer: Int) {
        if (answer == rightAnswers[questionNo]) {
            Toast.makeText(applicationContext, "CORRECT!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(applicationContext, "WRONG!", Toast.LENGTH_SHORT).show()
        }
        updateQuestion()
    }

    fun updateQuestion() {
        if (questionNo < questions.size - 1) {
            questionNo++
            findViewById<TextView>(R.id.textView).setText(questions[questionNo])
        } else {
            Toast.makeText(applicationContext, "End of questions", Toast.LENGTH_SHORT).show()
        }
    }

}