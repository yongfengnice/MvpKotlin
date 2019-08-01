package com.suyf.base.mvp

import com.suyf.base.mvp.interf.MvpView
import com.suyf.base.mvp.interf.Presenter
import com.suyf.mvpkotlin.mvp.interf.MvpModel

abstract class BasePresenter<V : MvpView, M : MvpModel> : Presenter {

    private var mMvpView: V? = null
    protected val mMvpModel: M by lazy { createModel() }

    fun getView(): V = mMvpView as V

    abstract fun createModel(): M

    override fun attachView(view: MvpView) {
        mMvpView = view as V
    }

    override fun detachView() {
        mMvpView = null
    }

}