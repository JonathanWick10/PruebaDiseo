package com.jonathan.pruebadiseo.controlador;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jonathan.pruebadiseo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SegundoFragmento extends Fragment {


    public SegundoFragmento() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_segundo_fragmento, container, false);
    }

}
