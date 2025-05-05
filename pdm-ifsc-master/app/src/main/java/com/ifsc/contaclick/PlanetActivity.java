package com.ifsc.contaclick;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PlanetActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_planet);

        Bundle bundle = getIntent().getExtras();

        String nome = bundle.getString("nome");
        TextView tvNome = findViewById(R.id.tvNome);
        tvNome.setText(nome);
    }
}