package com.suyf.base.mvp.interf

interface Presenter {
    fun attachView(view: MvpView)
    fun detachView()
}
