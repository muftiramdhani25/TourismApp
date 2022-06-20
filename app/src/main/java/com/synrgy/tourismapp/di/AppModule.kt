package com.synrgy.tourismapp.di

import com.synrgy.tourismapp.core.domain.usecase.TourismInteractor
import com.synrgy.tourismapp.core.domain.usecase.TourismUseCase
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {

    @Binds
    abstract fun provideTourismUseCase(tourismInteractor: TourismInteractor): TourismUseCase

}