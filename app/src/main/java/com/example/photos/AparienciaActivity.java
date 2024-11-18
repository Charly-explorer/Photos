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

public class AparienciaActivity extends AppCompatActivity {
    Button btnBack3,btnConf3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_apariencia);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnBack3 = (Button) findViewById(R.id.btnBackApar);
        btnConf3 = (Button) findViewById(R.id.btnConfApar);

        btnBack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ConfigActivity = new Intent(AparienciaActivity.this, ConfigurationActivity.class );
                startActivity(ConfigActivity);
            }
        });

        btnConf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ConfigActivity = new Intent(AparienciaActivity.this, ConfigurationActivity.class);
                startActivity(ConfigActivity);
            }
        });
    }
}