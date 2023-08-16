package com.test.imagemachine.core.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.test.imagemachine.core.data.local.entity.ImageMachineEntity
import kotlinx.coroutines.flow.Flow


@Dao
interface ImageMachineDao {
    @Query("SELECT * FROM imageMachineData")
    fun getListMachine(): Flow<List<ImageMachineEntity>>

    @Query("SELECT * FROM imageMachineData WHERE machineID = :id")
    fun getDetailMachine(id: Int): Flow<ImageMachineEntity>

    @Insert
    fun insertListMachine(list: List<ImageMachineEntity>)
}