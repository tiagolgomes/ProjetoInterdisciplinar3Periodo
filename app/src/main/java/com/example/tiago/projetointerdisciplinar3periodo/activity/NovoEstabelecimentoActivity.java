package com.example.tiago.projetointerdisciplinar3periodo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.tiago.projetointerdisciplinar3periodo.R;
import com.example.tiago.projetointerdisciplinar3periodo.model.Estabelecimento;
import com.example.tiago.projetointerdisciplinar3periodo.repository.EstabelecimentoRepository;

public class NovoEstabelecimentoActivity extends Activity {

    private Spinner spinnerTipoEstabelecimento;
    private EditText editNovoEstabNome;
    private EditText editNovoEstabEndereco;
    private EditText editNovoEstabCidade;
    private EditText editNovoEstabDDD;
    private EditText editNovoEstabTelefone;
    private EditText editNovoEstabEmail;
    private EditText editNovoEstabEstilo;
    private EditText editNovoEstabValor;

    private EstabelecimentoRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_estabelecimento);

        spinnerTipoEstabelecimento = findViewById(R.id.spinnerTipoEstabelecimento);
        editNovoEstabNome = findViewById(R.id.editNovoEstabNome);
        editNovoEstabEndereco = findViewById(R.id.editNovoEstabEndereco);
        editNovoEstabCidade = findViewById(R.id.editNovoEstabCidade);
        editNovoEstabDDD = findViewById(R.id.editNovoEstabDDD);
        editNovoEstabTelefone = findViewById(R.id.editNovoEstabTelefone);
        editNovoEstabEmail = findViewById(R.id.editNovoEstabEmail);
        editNovoEstabEstilo = findViewById(R.id.editNovoEstabEstilo);
        editNovoEstabValor = findViewById(R.id.editNovoEstabValor);

        repository = new EstabelecimentoRepository(getApplicationContext());
    }

    public void cadastrarNovoEstab(View view){
        Estabelecimento estabelecimento = new Estabelecimento();
        estabelecimento.setCategoriaEstabelecimento(spinnerTipoEstabelecimento.getSelectedItem().toString());
        estabelecimento.setNomeEstabelecimento(editNovoEstabNome.getText().toString());
        estabelecimento.setEnderecoEstabelecimento(editNovoEstabEndereco.getText().toString());
        estabelecimento.setCidadeEstabelecimento(editNovoEstabCidade.getText().toString());
        estabelecimento.setDddEstabelecimento(Integer.parseInt(editNovoEstabDDD.getText().toString()));
        estabelecimento.setTelefoneEstabelecimento(Integer.parseInt(editNovoEstabTelefone.getText().toString()));
        estabelecimento.setEmailEstabelecimento(editNovoEstabEmail.getText().toString());
        estabelecimento.setEstiloEstabelecimento(editNovoEstabEstilo.getText().toString());
        estabelecimento.setValorEstabelecimento(Integer.parseInt(editNovoEstabValor.getText().toString()));

        repository.insert(estabelecimento);
        Toast.makeText(this, "Estabelecimento Cadastrado com Sucesso!", Toast.LENGTH_SHORT).show();
        callIndexActivity();
    }

    private void callIndexActivity(){
        Intent indexActivity = new Intent(NovoEstabelecimentoActivity.this, IndexActivity.class);
        startActivity(indexActivity);
        finish();
    }

    public void abrirIndex(View view){
        callIndexActivity();
    }
}
