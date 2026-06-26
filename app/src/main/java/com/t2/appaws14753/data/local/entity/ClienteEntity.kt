package com.t2.appaws14753.data.local.entity
import androidx.room3.Entity
import androidx.room3.PrimaryKey

@Entity(tableName = "clientes")
data class ClienteEntity(
    @PrimaryKey(true) val id: Int = 0,
    val nombre: String,
    val email: String,
    val telefono: String
) {
}