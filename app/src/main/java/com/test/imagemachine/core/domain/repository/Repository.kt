package com.test.imagemachine.core.domain.repository

import com.test.imagemachine.core.data.local.entity.ImageMachineEntity
import kotlinx.coroutines.flow.Flow

interface Repository {
    suspend fun getListMachine(): Flow<List<ImageMachineEntity>>
    suspend fun getDetailMachine(id:Int):Flow<ImageMachineEntity>
    suspend fun insertListMachine(list: List<ImageMachineEntity>)
}