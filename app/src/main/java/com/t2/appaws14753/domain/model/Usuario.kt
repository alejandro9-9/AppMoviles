package com.t2.appaws14753.domain.model 

data class Usuario (
    val usuarioId: Int =0,
    val rol: String,
    val correo: String,
    val contraseña: String,
    val nombres: String,
    val apellidoPaterno: String,
    val apellidoMaterno: String,
    val especialidad: String


)