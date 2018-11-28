package com.example.tiago.projetointerdisciplinar3periodo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.tiago.projetointerdisciplinar3periodo.R;
import com.example.tiago.projetointerdisciplinar3periodo.model.Usuario;
import com.example.tiago.projetointerdisciplinar3periodo.repository.UsuarioRepository;

public class NovoUsuarioActivity extends Activity {

    private Spinner spinnerTipoUsuario;
    private EditText editNovoUsuarioNome;
    private EditText editNovoUsuarioCidade;
    private EditText editNovoUsuarioDDD;
    private EditText editNovoUsuarioTelefone;
    private EditText editNovoUsuarioEmail;
    private EditText editNovoUsuarioLogin;
    private EditText editNovoUsuarioSenha;
    private UsuarioRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_usuario);

        spinnerTipoUsuario = findViewById(R.id.spinnerTipoUsuario);
        editNovoUsuarioNome = findViewById(R.id.editNovoUsuarioNome);
        editNovoUsuarioCidade = findViewById(R.id.editNovoUsuarioCidade);
        editNovoUsuarioDDD = findViewById(R.id.editNovoUsuarioDDD);
        editNovoUsuarioTelefone = findViewById(R.id.editNovoUsuarioTelefone);
        editNovoUsuarioEmail = findViewById(R.id.editNovoUsuarioEmail);
        editNovoUsuarioLogin = findViewById(R.id.editNovoUsuarioLogin);
        editNovoUsuarioSenha = findViewById(R.id.editNovoUsuarioSenha);

        repository = new UsuarioRepository(getApplicationContext());
    }

    public void cadastrarNovoUsuario(View view){
        Usuario usuario = new Usuario();
        usuario.setTipoUsuario(spinnerTipoUsuario.getSelectedItem().toString());
        usuario.setNomeUsuario(editNovoUsuarioNome.getText().toString());
        usuario.setCidadeUsuario(editNovoUsuarioCidade.getText().toString());
        usuario.setDddUsuario(Integer.parseInt(editNovoUsuarioDDD.getText().toString()));
        usuario.setTelefoneUsuario(Integer.parseInt(editNovoUsuarioTelefone.getText().toString()));
        usuario.setEmailUsuario(editNovoUsuarioEmail.getText().toString());
        usuario.setLoginUsuario(editNovoUsuarioLogin.getText().toString().toUpperCase());
        usuario.setSenhaUsuario(editNovoUsuarioSenha.getText().toString().toUpperCase());

        repository.insert(usuario);
        Toast.makeText(this, "Usuário Cadastrado com Sucesso!", Toast.LENGTH_SHORT).show();
        callMainActivity();
    }

    private void callMainActivity(){
        Intent mainActivity = new Intent(NovoUsuarioActivity.this, MainActivity.class);
        startActivity(mainActivity);
        finish();
    }
}
