package com.example.tiago.projetointerdisciplinar3periodo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tiago.projetointerdisciplinar3periodo.R;

public class IndexActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);


    }

    public void callNovoEstab(View View){
        Intent novoEstab = new Intent(IndexActivity.this,NovoEstabelecimentoActivity.class);
        startActivity(novoEstab);
        finish();
    }
}
