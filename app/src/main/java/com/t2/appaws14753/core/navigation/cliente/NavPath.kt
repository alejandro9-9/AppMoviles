package com.t2.appaws14753.core.navigation.cliente

object NavPath {
    const val HOME = "Inicio"
    const val ORDER = "Ordenes"
    const val DEVICES = "Equipos"


    fun getTittle(path: String?): String{
        return when{
            path == HOME -> "Bienvenido"
            path == ORDER -> "Ordenes de Servicio"
            path == DEVICES -> "Inventario de Equipos"
            else -> "Bievenido"
        }
    }
}