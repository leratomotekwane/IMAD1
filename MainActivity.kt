package com.example.mealsuggestionapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.assignment11.R

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI components
        val timeInput: EditText = findViewById(R.id.timeInput)
        val suggestButton: Button = findViewById(R.id.suggestButton)
        val resetButton: Button = findViewById(R.id.resetButton)

        // Set click listener for the Suggest button
        suggestButton.setOnClickListener {
            // Get the time input from the EditText and convert to lowercase
            val time = timeInput.text.toString().trim().lowercase()

            // Determine the meal suggestion using if statements
            val suggestion = when (time) {
                "morning" -> {
                    "Eggs"
                }
                "mid-morning" -> {
                    "Fruit"
                }
                "afternoon" -> {
                    "Sandwich"
                }
                "mid-afternoon" -> {
                    "Cake"
                }
                "dinner" -> {
                    "Pasta"
                }
                "after dinner" -> {
                    "Ice cream"
                }
                else -> {
                    "Invalid time. Please enter Morning, Mid-morning, Afternoon, Mid-afternoon, Dinner, or After Dinner."
                }
            }

            // You can use a log statement, Toast, or other method to show the suggestion.
            // Example using log:
            android.util.Log.d("MealSuggestion", "Suggestion: $suggestion")

            // Example using Toast:
            android.widget.Toast.makeText(this, suggestion, android.widget.Toast.LENGTH_SHORT).show()
        }

        // Set click listener for the Reset button
        resetButton.setOnClickListener {
            // Clear the time input
            timeInput.text.clear()
        }
    }
}