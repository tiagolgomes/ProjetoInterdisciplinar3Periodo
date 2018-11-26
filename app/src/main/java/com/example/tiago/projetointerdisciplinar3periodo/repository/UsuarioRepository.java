package com.example.tiago.projetointerdisciplinar3periodo.repository;

import android.content.Context;

import com.example.tiago.projetointerdisciplinar3periodo.dataBase.UsuarioRoomDataBase;
import com.example.tiago.projetointerdisciplinar3periodo.model.Usuario;
import com.example.tiago.projetointerdisciplinar3periodo.DAO.UsuarioDAO;

public class UsuarioRepository {

    private UsuarioDAO mUsuarioDAO;
    public static Usuario usuario;

    public UsuarioRepository(Context context){
        UsuarioRoomDataBase db = UsuarioRoomDataBase.getDatabase(context);
        mUsuarioDAO = db.usuarioDAO();
    }

    public Usuario LoadUsuario (String login, String senha){
        return mUsuarioDAO.loadUsuario(login, senha);
    }

    public void insert(Usuario usuario){
        mUsuarioDAO.insert(usuario);
    }

    public void delete(long id){
        mUsuarioDAO.delete(id);
    }

    public void update(Usuario usuario) {
        mUsuarioDAO.update(usuario);
    }
}
