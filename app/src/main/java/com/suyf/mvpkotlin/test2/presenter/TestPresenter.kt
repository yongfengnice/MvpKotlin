package com.suyf.mvpkotlin.test2.presenter

import com.suyf.base.mvp.BasePresenter
import com.suyf.mvpkotlin.mvp.BaseModel
import com.suyf.mvpkotlin.test2.view.TestView

class TestPresenter :BasePresenter<TestView,BaseModel>(){
    override fun createModel(): BaseModel {
        return BaseModel()
    }

}