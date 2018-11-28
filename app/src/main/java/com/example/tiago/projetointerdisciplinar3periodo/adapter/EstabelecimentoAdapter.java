package com.example.tiago.projetointerdisciplinar3periodo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.tiago.projetointerdisciplinar3periodo.R;
import com.example.tiago.projetointerdisciplinar3periodo.model.Estabelecimento;
import com.example.tiago.projetointerdisciplinar3periodo.repository.EstabelecimentoRepository;

import java.util.List;

public class EstabelecimentoAdapter extends ArrayAdapter<Estabelecimento> {
    private int rId;

    public EstabelecimentoAdapter(@NonNull Context context, int resource, @NonNull List<Estabelecimento> objects) {
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

        Estabelecimento estabelecimento = EstabelecimentoRepository.estabelecimento;

        TextView textNomeEstab = mView.findViewById(R.id.textNomeEstab);
        TextView textCatEstab = mView.findViewById(R.id.textCatEstab);

        textNomeEstab.setText(estabelecimento.getNomeEstabelecimento().toUpperCase());
        textCatEstab.setText(estabelecimento.getCategoriaEstabelecimento().toUpperCase());

        return mView;
    }
}