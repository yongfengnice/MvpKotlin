package com.suyf.mvpkotlin.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.suyf.base.mvp.PresenterActivity
import com.suyf.mvpkotlin.App
import com.suyf.mvpkotlin.R
import com.suyf.mvpkotlin.test.presenter.MainPresenter
import com.suyf.mvpkotlin.test.view.MainView
import com.suyf.mvpkotlin.test2.TestActivity

class MainActivity : PresenterActivity<MainPresenter>(), MainView {

    override fun createPresenter(): MainPresenter {
        return MainPresenter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.test_main).setOnClickListener {
            getPresenter().doSomething()
            startActivity(Intent(App.get(), TestActivity::class.java))
        }
    }

    override fun showSomething(str: String) {
        toastMsg(str)
    }

}
