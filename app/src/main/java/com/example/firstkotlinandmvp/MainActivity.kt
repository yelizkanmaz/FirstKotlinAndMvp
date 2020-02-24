package com.example.firstkotlinandmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(),Contract.View {
    private lateinit var tvDate: TextView
    private lateinit var btnShow:Button
    private lateinit var presenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dateCalculationManager=DateCalculationManager()
        this.presenter= MainActivityPresenter(dateCalculationManager)
        this.presenter.setView(this)
        this.presenter.created()

    }


    override fun bindViews() {
        this.tvDate = findViewById(R.id.textView)
        this.btnShow = findViewById(R.id.button)
    }

    override fun initClickListeners() {
        this.btnShow.setOnClickListener {
            this.presenter.onShowDateButtonClick()
        }
    }

    override fun showDate(date: String) {
        this.tvDate.text = date
    }
}
