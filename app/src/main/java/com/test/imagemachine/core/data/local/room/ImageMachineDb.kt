package com.test.imagemachine.core.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.test.imagemachine.core.data.local.dao.ImageMachineDao
import com.test.imagemachine.core.data.local.entity.ImageMachineEntity

@Database(
    entities = [ImageMachineEntity::class], version = 1, exportSchema = true
)

abstract class ImageMachineDb : RoomDatabase() {
    abstract fun imageMachineDao(): ImageMachineDao
}