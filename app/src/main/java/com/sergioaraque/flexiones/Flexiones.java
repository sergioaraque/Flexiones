package com.sergioaraque.flexiones;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Flexiones extends AppCompatActivity {

    LinearLayout linearLayoutContador;
    TextView tvContador;

    int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flexiones);


        linearLayoutContador = (LinearLayout) findViewById (R.id.linearLayoutContador);
        tvContador = (TextView) findViewById(R.id.tvContador);

        tvContador.setText(contador + " flexiones");
    }

    public void linearButtonAction (View v) {

        contador += 1;
        tvContador.setText(contador + " flexiones");
    }

    public void volverInicio(View v) {
        finish();
    }
}
