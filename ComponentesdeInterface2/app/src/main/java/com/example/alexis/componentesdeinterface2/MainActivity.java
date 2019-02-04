package com.example.alexis.componentesdeinterface2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleEStado;
    private Switch switchEstado;
    private CheckBox checkBoxEstado;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleEStado = findViewById(R.id.toggleEstado);
        switchEstado = findViewById(R.id.switchEstado);
        checkBoxEstado = findViewById(R.id.checkBoxEstado);
        resultado = findViewById(R.id.tvResultado);
    }

    public void enviar(View view) {

        //O MESMO PODE SER FEITO PARA SWITCH E CHECKBOX.
        if (toggleEStado.isChecked()) {
            resultado.setText("Toggle ligado!");
        } else {
            resultado.setText("Toggle desligado!");
        }
    }
}
