package com.jonathan.pruebadiseo.controlador;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jonathan.pruebadiseo.R;

public class PrimerFragmento extends Fragment {

    //Variables
    View view;

    public PrimerFragmento() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view = inflater.inflate(R.layout.fragment_primer_fragmento, container, false);
        return view;
    }

}
