package com.example.alexis.recycleview.activity.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alexis.recycleview.R;
import com.example.alexis.recycleview.activity.model.Filme;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViweHolder> {

    private List<Filme> listaFilmes;

    public Adapter(List<Filme> filmes) {
        this.listaFilmes = filmes;
    }

    @NonNull
    @Override
    public MyViweHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemList = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_lista, viewGroup, false);
        return new MyViweHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViweHolder myViweHolder, int i) {
        Filme filme = listaFilmes.get(i);
        myViweHolder.titulo.setText(filme.getTitulo());
        myViweHolder.genero.setText(filme.getGenero());
        myViweHolder.ano.setText(filme.getAno());

    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }

    public class MyViweHolder extends RecyclerView.ViewHolder{
        TextView titulo;
        TextView ano;
        TextView genero;

        public MyViweHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textTitulo);
            ano = itemView.findViewById(R.id.textAno);
            genero = itemView.findViewById(R.id.textGenero);
        }
    }
}
