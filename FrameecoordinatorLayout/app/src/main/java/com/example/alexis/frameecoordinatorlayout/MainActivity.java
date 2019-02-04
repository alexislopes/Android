package com.example.alexis.frameecoordinatorlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = findViewById(R.id.frameCarregando);

        // View.GONE: faz com que o componente não fique disponível para o usuário;
        // View.INVISIBLE: torna o componente invisível porém é possível de interação.
        //frameLayout.setVisibility(View.GONE);
    }

    /*
    public void abrir(View view){
        frameLayout.setVisibility(View.VISIBLE);
    }*/
}
