package com.example.buscarsalon;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface buscaDao {

    @Insert

    void addUbicacion(Ubicacion miUbicacion);

}
