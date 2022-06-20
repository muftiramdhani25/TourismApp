package com.synrgy.tourismapp

import android.app.Application
import com.synrgy.tourismapp.core.di.CoreComponent
import com.synrgy.tourismapp.core.di.DaggerCoreComponent
import com.synrgy.tourismapp.di.AppComponent
import com.synrgy.tourismapp.di.DaggerAppComponent

open class MyApplication : Application() {

    private val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.factory().create(applicationContext)
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(coreComponent)
    }
}