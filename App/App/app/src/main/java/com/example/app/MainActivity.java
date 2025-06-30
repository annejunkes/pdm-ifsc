package com.example.app;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    LocationManager locationManager;

    TextView tvLatitude, tvLongitude, tvStatus;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tvLatitude = findViewById(R.id.tvLatitude);
        tvLongitude = findViewById(R.id.tvLongitude);
        tvStatus = findViewById(R.id.tvResultado);
        button = findViewById(R.id.btnObter);

        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        button.setOnClickListener(v -> {
            getLocalizacao();
        });

        }

        @SuppressLint("MissingPermission")
        public void getLocalizacao() {

            checaESolicitacaoPermissao();

        if(checaESolicitacaoPermissao()) {
            Location l = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            if(l!=null) {
                tvLatitude.setText(Double.toString(l.getLatitude()));
                tvLongitude.setText(Double.toString(l.getLongitude()));
            }
            else{
                tvLatitude.setText("Sem localizacao");
                }
        }
        else {
            tvLatitude.setText("Permissao negada");
        }
    }

    public boolean checaESolicitacaoPermissao() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED
                || ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{
                            Manifest.permission.ACCESS_COARSE_LOCATION,
                            Manifest.permission.ACCESS_FINE_LOCATION},
                    PackageManager.PERMISSION_GRANTED);

            return false;
        }
        else{
            return true;
        }

        }


    }
