package com.suyf.mvpkotlin.test2

import android.os.Bundle
import com.suyf.base.mvp.PresenterActivity
import com.suyf.mvpkotlin.R
import com.suyf.mvpkotlin.test2.presenter.TestPresenter

class TestActivity : PresenterActivity<TestPresenter>() {
    override fun createPresenter(): TestPresenter {
        return TestPresenter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fl_content, FgtFragment.newInstance())
            .commit()
    }
}