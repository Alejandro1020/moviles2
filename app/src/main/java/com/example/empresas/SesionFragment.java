package com.example.empresas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonRequest;

import org.json.JSONObject;


public class SesionFragment extends Fragment implements Response.Listener<JSONObject>,Response.ErrorListener {

    EditText jetcorreo,jetclave;
    Button jbtingresar;
    TextView jtvrgistrar;
    RequestQueue rq;
    JsonRequest jrq;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //Asociar objetos
        View vista = inflater.inflate(R.layout.fragment_sesion,container,false);
        jetcorreo=vista.findViewById(R.id.etcorreo);
        jetclave=vista.findViewById(R.id.etclave);
        jtvrgistrar=vista.findViewById(R.id.tvregistrar);
        jbtingresar=vista.findViewById(R.id.tvregistrar);

        //lanzar  metodo unido al evento clic del objeto jbtingresar

        jbtingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        return (vista);
    }

    @Override
    public void onErrorResponse(VolleyError error) {

    }

    @Override
    public void onResponse(JSONObject response) {

    }
}