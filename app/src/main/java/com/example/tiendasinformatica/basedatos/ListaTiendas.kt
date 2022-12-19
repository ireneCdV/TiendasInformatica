package com.example.tiendasinformatica

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity (tableName = "ListaTiendas")
class ListaTiendas (

    @PrimaryKey(autoGenerate = true)
    var id: Int =0,
    var nombre: String = "",
    var direccion:String = "",
    var tlf: String=""

)