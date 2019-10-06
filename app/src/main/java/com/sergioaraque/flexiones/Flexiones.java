package com.sergioaraque.flexiones;

import android.app.AlertDialog;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Flexiones extends AppCompatActivity {

    LinearLayout linearLayoutContador;
    TextView tvContador, tvResultado;
    Chronometer simpleChronometer;
    Button btnParar;

    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flexiones);


        btnParar = (Button) findViewById(R.id.btnParar);
        linearLayoutContador = (LinearLayout) findViewById (R.id.linearLayoutContador);
        tvContador = (TextView) findViewById(R.id.tvContador);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

        tvContador.setText(contador + " flexiones");

        simpleChronometer = (Chronometer) findViewById(R.id.simpleChronometer); // initiate a chronometer
        simpleChronometer.setBase(SystemClock.elapsedRealtime());
        simpleChronometer.start(); // start a chronometer
        simpleChronometer.setFormat("Tiempo activo - %s"); // set the format for a chronometer
    }

    public void linearButtonAction (View v) {
        contador += 1;
        tvContador.setText(contador + " flexiones");
    }

    public void volverInicio(View v) {
        finish();
    }

    public void pararCronometro(View v) {
        simpleChronometer.stop();
        btnParar.setVisibility(View.INVISIBLE);
        calcularMedia();

    }

    public void calcularMedia() {
        long segundos =  (SystemClock.elapsedRealtime() - simpleChronometer.getBase()) / 1000;
        float resultado = (float) segundos / contador;
        tvResultado.setText("Has hecho " + contador + " flexiones en " + segundos + " segundos. Esto da una media de " + resultado + " segundos por flexión");
    }
}
