package com.test.imagemachine.core.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "imageMachineData")
data class ImageMachineEntity(
    @PrimaryKey(autoGenerate = true)
    val machineID: UUID = UUID.fromString(DEFAULT_ID),
    val machineName :String? = null,
    val machineType :String? = null,
    val machineQR :Int? = null,
    val lastMaintenance :String? = null,
) {
    companion object {
        const val DEFAULT_ID = "0000-0000-0000-00"
    }
}