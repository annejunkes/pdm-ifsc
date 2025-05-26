package com.ifsc.contaclick;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase db;

    Button b;
    EditText edNome;

    ListView lv;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = openOrCreateDatabase("primeiro", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS NOTAS(id INTEGER PRIMARY KEY AUTOINCREMENT, TXTVARCHAR)");

        b=findViewById(R.id.btnInserir);
        edNome=findViewById(R.id.edNome);
        lv=findViewById(R.id.listView);


        b.setOnClickListener(v->{
            String nota = edNome.getText().toString();
            inserirNota(nota);
            //lv.setItem;


        });


    }

    public void listagemNotas(){
        Cursor cursor = db.rawQuery("SELECT * FROM NOTAS", null);
        cursor.moveToFirst();

        ArrayList<String> listaNotas = new ArrayList<String>();

        while(!cursor.isAfterLast()){
            int coluna = cursor.getColumnIndex("txt");
            listaNotas.add(cursor.getString(coluna));
            cursor.moveToNext();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                listaNotas);
        lv.setAdapter(adapter);

    }
    public void inserirNota(String txt){
        ContentValues cv = new ContentValues();
        cv.put("txt", txt);
        db.insert("notas", null, cv);
    }
}