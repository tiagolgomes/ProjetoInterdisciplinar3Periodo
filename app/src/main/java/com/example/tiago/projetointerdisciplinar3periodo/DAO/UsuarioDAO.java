package com.example.tiago.projetointerdisciplinar3periodo.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.tiago.projetointerdisciplinar3periodo.model.Usuario;

import java.util.List;

@Dao
public interface UsuarioDAO {

    @Query ("SELECT * FROM usuario_table WHERE usuario_table.loginUsuario == :login AND usuario_table.senhaUsuario == :senha")
    Usuario loadUsuario(String login, String senha);





    @Insert
    void insert(Usuario usuario);

    @Update
    void update(Usuario usuario);

    @Query("SELECT * FROM usuario_table WHERE usuario_table.IDUSUARIO == :id")
    Usuario loadUsuarioByID(Long id);

    @Query("DELETE FROM usuario_table where usuario_table.IDUSUARIO == :id")
    void delete(long id);

    @Query("SELECT * from usuario_table ORDER BY nomeUsuario DESC")
    List<Usuario> loadUsuarios();

    @Query("SELECT tipoUsuario from usuario_table")
    List<String> loadCategoriasUsuarios();
}

