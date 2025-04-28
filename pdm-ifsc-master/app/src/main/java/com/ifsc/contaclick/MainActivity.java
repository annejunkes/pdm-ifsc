package com.ifsc.contaclick;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Integer i=0;

    Integer imagem = R.drawable.perfil;
    EditText edNome, edDesc;
    ImageView imageView;
    //TextView tvNome;
    //TextView tvDesc;


    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ciclo de vida", "método onCreate");
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image);
        imageView.setImageResource(imagem);
        edDesc =  findViewById(R.id.edTextDesc);
        edNome =  findViewById(R.id.edTextNome);

       /* tvIMC = findViewById(R.id.tvIMCTxt);
        b = findViewById(R.id.button);

        b.setOnClickListener(v->{

            String heightTxt = edAltura.getText().toString();
            double height = Double.parseDouble(heightTxt);

            double imc = weight/(height*height);

            Intent intent = new Intent(getApplicationContext(), MainActivityB.class);
            String nome = edNome.getText().toString();
            String peso = edPeso.getText().toString();
            String altura = edAltura.getText().toString();
            String imcTxt = String.valueOf(imc);
            intent.putExtra("nome",nome);
            intent.putExtra("peso",peso);
            intent.putExtra("altura",altura);
            intent.putExtra("imc",imcTxt);
            startActivity(intent);
        });

        */


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ciclo de vida", "método onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ciclo de vida", "método onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ciclo de vida", "método onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ciclo de vida", "método onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ciclo de vida", "método oStop");
    }


}