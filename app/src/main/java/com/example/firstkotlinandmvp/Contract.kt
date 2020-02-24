package com.example.firstkotlinandmvp

interface Contract {

        interface View {

            fun showDate(date: String)

            fun bindViews()

            fun initClickListeners()

        }

        interface Presenter {

            fun setView(view: View)

            fun created()

            fun onShowDateButtonClick()

        }
}