package com.suyf.base.mvp

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.widget.Toast
import com.suyf.base.mvp.interf.MvpView

//Base View
abstract class PresenterActivity<P : BasePresenter<*, *>> : FragmentActivity(), MvpView {

    private val mPresenter: P by lazy { createPresenter() }

    fun getPresenter(): P = mPresenter

    abstract fun createPresenter(): P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter.attachView(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }

    override fun toastMsg(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}