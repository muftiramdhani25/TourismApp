package com.synrgy.tourismapp.core.domain.repository

import androidx.lifecycle.LiveData
import com.synrgy.tourismapp.core.data.Resource
import com.synrgy.tourismapp.core.domain.model.Tourism
import kotlinx.coroutines.flow.Flow

interface ITourismRepository {

    fun getAllTourism(): Flow<Resource<List<Tourism>>>

    fun getFavoriteTourism(): Flow<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)

}