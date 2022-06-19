package com.synrgy.tourismapp.home

import androidx.lifecycle.ViewModel
import com.synrgy.tourismapp.core.data.TourismRepository

class HomeViewModel(tourismRepository: TourismRepository) : ViewModel() {
    val tourism = tourismRepository.getAllTourism()
}