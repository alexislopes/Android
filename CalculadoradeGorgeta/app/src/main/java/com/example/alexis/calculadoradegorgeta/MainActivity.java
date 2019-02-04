package com.example.alexis.calculadoradegorgeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editValor;
    private TextView txtPorcentagem, txtGorgeta, txtTotal;
    private SeekBar seekGorgeta;
    private int porcentagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         editValor = findViewById(R.id.edtValor);
         txtGorgeta = findViewById(R.id.txtGorgeta);
         txtPorcentagem = findViewById(R.id.txtPorcentagem);
         txtTotal = findViewById(R.id.txtTotal);
         seekGorgeta = findViewById(R.id.seekBarGorgeta);

         //COntrolar seekbar
        seekGorgeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                porcentagem = seekBar.getProgress();
                txtPorcentagem.setText(Math.round(porcentagem) + "%");
                calcular();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void calcular(){
        Double valorDigitado = Double.parseDouble(editValor.getText().toString());
        Double gorgeta = valorDigitado * (porcentagem/100);
        Double total = gorgeta + valorDigitado;

        txtGorgeta.setText("R$" + Math.round(gorgeta));
        txtTotal.setText("R$" + total);
    }
}
