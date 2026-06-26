package com.t2.appaws14753.domain.model

data class Cliente(
    val id: Int,
    val nombre: String,
    val email: String,
    val telefono: String
)

data class ReparacionHistorica(
    val fecha: String,
    val tecnico: String,
    val monto: Double,
    val motivo: String
)

data class OrdenServicio(
    val numero: Int,
    val tipo: String,
    val equipo: String,
    val nroSerie: String = "",
    val estado: String,
    val prioridad: String,
    val actualizado: String,
    val tecnico: String = "Por asignar",
    val fechaCreacion: String = "",
    val fechaGarantia: String = "-",
    val fechaCompletado: String = "-",
    val costo: Double = 0.0
)

data class Equipo(
    val id: Int,
    val nombre: String,
    val marca: String,
    val nroSerie: String,
    val garantiaHasta: String,
    val ultimoManto: String,
    val estado: String,
    val historial: List<ReparacionHistorica> = emptyList()
)
