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

    Button btnchat2, btncamera, btnconfiguraciones;

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

        btnconfiguraciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ChatActivity = new Intent(ConfigurationActivity.this, ChatActivity.class);
                startActivity(ChatActivity);
            }
        });

    }
}