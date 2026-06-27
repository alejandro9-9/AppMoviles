package com.t2.appaws14753.data.local.entity


import androidx.room3.Embedded
import androidx.room3.Entity
import androidx.room3.PrimaryKey

import java.util.UUID

@Entity(tableName = "orden")
data class OrdenEntity(
    @PrimaryKey val ordenId: String = UUID.randomUUID().toString(),
    val dispositivoId: String,
    @Embedded val dispositivoInfo: DispositivoInfoEntity,
    val clienteId: String,
    val tecnicoId: String,
    val tecnicoNombre: String,
    val estado: String,
    val prioridad: String,
    val fechaIngreso: String,
    val fechaEntrega: String? = null,
    val detalleDiagnostico: String,
    val totalCobrado: Double
)