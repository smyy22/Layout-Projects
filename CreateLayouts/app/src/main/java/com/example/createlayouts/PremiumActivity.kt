package com.example.createlayouts

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.widget.TextView
import androidx.core.text.bold
import androidx.core.text.color
import androidx.core.text.scale

class PremiumActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_premium)

        val tvMonthSpannableString: TextView = findViewById(R.id.monthly_price)

        val monthSpannableString = SpannableStringBuilder()
            .bold {scale(1.5f) {append("$11.99\n")} }
            .bold {color(Color.parseColor("#87869E")) {append("$11.99")} }
            .bold {color(Color.parseColor("#B9B8C6")) {append(" per month\n")} }
            .bold {color(Color.parseColor("#87869E")) {append("$143.99")} }
            .bold {color(Color.parseColor("#B9B8C6")) {append(" per year")} }

        tvMonthSpannableString.text = monthSpannableString

        val tvYearSpannableString: TextView = findViewById(R.id.yearly_price)

        val yearSpannableString = SpannableStringBuilder()
            .bold {scale(1.5f) {append("$4.99\n")} }
            .bold {color(Color.parseColor("#87869E")) {append("$4.99")} }
            .bold {color(Color.parseColor("#B9B8C6")) {append(" per month\n")} }
            .bold {color(Color.parseColor("#87869E")) {append("$59.99")} }
            .bold {color(Color.parseColor("#B9B8C6")) {append(" per year")} }

        tvYearSpannableString.text = yearSpannableString



    }
}
