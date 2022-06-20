package com.synrgy.tourismapp.detail

import androidx.lifecycle.ViewModel
import com.synrgy.tourismapp.core.data.TourismRepository
import com.synrgy.tourismapp.core.domain.model.Tourism
import com.synrgy.tourismapp.core.domain.usecase.TourismUseCase
import javax.inject.Inject

class DetailTourismViewModel @Inject constructor(private val tourismUseCase: TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus:Boolean) = tourismUseCase.setFavoriteTourism(tourism, newStatus)
}