package com.t2.appaws14753.domain.model

data class Usuario(
    val usuarioId: String = "",
    val rol: String,
    val correo: String,
    val contrasena: String,
    val nombres: String,
    val apellidoPaterno: String,
    val apellidoMaterno: String? = null,
    val especialidad: String? = null
)