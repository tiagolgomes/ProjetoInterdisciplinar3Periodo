package com.example.tiago.projetointerdisciplinar3periodo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.tiago.projetointerdisciplinar3periodo.R;
import com.example.tiago.projetointerdisciplinar3periodo.model.Usuario;

import java.util.List;

public class UsuarioAdapter extends ArrayAdapter<Usuario> {
    private int rId;

    public Usuario LoadUsuario(View currentView){

        Usuario usuario = new Usuario();

        View mView = currentView;

        if(mView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView = inflater.inflate(rId,null);
        }

        EditText editLogin = mView.findViewById(R.id.editLogin);
        EditText editSenha = mView.findViewById(R.id.editSenha);



        return usuario;
    }

    public UsuarioAdapter(@NonNull Context context, int resource, @NonNull List<Usuario> objects) {
        super(context, resource, objects);
        rId = resource;
    }

    @Override
    public View getView(int position, View currentView, ViewGroup parent){
        View mView = currentView;

        if(mView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView = inflater.inflate(rId,null);
        }

        Usuario usuario = getItem(position);

        //TextView textTitulo = mView.findViewById(R.id.textNomeFilme);
        //TextView textGenero = mView.findViewById(R.id.textGeneroFilme);
        //TextView textAno = mView.findViewById(R.id.textAnoFilme);
        //RatingBar rating = mView.findViewById(R.id.ratingNotaFilme);

        //textTitulo.setText(usuario.getTitulo().toUpperCase());
        //textGenero.setText(usuario.getGenero());
        //textAno.setText("Ano: " + String.valueOf(usuario.getAno_producao()));
        //rating.setRating((float)usuario.getAvaliacao());

        return mView;
    }
}
