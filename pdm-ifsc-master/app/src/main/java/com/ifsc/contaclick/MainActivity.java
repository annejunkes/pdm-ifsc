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

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Integer i = 0;

    EditText edPeso, edAltura;
    TextView tvIMC;

    Button b;
    Button buttonNextImage;

    Integer imagens[] = new Integer[] {R.drawable.cachorro, R.drawable.gardem, R.drawable.happy, R.drawable.patinho, R.drawable.porquinho};

    ImageView imageView;

    int posicao =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ciclo de vida", "método onCreate");
        setContentView(R.layout.activity_main);

        edAltura =  findViewById(R.id.edAltura);
        edPeso =  findViewById(R.id.edPeso);
        tvIMC = findViewById(R.id.tvIMC);
        b = findViewById(R.id.button);
        buttonNextImage = findViewById(R.id.button2);
        imageView = findViewById(R.id.imageView);


        b.setOnClickListener(v->{

            Intent intent = new Intent(getApplicationContext(), MainActivityB.class);
            String msg = edPeso.getText().toString();
            intent.putExtra("mensagem",msg);
            startActivity(intent);
        });

        buttonNextImage.setOnClickListener(v->{
            imageView.setImageResource(imagens[posicao]);
            if(posicao<imagens.length-1) {
                posicao++;
            }else{
                posicao=0;
            }

        });

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