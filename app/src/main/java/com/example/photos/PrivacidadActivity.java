package com.example.photos;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrivacidadActivity extends AppCompatActivity {
    Button btnBack4,btnConf4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_privacidad);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnBack4 = (Button) findViewById(R.id.btnBackPriv);
        btnConf4 = (Button) findViewById(R.id.btnConfPriv);

        btnBack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ConfigActivity = new Intent(PrivacidadActivity.this, ConfigurationActivity.class );
                startActivity(ConfigActivity);
            }
        });

        btnConf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ConfigActivity = new Intent(PrivacidadActivity.this, ConfigurationActivity.class);
                startActivity(ConfigActivity);
            }
        });
    }
}