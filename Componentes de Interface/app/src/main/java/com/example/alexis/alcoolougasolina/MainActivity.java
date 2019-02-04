package com.example.alexis.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private TextView textResulatado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = findViewById(R.id.etPrecoAlcool);
        precoGasolina = findViewById(R.id.etPrecoGasolina);
        textResulatado = findViewById(R.id.tvResultado);
    }

    public void calcularPreco(View view){
        Double precoalcool = Double.parseDouble(precoAlcool.getText().toString());
        Double precogasolina = Double.parseDouble(precoGasolina.getText().toString());

        Boolean camposValidados = validarCampos(precoalcool, precogasolina);

        if(camposValidados){
            this.calcularMelhorPreco(precoalcool, precogasolina);
        } else {
            textResulatado.setText("Preencha os campos!");
        }
    }

    public void calcularMelhorPreco(Double pAlcool, Double pGasolina){
        Double resultado = pAlcool / pGasolina;

        if(resultado >= 0.7){
            textResulatado.setText("Melhor utilizar Gasolina!");
        } else {
            textResulatado.setText("Melhor utilizar Álcool!");
        }
    }

    public Boolean validarCampos(Double pAlcool, Double pGasolina){
        Boolean camposValidados = true;

        if (pAlcool==null || pAlcool.equals("")){
            camposValidados = false;
        } else if(pGasolina==null || pGasolina.equals("")){
            camposValidados = false;
        }

        return camposValidados;
    }
}
