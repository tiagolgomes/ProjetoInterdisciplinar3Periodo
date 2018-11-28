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

public class AlterarUsuarioActivity extends Activity {

    private Spinner spinnerTipoUsuario;
    private EditText editAltUsuarioNome;
    private EditText editAltUsuarioCidade;
    private EditText editAltUsuarioDDD;
    private EditText editAltUsuarioTelefone;
    private EditText editAltUsuarioEmail;
    private EditText editAltUsuarioLogin;
    private EditText editAltUsuarioSenha;
    private UsuarioRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_usuario);

        spinnerTipoUsuario = findViewById(R.id.spinnerTipoUsuario);
        editAltUsuarioNome = findViewById(R.id.editAltUsuarioNome);
        editAltUsuarioCidade = findViewById(R.id.editAltUsuarioCidade);
        editAltUsuarioDDD = findViewById(R.id.editAltUsuarioDDD);
        editAltUsuarioTelefone = findViewById(R.id.editAltUsuarioTelefone);
        editAltUsuarioEmail = findViewById(R.id.editAltUsuarioEmail);
        editAltUsuarioLogin = findViewById(R.id.editAltUsuarioLogin);
        editAltUsuarioSenha = findViewById(R.id.editAltUsuarioSenha);

        repository = new UsuarioRepository(this);

        carregarUsuarioCompleto();
    }

    private void carregarUsuarioCompleto(){
        Usuario usuario = UsuarioRepository.usuario;
        editAltUsuarioNome.setText(usuario.getNomeUsuario());
        editAltUsuarioCidade.setText(usuario.getCidadeUsuario());
        editAltUsuarioDDD.setText(Integer.toString(usuario.getDddUsuario()));
        editAltUsuarioTelefone.setText(Integer.toString(usuario.getTelefoneUsuario()));
        editAltUsuarioEmail.setText(usuario.getEmailUsuario());
        editAltUsuarioLogin.setText(usuario.getLoginUsuario());
        editAltUsuarioSenha.setText(usuario.getSenhaUsuario());
    }

    public void alterarDados(View view){
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(UsuarioRepository.usuario.getIdUsuario());
        usuario.setTipoUsuario(spinnerTipoUsuario.getSelectedItem().toString());
        usuario.setNomeUsuario(editAltUsuarioNome.getText().toString());
        usuario.setCidadeUsuario(editAltUsuarioCidade.getText().toString());
        usuario.setDddUsuario(Integer.parseInt(editAltUsuarioDDD.getText().toString()));
        usuario.setTelefoneUsuario(Integer.parseInt(editAltUsuarioTelefone.getText().toString()));
        usuario.setEmailUsuario(editAltUsuarioEmail.getText().toString());
        usuario.setLoginUsuario(editAltUsuarioLogin.getText().toString().toUpperCase());
        usuario.setSenhaUsuario(editAltUsuarioSenha.getText().toString().toUpperCase());

        repository.update(usuario);
        Toast.makeText(this, "Usuário Alterado com Sucesso!", Toast.LENGTH_SHORT).show();
        voltarIndex();
    }

    private void voltarIndex(){
        Intent indexActivity = new Intent(AlterarUsuarioActivity.this, IndexActivity.class);
        startActivity(indexActivity);
        finish();
    }

    public void voltarIndexB(View view){
        voltarIndex();
    }

    public void excluirUsuario(View view){
        Usuario usuario = UsuarioRepository.usuario;
        repository.delete(usuario.getIdUsuario());
        Toast.makeText(this, "Usuário Excluído com Sucesso!", Toast.LENGTH_SHORT).show();
        voltarMain();
    }

    private void voltarMain(){
        Intent mainActivity = new Intent(AlterarUsuarioActivity.this, MainActivity.class);
        startActivity(mainActivity);
        finish();
    }
}
