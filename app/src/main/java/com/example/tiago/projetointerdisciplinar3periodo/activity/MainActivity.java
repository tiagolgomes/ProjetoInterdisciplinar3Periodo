package com.example.tiago.projetointerdisciplinar3periodo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.tiago.projetointerdisciplinar3periodo.R;
import com.example.tiago.projetointerdisciplinar3periodo.model.Estabelecimento;
import com.example.tiago.projetointerdisciplinar3periodo.model.Usuario;
import com.example.tiago.projetointerdisciplinar3periodo.repository.UsuarioRepository;

import java.util.List;
//import com.example.tiago.projetointerdisciplinar3periodo.repository.EstabelecimentoRepository;

public class MainActivity extends Activity {

    private EditText editLogin;
    private EditText editSenha;
    private UsuarioRepository repository;
    private ListView listaEstabs;

    ArrayAdapter<Estabelecimento> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editLogin = findViewById(R.id.editLogin);
        editSenha = findViewById(R.id.editSenha);

        listaEstabs = findViewById(R.id.listaEstabs);

        repository = new UsuarioRepository(this);

        //atualizarEstabs();
    }

    public void realizarLogin(View view){
        String login = editLogin.getText().toString().toUpperCase();
        String senha = editSenha.getText().toString().toUpperCase();

        if (login.isEmpty() && senha.isEmpty()) {
            Toast.makeText(this, "Login inválido!", Toast.LENGTH_SHORT).show();
        }
        else {
            Usuario usuario = repository.loadUsuario(login, senha);
            if (usuario != null){
                UsuarioRepository.usuario = usuario;
                callIndexActivity();
            }
            else{
                Toast.makeText(this, "Login inválido!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void callNovoUsuarioActivity(View View){
        Intent novoUsuario = new Intent(MainActivity.this,NovoUsuarioActivity.class);
        startActivity(novoUsuario);
        finish();
    }

    private void callIndexActivity(){
        Intent indexActivity = new Intent(MainActivity.this, IndexActivity.class);
        startActivity(indexActivity);
        finish();
    }

    //private void atualizarEstabs(){
    //    List<Estabelecimento> estabelecimentos = repository.getAllEstabelecimentos();
    //}
}
