package com.example.tiago.projetointerdisciplinar3periodo.dataBase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.tiago.projetointerdisciplinar3periodo.DAO.EstabelecimentoDAO;
import com.example.tiago.projetointerdisciplinar3periodo.model.Estabelecimento;

@Database(entities = {Estabelecimento.class},version = 1)
public abstract class EstabelecimentoRoomDataBase extends RoomDatabase{
    private static volatile EstabelecimentoRoomDataBase INSTANCE;
    public abstract EstabelecimentoDAO estabelecimentoDAO();

    public static EstabelecimentoRoomDataBase getDatabase(final Context context){
        if(INSTANCE == null){
            synchronized (EstabelecimentoRoomDataBase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),EstabelecimentoRoomDataBase.class,"estabelecimento_database").allowMainThreadQueries().build();
                }
            }
        }
        return INSTANCE;
    }
}