package com.example.tiago.projetointerdisciplinar3periodo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.tiago.projetointerdisciplinar3periodo.R;
import com.example.tiago.projetointerdisciplinar3periodo.model.Usuario;
import com.example.tiago.projetointerdisciplinar3periodo.repository.UsuarioRepository;

public class IndexActivity extends Activity {

    private TextView nomeUsuario;
    private TextView tipoUsuario;
    private UsuarioRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        nomeUsuario = findViewById(R.id.nomeUsuario);
        tipoUsuario = findViewById(R.id.tipoUsuario);

        repository = new UsuarioRepository(this);

        carregarUsuario();
    }

    public void callNovoEstab(View View){
        Intent novoEstab = new Intent(IndexActivity.this,NovoEstabelecimentoActivity.class);
        startActivity(novoEstab);
        finish();
    }


    private void carregarUsuario(){
        Usuario usuario = UsuarioRepository.usuario;
        nomeUsuario.setText(usuario.getNomeUsuario());
        tipoUsuario.setText(usuario.getTipoUsuario());
    }

    public void alterarUsuario(View view){
        Intent altUsuario = new Intent(IndexActivity.this,AlterarUsuarioActivity.class);
        startActivity(altUsuario);
        finish();
    }
}
