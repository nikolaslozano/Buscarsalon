package com.example.buscarsalon;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Ubicacion {
    @PrimaryKey (autoGenerate = true)
    int id;

    String stopID,nombre,direccion,barrio,localidad;
    double latitud, longitud;

    public int getId (){
        return id;
    }

    public String getStopID(){
        return stopID;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getBarrio(){
        return barrio;
    }

    public String getLocalidad(){
        return localidad;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStopID(String stopID) {
        this.stopID = stopID;
    }
}
