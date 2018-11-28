package com.example.tiago.projetointerdisciplinar3periodo.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.tiago.projetointerdisciplinar3periodo.model.Estabelecimento;

import java.util.List;

@Dao
public interface EstabelecimentoDAO {
    @Insert
    void insert(Estabelecimento estabelecimento);

    @Update
    void update(Estabelecimento estabelecimento);

    @Query("SELECT * FROM estabelecimento_table WHERE estabelecimento_table.IDESTABELECIMENTO == :id")
    Estabelecimento loadEstabByID(Long id);

    @Query("DELETE FROM estabelecimento_table where estabelecimento_table.IDESTABELECIMENTO == :id")
    void delete(long id);

    @Query("SELECT * from estabelecimento_table ORDER BY nomeEstabelecimento DESC")
    List<Estabelecimento> loadEstabs();

}