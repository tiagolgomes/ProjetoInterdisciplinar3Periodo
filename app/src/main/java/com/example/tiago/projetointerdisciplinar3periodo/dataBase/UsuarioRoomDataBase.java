package com.example.tiago.projetointerdisciplinar3periodo.dataBase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.tiago.projetointerdisciplinar3periodo.DAO.UsuarioDAO;
import com.example.tiago.projetointerdisciplinar3periodo.model.Usuario;

@Database(entities = {Usuario.class},version = 1)

public abstract class UsuarioRoomDataBase extends RoomDatabase {
    private static volatile UsuarioRoomDataBase INSTANCE;
    public abstract UsuarioDAO usuarioDAO();

    public static UsuarioRoomDataBase getDatabase(final Context context){
        if(INSTANCE == null){
            synchronized (UsuarioRoomDataBase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),UsuarioRoomDataBase.class,"usuario_database").allowMainThreadQueries().build();
                }
            }
        }
        return INSTANCE;
    }
}