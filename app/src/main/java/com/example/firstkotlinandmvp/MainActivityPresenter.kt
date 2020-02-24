package com.example.firstkotlinandmvp



class MainActivityPresenter(dateCalculationManager: DateCalculationManager) : Contract.Presenter {

    private lateinit var mView: Contract.View
    private var mDateCalculationManager = dateCalculationManager


    override fun setView(view: Contract.View) {
        this.mView = view
    }

    override fun created() {
        this.mView.bindViews()
        this.mView.initClickListeners()
    }

    override fun onShowDateButtonClick() {
        val currentDate = this.mDateCalculationManager.calculateDate()
        this.mView.showDate(currentDate)
    }
}
