package com.t2.appaws14753.domain.model

data class Orden(
    val ordenId: String = "",
    val dispositivoId: String,
    val dispositivoInfo: DispositivoInfo,
    val clienteId: String,
    val tecnicoId: String,
    val tecnicoNombre: String,
    val estado: String,
    val prioridad: String,
    val fechaIngreso: String,
    val fechaEntrega: String? = null,
    val detalleDiagnostico: String,
    val servicios: List<DetalleServicio>,
    val totalCobrado: Double
)