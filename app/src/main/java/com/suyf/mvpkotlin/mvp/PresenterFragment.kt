package com.suyf.base.mvp

import android.content.Context
import android.support.v4.app.Fragment
import android.widget.Toast
import com.suyf.base.mvp.interf.MvpView

abstract class PresenterFragment<P : BasePresenter<*,*>> : Fragment(), MvpView {

    private lateinit var mPresenter: P

    fun getPresenter(): P = mPresenter

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        mPresenter = createPresenter()
        mPresenter.attachView(this)
    }

    abstract fun createPresenter(): P

    override fun onDetach() {
        super.onDetach()
        mPresenter.detachView()
    }

    override fun toastMsg(message: String) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
    }

}