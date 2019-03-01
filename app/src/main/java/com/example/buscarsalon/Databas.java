package com.example.buscarsalon;

import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.RoomDatabase;



@Database(entities = {Ubicacion.class}, version = 1)

public abstract class Databas extends RoomDatabase {

    public abstract buscaDao buscaDao();
}

