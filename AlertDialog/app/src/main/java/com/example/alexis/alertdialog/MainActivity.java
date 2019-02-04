package com.example.alexis.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirAlerta(View view){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //configura titulo e mensagem
        dialog.setTitle("Titulo");
        dialog.setMessage("Mensagem");

        //configura cancelamento
        dialog.setCancelable(false);

        //configura ícone
        dialog.setIcon(android.R.drawable.ic_btn_speak_now);

        //configura ações para botão sim ounão
        dialog.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "'SIM' foi pressionado", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.setNegativeButton("NÃO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "'NÃO' foi pressionado", Toast.LENGTH_SHORT).show();

            }
        });

        dialog.create();
        dialog.show();
    }
}
