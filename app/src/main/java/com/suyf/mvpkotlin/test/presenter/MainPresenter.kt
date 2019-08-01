package com.suyf.mvpkotlin.test.presenter

import com.suyf.base.mvp.BasePresenter
import com.suyf.mvpkotlin.test.model.MainModel
import com.suyf.mvpkotlin.test.view.MainView

class MainPresenter : BasePresenter<MainView, MainModel>() {
    override fun createModel(): MainModel {
        return MainModel()
    }

    fun doSomething() {
        //check some logic
        val str: String = mMvpModel.getSomething()
        getView().showSomething(str)
    }

}