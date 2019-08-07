package com.jonathan.pruebadiseo.controlador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.jonathan.pruebadiseo.R;

public class ContenedorInterfaces extends AppCompatActivity {

    //variables
    PrimerFragmento primerFragmento;

    FragmentManager manager;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarFragmentos();

    }

    private void inicializarFragmentos() {
        primerFragmento = new PrimerFragmento();

        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        transaction.replace(R.id.contenedor, primerFragmento);
        transaction.commit();
    }
}
