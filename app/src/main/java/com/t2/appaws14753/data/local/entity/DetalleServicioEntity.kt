package com.t2.appaws14753.data.local.entity


import androidx.room3.ForeignKey
import androidx.room3.PrimaryKey
import androidx.room3.Entity
import java.util.UUID

@Entity(
    tableName = "detalle_servicio",
    foreignKeys = [
        ForeignKey(
            entity = OrdenEntity::class,
            parentColumns = ["ordenId"],
            childColumns = ["ordenId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class DetalleServicioEntity(
    @PrimaryKey val detalleServicioId: String = UUID.randomUUID().toString(),
    val ordenId: String,
    val servicioId: String,
    val nombreServicio: String,
    val precioCobrado: Double
)