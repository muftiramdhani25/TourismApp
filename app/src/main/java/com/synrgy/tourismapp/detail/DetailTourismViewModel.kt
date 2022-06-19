package com.synrgy.tourismapp.detail

import androidx.lifecycle.ViewModel
import com.synrgy.tourismapp.core.data.TourismRepository
import com.synrgy.tourismapp.core.data.source.local.entity.TourismEntity

class DetailTourismViewModel(private val tourismRepository: TourismRepository) : ViewModel() {
    fun setFavoriteTourism(tourism: TourismEntity, newStatus:Boolean) = tourismRepository.setFavoriteTourism(tourism, newStatus)
}