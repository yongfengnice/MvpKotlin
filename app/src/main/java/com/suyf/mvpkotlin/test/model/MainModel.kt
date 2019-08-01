package com.suyf.mvpkotlin.test.model

import com.suyf.mvpkotlin.mvp.BaseModel

class MainModel :BaseModel() {
    fun getSomething(): String {
        return "return str from MainModel"
    }
}