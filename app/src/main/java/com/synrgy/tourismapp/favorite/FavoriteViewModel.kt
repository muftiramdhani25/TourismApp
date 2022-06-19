package com.synrgy.tourismapp.favorite

import androidx.lifecycle.ViewModel
import com.synrgy.tourismapp.core.data.TourismRepository

class FavoriteViewModel(tourismRepository: TourismRepository) : ViewModel() {
    val favoriteTourism = tourismRepository.getFavoriteTourism()
}