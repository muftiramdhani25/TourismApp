package com.synrgy.tourismapp.home

import androidx.lifecycle.ViewModel
import com.synrgy.tourismapp.core.domain.usecase.TourismUseCase

class HomeViewModel(tourismUseCase: TourismUseCase) : ViewModel() {
    val tourism = tourismUseCase.getAllTourism()
}