package com.synrgy.tourismapp.core.domain.usecase

import androidx.lifecycle.LiveData
import com.synrgy.tourismapp.core.data.Resource
import com.synrgy.tourismapp.core.domain.model.Tourism
import kotlinx.coroutines.flow.Flow

interface TourismUseCase {
    fun getAllTourism(): Flow<Resource<List<Tourism>>>
    fun getFavoriteTourism(): Flow<List<Tourism>>
    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}