package com.example.alexis.recycleview.activity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.alexis.recycleview.R;
import com.example.alexis.recycleview.activity.adapter.Adapter;
import com.example.alexis.recycleview.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> filmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //criar filmes
        this.criarFilmes();

        //Config adapter

        Adapter adapter = new Adapter(filmes);


        //Config RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true); //otimiza vizualização
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);
    }

    public void criarFilmes(){
        for(int i = 0; i<10; i++) {
            Filme filme = new Filme("titulo " + i, "genero " + i, "ano " + i);
            this.filmes.add(filme);
        }

    }
}
