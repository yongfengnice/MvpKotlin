package com.suyf.mvpkotlin.test2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.suyf.base.mvp.PresenterFragment
import com.suyf.mvpkotlin.R
import com.suyf.mvpkotlin.test2.presenter.FgtPresenter
import com.suyf.mvpkotlin.test2.view.FgtView

class FgtFragment : PresenterFragment<FgtPresenter>(), FgtView {

    companion object {
        fun newInstance(): FgtFragment = FgtFragment()
    }

    override fun createPresenter(): FgtPresenter {
        return FgtPresenter()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_fgt, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btn_fgt).setOnClickListener {
            getPresenter().doLogic()
        }
    }

    override fun showLogicResult(string: String) {
        toastMsg(string)
    }

}
