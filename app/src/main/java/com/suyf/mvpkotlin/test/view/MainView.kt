package com.suyf.mvpkotlin.test.view

import com.suyf.base.mvp.interf.MvpView

interface MainView : MvpView {
    fun showSomething(str: String)
}