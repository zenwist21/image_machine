package com.test.imagemachine.core.data.repository

import com.test.imagemachine.core.data.local.dao.ImageMachineDao
import com.test.imagemachine.core.data.local.entity.ImageMachineEntity
import com.test.imagemachine.core.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val dao: ImageMachineDao
) : Repository {
    override suspend fun getListMachine(): Flow<List<ImageMachineEntity>> =
        dao.getListMachine()

    override suspend fun getDetailMachine(id: Int): Flow<ImageMachineEntity> =
        dao.getDetailMachine(id)

    override suspend fun insertListMachine(list: List<ImageMachineEntity>) =
        dao.insertListMachine(list)
}