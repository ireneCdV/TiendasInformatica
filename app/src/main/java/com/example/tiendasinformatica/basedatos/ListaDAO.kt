package com.example.tiendasinformatica

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update


@Dao
interface ListaDAO {

    @Insert
    suspend fun addAlumno(taskEntity: Alumnos):Long

    @Update
    suspend fun updateAlumno(taskEntity: Alumnos):Int

    @Delete
    suspend fun deleteAlumno(taskEntity: Alumnos):Int






}