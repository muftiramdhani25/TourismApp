package com.synrgy.tourismapp.di

import com.synrgy.tourismapp.core.di.CoreComponent
import com.synrgy.tourismapp.detail.DetailTourismActivity
import com.synrgy.tourismapp.favorite.FavoriteFragment
import com.synrgy.tourismapp.home.HomeFragment
import dagger.Component

@AppScope
@Component(
    dependencies = [CoreComponent::class],
    modules = [AppModule::class, ViewModelModule::class]
)

interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): AppComponent
    }

    fun inject(fragment: HomeFragment)
    fun inject(fragment: FavoriteFragment)
    fun inject(activity: DetailTourismActivity)
}