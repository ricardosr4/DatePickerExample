package com.example.datepickerexample

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etDate = findViewById<EditText>(R.id.etDate)
        etDate.setOnClickListener { showDataPickerDialog() }


    }

    private fun showDataPickerDialog() {

    }
}