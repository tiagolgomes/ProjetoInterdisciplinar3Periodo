package com.example.tiago.projetointerdisciplinar3periodo.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "estabelecimento_table")
public class Estabelecimento {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "IDESTABELECIMENTO")
    private int idEstabelecimento;
    private String CategoriaEstabelecimento;
    private String nomeEstabelecimento;
    private String enderecoEstabelecimento;
    private String cidadeEstabelecimento;
    private int dddEstabelecimento;
    private int telefoneEstabelecimento;
    private String emailEstabelecimento;
    private String estiloEstabelecimento;
    private double valorEstabelecimento;

    public Estabelecimento(){
    }

    public Estabelecimento(int idEstabelecimento, String CategoriaEstabelecimento, String nomeEstabelecimento, String enderecoEstabelecimento, String cidadeEstabelecimento, int dddEstabelecimento, int telefoneEstabelecimento, String emailEstabelecimento, String estiloEstabelecimento, double valorEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
        this.CategoriaEstabelecimento = CategoriaEstabelecimento;
        this.nomeEstabelecimento = nomeEstabelecimento;
        this.enderecoEstabelecimento = enderecoEstabelecimento;
        this.cidadeEstabelecimento = cidadeEstabelecimento;
        this.dddEstabelecimento = dddEstabelecimento;
        this.telefoneEstabelecimento = telefoneEstabelecimento;
        this.emailEstabelecimento = emailEstabelecimento;
        this.estiloEstabelecimento = estiloEstabelecimento;
        this.valorEstabelecimento = valorEstabelecimento;
    }

    public int getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(int idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    public String getCategoriaEstabelecimento() {
        return CategoriaEstabelecimento;
    }

    public void setCategoriaEstabelecimento(String CategoriaEstabelecimento) {
        this.CategoriaEstabelecimento = CategoriaEstabelecimento;
    }

    public String getNomeEstabelecimento() {
        return nomeEstabelecimento;
    }

    public void setNomeEstabelecimento(String nomeEstabelecimento) {
        this.nomeEstabelecimento = nomeEstabelecimento;
    }

    public String getEnderecoEstabelecimento() {
        return enderecoEstabelecimento;
    }

    public void setEnderecoEstabelecimento(String enderecoEstabelecimento) {
        this.enderecoEstabelecimento = enderecoEstabelecimento;
    }

    public String getCidadeEstabelecimento() {
        return cidadeEstabelecimento;
    }

    public void setCidadeEstabelecimento(String cidadeEstabelecimento) {
        this.cidadeEstabelecimento = cidadeEstabelecimento;
    }

    public int getDddEstabelecimento() {
        return dddEstabelecimento;
    }

    public void setDddEstabelecimento(int dddEstabelecimento) {
        this.dddEstabelecimento = dddEstabelecimento;
    }

    public int getTelefoneEstabelecimento() {
        return telefoneEstabelecimento;
    }

    public void setTelefoneEstabelecimento(int telefoneEstabelecimento) {
        this.telefoneEstabelecimento = telefoneEstabelecimento;
    }

    public String getEmailEstabelecimento() {
        return emailEstabelecimento;
    }

    public void setEmailEstabelecimento(String emailEstabelecimento) {
        this.emailEstabelecimento = emailEstabelecimento;
    }

    public String getEstiloEstabelecimento() {
        return estiloEstabelecimento;
    }

    public void setEstiloEstabelecimento(String estiloEstabelecimento) {
        this.estiloEstabelecimento = estiloEstabelecimento;
    }

    public double getValorEstabelecimento() {
        return valorEstabelecimento;
    }

    public void setValorEstabelecimento(double valorEstabelecimento) {
        this.valorEstabelecimento = valorEstabelecimento;
    }
}