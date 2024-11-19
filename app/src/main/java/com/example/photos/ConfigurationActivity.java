package com.example.photos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ConfigurationActivity extends AppCompatActivity {

    Button btnchat2, btncamera, btnconfiguraciones,btnPerfil,btnApariencia,btnPrivacidad,
            btnAdministrarCuen,btnHistorial,btnSugerencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_configuration);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnchat2 = (Button) findViewById(R.id.btnChat2);
        btncamera = (Button) findViewById(R.id.btnCamara2);
        btnconfiguraciones=(Button) findViewById(R.id.btnConfiguracion2);

        btncamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CameraActivity = new Intent(ConfigurationActivity.this, CameraActivity.class );
                startActivity(CameraActivity);
            }
        });

        btnchat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ChatActivity = new Intent(ConfigurationActivity.this, ChatActivity.class);
                startActivity(ChatActivity);
            }
        });

        btnPerfil = (Button) findViewById(R.id.btnPerfil);
        btnApariencia = (Button) findViewById(R.id.btnApariencia);
        btnPrivacidad=(Button) findViewById(R.id.btnPrivacidad);
        btnAdministrarCuen = (Button) findViewById(R.id.btnCuentas);
        btnHistorial = (Button) findViewById(R.id.btnHistorial);
        btnSugerencias=(Button) findViewById(R.id.btnSugerencias);

        btnPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Perfil = new Intent(ConfigurationActivity.this, PerfilActivity.class );
                startActivity(Perfil);
            }
        });

        btnApariencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Apariencia = new Intent(ConfigurationActivity.this, AparienciaActivity.class);
                startActivity(Apariencia);
            }
        });
        btnPrivacidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Privacidad = new Intent(ConfigurationActivity.this, PrivacidadActivity.class );
                startActivity(Privacidad);
            }
        });

        btnAdministrarCuen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Administrar = new Intent(ConfigurationActivity.this, CuentaActivity.class);
                startActivity(Administrar);
            }
        });
        btnHistorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Historial = new Intent(ConfigurationActivity.this, HistorialActivity.class );
                startActivity(Historial);
            }
        });

        btnSugerencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Sugerencias = new Intent(ConfigurationActivity.this, SugerenciasActivity.class);
                startActivity(Sugerencias);
            }
        });

    }
}