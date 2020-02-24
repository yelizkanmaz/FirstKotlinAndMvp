package com.example.firstkotlinandmvp

import java.text.DateFormat
import java.util.*

class DateCalculationManager {
    fun calculateDate(): String {
        return DateFormat.getDateTimeInstance().format(Date(Calendar.getInstance().timeInMillis))
    }
}
