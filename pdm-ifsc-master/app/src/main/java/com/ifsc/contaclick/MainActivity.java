package com.ifsc.contaclick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Integer i=0;

    String [] nomes = new String[] {"Anne", "Fernanda", "Jaque", "Mariana"};

    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv =  findViewById(R.id.listView);

        ArrayAdapter<String> a = new ArrayAdapter(
                this,
                R.layout.activity_planet,
                R.id.tvNome,nomes);

        lv.setAdapter(a);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                position = 2;
                Intent intent = new Intent(getApplicationContext(), PlanetActivity.class);
                intent.putExtra("nome", nomes[position]);

                startActivity(intent);
            }
        });



    }
}