package com.suyf.mvpkotlin

import android.app.Application

class App : Application() {
    companion object {
        private lateinit var instance: App
        fun get(): App = instance
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}