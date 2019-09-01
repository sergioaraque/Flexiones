package com.sergioaraque.flexiones;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Test extends AppCompatActivity {

    LinearLayout linearButton;
    TextView tvContador;

    int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);


        linearButton = (LinearLayout) findViewById (R.id.linearButton);
        tvContador = (TextView) findViewById(R.id.tvContador);

        tvContador.setText(contador + " flexiones");
    }

    public void linearButtonAction (View v) {
        /*new AlertDialog.Builder(Test.this)
                .setTitle("Your Alert")
                .setMessage("Your Message")
                .setCancelable(false)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Whatever...
                    }
                }).show();*/

        contador += 1;
        tvContador.setText(contador + " flexiones");
    };
}
