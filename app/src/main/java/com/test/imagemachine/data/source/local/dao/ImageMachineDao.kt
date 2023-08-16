package com.test.imagemachine.data.source.local.dao

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface ImageMachineDao {
    @Query("SELECT * FROM weatherData")
    fun getWeatherList(): Flow<List<WeatherBaseData>>


}