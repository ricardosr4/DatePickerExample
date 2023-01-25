package com.example.datepickerexample

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import java.time.Month
import java.time.Year

class MainActivity : AppCompatActivity() {
    var etDate: EditText? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         etDate = findViewById<EditText>(R.id.etDate)
        etDate!!.setOnClickListener { showDataPickerDialog() }


    }

    private fun showDataPickerDialog() {
        val datePicker = DatePickerFragment {day, month, year -> onDateSelected(day, month, year)}
        datePicker.show(supportFragmentManager,  "datePicker")
    }

    fun onDateSelected(day: Int, month: Int, year: Int){
        etDate!!.setText("has seleccionado el dia $day del mes $month de $year ")

    }

}