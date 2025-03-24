package com.ifsc.contaclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Integer i=0;

    EditText edPeso, edAltura;
    TextView tvIMC;

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edAltura =  findViewById(R.id.edAltura);
        edPeso =  findViewById(R.id.edPeso);
        tvIMC = findViewById(R.id.tvIMC);
        b = findViewById(R.id.button);

        b.setOnClickListener(v->{

            Double peso = Double.parseDouble(edPeso.getText().toString());
            Double altura = Double.parseDouble(edAltura.getText().toString());

            Double imc = peso/(altura*altura);

            String imcTxt = imc.toString();
            tvIMC.setText(imcTxt);

        });


    }
}