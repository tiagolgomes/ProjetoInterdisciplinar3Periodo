package com.example.tiago.projetointerdisciplinar3periodo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.tiago.projetointerdisciplinar3periodo.R;
import com.example.tiago.projetointerdisciplinar3periodo.model.Usuario;
import com.example.tiago.projetointerdisciplinar3periodo.repository.UsuarioRepository;

import java.util.List;

/*

public class UsuarioAdapter extends ArrayAdapter<Usuario> {
    private int rId;

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

        Usuario usuario = UsuarioRepository.usuario;

        TextView nomeUsuario = mView.findViewById(R.id.nomeUsuario);
        TextView tipoUsuario = mView.findViewById(R.id.tipoUsuario);

        nomeUsuario.setText(usuario.getNomeUsuario().toUpperCase());
        tipoUsuario.setText(usuario.getTipoUsuario().toUpperCase());

        return mView;
    }
}

*/