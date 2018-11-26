package com.example.tiago.projetointerdisciplinar3periodo.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "usuario_table")
public class Usuario {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "IDUSUARIO")
    private long idUsuario;
    private String tipoUsuario;
    private String nomeUsuario;
    private String cidadeUsuario;
    private int dddUsuario;
    private int telefoneUsuario;
    private String emailUsuario;
    private String loginUsuario;
    private String senhaUsuario;

    public Usuario(){
    }

    public Usuario(long idUsuario, String tipoUsuario, String nomeUsuario, String cidadeUsuario, int dddUsuario, int telefoneUsuario, String emailUsuario, String loginUsuario, String senhaUsuario) {
        this.idUsuario = idUsuario;
        this.tipoUsuario = tipoUsuario;
        this.nomeUsuario = nomeUsuario;
        this.cidadeUsuario = cidadeUsuario;
        this.dddUsuario = dddUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.emailUsuario = emailUsuario;
        this.loginUsuario = loginUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getCidadeUsuario() {
        return cidadeUsuario;
    }

    public void setCidadeUsuario(String cidadeUsuario) {
        this.cidadeUsuario = cidadeUsuario;
    }

    public int getDddUsuario() {
        return dddUsuario;
    }

    public void setDddUsuario(int dddUsuario) {
        this.dddUsuario = dddUsuario;
    }

    public int getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(int telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
}