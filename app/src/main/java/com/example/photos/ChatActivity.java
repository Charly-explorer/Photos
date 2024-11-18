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

public class ChatActivity extends AppCompatActivity {
    Button btnchat, btncamera, btnconfiguraciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chat);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnchat = (Button) findViewById(R.id.btnChat);
        btncamera = (Button) findViewById(R.id.btnCamara);
        btnconfiguraciones=(Button) findViewById(R.id.btnConfiguracion);

        btncamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CameraActivity = new Intent(ChatActivity.this, CameraActivity.class );
                startActivity(CameraActivity);
            }
        });
        btnconfiguraciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ConfigurationActivity = new Intent(ChatActivity.this, ConfigurationActivity.class);
                startActivity(ConfigurationActivity);
            }
        });

    }
}