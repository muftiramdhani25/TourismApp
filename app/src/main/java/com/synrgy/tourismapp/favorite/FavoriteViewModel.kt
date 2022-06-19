package com.synrgy.tourismapp.favorite

import androidx.lifecycle.ViewModel
import com.synrgy.tourismapp.core.domain.usecase.TourismUseCase

class FavoriteViewModel(tourismUseCase: TourismUseCase) : ViewModel() {
    val favoriteTourism = tourismUseCase.getFavoriteTourism()

}