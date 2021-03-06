package com.example.buscarsalon;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import androidx.room.Database;
import androidx.room.Room;

public class MainActivity extends AppCompatActivity {


    FragmentManager miFragmento = getSupportFragmentManager();
    FragmentManager agremod = getSupportFragmentManager();
    FragmentManager buscarBorrar = getSupportFragmentManager();

    FragmentoPrincipal fragmentoPrincipal = new FragmentoPrincipal();
    Agremod agregar = new Agremod();
    BuscarBorrar buscar = new BuscarBorrar();

    public static Databas miBasedatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miBasedatos= Room.databaseBuilder(getApplicationContext(),Databas.class,"mibasededatos").allowMainThreadQueries().build();


        FragmentTransaction miTransaccion = miFragmento.beginTransaction();

        miTransaccion.add(R.id.contenedorFragmentos,fragmentoPrincipal);
        miTransaccion.commit();
    }

    public void agremod (View v){

        FragmentTransaction transaction=miFragmento.beginTransaction();
        transaction.remove(fragmentoPrincipal);
        transaction.commit();

        FragmentTransaction miTransaccion = agremod.beginTransaction();

        miTransaccion.add(R.id.contenedorFragmentos,agregar);
        miTransaccion.commit();
    }

    public void buscarBorrar (View v){
        FragmentTransaction transaction = miFragmento.beginTransaction();
        transaction.remove(fragmentoPrincipal);
        transaction.commit();

        FragmentTransaction miManejador = buscarBorrar.beginTransaction();
        miManejador.add(R.id.contenedorFragmentos,buscar);
        miManejador.commit();
    }

    public void continuar (View v){
        FragmentTransaction transaction = miFragmento.beginTransaction();
        transaction.replace(R.id.contenedorFragmentos,fragmentoPrincipal);
        transaction.commit();
    }

}
