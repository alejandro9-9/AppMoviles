package com.t2.appaws14753.domain.model 

data class Dispositivo(
    val dispositivoId: Int =0,
    val clienteId: String,
    val marca: String,
    val modelo: String,
    val numeroSerie: String,
)