package com.example.tiago.projetointerdisciplinar3periodo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tiago.projetointerdisciplinar3periodo.R;
import com.example.tiago.projetointerdisciplinar3periodo.model.Usuario;
import com.example.tiago.projetointerdisciplinar3periodo.repository.UsuarioRepository;
//import com.example.tiago.projetointerdisciplinar3periodo.repository.EstabelecimentoRepository;

public class MainActivity extends Activity {

    private EditText editLogin;
    private EditText editSenha;
    private UsuarioRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editLogin = findViewById(R.id.editLogin);
        editSenha = findViewById(R.id.editSenha);

        repository = new UsuarioRepository(getApplicationContext());
    }

    public void realizarLogin(View view){
        String login = editLogin.getText().toString().toUpperCase();
        String senha = editSenha.getText().toString().toUpperCase();

        if (login.isEmpty() && senha.isEmpty()) {
            Toast.makeText(this, "Login inválido!", Toast.LENGTH_SHORT).show();
        }
        else {
            Usuario usuario = repository.LoadUsuario(login, senha);
            if (usuario != null){
                UsuarioRepository.usuario = usuario;
                callIndexActivity();
            }
            else{
                Toast.makeText(this, "Login inválido!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void callNovoUsuario(View View){
        Intent novoUsuario = new Intent(MainActivity.this,NovoUsuarioActivity.class);
        startActivity(novoUsuario);
        finish();
    }

    private void callIndexActivity(){
        Intent indexActivity = new Intent(MainActivity.this, IndexActivity.class);
        startActivity(indexActivity);
        finish();
    }
}
