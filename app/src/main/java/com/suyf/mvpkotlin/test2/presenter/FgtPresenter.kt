package com.suyf.mvpkotlin.test2.presenter

import com.suyf.base.mvp.BasePresenter
import com.suyf.mvpkotlin.mvp.BaseModel
import com.suyf.mvpkotlin.test2.view.FgtView

class FgtPresenter :BasePresenter<FgtView,BaseModel>(){
    override fun createModel(): BaseModel {
        return BaseModel()
    }

    fun doLogic() {
        val string = "do Logic in FgtPresenter"
        getView().showLogicResult(string)
    }

}