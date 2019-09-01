package com.sergioaraque.flexiones;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class Test extends AppCompatActivity {

    LinearLayout linearButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);


        linearButton = (LinearLayout) findViewById (R.id.linearButton);

    }

    public void linearButtonAction (View v) {
        new AlertDialog.Builder(Test.this)
                .setTitle("Your Alert")
                .setMessage("Your Message")
                .setCancelable(false)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Whatever...
                    }
                }).show();
    };
}
