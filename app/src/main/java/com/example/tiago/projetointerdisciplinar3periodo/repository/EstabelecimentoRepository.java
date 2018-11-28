package com.example.tiago.projetointerdisciplinar3periodo.repository;

import android.content.Context;

import com.example.tiago.projetointerdisciplinar3periodo.DAO.EstabelecimentoDAO;
import com.example.tiago.projetointerdisciplinar3periodo.dataBase.EstabelecimentoRoomDataBase;
import com.example.tiago.projetointerdisciplinar3periodo.model.Estabelecimento;

import java.util.List;

public class EstabelecimentoRepository {

    private EstabelecimentoDAO mEstabelecimentoDAO;
    public static Estabelecimento estabelecimento;
    private List<Estabelecimento> mEstabelecimentos;

    public EstabelecimentoRepository(Context context){
        EstabelecimentoRoomDataBase db = EstabelecimentoRoomDataBase.getDatabase(context);
        mEstabelecimentoDAO = db.estabelecimentoDAO();
    }

    public void insert(Estabelecimento estabelecimento){
        mEstabelecimentoDAO.insert(estabelecimento);
    }

    public List<Estabelecimento> getAllEstabelecimentos(){
        mEstabelecimentos = mEstabelecimentoDAO.loadEstabs();
        return mEstabelecimentos;
    }
}